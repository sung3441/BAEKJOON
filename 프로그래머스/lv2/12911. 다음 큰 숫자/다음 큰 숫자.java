class Solution {
    public int solution(int n) {
        int count = getOneCount(n);
        while (count != getOneCount(++n)) {}
        return n;
    }
    
    int getOneCount(int n) {
        int count = 0;
        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}