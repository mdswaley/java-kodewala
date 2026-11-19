package com.kodewala.utility;

import com.kodewala.exception.FileSizeExceededException;
import com.kodewala.exception.InvalidFileNameException;
import com.kodewala.exception.UnsupportedFileTypeException;

public class FileValidator {
    private static final double MAX_FILE_SIZE = 5.0;

    private static final String[] ALLOWED_EXTENSIONS = {".pdf", ".jpg", ".png"};

    public static void validateFileName(String fileName) throws InvalidFileNameException{
        if (fileName == null || fileName.isBlank() || fileName.trim().isEmpty()){
            throw new InvalidFileNameException("File name cannot be empty!");
        }
    }

    public static void validateFileSize(double fileSize) throws FileSizeExceededException{
        if (fileSize > MAX_FILE_SIZE){
            throw new FileSizeExceededException("File size cannot exceed 5 MB!");
        }
    }

    public static void validateFileType(String fileName) {
        String lcn = fileName.toLowerCase();

        for (String extension : ALLOWED_EXTENSIONS){
            if (lcn.endsWith(extension)){
                return;
            }
        }

        throw new UnsupportedFileTypeException("Only PDF, JPG and PNG files are allowed!");
    }
}
