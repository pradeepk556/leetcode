class Solution {
    private int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n * n;
        int sumEven = sumOdd + n;
        return gcd(sumOdd, sumEven);
    }
}