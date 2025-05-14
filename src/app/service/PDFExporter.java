package app.service;

import app.model.CVEntry;  // Pastikan import CVEntry

public class PDFExporter {

    // Method untuk mengekspor data CV ke dalam file PDF
    public void exportCV(String filePath, String name, String email, String summary) {
        CVBuilder cvBuilder = new CVBuilder();
        cvBuilder.generateCV(filePath, name, email, summary);
    }
}
