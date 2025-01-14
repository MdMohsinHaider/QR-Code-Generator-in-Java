package com.mohsin.qr.generator;

import java.io.File;

public interface QRCodeGenerator {
    /**
     * Generate a QR code with the specified content and save it to the provided file path.
     *
     * @param content  The content to encode in the QR code.
     * @param filePath The path where the QR code file will be saved.
     * @return The generated QR code file, or null if an error occurs.
     */
    File generateQRCode(String content, String filePath);
}
