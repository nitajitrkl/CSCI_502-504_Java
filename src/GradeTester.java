import java.util.Scanner;
public class GradeTester {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Grades: ");
        double grade = in.nextDouble();
        Grade student = new Grade(grade);
        System.out.println(student.getLetterGrade());
    }
}