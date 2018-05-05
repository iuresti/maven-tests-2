package com.politecnica.workshops.model;

public class OutputData {

    private String approvalCode;

    private String transactionReference;

    private String serverDateTime;

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public String getServerDateTime() {
        return serverDateTime;
    }

    public void setServerDateTime(String serverDateTime) {
        this.serverDateTime = serverDateTime;
    }

    @Override public String toString() {
        return "OutputData{" + "approvalCode='" + approvalCode + '\'' + ", transactionReference='" + transactionReference + '\'' + ", serverDateTime='"
                + serverDateTime + '\'' + '}';
    }
}
