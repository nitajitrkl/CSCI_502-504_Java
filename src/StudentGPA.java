public class StudentGPA {
    public StudentGPA (){
        firstName = "";
        lastName = "";
        id = "";
        gpa = 0.0;
    }
    public StudentGPA (String first, String last, String idNumber, double gpavg){
        firstName = first;
        lastName = last;
        id = idNumber;
        gpa = gpavg;
    }
    public double getGPA(){
        return gpa;
    }
    public static void setGPA (double newGPA){
        gpa = newGPA;
    }

    public static void change1(StudentGPA stdt1, StudentGPA stdt2) {
        stdt1 = stdt2;
    }

    public static void change2(StudentGPA stdt1, StudentGPA stdt2) {
        setGPA(stdt2.getGPA()); // Static methods
    }
    private String firstName;
    private String lastName;
    private String id;
    private static double gpa;


}
