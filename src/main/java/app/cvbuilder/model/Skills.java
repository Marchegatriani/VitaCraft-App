package app.cvbuilder.model;

public class Skills {
    private String skillName;

    public Skills(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillName() {
        return skillName;
    }

    public String formatForDisplay() {
        return skillName;
    }

    @Override
    public String toString() {
        return formatForDisplay();
    }
}
