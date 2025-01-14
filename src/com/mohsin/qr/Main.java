package com.mohsin.qr;

import com.mohsin.qr.generator.DefaultQRCodeGenerator;
import com.mohsin.qr.generator.QRCodeGenerator;
import com.mohsin.qr.utils.FileHandler;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Define the output directory and file name
        String outputDirectory = "output"; // Directory where the file will be created
        String fileName = "qr_code.png"; // Name of the QR code file

        // Ensure the output directory exists
        if (FileHandler.ensureDirectoryExists(outputDirectory)) {
            // Generate the full file path
            String filePath = FileHandler.getFilePath(outputDirectory, fileName);

            // Define the QR code content
            String content = "Welcome to the industrial-level QR code generator system!";

            // Use the QR code generator
            QRCodeGenerator generator = new DefaultQRCodeGenerator();
            File qrCodeFile = generator.generateQRCode(content, filePath);

            // Print the result
            if (qrCodeFile != null) {
                System.out.println("QR code generated successfully: " + qrCodeFile.getAbsolutePath());
            } else {
                System.out.println("Failed to generate QR code.");
            }
        } else {
            System.out.println("Failed to create output directory.");
        }
    }
}
