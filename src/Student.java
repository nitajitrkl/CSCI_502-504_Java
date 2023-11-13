public class Student {
    public Student() {
        name = "";
        totalScore = 0;
        quizCount = 0;
    }
    public Student(String n) {
        name = n;
        totalScore = 0;
        quizCount = 0;
    }
    public String getName() {
        return name;
    }
    public void addQuiz(double score) {
        totalScore += score;
        quizCount++;
    }
    public double getTotalScore() {
        return totalScore;
    }
    public double getAverageScore() {
        return totalScore / quizCount;
    }
    private String name;
    private double totalScore;
    private int quizCount;
}