import java.util.Scanner;
public class Main {
    static public void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Welcome to Caculator of Leap Year. Please enter the year");
        int year = input.nextInt();

        if (year%100 == 0 && year%400 == 0) {System.out.println("Yes, it is a Leap Year!");}
        else if (year%100 != 0 && year%4==0) {System.out.println("Yes, it is a Leap Year!");}
        else {System.out.println("Sorry... It is not a Leap Year :( :( :( ");}

    }
}