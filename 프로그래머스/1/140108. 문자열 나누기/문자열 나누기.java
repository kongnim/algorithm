class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char x = ' ';
        int countX = 0;
        int countY = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (x == ' ') {
                x = ch;
            }
            
            if (x == ch) {
                countX++;
            } else {
                countY++;
            }
            
            if (countX == countY) {
                answer++;
                x = ' ';
                countX = 0;
                countY = 0;
                
            }
        }
        
        if (countX != 0) {
            answer++;
        }
        
        return answer;
    }
}