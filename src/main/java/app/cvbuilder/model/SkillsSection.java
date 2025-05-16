package app.cvbuilder.model;

import java.util.List;

public class SkillsSection implements CVSection {
    private List<Skills> entries;

    public SkillsSection(List<Skills> entries) {
        this.entries = entries;
    }

    @Override
    public String getSectionTitle() {
        return "Keahlian \n--------------------------------------------------------";
    }

    @Override
    public String getFormattedContent() {
        StringBuilder sb = new StringBuilder();
        for (Skills skill : entries) {
            sb.append("- ").append(skill.formatForDisplay()).append("\n");
        }
        return sb.toString();
    }
}
