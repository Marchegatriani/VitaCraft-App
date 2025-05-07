package app.cvbuilder.model;

import java.util.List;

public class OrganizationSection implements CVSection {
    private List<OrganizationExperience> entries;

    public OrganizationSection(List<OrganizationExperience> entries) {
        this.entries = entries;
    }

    @Override
    public String getSectionTitle() {
        return "Organizational Experience";
    }

    @Override
    public String getFormattedContent() {
        StringBuilder sb = new StringBuilder();
        for (OrganizationExperience org : entries) {
            sb.append("- ").append(org.formatForDisplay()).append("\n");
        }
        return sb.toString();
    }
}