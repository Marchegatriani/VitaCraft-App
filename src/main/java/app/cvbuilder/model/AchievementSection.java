package app.cvbuilder.model;

import java.util.List;

public class AchievementSection implements CVSection {
    private List<Achievement> entries;

    public AchievementSection(List<Achievement> entries) {
        this.entries = entries;
    }

    @Override
    public String getSectionTitle() {
        return "Prestasi \n--------------------------------------------------------";
    }

    @Override
    public String getFormattedContent() {
        StringBuilder sb = new StringBuilder();
        for (Achievement ach : entries) {
            sb.append("- ").append(ach.formatForDisplay()).append("\n");
        }
        return sb.toString();
    }
}/