import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = Arrays.stream(numbers).mapToObj(String::valueOf)
                                .sorted((a, b) -> (b + a).compareTo(a + b))
                                .reduce((a, b) -> a + b)
                                .orElse("");
        
        if (answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer;
    }
}