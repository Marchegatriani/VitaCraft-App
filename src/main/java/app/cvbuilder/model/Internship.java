package app.cvbuilder.model;

public class Internship extends CVEntry {
    private String company;
    private String position;
    private String responsibilities;

    public Internship(String company, String position, String start, String end, String responsibilities) {
        super(start, end);
        this.company = company;
        this.position = position;
        this.responsibilities = responsibilities;
    }
    @Override
    public String formatForDisplay() {
        return position + " di " + company + " (" + getStart() + "-" + getEnd() + ")" + ": " + responsibilities;
    }

    @Override
    public String toString() {
        return formatForDisplay();
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    
    public String getResponsibilities() {
        return responsibilities;
    }
    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }
}