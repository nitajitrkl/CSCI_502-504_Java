import java.util.Scanner;

class PalindromeReverseString {
    public static boolean isPalindrome(String s){
        if (s.isEmpty()) {
            return true;
        }
        String rs = "";
        for (int i = 0; i < s.length(); i++){
            rs += s.charAt(i);
        }
        return (s.equals(rs));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.next();
        System.out.println(isPalindrome(s));
    }
}