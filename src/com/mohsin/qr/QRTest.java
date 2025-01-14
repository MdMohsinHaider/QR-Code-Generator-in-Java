package com.mohsin.qr;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class QRTest {
    public static void main(String[] args) {
        try {
            // File where the QR code will be saved
            File file = new File("abc.png");

            // Content for the QR code
            String content = "this is my content A QR code and my name is Md Mohsin Haider";

            // Generate QR code as PNG
            ByteArrayOutputStream out = QRCode.from(content).to(ImageType.PNG).stream();

            // Write the stream to the file
            try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
                fileOutputStream.write(out.toByteArray());
            }

            System.out.println("QR code generated successfully: " + file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
