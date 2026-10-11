package task3;
import java.util.Scanner;
class task3 {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the year :");
        int y = Scanner.nextInt();
        if (y % 400 ==0){
            System.out.print("the year is a leap year ");
        } else if (y % 100 ==0) {
            System.out.print("the year is not leap year ");
        } else if (y % 4 ==0) {
            System.out.print("the year is a leap yar ");
        }else{
            System.out.print("the year is not a leap year ");
        }
        Scanner.close();

    }
}
