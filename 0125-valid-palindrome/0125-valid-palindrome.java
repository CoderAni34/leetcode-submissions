class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<end){
        char chs = Character.toLowerCase(s.charAt(start));
        char che = Character.toLowerCase(s.charAt(end));
        if(!Character.isLetterOrDigit(chs))
            start++;
        else if(!Character.isLetterOrDigit(che))
            end--;
        else {
            if(che!=chs)
                return false;
            start++;
            end--;
        }
    }
        return true;
    }
}