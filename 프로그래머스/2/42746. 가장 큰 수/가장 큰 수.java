import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] numberStrings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numberStrings[i] = numbers[i] + "";
        }
        
        Arrays.sort(numberStrings, (a, b) -> (b + a).compareTo(a + b));
        
        if ("0".equals(numberStrings[0])) {
            return "0";
        }
        
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < numberStrings.length; i++) {
            answer.append(numberStrings[i]);
        }
        
        return answer.toString();
    }
}