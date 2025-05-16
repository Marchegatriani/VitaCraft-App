import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import model.*; // Asumsikan package model Anda ada

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

        JPanel inputPanel = new JPanel(new GridBagLayout()); // Use GridBagLayout for more control
        add(inputPanel, BorderLayout.NORTH);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add some padding
        gbc.anchor = GridBagConstraints.WEST; // Align components to the left

        // Panel Profil dan Kontak
        JPanel profileContactPanel = new JPanel(new GridLayout(0, 2));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        inputPanel.add(profileContactPanel, gbc);

        profileContactPanel.add(new JLabel("Name:"));
        nameField = new JTextField(20);
        profileContactPanel.add(nameField);

        profileContactPanel.add(new JLabel("Title:"));
        titleField = new JTextField(20);
        profileContactPanel.add(titleField);

        profileContactPanel.add(new JLabel("Summary:"));
        summaryField = new JTextField(20);
        profileContactPanel.add(summaryField);

        profileContactPanel.add(new JLabel("Email:"));
        emailField = new JTextField(20);
        profileContactPanel.add(emailField);

        profileContactPanel.add(new JLabel("Phone:"));
        phoneField = new JTextField(20);
        profileContactPanel.add(phoneField);

        profileContactPanel.add(new JLabel("Address:"));
        addressField = new JTextField(20);
        profileContactPanel.add(addressField);

        // Panels for CV Sections
        educationPanel = new JPanel(new GridLayout(0, 1));
        achievementPanel = new JPanel(new GridLayout(0, 1));
        orgPanel = new JPanel(new GridLayout(0, 1));
        internshipPanel = new JPanel(new GridLayout(0, 1));
        skillsPanel = new JPanel(new GridLayout(0, 1));

        // Add Buttons for adding entries
        addEducationButton = new JButton("Add Education");
        addAchievementButton = new JButton("Add Achievement");
        addOrgButton = new JButton("Add Org. Exp.");
        addInternshipButton = new JButton("Add Internship");
        addSkillButton = new JButton("Add Skill");

        // Action Listeners
        addEducationButton.addActionListener(e -> addEducationEntry());
        addAchievementButton.addActionListener(e -> addAchievementEntry());
        addOrgButton.addActionListener(e -> addOrgEntry());
        addInternshipButton.addActionListener(e -> addInternshipEntry());
        addSkillButton.addActionListener(e -> addSkillEntry());

        // Add panels and buttons to inputPanel
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        inputPanel.add(new JLabel("Education"), gbc);

        gbc.gridx = 1;
        inputPanel.add(educationPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        inputPanel.add(addEducationButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        inputPanel.add(new JLabel("Achievements"), gbc);

        gbc.gridx = 1;
        inputPanel.add(achievementPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        inputPanel.add(addAchievementButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        inputPanel.add(new JLabel("Organizational Experience"), gbc);

        gbc.gridx = 1;
        inputPanel.add(orgPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        inputPanel.add(addOrgButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        inputPanel.add(new JLabel("Internships"), gbc);

        gbc.gridx = 1;
        inputPanel.add(internshipPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        inputPanel.add(addInternshipButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        inputPanel.add(new JLabel("Skills"), gbc);

        gbc.gridx = 1;
        inputPanel.add(skillsPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 10;
        inputPanel.add(addSkillButton, gbc);

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

    private void addInternshipEntry() {
        InternshipInputPanel internshipInputPanel = new InternshipInputPanel();
        internshipInputPanels.add(internshipInputPanel);
        internshipPanel.add(internshipInputPanel);
        internshipPanel.revalidate();
        internshipPanel.repaint();
    }

    private void addSkillEntry() {
        SkillInputPanel skillInputPanel = new SkillInputPanel();
        skillInputPanels.add(skillInputPanel);
        skillsPanel.add(skillInputPanel);
        skillsPanel.revalidate();
        skillsPanel.repaint();
    }

    private void generateCV() {
        // Get data from fields
        String name = nameField.getText();
        String title = titleField.getText();
        String summary = summaryField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String address = addressField.getText();

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

        List<Internshipp> internships = new ArrayList<>();
        for (InternshipInputPanel panel : internshipInputPanels) {
            Internshipp internship = panel.getInternship();
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
        cvContent.append("=== CURRICULUM VITAE ===\n\n");
        cvContent.append(profile).append("\n");
        cvContent.append(contact).append("\n\n");
        cvContent.append(educationSection.getSectionTitle()).append("\n");
        cvContent.append(educationSection.getFormattedContent()).append("\n");
        cvContent.append(achievementSection.getSectionTitle()).append("\n");
        cvContent.append(achievementSection.getFormattedContent()).append("\n");
        cvContent.append(organizationSection.getSectionTitle()).append("\n");
        cvContent.append(organizationSection.getFormattedContent()).append("\n");
        cvContent.append(internshipSection.getSectionTitle()).append("\n");
        cvContent.append(internshipSection.getFormattedContent()).append("\n");
        cvContent.append(skillSection.getSectionTitle()).append("\n");
        cvContent.append(skillSection.getFormattedContent()).append("\n");

        // Buka frame baru untuk output CV
        SwingUtilities.invokeLater(() -> {
            JFrame outputFrame = new JFrame("CV Output");
            outputFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Tutup frame output saja
            JTextArea outputTextArea = new JTextArea(cvContent.toString());
            outputTextArea.setEditable(false);
            JScrollPane outputScrollPane = new JScrollPane(outputTextArea);
            outputFrame.getContentPane().add(outputScrollPane);
            outputFrame.setSize(600, 800); // Atur ukuran sesuai kebutuhan
            outputFrame.setLocationRelativeTo(this); // Tampilkan di tengah frame utama
            outputFrame.setVisible(true);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CVGuiEnhanced::new);
    }
}

// Input Panels (Separate Classes for better organization)

class EducationInputPanel extends JPanel {
    private JTextField degreeField = new JTextField(15);
    private JTextField institutionField = new JTextField(15);
    private JTextField startYearField = new JTextField(5);
    private JTextField endYearField = new JTextField(5);

    public EducationInputPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JLabel("Degree:"));
        add(degreeField);
        add(new JLabel("Institution:"));
        add(institutionField);
        add(new JLabel("Start Year:"));
        add(startYearField);
        add(new JLabel("End Year:"));
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
        return new Education(degree, institution, startYear, endYear);
    }
}

class AchievementInputPanel extends JPanel {
    private JTextField titleField = new JTextField(15);
    private JTextField descriptionField = new JTextField(20);
    private JTextField yearField = new JTextField(5);

    public AchievementInputPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JLabel("Title:"));
        add(titleField);
        add(new JLabel("Description:"));
        add(descriptionField);
        add(new JLabel("Year:"));
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
        add(new JLabel("Role:"));
        add(roleField);
        add(new JLabel("Organization:"));
        add(orgNameField);
        add(new JLabel("Start Date:"));
        add(startDateField);
        add(new JLabel("End Date:"));
        add(endDateField);
        add(new JLabel("Description:"));
        add(descriptionField);
    }

    public OrganizationExperience getOrg() {
        String role = roleField.getText();
        String orgName = orgNameField.getText();
        String startDate = startDateField.getText();
        String endDate = endDateField.getText();
        String description = descriptionField.getText();
        if (role.isEmpty() || orgName.isEmpty() || startDate.isEmpty() || endDate.isEmpty() || description.isEmpty()) {
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
        add(new JLabel("Company:"));
        add(companyField);
        add(new JLabel("Position:"));
        add(positionField);
        add(new JLabel("Start Date:"));
        add(startDateField);
        add(new JLabel("End Date:"));
        add(endDateField);
        add(new JLabel("Responsibilities:"));
        add(responsibilitiesField);
    }

    public Internshipp getInternship() {
        String company = companyField.getText();
        String position = positionField.getText();
        String startDate = startDateField.getText();
        String endDate = endDateField.getText();
        String responsibilities = responsibilitiesField.getText();
        if (company.isEmpty() || position.isEmpty() || startDate.isEmpty() || endDate.isEmpty() || responsibilities.isEmpty()) {
            return null;
        }
        return new Internshipp(company, position, startDate, endDate, responsibilities);
    }
}

class SkillInputPanel extends JPanel {
    private JTextField skillNameField = new JTextField(15); // Lebihkan sedikit ukurannya

    public SkillInputPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JLabel("Skill:"));
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