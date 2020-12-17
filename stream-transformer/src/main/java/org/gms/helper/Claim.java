package org.gms.helper;




public class Claim {

//	private String message;


    private int CA_CaseID;
    private int CO_ContractID;
    private double CA_CostEstimate;
    private int CA_LimitBenDate;
    private int CA_StatusDate;
    private int SC_CaseStatusID;
    private String CA_WorldAccessID;
    private int CA_DepartureDate;
    private int CA_ContactDate;
    private int CA_VerifyDate;
    private int CA_DischargeDate;
    private int CA_IncidentDate;
    private int IO_IndivOptionID;
    private int IG_IndivGroupOptionID;
    private String CA_CaseType;


    public Claim() {

    }
//
//	public Model(String message) {
//		this.message = message;
//	}
//	@Override
//	public String toString() {
//		return String.format("Model [message=%s]", message);
//	}

    public Claim(String message, int CA_CaseID, int CO_ContractID, double CA_CostEstimate, int CA_LimitBenDate, int CA_StatusDate, int SC_CaseStatusID, String CA_WorldAccessID, int CA_DepartureDate, int CA_ContactDate, int CA_VerifyDate, int CA_DischargeDate, int CA_IncidentDate, int IO_IndivOptionID, int IG_IndivGroupOptionID, String CA_CaseType) {

        this.CA_CaseID = CA_CaseID;
        this.CO_ContractID = CO_ContractID;
        this.CA_CostEstimate = CA_CostEstimate;
        this.CA_LimitBenDate = CA_LimitBenDate;
        this.CA_StatusDate = CA_StatusDate;
        this.SC_CaseStatusID = SC_CaseStatusID;
        this.CA_WorldAccessID = CA_WorldAccessID;
        this.CA_DepartureDate = CA_DepartureDate;
        this.CA_ContactDate = CA_ContactDate;
        this.CA_VerifyDate = CA_VerifyDate;
        this.CA_DischargeDate = CA_DischargeDate;
        this.CA_IncidentDate = CA_IncidentDate;
        this.IO_IndivOptionID = IO_IndivOptionID;
        this.IG_IndivGroupOptionID = IG_IndivGroupOptionID;
        this.CA_CaseType = CA_CaseType;
    }


    @Override
    public String toString() {
        return "Model{" +

                ", CA_CaseID=" + CA_CaseID +
                ", CO_ContractID=" + CO_ContractID +
                ", CA_CostEstimate=" + CA_CostEstimate +
                ", CA_LimitBenDate=" + CA_LimitBenDate +
                ", CA_StatusDate=" + CA_StatusDate +
                ", SC_CaseStatusID=" + SC_CaseStatusID +
                ", CA_WorldAccessID='" + CA_WorldAccessID + '\'' +
                ", CA_DepartureDate=" + CA_DepartureDate +
                ", CA_ContactDate=" + CA_ContactDate +
                ", CA_VerifyDate=" + CA_VerifyDate +
                ", CA_DischargeDate=" + CA_DischargeDate +
                ", CA_IncidentDate=" + CA_IncidentDate +
                ", IO_IndivOptionID=" + IO_IndivOptionID +
                ", IG_IndivGroupOptionID=" + IG_IndivGroupOptionID +
                ", CA_CaseType='" + CA_CaseType + '\'' +
                '}';
    }




    public int getCA_CaseID() {
        return CA_CaseID;
    }

    public void setCA_CaseID(int CA_CaseID) {
        this.CA_CaseID = CA_CaseID;
    }

    public int getCO_ContractID() {
        return CO_ContractID;
    }

    public void setCO_ContractID(int CO_ContractID) {
        this.CO_ContractID = CO_ContractID;
    }

    public double getCA_CostEstimate() {
        return CA_CostEstimate;
    }

    public void setCA_CostEstimate(double CA_CostEstimate) {
        this.CA_CostEstimate = CA_CostEstimate;
    }

    public int getCA_LimitBenDate() {
        return CA_LimitBenDate;
    }

    public void setCA_LimitBenDate(int CA_LimitBenDate) {
        this.CA_LimitBenDate = CA_LimitBenDate;
    }

    public int getCA_StatusDate() {
        return CA_StatusDate;
    }

    public void setCA_StatusDate(int CA_StatusDate) {
        this.CA_StatusDate = CA_StatusDate;
    }

    public int getSC_CaseStatusID() {
        return SC_CaseStatusID;
    }

    public void setSC_CaseStatusID(int SC_CaseStatusID) {
        this.SC_CaseStatusID = SC_CaseStatusID;
    }

    public String getCA_WorldAccessID() {
        return CA_WorldAccessID;
    }

    public void setCA_WorldAccessID(String CA_WorldAccessID) {
        this.CA_WorldAccessID = CA_WorldAccessID;
    }

    public int getCA_DepartureDate() {
        return CA_DepartureDate;
    }

    public void setCA_DepartureDate(int CA_DepartureDate) {
        this.CA_DepartureDate = CA_DepartureDate;
    }

    public int getCA_ContactDate() {
        return CA_ContactDate;
    }

    public void setCA_ContactDate(int CA_ContactDate) {
        this.CA_ContactDate = CA_ContactDate;
    }

    public int getCA_VerifyDate() {
        return CA_VerifyDate;
    }

    public void setCA_VerifyDate(int CA_VerifyDate) {
        this.CA_VerifyDate = CA_VerifyDate;
    }

    public int getCA_DischargeDate() {
        return CA_DischargeDate;
    }

    public void setCA_DischargeDate(int CA_DischargeDate) {
        this.CA_DischargeDate = CA_DischargeDate;
    }

    public int getCA_IncidentDate() {
        return CA_IncidentDate;
    }

    public void setCA_IncidentDate(int CA_IncidentDate) {
        this.CA_IncidentDate = CA_IncidentDate;
    }

    public int getIO_IndivOptionID() {
        return IO_IndivOptionID;
    }

    public void setIO_IndivOptionID(int IO_IndivOptionID) {
        this.IO_IndivOptionID = IO_IndivOptionID;
    }

    public int getIG_IndivGroupOptionID() {
        return IG_IndivGroupOptionID;
    }

    public void setIG_IndivGroupOptionID(int IG_IndivGroupOptionID) {
        this.IG_IndivGroupOptionID = IG_IndivGroupOptionID;
    }

    public String getCA_CaseType() {
        return CA_CaseType;
    }

    public void setCA_CaseType(String CA_CaseType) {
        this.CA_CaseType = CA_CaseType;
    }
}


