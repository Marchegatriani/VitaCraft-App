package app.cvbuilder.model;

public abstract class CVEntry {
    private String start;
    private String end;

    public CVEntry(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public String formatForDisplay() {
        return "(" + start + " - " + end + ")";
    } 
}