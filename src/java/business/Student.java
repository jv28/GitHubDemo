package business;

import java.time.LocalDate;

public class Student {
    private int studentId;
    private String name;
    private LocalDate birthDate;

    public Student(int studentId, String name, LocalDate birthDate) {
        this.studentId = studentId;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    
    
}
