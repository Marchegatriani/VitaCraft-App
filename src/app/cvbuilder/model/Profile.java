package app.cvbuilder.model;

import java.io.Serializable;
import java.util.Objects;

public class Profile implements Serializable {
    private String name;
    private String title;
    private String summary;

    public Profile() {}

    public Profile(String name, String title, String summary) {
        this.name = name;
        this.title = title;
        this.summary = summary;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
public String toString() {
    return  "+---------------------------+\n" +
            "|       PROFILE INFO       |\n" +
            "+---------------------------+\n" +
            "| Full Name : " + name + "\n" +
            "| title  : " + title + "\n" +
            "| Summary   : " + summary + "\n" +
            "+---------------------------+";
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Profile profile = (Profile) o;

        return Objects.equals(name, profile.name) &&
               Objects.equals(title, profile.title) &&
               Objects.equals(summary, profile.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, title, summary);
    }
}