package app.cvbuilder.model;

import java.util.ArrayList;
import java.util.List;

public class EducationSection {
    private List<Education> educationList;

    public EducationSection() {
        this.educationList = new ArrayList<>();
    }

    public void addEducation(Education education) {
        educationList.add(education);
    }

    public void removeEducation(Education education) {
        educationList.remove(education);
    }

    public void displayAll() {
        if (educationList.isEmpty()) {
            System.out.println("No education entries available.");
        } else {
            for (Education education : educationList) {
                education.display();
            }
        }
    }
}
