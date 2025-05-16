import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PDFExporter {
    public static void exportProfile(String name, String email, String summary, String[] education) {
        String dest = "output.pdf"; // Nama file PDF yang akan dihasilkan

        try {
            PdfWriter writer = new PdfWriter(new File(dest));
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            // Menambahkan konten ke PDF
            document.add(new Paragraph("Profil Pengguna"));
            document.add(new Paragraph("Nama: " + name));
            document.add(new Paragraph("Email: " + email));
            document.add(new Paragraph("Ringkasan: " + summary));

            document.add(new Paragraph("Pendidikan:"));
            for (String edu : education) {
                document.add(new Paragraph(edu));
            }

            document.close();
            System.out.println("PDF created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}