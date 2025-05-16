import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import app.cvbuilder.model.Achievement;
import app.cvbuilder.model.AchievementSection;
import app.cvbuilder.model.CVSection;
import app.cvbuilder.model.Contact;
import app.cvbuilder.model.Education;
import app.cvbuilder.model.EducationSection;
import app.cvbuilder.model.Internship;
import app.cvbuilder.model.InternshipSection;
import app.cvbuilder.model.OrganizationExperience;
import app.cvbuilder.model.OrganizationSection;
import app.cvbuilder.model.Profile;
import app.cvbuilder.model.Skills;
import app.cvbuilder.model.SkillsSection;

public class CVGuiEnhanced extends JFrame {

    private JTextField nameField, titleField, summaryField, emailField, phoneField, addressField;
    private JPanel educationPanel, achievementPanel, orgPanel, internshipPanel, skillsPanel;
    private JButton addEducationButton, addAchievementButton, addOrgButton, addInternshipButton, addSkillButton;

    private List<EducationInputPanel> educationInputPanels = new ArrayList<>();
    private List<AchievementInputPanel> achievementInputPanels = new ArrayList<>();
    private List<OrgInputPanel> orgInputPanels = new ArrayList<>();
    private List<InternshipInputPanel> internshipInputPanels = new ArrayList<>();
    private List<SkillInputPanel> skillInputPanels = new ArrayList<>();

    public CVGuiEnhanced() {
        setTitle("CV Builder Enhanced");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridBagLayout());
        add(inputPanel, BorderLayout.NORTH);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Panel Profil dan Kontak
        JPanel profileContactPanel = new JPanel(new GridLayout(0, 2));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        inputPanel.add(profileContactPanel, gbc);

        profileContactPanel.add(new JLabel("Nama: "));
        nameField = new JTextField(20);
        profileContactPanel.add(nameField);

        profileContactPanel.add(new JLabel("Gelar: "));
        titleField = new JTextField(20);
        profileContactPanel.add(titleField);

        profileContactPanel.add(new JLabel("Ringkasan singkat diri anda: "));
        summaryField = new JTextField(20);
        profileContactPanel.add(summaryField);

        profileContactPanel.add(new JLabel("Email: "));
        emailField = new JTextField(20);
        profileContactPanel.add(emailField);

        profileContactPanel.add(new JLabel("Nomor HP: "));
        phoneField = new JTextField(20);
        profileContactPanel.add(phoneField);

        profileContactPanel.add(new JLabel("Alamat:"));
        addressField = new JTextField(20);
        profileContactPanel.add(addressField);

        // Panels for CV Sections
        educationPanel = new JPanel(new GridLayout(0, 1));
        achievementPanel = new JPanel(new GridLayout(0, 1));
        orgPanel = new JPanel(new GridLayout(0, 1));
        internshipPanel = new JPanel(new GridLayout(0, 1));
        skillsPanel = new JPanel(new GridLayout(0, 1));

        // Add Buttons for adding entries
        addEducationButton = new JButton("Tambahkan Riwayat Pendidikan");
        addSkillButton = new JButton("Tambahkan Keahlian");
        addInternshipButton = new JButton("Tambahkan Pengalaman Bekerja/Magang");
        addAchievementButton = new JButton("Tambahkan Prestasi");
        addOrgButton = new JButton("Tambahkan Riwayat Organisasi");

        // Action Listeners
        addEducationButton.addActionListener(e -> addEducationEntry());
        addSkillButton.addActionListener(e -> addSkillEntry());
        addInternshipButton.addActionListener(e -> addInternshipEntry());
        addAchievementButton.addActionListener(e -> addAchievementEntry());
        addOrgButton.addActionListener(e -> addOrgEntry());

        // Add panels and buttons to inputPanel
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        inputPanel.add(new JLabel("Pendidikan"), gbc);

