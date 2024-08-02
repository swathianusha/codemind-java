import java.util.Scanner;
public class Trapezium {
    public static void main(String[] args){
    int a,b,h;
    Scanner read = new Scanner(System.in);
    a = read.nextInt();
    b = read.nextInt();
    h = read.nextInt();
    double area = 0.5*(a+b)*h;
    System.out.printf("%.4f",area);
    }
}