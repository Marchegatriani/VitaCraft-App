package app.cvbuilder.model;

public class Education extends CVEntry {
    private String degree;
    private String institution;

    public Education(String degree, String institution, String start, String end) {
        super(start, end);
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
    public String formatForDisplay() {
        return degree + " at " + institution + " " + super.formatForDisplay();
    }

    @Override
    public String toString() {
        return formatForDisplay();
    }
}