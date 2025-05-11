package app.cvbuilder.model;

public class Internshipp extends CVEntry {
    private String company;
    private String position;
    private String responsibilities;

    public Internshipp(String company, String position, String startDate, String endDate, String responsibilities) {
        super(position + " at " + company, startDate, endDate, responsibilities);  // Menggunakan title yang digabungkan
        this.company = company;
        this.position = position;
        this.responsibilities = responsibilities;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    // Format string untuk ditampilkan
    @Override   
    public String toString() {
        return getTitle() + " (" + getStartDate() + " - " + getEndDate() + "): " + getDescription();
    }

    // Menampilkan informasi lebih terformat
    
    public String formatForDisplay() {
        return position + " at " + company + " (" + getStartDate() + " - " + getEndDate() + "): " + responsibilities;
    }
}
