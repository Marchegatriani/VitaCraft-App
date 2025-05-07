package app.cvbuilder.model;

import java.io.Serializable;
import java.util.Objects;

public class Profile implements Serializable {
    private String fullName;
    private String headline;
    private String summary;

    public Profile() {}

    public Profile(String fullName, String headline, String summary) {
        this.fullName = fullName;
        this.headline = headline;
        this.summary = summary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "fullName='" + fullName + '\'' +
                ", headline='" + headline + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Profile profile = (Profile) o;

        return Objects.equals(fullName, profile.fullName) &&
               Objects.equals(headline, profile.headline) &&
               Objects.equals(summary, profile.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, headline, summary);
    }
}