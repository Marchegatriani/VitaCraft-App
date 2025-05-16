package app.cvbuilder.model;

import java.io.Serializable;
import java.util.Objects;

public class Contact implements Serializable {
    private String email;
    private String phone;
    private String address;
    private String linkedIn;
    private String website;

    public Contact() {}

    public Contact(String email, String phone, String address, String linkedIn, String website) {
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.linkedIn = linkedIn;
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", linkedIn='" + linkedIn + '\'' +
                ", website='" + website + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        return Objects.equals(email, contact.email) &&
            Objects.equals(phone, contact.phone) &&
            Objects.equals(address, contact.address) &&
            Objects.equals(linkedIn, contact.linkedIn) &&
            Objects.equals(website, contact.website);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, phone, address, linkedIn, website);
    }
}