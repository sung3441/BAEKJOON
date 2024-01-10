class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] countArr = new int[7];
        int[] diceNumber = new int[2];
        int diceIndex = 0;
        int diceCount = 0;
        countArr[a]++;
        countArr[b]++;
        countArr[c]++;
        countArr[d]++;

        for (int i = 1; i < 7; i++) {
            if (countArr[i] > 1) {
                diceCount++;
                diceNumber[diceIndex++] = i;
            }
        }

        if (diceCount == 0) {
            int min = 10;
            for (int i = 1; i < 7; i++) {
                if (countArr[i] > 0) {
                    min = Math.min(min, i);
                }
            }
            return min;
        } else if (diceCount == 1) {
            int number = diceNumber[0];
            int count = countArr[number];
            if (count == 2) {
                int[] arr = new int[2];
                int index = 0;
                for (int i = 1; i < 7; i++) {
                    if (countArr[i] == 1) {
                        arr[index++] = i;
                    }
                }
                return arr[0] * arr[1];
            } else if (count == 3) {
                int q = 0;
                for (int i = 1; i < 7; i++) {
                    if (countArr[i] == 1) {
                        q = i;
                        break;
                    }
                }
                int result = 10 * number + q;
                return result * result;
            } else {
                return 1111 * number;
            }
        } else {
            return (diceNumber[0] + diceNumber[1]) * Math.abs(diceNumber[0] - diceNumber[1]);
        }
    }
}