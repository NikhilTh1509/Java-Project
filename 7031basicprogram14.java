import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        int n;
        char s1, s2, s3;
        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        n = in.nextInt();
        
        System.out.printf("%d\n", n+n*n+n*n*n);
    }
}
