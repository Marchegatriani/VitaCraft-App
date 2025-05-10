package app.cvbuilder.model;

import java.io.Serializable;
import java.util.Objects;

public class Achievement implements Serializable {
    private String title;
    private String description;
    private String date;

    public Achievement() {}

    public Achievement(String title, String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Title      : " + title + "\n" +
               "Description: " + description + "\n" +
               "Date       : " + date;
    }    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Achievement that = (Achievement) o;

        return Objects.equals(title, that.title) &&
               Objects.equals(description, that.description) &&
               Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, date);
    }
}