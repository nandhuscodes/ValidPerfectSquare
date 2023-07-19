import java.util.Scanner;

public class ValidPerfectSquare {
    static boolean findValidPerfectSquare(int N){
        return Math.sqrt(N) == Math.floor(Math.sqrt(N));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(findValidPerfectSquare(scanner.nextInt()));
    }
}
