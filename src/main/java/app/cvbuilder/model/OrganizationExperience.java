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

    //setter getter
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}