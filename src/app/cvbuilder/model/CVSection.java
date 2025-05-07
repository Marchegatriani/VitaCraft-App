package app.cvbuilder.model;

import java.util.ArrayList;
import java.util.List;

public class CVSection<T extends CVEntry> {
    private final String sectionTitle;
    private final List<T> entries;

    public CVSection(String sectionTitle) {
        this.sectionTitle = sectionTitle;
        this.entries = new ArrayList<>();
    }

    public void addEntry(T entry) {
        entries.add(entry);
    }

    public void displaySection() {
        System.out.println("\n=== " + sectionTitle + " ===");
        for (T entry : entries) {
            entry.display();
        }
    }

    public List<T> getEntries() {
        return entries;
    }
}
