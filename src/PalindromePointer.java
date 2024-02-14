import java.util.Scanner;

class PalindromePointer {
    public static boolean isPalindrome(String s){
        if (s.isEmpty()){
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        if (s.charAt(left) != s.charAt(right)){
            return false;
        }
        if (right==0) return true;
        else return isPalindrome(s.substring(left+1, right));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = in.next();
        System.out.println(isPalindrome(s));
    }
}