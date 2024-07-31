import java.util.Scanner;
public class Hours {
    public static void main(String[] args) {
        int s,H,M;
        Scanner read = new Scanner(System.in);
        s = read.nextInt();
        H = s/60;
        M = s%60;
        System.out.printf("%d Hour(s) %d Minute(s)",H,M);
        
    }
}