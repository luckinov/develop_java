package week8;

public class Student {
    String name;
    double grade;
    
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public void displayStudent() {
        System.out.println("the " + name + " grade is " + grade);
    }
    public static Student highestGradeStudent(Student[] students) {
        if (students == null || students.length == 0) {
            return null;
        }

        Student highestScoringStudent = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].getGrade() > highestScoringStudent.getGrade()) {
                highestScoringStudent = students[i];
            }
        }
        return highestScoringStudent;
    }

    public static void main(String[] args) {//test
        Student[] students = new Student[5];

        students[0] = new Student("Alice", 80);
        students[1] = new Student("Bob", 75);
        students[2] = new Student("Charlie", 90);
        students[3] = new Student("David", 95);
        students[4] = new Student("Eve", 85);
        Student highestScoringStudent = Student.highestGradeStudent(students);

        // 展示得分最高的学生
        if (highestScoringStudent != null) {
            highestScoringStudent.displayStudent();
        } else {
            System.out.println("没有学生信息");
        }
    }
    
}
