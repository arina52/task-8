public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        day=0;
        month=0;
        year=0;
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
    public void setDay(int day){
        if(day<0 || day>31) {
            System.out.println("Invalid day");
        }
        else this.day = day;
    }
    public void setMonth(int month) {
        if(month<0 || month>12)
            System.out.println("Invalid month");
        else this.month = month;
    }
    public void setYear(int year) {
        if(year<0)
            System.out.println("Invalid year");
        else this.year = year;
    }
    public void displayDate(){
        System.out.println(day+"/"+month+"/"+year);
    }
}
