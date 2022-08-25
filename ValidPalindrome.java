class Solution {

  public boolean isPalindrome(String s) {
    String parsedString = "";
    String reversedString = "";
    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
        parsedString += Character.toLowerCase(s.charAt(i));
        reversedString = Character.toLowerCase(s.charAt(i)) + reversedString;
      }
    }
    if (reversedString.equals(parsedString)) return true; else return false;
  }
}
