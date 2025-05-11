package app.cvbuilder;

import app.cvbuilder.model.Profile;
import app.cvbuilder.model.Contact;
import app.cvbuilder.model.Education;
import app.cvbuilder.model.EducationSection;
import app.cvbuilder.model.OrganizationExperience;
import app.cvbuilder.model.OrganizationSection;
import app.cvbuilder.model.Achievement;
import app.cvbuilder.model.AchievementSection;
import app.util.InputHelper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CV BUILDER ===");

        // Profil dan Kontak
        String name = InputHelper.getString("Enter your name: ");
        String title = InputHelper.getString("Enter your title: ");
        String summary = InputHelper.getString("Enter a short summary: ");
        Profile profile = new Profile(name, title, summary);

        String email = InputHelper.getEmail("Enter your email: ");
        String phone = InputHelper.getPhoneNumber("Enter your phone number: ");
        String address = InputHelper.getString("Enter your address: ");
        String linkedIn = InputHelper.getString("Enter your LinkedIn Account: ");
        Contact contact = new Contact(email, phone, address, linkedIn);

        // Buat section untuk Pendidikan
        EducationSection educationSection = new EducationSection();
        int eduCount = InputHelper.getInt("How many education entries?: ");
        for (int i = 0; i < eduCount; i++) {
            System.out.println("Education #" + (i + 1));
            String degree = InputHelper.getString("Degree: ");
            String institution = InputHelper.getString("Institution: ");
            String start = InputHelper.getString("Start Year: ");
            String end = InputHelper.getString("End Year: ");
            String description = InputHelper.getString("Description: ");
            educationSection.addEducation(new Education(degree, institution, start, end, description));
        }

        // Buat section untuk Prestasi
        AchievementSection achievementSection = new AchievementSection();
        int achCount = InputHelper.getInt("How many achievements?: ");
        for (int i = 0; i < achCount; i++) {
            System.out.println("Achievement #" + (i + 1));
            String titleAch = InputHelper.getString("Title: ");
            String desc = InputHelper.getString("Description: ");
            String year = InputHelper.getString("Year: ");
            achievementSection.addAchievement(new Achievement(titleAch, desc, year));
        }

        // Pengalaman Organisasi
        OrganizationSection organizationSection = new OrganizationSection(new ArrayList<>());
        int orgCount = InputHelper.getInt("How many organizational experiences?: ");
        for (int i = 0; i < orgCount; i++) {
            System.out.println("Organization #" + (i + 1));
            String role = InputHelper.getString("Role: ");
            String orgName = InputHelper.getString("Organization Name: ");
            String start = InputHelper.getString("Start Date: ");
            String end = InputHelper.getString("End Date: ");
            String desc = InputHelper.getString("Description: ");
            organizationSection.addEntry(new OrganizationExperience(role, orgName, start, end, desc));
        }

        // Tampilkan CV
        System.out.println("\n=== CURRICULUM VITAE ===\n");
        System.out.println(profile);
        System.out.println(contact + "\n");
        System.out.println(educationSection.getFormattedContent());
        System.out.println(achievementSection);
        System.out.println(organizationSection.getFormattedContent());
    }
}