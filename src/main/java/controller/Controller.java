package controller;

import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import model.*;

@RestController
@RequestMapping("/api/v1/printer")
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @PostMapping
    public ResponseEntity<String> executeCommand(@RequestBody String requestBody,  @RequestHeader("Authorization") String authorizationHeader) {
        String token_checker = "wUyWBcgFt7oiGLliUb9kDsIpuAXezoYJ";
        
        if (StringUtils.hasText(authorizationHeader) && authorizationHeader.startsWith("Bearer ")) {
            String token = authorizationHeader.substring(7); // Extrait le token sans le préfixe "Bearer "
            if (token_checker.equals(token)) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                                 .body("Token incorrect, format attendu (Bearer Token_string)");
            }
            logger.info("======= Bearer token trouvé et correct   =======", token);
        } else {
            logger.error("Aucun jeton Bearer trouvé dans l'en-tête Authorization");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                                 .body("Aucun jeton Bearer trouvé dans l'en-tête Authorization");
        }
        try {
            Process process = Runtime.getRuntime().exec("ls");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append("\n");
            }
            process.waitFor();
            String result = builder.toString();
            logger.info("Résultat de la commande 'ls' : {}", result);
        } catch (Exception e) {
            logger.error("Erreur lors de l'exécution de la commande : {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body("Erreur lors de l'exécution de la commande : " + e.getMessage());
        }

        ObjectMapper objectMapper = new ObjectMapper();
        String all_command = "";
        
        try {
            // Créer un ObjectMapper (de Jackson)

            // Désérialiser le JSON en une instance de la classe principale
            DataTickets mainClass = objectMapper.readValue(requestBody, DataTickets.class);
            System.out.println("P1");
            // Accéder à la liste des tickets et traiter chaque élément
            List<Ticket> tickets = mainClass.getTickets();
            for (Ticket ticket : tickets) {
                // Générer une ligne de commande pour chaque ticket
                String command = String.format("pdpr -d %s -x\"-job-custom-5 \"%d\" -job-custom-4 \"%d\" -job-custom-1 %d -job-custom-2 %s -job-custom-3 \"%s\" -copy-count %f -job-name %s -job-custom-7 \"%s\" -job-deliver-to-department %s -job-custom-6 \"%s\" -job-custom-9 \"%f\" -job-custom-8 \"%s\"\" zplContent",
                mainClass.getPrinterName(), mainClass.getStoreId(), mainClass.getTemplateId(), ticket.getTicketId(), ticket.getItemId(), ticket.getPrimaryUpc(), ticket.getPrintQuantity(), ticket.getShortDescription(), ticket.getLongDescription(), ticket.getDepartmentName(), ticket.getPriceCurrency(), ticket.getPriceValue(), ticket.getCountryOfManufacture());
                all_command += command + "\n";                
            }
            logger.info(all_command);
            return ResponseEntity.ok(all_command);
        } catch (IOException e) {
            System.out.println(e);
        }
        return ResponseEntity.ok("error");
    }
}

