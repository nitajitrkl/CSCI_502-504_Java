public class StudentTester {
    public static void main(String[] args) {
        Student student = new Student("Ajit");
        student.addQuiz(3);
        student.addQuiz(2);
        student.addQuiz(1);
        String x = student.getName();
        System.out.print(x);
        System.out.print("'s quiz score total is ");
        System.out.print(student.getTotalScore());
        System.out.print(", and the average is ");
        System.out.println(student.getAverageScore());
    }
}
