class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f = strs[0];
        String l = strs[strs.length-1];
        int k = 0;
        for(int i = 0 ; i < f.length() && i < l.length() ; i ++)
        {
            if(f.charAt(i)==l.charAt(i))
            {
                k++;
            }
            else 
            break;
        }
        return f.substring(0,k);
    }
}