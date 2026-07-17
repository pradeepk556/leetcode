class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] temp = Arrays.copyOf(arr, n);
        Arrays.sort(temp);

        Map<Integer, Integer> numToRank = new HashMap<>();
        int rank = 1;
        for(int i = 0; i < n; i++) {
            if(i > 0 && temp[i] > temp[i - 1]) {
                rank += 1;
            }
            numToRank.put(temp[i], rank);
        }

        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = numToRank.get(arr[i]);
        }

        return ans;
    }
}