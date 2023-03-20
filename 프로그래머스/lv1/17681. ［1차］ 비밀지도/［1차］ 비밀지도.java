class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        String format = "%0" + n + "s";
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            String[] split1 = ("0".repeat(n - s1.length()) + s1).split("");
            String[] split2 = ("0".repeat(n - s2.length()) + s2).split("");
            
            for (int j = 0; j < n; j++) {
                if (split1[j].equals("0") && split2[j].equals("0")) {
                    sb.append(" ");
                    continue;
                }
                sb.append("#");
            }
            result[i] = sb.toString();
        }
        return result;
    }
}