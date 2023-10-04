class Solution {
        
    public String reverseWord(String word) {
        String reversedWord = "";
        String[] splitWord = word.split("");
        int size = splitWord.length;
        
        for (int i=0; i<size; i++) {
            reversedWord += splitWord[size - i - 1];
        }
        
        return reversedWord;
    }
    
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        int size = words.length;
        
        for (int i=0; i<size; i++) {
            for (int j=i+1; j<size; j++) {
                if ( words[i].equals(reverseWord(words[j])) ) {
                    count += 1;
                } 
            }
        }
        
        return count;
    }
}


class Main {
    public static void main (String[] args) {
        String[] strings = {"cd","ac","dc","ca","zz"};
        Solution soln = new Solution();
        int result = soln.maximumNumberOfStringPairs(strings);
        System.out.println(result);
    }
}