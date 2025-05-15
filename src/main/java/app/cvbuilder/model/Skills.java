package app.cvbuilder.model;

public class Skills {
    private String skillName;
    private String level;

    public Skills(String skillName, String level) {
        this.skillName = skillName;
        this.level = level;
    }

    public String getSkillName() {
        return skillName;
    }

    public String getLevel() {
        return level;
    }

    public String formatForDisplay() {
        return skillName + " (" + level + ")";
    }

    @Override
    public String toString() {
        return formatForDisplay();
    }
}
