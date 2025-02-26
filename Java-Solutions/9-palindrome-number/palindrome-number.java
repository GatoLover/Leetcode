class Solution {
    public boolean isPalindrome(int x) {
        int numLength = Integer.toString(x).length();
        int reversed = 0;
        int temp = x;
        if(x < 0){
            return false;
        } else {
            for (int i=0; i < numLength; i++) {
                int remainder = temp % 10;
                reversed = reversed * 10 + remainder;
                temp /= 10;
            }
            return reversed == x;
        }
    }
}