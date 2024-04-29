package com.example.connector;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilterAuth {

    private static final String AUTH_TOKEN = "Bearer yourAuthTokenHere";

    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        // Votre logique de vérification du token ici
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null && authHeader.equals(AUTH_TOKEN)) {
            // Le token est valide, continuez la chaîne de filtres
            filterChain.doFilter(request, response);
        } else {
            // Le token est invalide, renvoyez une réponse non autorisée
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        }
    }
}
