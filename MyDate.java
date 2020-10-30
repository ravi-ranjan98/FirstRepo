import java.util.Scanner;

public class MyDate {

    private int day, month,year;

    MyDate(){
        this.day=20;
        this.month=11;
        this.year=2020;
    }

    MyDate( int day , int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    int getDay(){
        return day;
    }
    int getMonth(){
        return month;
    }
    int getYear(){
        return year;
    }

    void setDay(int day){
        this.day = day;

    }
    void setMonth(int month){
        this.month = month;

    }

    void setYear(int year){
        this.year = year;
    }

    void display(){
        System.out.println(day+"/"+month+"/"+year);
    }

    void set(int day , int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    // static void show(){
    //     System.out.println("in static method");
    // }

    public static void main(String args[]){
       MyDate d1 = new MyDate();
       System.out.println("Default constructor");
       d1.display();
       MyDate d2 = new MyDate(20,10,2020);
       System.out.println("Parameterized constructor");
       d2.display();
      

    }
}
