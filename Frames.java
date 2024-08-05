import java.util.Scanner;
public class Frames {
    public static void main(String[] args) {
        int x,y,z;
        Scanner read = new Scanner(System.in);
        x = read.nextInt();
        y = read.nextInt();
        z = read.nextInt();
        int cost = z*(2*(x+y));
        System.out.println(cost);
    }
} 