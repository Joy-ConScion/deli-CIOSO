package com.pluralsight.data;

import com.pluralsight.model.MenuItem;
import com.pluralsight.model.Order;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptManager {

    public static void saveReceipt(Order order) {

        File folder = new File("receipts");
        folder.mkdirs();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter receiptSnapshotFormat = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");

        String receiptName = "receipts/" + now.format(receiptSnapshotFormat) + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(receiptName))) {

            writer.write("^^^^ ¡Deli-CIOSO! Receipt ^^^^");
            writer.newLine();
            writer.newLine();

            for (MenuItem item : order.getCustomOrder()) {
                writer.write(item.toString());
                writer.newLine();
            }

            writer.newLine();
            writer.write("----------------------------");
            writer.newLine();
            writer.write("TOTAL: $" + order.calculateTotal());
            writer.newLine();
            writer.write("Number of Items: " + order.getItemCount());
            writer.newLine();
            writer.newLine();
            writer.write("Come back again!");
            writer.newLine();
            writer.write("----------------------------");
            writer.newLine();
            writer.write("Fill out the survey below and get your next order of chips free!");
            writer.newLine();
            writer.write("@#%|@#%|@#%|@#%|@#%|@#%|@#%|@#%|@#%|@#%|@#%|@#%|");

        } catch (IOException e) {
            System.out.println("Critical system error writing the receipt: " + e.getMessage());
        }

    }
}