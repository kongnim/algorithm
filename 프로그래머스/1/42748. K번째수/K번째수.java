import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] returnArray = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] copiedArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(copiedArray);
            returnArray[i] = copiedArray[commands[i][2] - 1];
        }
        
        return returnArray;
    }
}