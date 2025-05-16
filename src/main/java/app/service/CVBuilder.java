package app.service;

import app.cvbuilder.model.CVEntry; // Pastikan import CVEntry

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfDocument;

import java.io.FileNotFoundException;

public class CVBuilder {

    // Method untuk membuat dan mengekspor data CV ke dalam file PDF
    public void generateCV(String filePath, String name, String email, String summary) {
        try (PdfWriter writer = new PdfWriter(filePath);
                PdfDocument pdf = new PdfDocument(writer);
                Document document = new Document(pdf)) {

            // Menambahkan informasi CV ke dalam PDF
            document.add(new Paragraph("Curriculum Vitae"));
            document.add(new Paragraph("Nama: " + name));
            document.add(new Paragraph("Email: " + email));
            document.add(new Paragraph("Deskripsi: " + summary));

            // Menutup dokumen secara otomatis
            System.out.println("CV berhasil diekspor ke " + filePath);
        } catch (FileNotFoundException e) {
            System.err.println("File tidak ditemukan: " + e.getMessage());
        }
    }
}
