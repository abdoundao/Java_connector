package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class DataTickets {
    @JsonProperty("storeId")
    private int storeId;
    @JsonProperty("printerName")
    private String printerName;
    @JsonProperty("printerAddress")
    private String printerAddress;
    @JsonProperty("formatType")
    private String formatType;
    @JsonProperty("formatReference")
    private String formatReference;
    @JsonProperty("templateId")
    private int templateId;
    // Ajoutez d'autres champs si nécessaire

    @JsonProperty("tickets")
    private List<Ticket> tickets;

    // Ajoutez des getters et des setters pour tous les champs

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    // Getters et setters pour printerName
    public String getPrinterName() {
        return printerName;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    // Getters et setters pour printerAddress
    public String getPrinterAddress() {
        return printerAddress;
    }

    public void setPrinterAddress(String printerAddress) {
        this.printerAddress = printerAddress;
    }

    // Getters et setters pour formatType
    public String getFormatType() {
        return formatType;
    }

    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }

    // Getters et setters pour formatReference
    public String getFormatReference() {
        return formatReference;
    }

    public void setFormatReference(String formatReference) {
        this.formatReference = formatReference;
    }

    // Getters et setters pour templateId
    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }
}
