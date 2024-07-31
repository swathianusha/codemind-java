import java.util.Scanner;
public class Water {
    public static void main(String[] args) {
        int x,y,time;
        Scanner read = new Scanner(System.in);
        x = read.nextInt();
        y = read.nextInt();
        time = (x*y)/(x+y);
        System.out.println(time);
    }
}