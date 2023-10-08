class Solution {
    public String finalString(String s) {
        String str = "";
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'i') {
                str = reverseString(str);
                continue;
            }
            str += s.charAt(i);
        }
        return str;
    }
    
    public String reverseString(String s) {
        String str = "";
        int size = s.length();
        for (int i=0; i<size; i++) {
            str += s.charAt(size-i-1);
        }
        return str;
    }
}

public class Main
{
	public static void main(String[] args) {
		Solution sol = new Solution();
        String str = "string";
		String output = sol.finalString(str);
		System.out.println(output);
	}
}

/* Optimized Solution
 *  public String finalString(String s) {
       StringBuilder str = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'i') {
                str.reverse();
            } else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
 */