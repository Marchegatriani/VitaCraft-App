package app.cvbuilder.model;

public class OrganizationExperience extends CVEntry {
    private String role;
    private String organization;
    private String description;

    public OrganizationExperience(String role, String organization, String start, String end, String description) {
        super(start, end);
        this.role = role;
        this.organization = organization;
        this.description = description;
    }

    @Override
    public String formatForDisplay() {
        return role + " | " + organization + " (" + getStart() + " - " + getEnd() + "): " + description;
    }

    @Override
    public String toString() {
        return formatForDisplay();
    }
}