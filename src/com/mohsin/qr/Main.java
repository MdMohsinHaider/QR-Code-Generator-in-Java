package com.mohsin.qr;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("abc.jpg"); // Corrected file extension
            String content = "this is my content"; // Fixed typo in variable name

            ByteArrayOutputStream out = QRCode.from(content).to(ImageType.JPG).stream();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(out.toByteArray());
            fileOutputStream.close();

            System.out.println("QR code generated successfully: " + file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace(); // Print full stack trace for better debugging
        }
    }
}
