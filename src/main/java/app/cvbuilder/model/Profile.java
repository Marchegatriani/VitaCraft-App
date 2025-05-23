package app.cvbuilder.model;

public class Profile {
    private String name;
    private String summary;

    public Profile(String name, String summary) {
        this.name = name;
        this.summary = summary;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}