import java.util.Scanner;
public class Area {
    public static void main(String[] args){
       int r;
       Scanner read =new Scanner(System.in);
       r = read.nextInt();
       double area,perimeter;
       area = 3.14*r*r;
       perimeter = 2*3.14*r;
       System.out.printf("%.2f
",area);
       System.out.printf("%.2f",perimeter);
    }
}