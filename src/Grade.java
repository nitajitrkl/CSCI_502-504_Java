public class Grade {
    public Grade (double iGrade)
    {
        input = iGrade;
    }
    public String getLetterGrade() {
        if (input >= 0 && input <= 4.5) {
            if (input >= 3.5 )
                return "A";
            else if (input >= 2.5 )
                return "B";
            else if (input >= 1.5 )
                return "C";
            else if (input >= 0.5 )
                return "D";
            else
                return "F";
        }
        else
            return "That is not valid";
    }
    public double input;
}