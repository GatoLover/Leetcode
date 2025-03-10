/*
num1 and num2
start operationCount at 1
either subtract num1 from num2 or num2 from num1
    Subtract the lower number from the higher number
    If the same, then return operationCount 
    increment operation count if neither are equal to 0

*/

class Solution {
    public int countOperations(int num1, int num2) {
        int operationCount = 0;
        while(num1 != 0 && num2 != 0) {
            operationCount++;
            if(num1 > num2) {
                num1 -= num2;
            } else if (num2 > num1) {
                num2 -= num1;
            } else {
                break;
            }
        }
        return operationCount;
    }
}