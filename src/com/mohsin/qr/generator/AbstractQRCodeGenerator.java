package com.mohsin.qr.generator;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public abstract class AbstractQRCodeGenerator implements QRCodeGenerator {
    @Override
    public File generateQRCode(String content, String filePath) {
        try {
            // Generate the QR code as a byte stream
            ByteArrayOutputStream stream = QRCode.from(content).to(getImageType()).stream();
            File file = new File(filePath);

            // Write the stream to the file
            try (FileOutputStream fos = new FileOutputStream(file)) {
                fos.write(stream.toByteArray());
            }

            return file; // Return the file if successful
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Return null if an error occurs
        }
    }

    /**
     * Subclasses must specify the image type (e.g., PNG, JPG).
     *
     * @return The desired ImageType for the QR code.
     */
    protected abstract ImageType getImageType();
}
