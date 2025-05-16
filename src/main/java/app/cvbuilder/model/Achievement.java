package app.cvbuilder.model;

public class Achievement extends CVEntry {
    private String title;
    private String description;

    public Achievement(String title, String description, String year) {
        super(year, year); // Tahun yang sama, bisa disesuaikan kalau perlu
        this.title = title;
        this.description = description;
    }

    // Getter & Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String formatForDisplay() {
        return title + " (" + getStart() + "): " + description;
    }

    @Override
    public String toString() {
        return formatForDisplay();
    }
}