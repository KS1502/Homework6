package Homework;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day,int month,int year){
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

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(!(obj instanceof MyDate))return false;
        MyDate myDate =(MyDate) obj;
        return day ==myDate.day && myDate.equals(myDate.month);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "MyDay"+day+month+year;
    }
}
/*Создать класс MyDate с полями day,month,year, конструктором,геттерами и сеттерами.
        Создать несколько одинаковых обьектов этого класса и проверить их на равенство.
        Затем переопределить методы equals и hashCode и вновь проверить обьекты на равенство.*/
