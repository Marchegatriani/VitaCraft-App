package app.cvbuilder.model;

public class Contact {
    private String email;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String phone;
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String address;

    public Contact(String email, String phone, String address) {
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    // Getter & Setter
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return email + " | " + phone + " | " + address;
    }
}