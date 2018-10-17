import java.util.Stack;

public class Solution {
	
	public int solution(String arrangement) {
        
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < arrangement.length(); i++) {
            
        	// '('인 경우 해당 인덱스를 스택에 저장
        	if (arrangement.charAt(i) == '(') {
                st.push(i);  
            } 
        	
            else if (arrangement.charAt(i) == ')') {
                
                // 직전 기호가 '('인지 인덱스를 통해 판별
                // '()' 이와 같은 모양이 형성될 경우
                // 막대기를 자르는 작업 수행
                // 막대기의 수를 늘린다.
                if (st.peek() + 1 == i) {
                    st.pop();
                    answer += st.size();
                } 
                
                // 자르는 작업이 아닌 막대기의 끝을 확인한경우
                // 막대기 마지막 부분을 총합에 더한다.
                else {
                    st.pop();
                    answer++;
                }
            }
        }
        
        return answer;
	}
}
