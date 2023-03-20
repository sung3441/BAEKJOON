class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            if (n > binary.length()) {
                binary = "0".repeat(n - binary.length()) + binary;
            }
            result[i] = binary.replace("0", " ").replace("1", "#");
        }
        return result;
    }
}