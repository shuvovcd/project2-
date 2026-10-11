package Tasktwo;
import java.util.Scanner;
class Tasktwo {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);

        System.out.print("Enter the hour(h) :");
        int h = Scanner.nextInt();
        System.out.print("Enter the min(m) :");
        int m = Scanner.nextInt();
        System.out.print("Enter the secound(s):");
        int s = Scanner.nextInt();
        s = s + 1;
        if (s == 60){
            s = 0;
            m = m + 1;
        }
        if (m == 60){
            m = 0;
            h = h + 1;
        }
        if (h == 24){
            h = 0;
        }
        System.out.print("the hour will be :" + h);
        System.out.print("the min will be :" + m);
        System.out.print("the sec will be :" + s);
        Scanner.close();;
    }
}

