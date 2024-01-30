public class StudentTester {
    public static void main(String[] args) {
        Student student = new Student("Ajit");
        student.addGrade(3);
        student.addGrade(2);
        student.addGrade(1);
        System.out.print("The average is ");
        System.out.println(student.calculateAverage());
    }
}
