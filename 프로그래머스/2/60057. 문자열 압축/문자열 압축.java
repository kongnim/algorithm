class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        for (int i = 1; i <= s.length(); i++) {
            String prev = s.substring(0, i);
            int tempNum = 1;
            StringBuilder sb = new StringBuilder();
            
            for (int j = i; j < s.length(); j += i) {
                String curr = s.substring(j, Math.min(i + j, s.length()));
                
                if (prev.equals(curr)) {
                    tempNum++;
                    
                } else {
                    sb.append(tempNum == 1 ? "" : tempNum).append(prev);
                    tempNum = 1;
                    prev = curr;

                }
            }
            
            sb.append(tempNum == 1 ? "" : tempNum).append(prev);
            
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }
}