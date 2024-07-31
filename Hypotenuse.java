import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args) {
        double x,y,z;
        Scanner read = new Scanner(System.in);
        x = read.nextInt();
        y = read.nextInt();
        z = Math.sqrt((x*x)+(y*y));
        System.out.printf("%.2f",z);
    }
}