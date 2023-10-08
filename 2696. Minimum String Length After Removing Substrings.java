class Solution {
    public int minLength(String s) {
        String str = s.toUpperCase();
        StringBuilder strBuilder = new StringBuilder();
        for (char ch: str.toCharArray()) {
            System.out.println(ch);
            int len = strBuilder.length();
            if (len > 0 && strBuilder.charAt(len-1)=='A' && ch=='B') {
                strBuilder.deleteCharAt(len-1);
            }
            else if (len > 0 && strBuilder.charAt(len-1)=='C' && ch=='D') {
                strBuilder.deleteCharAt(len-1);
            }
            else {
                strBuilder.append(ch);
            }
        }
        return strBuilder.length();
    }
}

public class Main
{
	public static void main(String[] args) {
        Solution sol = new Solution();
        String words = "ABFCACDB";
        int result = sol.minLength(words);
        System.out.println(result);
	}
}
