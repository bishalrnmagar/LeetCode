import java.util.ArrayList;

class Solution {
    
    int getMinLen(ArrayList<Integer> ints) {
        int MIN_VAL = ints.get(0);
        for (int i=1; i<ints.size(); i++) {
            if (i < MIN_VAL) {
                MIN_VAL = i;
            }
        }
        return MIN_VAL;
    }
    
    String longestCommonPrefix(String[] strs) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        
        for (String str: strs){
            ints.add(str.length());
        }
        
        ArrayList<String> newStr = new ArrayList<String>();
        int minLength = getMinLen(ints);
        
        for (String wq: strs) {
            newStr.add(wq.substring(0,minLength));
        }
        
        for (String str: newStr) {
            System.out.println(str.length());
        }

        String firstStr = newStr.get(0);
            
        return strs[0];
    }
}

public class Main
{
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] strs = {"applet","apple","appendix"};
		String res = sol.longestCommonPrefix(strs);
		System.out.println(res);
	}
}
