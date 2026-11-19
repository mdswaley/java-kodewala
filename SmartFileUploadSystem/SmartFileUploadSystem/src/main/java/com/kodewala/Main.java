package com.kodewala;

import com.kodewala.exception.DuplicateFileException;
import com.kodewala.exception.FileSizeExceededException;
import com.kodewala.exception.InvalidFileNameException;
import com.kodewala.exception.UnsupportedFileTypeException;
import com.kodewala.model.UploadedFile;
import com.kodewala.service.FileUploadService;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FileUploadService service = new FileUploadService();

        while (true){
            System.out.println("\n========== SMART FILE UPLOAD SYSTEM ==========");
            System.out.println("1. Upload File");
            System.out.println("2. View Uploaded Files");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Please enter a valid number!");
                continue;
            }

            switch (choice){

                case 1:

                    System.out.print("Enter file path: ");
                    String filePath = sc.nextLine();

                    try {

                        UploadedFile uploadedFile = service.uploadFile(filePath);

                        System.out.println("\nFile uploaded successfully!");
                        System.out.println(uploadedFile);

                    }
                    catch (InvalidFileNameException e) {
                        System.out.println("Invalid File Name: " + e.getMessage());
                    }
                    catch (FileSizeExceededException e) {
                        System.out.println("File Size Error: " + e.getMessage());
                    }
                    catch (UnsupportedFileTypeException e) {
                        System.out.println("File Type Error: " + e.getMessage());
                    }
                    catch (DuplicateFileException e) {
                        System.out.println("Duplicate File: " + e.getMessage());
                    }
                    catch (FileNotFoundException e) {
                        System.out.println("File Not Found: " + e.getMessage());
                    }

                    break;

                case 2:
                    service.displayUploadedFiles();
                    break;

                case 3:
                    System.out.println("Thank you for using Smart File Upload System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}