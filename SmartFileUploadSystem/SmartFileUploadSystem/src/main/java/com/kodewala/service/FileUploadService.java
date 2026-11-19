package com.kodewala.service;

import com.kodewala.exception.DuplicateFileException;
import com.kodewala.exception.FileSizeExceededException;
import com.kodewala.exception.InvalidFileNameException;
import com.kodewala.exception.UnsupportedFileTypeException;
import com.kodewala.model.UploadedFile;
import com.kodewala.utility.FileValidator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class FileUploadService {
    private final List<UploadedFile> uploadedFiles = new ArrayList<>();

    public UploadedFile uploadFile(String filePath) throws InvalidFileNameException,
            FileSizeExceededException,
            UnsupportedFileTypeException,
            DuplicateFileException,
            FileNotFoundException {

        File file = new File(filePath);

        FileValidator.validateFileExists(file);
        
        String fileName = file.getName();

        FileValidator.validateFileName(fileName);

        // 3. Get file size in MB
        double fileSize = (double) file.length() / (1024 * 1024);

        FileValidator.validateFileSize(fileSize);

        FileValidator.validateFileType(fileName);

        for (UploadedFile uploadedFile: uploadedFiles){
            if (uploadedFile.getFileName().equalsIgnoreCase(fileName)){
                throw new DuplicateFileException("File already uploaded : "+ fileName);
            }
        }

        UploadedFile uploadedFile = new UploadedFile(fileName, fileSize, filePath);

        uploadedFiles.add(uploadedFile);

        return uploadedFile;
    }

    public void displayUploadedFiles()
    {
        if (uploadedFiles.isEmpty()) {
            System.out.println("No files uploaded yet.");
            return;
        }

        System.out.println("\n========== UPLOADED FILES ==========");

        for (UploadedFile file : uploadedFiles) {
            System.out.println(file);
            System.out.println("--------------------------------");
        }
    }
}
