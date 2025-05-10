package app.cvbuilder.model;

public class Education extends CVEntry {
    private String degree;
    private String institution;

    public Education(String degree, String institution, String startDate, String endDate, String description) {
        super(degree + " at " + institution, startDate, endDate, description); // Menetapkan title sebagai kombinasi degree dan institution
        this.degree = degree;
        this.institution = institution;
    }

    public String getDegree() {
        return degree;
    }

    public String getInstitution() {
        return institution;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return getTitle() + " (" + getStartDate() + " - " + getEndDate() + "): " + getDescription();
    }
}
