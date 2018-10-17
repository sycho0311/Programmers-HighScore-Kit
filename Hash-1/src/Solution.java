import java.util.HashMap;

public class Solution {
	
	public String solution(String[] participant, String[] completion) {
		
		String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        
        // getOrDefault() : HashMap 메소드를 사용하여 키 값을 검색
        // 키 값이 없는 경우 0을 반환
        // 가장 처음 put을 하기전 키 값은 0으로 반환한다.
        // 반환한 값으로부터 1을 증가하여 put을 실행
        // 만일 동일한 키에 대하여 put을 반복할 경우 기존의 키 값에서 1만큼 증가한 뒤 put이 실행
        
        for (String player : participant)
        	hm.put(player, hm.getOrDefault(player, 0) + 1);
        
        // HashMap에 저장된 키 값이 기존에 저장된 키 값인지 확인하기 위해
        // 해당하는 키 값을 가져온 뒤 1을 감소하여 put을 실행한다.
        // 만일 한번도 put을 한적이 없다면, -1이 되므로 에러가 발생할 것이고
        // 중복하여 put이 수행된 경우 0보다 클것이다.
        // 이때, 0보다 큰경우의 키는 중복되어 HashMap에 put이 수행되었다는 것을 확인할 수 있다.
        
        for (String player : completion) 
        	hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        
        return answer;		
	}
	
}