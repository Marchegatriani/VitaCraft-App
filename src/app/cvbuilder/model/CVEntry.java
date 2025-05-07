package app.cvbuilder.model;

public abstract class CVEntry {
    protected String title;
    protected String startDate;
    protected String endDate;
    protected String description;

    public CVEntry(String title, String startDate, String endDate, String description) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public abstract void display();

    public String getTitle() { return title; }
    public String getStartDate() { return startDate; }
    public String getEndDate() { return endDate; }
    public String getDescription() { return description; }

    public void setTitle(String title) { this.title = title; }
    public void setStartDate(String startDate) { this.startDate = startDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }
    public void setDescription(String description) { this.description = description; }
}
