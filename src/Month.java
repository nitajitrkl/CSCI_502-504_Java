public class Month {
    public Month(int iMonth)
    {
        month = iMonth;
    }
    public int getDays() {
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        else if (month == 2)
            return 28;
        else if (1 <= month && month <= 12)
            return 31;
        else return 0;
    }
    public int month;
}