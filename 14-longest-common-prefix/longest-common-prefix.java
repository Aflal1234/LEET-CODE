class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f = strs[0];
        String l = strs[strs.length-1];
        int k = 0;
        while (( k < f.length() && k < l.length() )&&(f.charAt(k)==l.charAt(k)))
        k++;
        return f.substring(0,k);
    }
}