package app.cvbuilder.model;

public abstract class CVEntry {
    private String start;
    private String end;

    public CVEntry(){
        
    }

    public CVEntry(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public void setStart(String start) {
        this.start = start;
    }
    public String getStart() {
        return start;
    }

    public void setEnd(String end) {
        this.end = end;
    }
    public String getEnd() {
        return end;
    }

    public abstract String formatForDisplay();

}