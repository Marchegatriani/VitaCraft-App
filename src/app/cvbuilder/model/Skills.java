package app.cvbuilder.model;

public class Skills extends CVEntry {
    public Skills(String skillName, String level) {

        super(skillName, "", "", level);
    }

    @Override
    public void display() {
        System.out.println("- " + title + " (" + description + ")");
    }

    @Override
    public String toString() {
        return title + " (" + description + ")";
    }
}
