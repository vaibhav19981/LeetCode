class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        // Corrected null and length checks
        if (word1 == null || word1.length() == 0) return word2;
        if (word2 == null || word2.length() == 0) return word1;
        
        // Corrected loop condition to avoid infinite loop
        while (i < word1.length() && i < word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            i++;
        }
        
        // Append remaining characters if one string is longer
        if (i < word1.length()) {
            result.append(word1.substring(i));
        } else if (i < word2.length()) {
            result.append(word2.substring(i));
        }
        
        return result.toString();
    }
}
