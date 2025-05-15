package app.cvbuilder;

import app.cvbuilder.model.Profile;
import app.cvbuilder.model.Contact;
import app.cvbuilder.model.Education;
import app.cvbuilder.model.EducationSection;
import app.cvbuilder.model.OrganizationExperience;
import app.cvbuilder.model.OrganizationSection;
import app.cvbuilder.model.Achievement;
import app.cvbuilder.model.AchievementSection;
import app.cvbuilder.model.Internship;
import app.cvbuilder.model.InternshipSection;
import app.cvbuilder.model.Skills;
import app.cvbuilder.model.SkillsSection;
import app.cvbuilder.model.CVSection;

import app.util.InputHelper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CV BUILDER ===");

        // Profil dan Kontak
        String name = InputHelper.getString("Masukkan nama Anda: ");
        String title = InputHelper.getString("Masukkan profesi Anda: ");
        String summary = InputHelper.getString("Masukkan ringkasan singkat tentang anda: ");
        Profile profile = new Profile(name, title, summary);

        String email = InputHelper.getEmail("Masukkan email Anda: ");
        String phone = InputHelper.getPhoneNumber("Masukkan nomor telepon Anda: ");
        String address = InputHelper.getString("Masukkan alamat Anda: ");
        Contact contact = new Contact(email, phone, address);

        // Pendidikan
        List<Education> educations = new ArrayList<>();
        int eduCount = InputHelper.getInt("Berapa banyak pendidikan yang ingin dimasukkan? (yang telah ditempuh): ");
        for (int i = 0; i < eduCount; i++) {
            System.out.println("Pendidikan #" + (i + 1));
            String degree = InputHelper.getString("Gelar: ");
            String institution = InputHelper.getString("Institusi: ");
            String start = InputHelper.getString("Tahun Mulai: ");
            String end = InputHelper.getString("Tahun Selesai: ");
            educations.add(new Education(degree, institution, start, end));
        }

        // Skills
        List<Skills> skills = new ArrayList<>();
        int sklCount = InputHelper.getInt("Berapa banyak keahlian yang ingin dimasukkan?: ");
        for (int i = 0; i < sklCount; i++) {
            System.out.println("Skills #" + (i + 1));
            String skillName = InputHelper.getString("Keahlian: ");
            String level = InputHelper.getString("Tingkatan/Level: ");
            skills.add(new Skills(skillName, level));
        }

        // Internship
        List<Internship> internships = new ArrayList<>();
        int intCount = InputHelper.getInt("Berapa banyak pengalaman kerja yang ingin dimasukkan?: ");
        for (int i = 0; i < intCount; i++) {
            System.out.println("Internship #" + (i + 1));
            String company = InputHelper.getString("Perusahaan/Instansi: ");
            String position = InputHelper.getString("Posisi: ");
            String start = InputHelper.getString("Tanggal/Tahun mulai: ");
            String end = InputHelper.getString("Tanggal/Tahun selesai: ");
            String responsibilities = InputHelper.getString("Responsibilities: ");
            internships.add(new Internship(company, position, start, end, responsibilities));
        }

        // Prestasi
        List<Achievement> achievements = new ArrayList<>();
        int achCount = InputHelper.getInt("Berapa banyak prestasi yang ingin anda masukkan?: ");
        for (int i = 0; i < achCount; i++) {
            System.out.println("Prestasi #" + (i + 1));
            String titleAch = InputHelper.getString("Judul: ");
            String desc = InputHelper.getString("Deskripsi: ");
            String year = InputHelper.getString("Tahun: ");
            achievements.add(new Achievement(titleAch, desc, year));
        }

        // Pengalaman Organisasi
        List<OrganizationExperience> orgs = new ArrayList<>();
        int orgCount = InputHelper.getInt("Berapa banyak pengalaman organisasi yang ingin dimasukkan?: ");
        for (int i = 0; i < orgCount; i++) {
            System.out.println("Organization #" + (i + 1));
            String role = InputHelper.getString("Peran: ");
            String orgName = InputHelper.getString("Nama Organisasi: ");
            String start = InputHelper.getString("Tanggal/Tahun Mulai: ");
            String end = InputHelper.getString("Tanggal/Tahun Selesai: ");
            String desc = InputHelper.getString("Deskripsi: ");
            orgs.add(new OrganizationExperience(role, orgName, start, end, desc));
        }

        // Buat section
        CVSection educationSection = new EducationSection(educations);
        CVSection skillSection = new SkillsSection(skills);
        CVSection internshipSection = new InternshipSection(internships);
        CVSection achievementSection = new AchievementSection(achievements);
        CVSection organizationSection = new OrganizationSection(orgs);

        // Tampilkan CV
        System.out.println("\n=== CURRICULLUM VITAE ===\n");
        System.out.println(profile);
        System.out.println(contact + "\n");

        if (!educations.isEmpty()) {
            System.out.println(educationSection.getSectionTitle());
            System.out.println(educationSection.getFormattedContent());
        }

        if (!skills.isEmpty()) {
            System.out.println(skillSection.getSectionTitle());
            System.out.println(skillSection.getFormattedContent());
        }

        if (!internships.isEmpty()) {
            System.out.println(internshipSection.getSectionTitle());
            System.out.println(internshipSection.getFormattedContent());
        }

        if (!achievements.isEmpty()) {
            System.out.println(achievementSection.getSectionTitle());
            System.out.println(achievementSection.getFormattedContent());
        }

        if (!orgs.isEmpty()) {
            System.out.println(organizationSection.getSectionTitle());
            System.out.println(organizationSection.getFormattedContent());
        }
    }
}