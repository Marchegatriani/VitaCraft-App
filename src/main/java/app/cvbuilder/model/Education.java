package app.cvbuilder.model;

public class Education extends CVEntry {
    private double ipk;
    private String institution;
    private String major;

    public Education(double ipk, String institution, String major, String start, String end) {
        super(start, end);
        this.ipk = ipk;
        this.institution = institution;
        this.major = major;
    }

    public double getIpk() {
        return ipk;
    }

    public String getInstitution() {
        return institution;
    }

    @Override
    public String formatForDisplay() {
        return institution + ", " + major + " (" + getStart() + " - " + getEnd() + ")\n IPK: " + ipk;
    }

    @Override
    public String toString() {
        return formatForDisplay();
    }
}