package app.cvbuilder.model;
import java.util.List;

public class InternshipSection implements CVSection {
    private List<Internshipp> entries;

    public InternshipSection(List<Internshipp> entries) {
        this.entries = entries;
    }


    public String getSectionTitle() {
        return "Internships";  // Judul bagian Internships
    }

    public String getFormattedContent() {
        StringBuilder sb = new StringBuilder();
        for (Internshipp i : entries) {
            sb.append("- ").append(i.formatForDisplay()).append("\n");  // Menambahkan setiap entri magang dalam format
        }
        return sb.toString();  // Mengembalikan isi dalam format yang sudah diatur
    }
}
