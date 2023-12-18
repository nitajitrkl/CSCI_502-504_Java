public class StudentGPATester {
    public static void main(String[] args) {
        StudentGPA sample = new StudentGPA();
        StudentGPA student1 = new StudentGPA();
        StudentGPA student2 = new StudentGPA("Joe", "Smith", "111", 3.86);
        StudentGPA student3 = new StudentGPA("harry", "hakd", "2323", 3.52);
        StudentGPA.change1(student1, student2);
        StudentGPA.change2(student3, student1);
        System.out.println(student1.getGPA());
        System.out.println(student2.getGPA());
        System.out.println(student3.getGPA());
    }
}
