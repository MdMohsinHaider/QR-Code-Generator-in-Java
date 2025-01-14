package com.mohsin.qr.utils;

import java.io.File;

public class FileHandler {
    /**
     * Ensures the existence of the specified directory, creating it if necessary.
     *
     * @param directoryPath The path of the directory to check or create.
     * @return True if the directory exists or was created successfully, false otherwise.
     */
    public static boolean ensureDirectoryExists(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            return directory.mkdirs();
        }
        return true;
    }

    /**
     * Constructs a file path by combining a directory and a file name.
     *
     * @param directory The directory path.
     * @param fileName  The file name.
     * @return The combined file path.
     */
    public static String getFilePath(String directory, String fileName) {
        return directory + File.separator + fileName;
    }
}
