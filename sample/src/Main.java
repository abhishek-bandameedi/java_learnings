// Java approach for the above approach
import java.util.Scanner;
import java.util.Stack;

public class Main {

    // Function to check if target
    // is a subsequence of string S
    static void checkforSubsequence(String S, String target)
    {

        // Declare a stack
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < target.length(); i++) {
            s.push(target.charAt(i));
        }
        for (int i = (int)S.length() - 1; i >= 0; i--) {
            if (s.empty()) {

                System.out.println("Yes");
                return;
            }
            if (S.charAt(i) == s.peek()) {
                s.pop();
            }
        }
        if (s.empty())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s = sc.next();
            String t = sc.next();
            checkforSubsequence(s,t);
        }
    }
}

