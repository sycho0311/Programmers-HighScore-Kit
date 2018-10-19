import java.util.HashMap;

public class Solution {
	
	public int solution(String[][] clothes) {
        int answer = 0;
        int cnt = 1;
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        // 입을 수 있는 옷의 조합
        // head1, head2 => head 2
        // pants1, pants2, pants3 => pant 3
        // shirt1, shirt2 => shirt 2
        // 한종류 이상의 옷을 반드시 입는 것이 아닌, 입지 않는 경우의 수도 포함해야 한다.
        // 각 종류의 옷에서 입지 않는 경우의 수 한가지 씩을 추가한다.
        for (int i=0;i<clothes.length;i++) {
        	hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 1) + 1);
        }
        
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                cnt = cnt * hm.get(key);
            }
        }
        
        // 반드시 하나의 옷은 입어야 한다.
        // 옷을 아예 입지 않는 경우의 수 제외
        answer = cnt - 1;
        
        return answer;
    }
		
}