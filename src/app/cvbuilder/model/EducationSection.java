package app.cvbuilder.model;

import java.util.List;

public class EducationSection implements CVSection {
    private List<Education> entries;

    public EducationSection(List<Education> entries) {
        this.entries = entries;
    }

    @Override
    public String getSectionTitle() {
        return "Education";
    }

    @Override
    public String getFormattedContent() {
        StringBuilder sb = new StringBuilder();
        for (Education edu : entries) {
            sb.append("- ").append(edu.formatForDisplay()).append("\n");
        }
        return sb.toString();
    }
}