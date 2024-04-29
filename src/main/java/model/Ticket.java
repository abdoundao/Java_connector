package model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;




@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticket {
    @JsonProperty("ticketId")
    private int ticketId;

    @JsonProperty("itemId")
    private String itemId;

    @JsonProperty("primaryUpc")
    private String primaryUpc;

    @JsonProperty("originType")
    private int originType;

    @JsonProperty("sequenceNumber")
    private int sequenceNumber;

    @JsonProperty("ticketCount")
    private int ticketCount;

    @JsonProperty("shortDescription")
    private String shortDescription;

    @JsonProperty("longDescription")
    private String longDescription;

    @JsonProperty("diffType1")
    private String diffType1;

    @JsonProperty("diffDescription1")
    private String diffDescription1;

    @JsonProperty("diffType2")
    private String diffType2;

    @JsonProperty("diffDescription2")
    private String diffDescription2;

    @JsonProperty("departmentId")
    private int departmentId;

    @JsonProperty("departmentName")
    private String departmentName;

    @JsonProperty("classId")
    private int classId;

    @JsonProperty("className")
    private String className;

    @JsonProperty("subclassId")
    private int subclassId;

    @JsonProperty("subclassName")
    private String subclassName;

    @JsonProperty("printQuantity")
    private double printQuantity;

    @JsonProperty("lowestMonthlyPriceCurrency")
    private String lowestMonthlyPriceCurrency;

    @JsonProperty("lowestMonthlyPriceValue")
    private double lowestMonthlyPriceValue;

    @JsonProperty("lowestMonthlyPriceType")
    private int lowestMonthlyPriceType;

    @JsonProperty("priceCurrency")
    private String priceCurrency;

    @JsonProperty("priceValue")
    private double priceValue;

    @JsonProperty("priceType")
    private int priceType;

    @JsonProperty("priceUom")
    private String priceUom;

    @JsonProperty("priceActiveDate")
    private String priceActiveDate;

    @JsonProperty("countryOfManufacture")
    private String countryOfManufacture;

    public int getTicketId() {
        return ticketId;
    }
    
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
    
    public String getItemId() {
        return itemId;
    }
    
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    
    public String getPrimaryUpc() {
        return primaryUpc;
    }
    
    public void setPrimaryUpc(String primaryUpc) {
        this.primaryUpc = primaryUpc;
    }
    
    public int getOriginType() {
        return originType;
    }
    
    public void setOriginType(int originType) {
        this.originType = originType;
    }
    
    public int getSequenceNumber() {
        return sequenceNumber;
    }
    
    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
    
    public int getTicketCount() {
        return ticketCount;
    }
    
    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }
    
    public String getShortDescription() {
        return shortDescription;
    }
    
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    
    public String getLongDescription() {
        return longDescription;
    }
    
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    
    public String getDiffType1() {
        return diffType1;
    }
    
    public void setDiffType1(String diffType1) {
        this.diffType1 = diffType1;
    }
    
    public String getDiffDescription1() {
        return diffDescription1;
    }
    
    public void setDiffDescription1(String diffDescription1) {
        this.diffDescription1 = diffDescription1;
    }
    
    public String getDiffType2() {
        return diffType2;
    }
    
    public void setDiffType2(String diffType2) {
        this.diffType2 = diffType2;
    }
    
    public String getDiffDescription2() {
        return diffDescription2;
    }
    
    public void setDiffDescription2(String diffDescription2) {
        this.diffDescription2 = diffDescription2;
    }
    
    public int getDepartmentId() {
        return departmentId;
    }
    
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    
    public String getDepartmentName() {
        return departmentName;
    }
    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    public int getClassId() {
        return classId;
    }
    
    public void setClassId(int classId) {
        this.classId = classId;
    }
    
    public String getClassName() {
        return className;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }
    
    public int getSubclassId() {
        return subclassId;
    }
    
    public void setSubclassId(int subclassId) {
        this.subclassId = subclassId;
    }
    
    public String getSubclassName() {
        return subclassName;
    }
    
    public void setSubclassName(String subclassName) {
        this.subclassName = subclassName;
    }
    
    public double getPrintQuantity() {
        return printQuantity;
    }
    
    public void setPrintQuantity(double printQuantity) {
        this.printQuantity = printQuantity;
    }
    
    public String getLowestMonthlyPriceCurrency() {
        return lowestMonthlyPriceCurrency;
    }
    
    public void setLowestMonthlyPriceCurrency(String lowestMonthlyPriceCurrency) {
        this.lowestMonthlyPriceCurrency = lowestMonthlyPriceCurrency;
    }
    
    public double getLowestMonthlyPriceValue() {
        return lowestMonthlyPriceValue;
    }
    
    public void setLowestMonthlyPriceValue(double lowestMonthlyPriceValue) {
        this.lowestMonthlyPriceValue = lowestMonthlyPriceValue;
    }
    
    public int getLowestMonthlyPriceType() {
        return lowestMonthlyPriceType;
    }
    
    public void setLowestMonthlyPriceType(int lowestMonthlyPriceType) {
        this.lowestMonthlyPriceType = lowestMonthlyPriceType;
    }
    
    public String getPriceCurrency() {
        return priceCurrency;
    }
    
    public void setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }
    
    public double getPriceValue() {
        return priceValue;
    }
    
    public void setPriceValue(double priceValue) {
        this.priceValue = priceValue;
    }
    
    public int getPriceType() {
        return priceType;
    }
    
    public void setPriceType(int priceType) {
        this.priceType = priceType;
    }
    
    public String getPriceUom() {
        return priceUom;
    }
    
    public void setPriceUom(String priceUom) {
        this.priceUom = priceUom;
    }
    
    public String getPriceActiveDate() {
        return priceActiveDate;
    }
    
    public void setPriceActiveDate(String priceActiveDate) {
        this.priceActiveDate = priceActiveDate;
    }
    
    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }
    
    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }
}
