package com.pluralsight.Records;

import java.time.LocalDate;
import java.time.LocalTime;

public class Receipt {

    private LocalDate date;
    private LocalTime time;
    private String description;
    private String vendor;
    private double total;

    public Receipt(LocalDate date, LocalTime time, String description, String vendor, double total) {
        this.date = date;
        this.time = time;
        this.description = description; /*Somehow setup so that sandwich order is stored here*/
        this.vendor = "¡Deli-CIOSO!";
        this.total = total;
    }

    public Receipt() {

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
