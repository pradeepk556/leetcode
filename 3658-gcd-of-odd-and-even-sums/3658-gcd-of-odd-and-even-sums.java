class Solution {
    private int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        int num = 2;
        for(int i = 0; i < n; i++) {
            sumOdd += (num - 1);
            sumEven += num;
            num += 2;
        }

        return gcd(sumOdd, sumEven);
    }
}