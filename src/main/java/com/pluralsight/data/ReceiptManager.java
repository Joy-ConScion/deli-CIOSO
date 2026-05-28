package com.pluralsight.data;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ReceiptManager {

    LocalDateTime now = LocalDateTime.now();
    String date = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    static ArrayList<Receipt> receipts = new ArrayList<>();

    public static void generateAndSaveReceipt(String formatDate1, String formatTime2, String description, String vendor, double total) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ReceiptLog.csv", true))) {
            bufferedWriter.write(formatDate1 + "|" + formatTime2 + "|" + description + "|" + vendor + "|" + total);
            bufferedWriter.newLine();

            Receipt currentReceipt = new Receipt(
                    LocalDate.parse(formatDate1),
                    LocalTime.parse(formatTime2),
                    description,
                    vendor,
                    total
            );

            currentReceipt.setDate(LocalDate.parse(formatDate1));
            currentReceipt.setTime(LocalTime.parse(formatTime2));
            currentReceipt.setDescription(description);
            currentReceipt.setVendor(vendor);
            currentReceipt.setTotal(total);
            receipts.add(currentReceipt);

        } catch (IOException e) {
            System.out.println("Unexpected Error | Entry could not be stored");
        }
        System.out.println("""
                
                Receipt saved to database. Keep up the work!
                
                
                """);
    }

    public static ArrayList<Receipt> fetchReceiptLog() {
        receipts.clear();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("ReceiptLog.csv"))) {

            String input;
            DateTimeFormatter formatter1 =
                    DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter formatter2 =
                    DateTimeFormatter.ofPattern("HH:mm:ss");

            while ((input = bufferedReader.readLine()) != null) {
                String[] tokAttrib = input.split("\\|");

                Receipt currentReceipt = new Receipt();

                currentReceipt.setDate(LocalDate.parse(tokAttrib[0], formatter1));
                currentReceipt.setTime(LocalTime.parse(tokAttrib[1], formatter2));
                currentReceipt.setDescription(tokAttrib[2]);
                currentReceipt.setVendor(tokAttrib[3]);
                currentReceipt.setTotal(Double.parseDouble(tokAttrib[4]));
                receipts.add(currentReceipt);
            }

        } catch (IOException e) {
            System.out.println("Error - Couldn't retrieve request");
            e.printStackTrace();
        }
        System.out.println("""
                
                
                
                
                
                """);
        return receipts;
    }





}
