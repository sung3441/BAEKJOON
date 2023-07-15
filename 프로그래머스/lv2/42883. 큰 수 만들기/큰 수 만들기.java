class Solution {
    public String solution(String n, int k) {
        
        StringBuilder number = new StringBuilder();
        int length = n.length();
        int maxIndex = 0;
        char max = (char) 0;
        
        for (int i = 0; i <= k; i++) {
            char c = n.charAt(i);
            if (c > max) {
                maxIndex = i;
                max = c;
            }
        }
        
        number.append(n.substring(maxIndex));
        int count = k - (length - number.length());
        int index = 1;
        
        while (count > 0) {
            boolean flag = true;
            
            for (int i = index; i < number.length(); i++) {
                char c = number.charAt(i);
                if (i == number.length() - 1) {
                    if (number.charAt(i - 1) > c) {
                        number.deleteCharAt(i);
                        flag = false;
                        index = i - 1;
                        break;
                    }
                } else {
                    if (number.length() > 2 && number.charAt(i + 1) > c) {
                        number.deleteCharAt(i);
                        flag = false;
                        index = i - 1;
                        break;
                    }
                }
            }
            if (flag) {
                return number.substring(0, number.length() - count);
            }
            count--;
        }
        
        return number.toString();
    }
}