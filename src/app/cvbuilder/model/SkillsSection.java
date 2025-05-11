package app.cvbuilder.model;

import java.util.List;

public class SkillsSection implements CVSection {
    private List<Skills> entries;

    public SkillsSection(List<Skills> entries) {
        this.entries = entries;
    }

    @Override
    public String getSectionTitle() {
        return "Skills";
    }

    @Override
    public String getFormattedContent() {
        if (entries.isEmpty()) {
            return "No skills listed.";
        }
        StringBuilder sb = new StringBuilder();
        for (Skills skill : entries) {
            sb.append("- ").append(skill.formatForDisplay()).append("\n");
        }
        return sb.toString();
    }
}
