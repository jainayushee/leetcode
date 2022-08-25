public class PalindromeNumber {

  public boolean isPalindrome(int x) {
    if (x < 0) return false;
    int n1 = x;
    int r = 0, d = 0;
    while (n1 != 0) {
      r = n1 % 10;
      d = d * 10 + r;
      n1 = n1 / 10;
    }
    if (d % 10 != x % 10) return false; else {
      if (d == x) return true; else return false;
    }
  }
}
