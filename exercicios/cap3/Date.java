package exercicios.cap3;

public class Date{
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int year){
        this.year = year;
    }
    public void setYear(int day){
        this.day = day;
    }


    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }
    public int getYear(){
        return this.year;
    }

    public void displayDate(){
        String fulldate = String.format(" %d/%d/%d ",
            this.month, this.day, this.year);
        System.out.println(fulldate);
    }
}