class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Character x = null;
        int[][] count = new int[2][1];
        
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            
            if (x == null) {
                x = ch;
            }
            
            if (x == ch) {
                count[0][0]++;
            } else {
                count[1][0]++;
            }
            
            if (count[0][0] == count[1][0]) {
                answer++;
                x = null;
                count = new int[2][1];
            } else if (i == s.length() - 1) {
                answer++;
            }
            
        }
        
        return answer;
    }
}