        gbc.gridx = 1;
        inputPanel.add(educationPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        inputPanel.add(addEducationButton, gbc);

        // Skill
        gbc.gridx = 0;
        gbc.gridy = 9;
        inputPanel.add(new JLabel("Keahlian"), gbc);

        gbc.gridx = 1;
        inputPanel.add(skillsPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 10;
        inputPanel.add(addSkillButton, gbc);

        // Intern
        gbc.gridx = 0;
        gbc.gridy = 7;
        inputPanel.add(new JLabel("Pengalaman Bekerja/Magang"), gbc);

        gbc.gridx = 1;
        inputPanel.add(internshipPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        inputPanel.add(addInternshipButton, gbc);

        // Achiev
        gbc.gridx = 0;
        gbc.gridy = 3;
        inputPanel.add(new JLabel("Prestasi"), gbc);

        gbc.gridx = 1;
        inputPanel.add(achievementPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        inputPanel.add(addAchievementButton, gbc);

        // Org
        gbc.gridx = 0;
        gbc.gridy = 5;
        inputPanel.add(new JLabel("Pengalaman Organisasi"), gbc);

        gbc.gridx = 1;
        inputPanel.add(orgPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        inputPanel.add(addOrgButton, gbc);

        JButton generateCvButton = new JButton("Generate CV");
        generateCvButton.addActionListener(e -> generateCV());
        add(generateCvButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void addEducationEntry() {
        EducationInputPanel eduInputPanel = new EducationInputPanel();
        educationInputPanels.add(eduInputPanel);
        educationPanel.add(eduInputPanel);
        educationPanel.revalidate();
        educationPanel.repaint();
    }

    private void addSkillEntry() {
        SkillInputPanel skillInputPanel = new SkillInputPanel();
        skillInputPanels.add(skillInputPanel);
        skillsPanel.add(skillInputPanel);
        skillsPanel.revalidate();
        skillsPanel.repaint();
    }

    private void addInternshipEntry() {
        InternshipInputPanel internshipInputPanel = new InternshipInputPanel();
        internshipInputPanels.add(internshipInputPanel);
        internshipPanel.add(internshipInputPanel);
        internshipPanel.revalidate();
        internshipPanel.repaint();
    }

    private void addAchievementEntry() {
        AchievementInputPanel achInputPanel = new AchievementInputPanel();
        achievementInputPanels.add(achInputPanel);
        achievementPanel.add(achInputPanel);
        achievementPanel.revalidate();
        achievementPanel.repaint();
    }

    private void addOrgEntry() {
        OrgInputPanel orgInputPanel = new OrgInputPanel();
        orgInputPanels.add(orgInputPanel);
        orgPanel.add(orgInputPanel);
        orgPanel.revalidate();
        orgPanel.repaint();
    }

    private void generateCV() {
        // Get data from fields
        String name = nameField.getText();
        String title = titleField.getText();
        String summary = summaryField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String address = addressField.getText();

        // Validate required fields
        if (name.isEmpty() || title.isEmpty() || summary.isEmpty() || email.isEmpty() || phone.isEmpty()
                || address.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Semua data (Nama, Profesi, Ringkasan singkat diri anda, Email, Nomor HP, Alamat) harus diisi.",
                    "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate phone number as integer
        try {
            Integer.parseInt(phone);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nomor HP harus berupa angka.", "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate email format
        String emailRegex = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
        if (!email.matches(emailRegex)) {
            JOptionPane.showMessageDialog(this, "Email harus berformat valid (contoh: nama@gmail.com).",
                    "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Profile profile = new Profile(name, title, summary);
        Contact contact = new Contact(email, phone, address);

        // Get data from input panels
        List<Education> educations = new ArrayList<>();
        for (EducationInputPanel panel : educationInputPanels) {
            Education edu = panel.getEducation();
            if (edu != null) {
                educations.add(edu);
            }
        }

        List<Achievement> achievements = new ArrayList<>();
        for (AchievementInputPanel panel : achievementInputPanels) {
            Achievement ach = panel.getAchievement();
            if (ach != null) {
                achievements.add(ach);
            }
        }

        List<OrganizationExperience> orgs = new ArrayList<>();
        for (OrgInputPanel panel : orgInputPanels) {
            OrganizationExperience org = panel.getOrg();
            if (org != null) {
                orgs.add(org);
            }
        }

        List<Internship> internships = new ArrayList<>();
        for (InternshipInputPanel panel : internshipInputPanels) {
            Internship internship = panel.getInternship();
            if (internship != null) {
                internships.add(internship);
            }
        }

        List<Skills> skills = new ArrayList<>();
        for (SkillInputPanel panel : skillInputPanels) {
            Skills skill = panel.getSkill();
            if (skill != null) {
                skills.add(skill);
            }
        }

        // Create sections
        CVSection educationSection = new EducationSection(educations);
        CVSection achievementSection = new AchievementSection(achievements);
        CVSection organizationSection = new OrganizationSection(orgs);
        CVSection internshipSection = new InternshipSection(internships);
        CVSection skillSection = new SkillsSection(skills);

        // Generate CV output
        StringBuilder cvContent = new StringBuilder();
        cvContent.append(name).append("\n"); // Nama
        cvContent.append(title).append("\n"); // Gelar/Title
        cvContent.append("Contact:\n"); // Judul Contact
        cvContent.append("Email: ").append(email).append("\n");
        cvContent.append("Phone: ").append(phone).append("\n");
        cvContent.append("Address: ").append(address).append("\n\n");
        cvContent.append("Profil\n"); // Judul Ringkasan Diri
        cvContent.append(summary).append("\n\n");

        if (!educations.isEmpty()) {
            cvContent.append(educationSection.getSectionTitle()).append("\n");
            cvContent.append(educationSection.getFormattedContent()).append("\n");
        }

        if (!achievements.isEmpty()) {
            cvContent.append(achievementSection.getSectionTitle()).append("\n");
            cvContent.append(achievementSection.getFormattedContent()).append("\n");
        }

        if (!orgs.isEmpty()) {
            cvContent.append(organizationSection.getSectionTitle()).append("\n");
            cvContent.append(organizationSection.getFormattedContent()).append("\n");
        }

        if (!internships.isEmpty()) {
            cvContent.append(internshipSection.getSectionTitle()).append("\n");
            cvContent.append(internshipSection.getFormattedContent()).append("\n");
        }

        if (!skills.isEmpty()) {
            cvContent.append(skillSection.getSectionTitle()).append("\n");
            cvContent.append(skillSection.getFormattedContent()).append("\n");
        }

        // Open a new frame for CV output
        SwingUtilities.invokeLater(() -> {
            JFrame outputFrame = new JFrame("CV Output");
            outputFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the output frame
            JTextArea outputTextArea = new JTextArea(cvContent.toString());
            outputTextArea.setEditable(false);
            JScrollPane outputScrollPane = new JScrollPane(outputTextArea);
            outputFrame.getContentPane().add(outputScrollPane);
            outputFrame.setSize(600, 800); // Adjust size as needed
            outputFrame.setLocationRelativeTo(this); // Center the frame relative to the main frame
            outputFrame.setVisible(true);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CVGuiEnhanced::new);
    }

    // Input Panels (Separate Classes for better organization)

    class EducationInputPanel extends JPanel {
        private JTextField degreeField = new JTextField(15);
        private JTextField institutionField = new JTextField(15);
        private JTextField startYearField = new JTextField(5);
        private JTextField endYearField = new JTextField(5);

        public EducationInputPanel() {
            setLayout(new FlowLayout(FlowLayout.LEFT));
            add(new JLabel("Gelar:"));
            add(degreeField);
            add(new JLabel("Institusi:"));
            add(institutionField);
            add(new JLabel("Tahun Mulai:"));
            add(startYearField);
            add(new JLabel("Tahun Selesai:"));
            add(endYearField);
        }

        public Education getEducation() {
            String degree = degreeField.getText();
            String institution = institutionField.getText();
            String startYear = startYearField.getText();
            String endYear = endYearField.getText();
            if (degree.isEmpty() || institution.isEmpty() || startYear.isEmpty() || endYear.isEmpty()) {
                return null; // or show an error message
            }
            if (Integer.parseInt(startYear) >= Integer.parseInt(endYear)) {
                JOptionPane.showMessageDialog(this, "Tahun Mulai harus lebih kecil dari Tahun Selesai.",
                        "Validation Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            return new Education(degree, institution, startYear, endYear);
        }
    }

    class AchievementInputPanel extends JPanel {
        private JTextField titleField = new JTextField(15);
        private JTextField descriptionField = new JTextField(20);
        private JTextField yearField = new JTextField(5);

        public AchievementInputPanel() {
            setLayout(new FlowLayout(FlowLayout.LEFT));
            add(new JLabel("Judul:"));
            add(titleField);
            add(new JLabel("Deskripsi:"));
            add(descriptionField);
            add(new JLabel("Tahun:"));
            add(yearField);
        }

        public Achievement getAchievement() {
            String title = titleField.getText();
            String description = descriptionField.getText();
            String year = yearField.getText();
            if (title.isEmpty() || description.isEmpty() || year.isEmpty()) {
                return null;
            }
            return new Achievement(title, description, year);
        }
    }

    class OrgInputPanel extends JPanel {
        private JTextField roleField = new JTextField(10);
        private JTextField orgNameField = new JTextField(10);
        private JTextField startDateField = new JTextField(5);
        private JTextField endDateField = new JTextField(5);
        private JTextField descriptionField = new JTextField(20);

        public OrgInputPanel() {
            setLayout(new FlowLayout(FlowLayout.LEFT));
            add(new JLabel("Jabatan:"));
            add(roleField);
            add(new JLabel("Organisasi:"));
            add(orgNameField);
            add(new JLabel("Tahun Mulai:"));
            add(startDateField);
            add(new JLabel("Tahun Selesai:"));
            add(endDateField);
            add(new JLabel("Deskripsi:"));
            add(descriptionField);
        }

        public OrganizationExperience getOrg() {
            String role = roleField.getText();
            String orgName = orgNameField.getText();
            String startDate = startDateField.getText();
            String endDate = endDateField.getText();
            String description = descriptionField.getText();
            if (role.isEmpty() || orgName.isEmpty() || startDate.isEmpty() || endDate.isEmpty()
                    || description.isEmpty()) {
                return null;
            }
            if (Integer.parseInt(startDate) >= Integer.parseInt(endDate)) {
                JOptionPane.showMessageDialog(this, "Tahun Mulai harus lebih kecil dari Tahun Selesai.",
                        "Validation Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            return new OrganizationExperience(role, orgName, startDate, endDate, description);
        }
    }

    class InternshipInputPanel extends JPanel {
        private JTextField companyField = new JTextField(10);
        private JTextField positionField = new JTextField(10);
        private JTextField startDateField = new JTextField(5);
        private JTextField endDateField = new JTextField(5);
        private JTextField responsibilitiesField = new JTextField(20);

        public InternshipInputPanel() {
            setLayout(new FlowLayout(FlowLayout.LEFT));
            add(new JLabel("Perusahaan:"));
            add(companyField);
            add(new JLabel("Jabatan:"));
            add(positionField);
            add(new JLabel("Tahun Mulai:"));
            add(startDateField);
            add(new JLabel("Tahun Selesai:"));
            add(endDateField);
            add(new JLabel("Tanggung Jawab:"));
            add(responsibilitiesField);
        }

        public Internship getInternship() {
            String company = companyField.getText();
            String position = positionField.getText();
            String startDate = startDateField.getText();
            String endDate = endDateField.getText();
            String responsibilities = responsibilitiesField.getText();
            if (company.isEmpty() || position.isEmpty() || startDate.isEmpty() || endDate.isEmpty()
                    || responsibilities.isEmpty()) {
                return null;
            }
            return new Internship(company, position, startDate, endDate, responsibilities);
        }
    }

    class SkillInputPanel extends JPanel {
        private JTextField skillNameField = new JTextField(15); // Lebihkan sedikit ukurannya

        public SkillInputPanel() {
            setLayout(new FlowLayout(FlowLayout.LEFT));
            add(new JLabel("Keahlian:"));
            add(skillNameField);
            // Input level dihapus
        }

        public Skills getSkill() {
            String skillName = skillNameField.getText();
            if (skillName.isEmpty()) {
                return null;
            }
            return new Skills(skillName, ""); // Level dikosongkan
        }
    }
}