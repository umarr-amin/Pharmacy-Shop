// Date.java
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isExpired(Date currentDate) {
        if (this.year < currentDate.year) {
            return true;
        } else if (this.year == currentDate.year) {
            if (this.month < currentDate.month) {
                return true;
            } else if (this.month == currentDate.month) {
                return this.day < currentDate.day;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
