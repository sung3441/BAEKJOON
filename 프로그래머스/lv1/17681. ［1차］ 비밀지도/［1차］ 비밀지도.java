class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for(int i = 0; i < n; i++) {
            String data = Integer.toBinaryString(arr1[i] | arr2[i]);
            data = data.length() < n ? " ".repeat(n-data.length())+data : data;
            result[i] = data.replaceAll("0", " ").replace("1", "#");
        }
        return result;
    }
}