package baekjoon;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/11283">https://www.acmicpc.net/problem/11283</a>
 */
public class baekjoon_11283 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.codePointAt(0));
        scanner.close();
    }
    
}