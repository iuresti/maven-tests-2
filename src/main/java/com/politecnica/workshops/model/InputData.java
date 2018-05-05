package com.politecnica.workshops.model;

public class InputData {

    private String phoneNumber;

    private int amount;

    private Carrier carrier;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    @Override public String toString() {
        return "InputData{" + "phoneNumber='" + phoneNumber + '\'' + ", amount=" + amount + ", carrier=" + carrier + '}';
    }
}
