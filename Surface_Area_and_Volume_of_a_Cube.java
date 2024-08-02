import java.util.Scanner;
public class Cube {
    public static void main(String[] args) {
        int side;
        Scanner read = new Scanner(System.in);
        side = read.nextInt();
        int area = 6*side*side;
        int volume = side*side*side;
        System.out.printf("Surface area = %d and Volume = %d",area,volume);
    }
}