import java.util.List;
import java.util.Arrays;

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder newStr = new StringBuilder();
        for (String str: words) {
            newStr.append(str.charAt(0));
        }
        return s.equals(newStr.toString());
    }
}

public class Main
{
	public static void main(String[] args) {
		Solution sol = new Solution();
        String str = "abc";
        List<String> words = Arrays.asList("alice","bob","charlie");
		boolean output = sol.isAcronym(words, str);
		System.out.println(output);
	}
}
