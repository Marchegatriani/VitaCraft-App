package app.cvbuilder.model;

public class OrganizationExperience extends CVEntry {
    private String role;
    private String organization;

    public OrganizationExperience(String role, String organization, String startDate, String endDate, String description) {
        super(role + " at " + organization, startDate, endDate, description); // title diisi gabungan
        this.role = role;
        this.organization = organization;
    }

    @Override
    public void display() {
        System.out.println(role + " at " + organization + " (" + startDate + " - " + endDate + ")");
        System.out.println(description + "\n");
    }

    // Optional: Bisa override toString juga kalau kamu pakai toString untuk tampilan alternatif
    @Override
    public String toString() {
        return role + " at " + organization + " (" + startDate + " - " + endDate + "): " + description;
    }
}
