package app.cvbuilder.model;

import java.util.List;

public class InternshipSection implements CVSection {
    private List<Internship> entries;

    public InternshipSection(List<Internship> entries) {
        this.entries = entries;
    }

    @Override
    public String getSectionTitle() {
        return "Pengalaman Kerja \n--------------------------------------------------------";
    }

    @Override
    public String getFormattedContent() {
        StringBuilder sb = new StringBuilder();
        for (Internship i : entries) {
            sb.append("- ").append(i.formatForDisplay()).append("\n");
        }
        return sb.toString();
    }
}