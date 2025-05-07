package app.cvbuilder.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AchievementSection implements Serializable {
    private List<Achievement> achievements;

    public AchievementSection() {
        this.achievements = new ArrayList<>();
    }

    public AchievementSection(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    public void addAchievement(Achievement achievement) {
        this.achievements.add(achievement);
    }

    public void removeAchievement(Achievement achievement) {
        this.achievements.remove(achievement);
    }

    @Override
    public String toString() {
        return "AchievementSection{" +
                "achievements=" + achievements +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AchievementSection that = (AchievementSection) o;

        return Objects.equals(achievements, that.achievements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(achievements);
    }
}