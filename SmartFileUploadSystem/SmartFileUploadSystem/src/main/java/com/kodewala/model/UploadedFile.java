package com.kodewala.model;

public class UploadedFile {
    private String fileName;
    private double fileSize;
    private String filePath;

    public UploadedFile(String fileName, double fileSize, String filePath) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public double getFileSize() {
        return fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public String toString() {
        return "UploadedFile{" +
                "fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
