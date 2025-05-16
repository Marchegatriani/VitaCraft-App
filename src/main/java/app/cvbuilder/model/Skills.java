package app.cvbuilder.model;

public class Skills extends CVEntry {
    private String skillName;

    public Skills(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillName() {
        return skillName;
    }

    @Override
    public String formatForDisplay() {
        return skillName;
    }

    @Override
    public String toString() {
        return formatForDisplay();
    }
}
