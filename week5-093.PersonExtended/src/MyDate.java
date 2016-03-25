
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString()
    {
        return this.day + "." + this.month + "." + this.year;
    }
    public boolean earlier(MyDate compared)
    {
        if (this.year < compared.year) {
            return true;
        }
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }
        return false;
    }
   public int differenceInYears(MyDate compareDate)
    {
        int difference = this.year - compareDate.year;
        int dayDiff = (this.day * this.month) - (compareDate.day * compareDate.month);
        int dayDiff2 = (compareDate.day * compareDate.month) - (this.day * this.month);

        if (difference > 0 && dayDiff < 0)
        {
            return difference -1;
        }
        if (difference > 0 && dayDiff > 0)
        {
            return difference;
        }
        if (difference < 0 && dayDiff2 < 0)
        {
            return Math.abs(difference) -1;
        }
        if (difference < 0 && dayDiff2 > 0)
        {
            return Math.abs(difference);
        }
        if (difference == 0 && this.month == compareDate.month && this.day == compareDate.day)
        {
            return 0;
        }
        if (difference == 1 || difference == -1 && this.month == compareDate.month && this.day == compareDate.day)
        {
            return 1;
        }
        if (difference == 0 && dayDiff == 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}