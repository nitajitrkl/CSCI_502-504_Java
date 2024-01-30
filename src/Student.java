public class Student {
    public Student(String n) {
        totalScore = 0;
    }
    public void addGrade(double score) {
        totalScore += score;
    }
    public double calculateAverage () {
        return totalScore / 3;
    }
    private double totalScore;
}