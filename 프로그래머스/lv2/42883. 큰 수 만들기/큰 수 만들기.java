class Solution {
    public String solution(String n, int k) {
        
        StringBuilder number = new StringBuilder();
        int maxIndex = getMaxNumFirstIndex(n, k);
        
        number.append(n.substring(maxIndex));
        int count = k - (n.length() - number.length());
        int index = 1;
        
        while (count > 0) {
            boolean flag = true;
            
            for (int i = index; i < number.length() - 1; i++) {
                char c = number.charAt(i);
                if (number.length() > 2 && number.charAt(i + 1) > c) {
                    number.deleteCharAt(i);
                    flag = false;
                    index = i - 1;
                    count--;
                    break;
                }
            }
            if (flag) {
                return number.substring(0, number.length() - count);
            }
        }
        
        return number.toString();
    }
    
    int getMaxNumFirstIndex(String numStr, int k) {
        int maxIndex = 0;
        char max = (char) 0;
        
        for (int i = 0; i <= k; i++) {
            char c = numStr.charAt(i);
            if (c > max) {
                maxIndex = i;
                max = c;
            }
        }
        return maxIndex;
    }
}