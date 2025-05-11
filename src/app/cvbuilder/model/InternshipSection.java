package app.cvbuilder.model;

import java.util.List;

public class InternshipSection implements CVSection {
    private List<Internshipp> entries;

    public InternshipSection(List<Internshipp> entries) {
        this.entries = entries;
    }

    @Override
    public String getSectionTitle() {
        return "Internships";
    }

    @Override
    public String getFormattedContent() {
        StringBuilder sb = new StringBuilder();
        for (Internshipp i : entries) {
            sb.append("- ").append(i.formatForDisplay()).append("\n");
        }
        return sb.toString();
    }
}