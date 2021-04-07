package Student;

public class Student {
    private String name;
    private String lastname;
    private String university;
    private String faculty;
    private int age;
    private double gpa;
    private String gender;
    public boolean isArmenian = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age >= 16 ? age : 16;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = (gpa>=0 && gpa<=5) ? gpa : 0;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printStudentInfo(){
        System.out.println("Name: " + getName());
        System.out.println("LastName: " + getLastname());
        System.out.println("Age: " + getAge());
        System.out.println("University: " + getUniversity());
        System.out.println("Faculty: " + getFaculty());
        System.out.println("Gender: " + getGender());
        System.out.println("GPA: " + getGpa());
    }

}
