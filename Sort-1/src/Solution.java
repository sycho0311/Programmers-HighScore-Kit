import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	
	public int[] solution(int[] array, int[][] commands) {
		
		int[] answer = new int [commands.length];
        int j=0;

        // 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하기 위한
        // 이차원 배열 commands {{i, j, k}}를 담기 위한 변수 num 1, 2, 3 
        int num1, num2, num3;
         
        for (int i=0;i<commands.length;i++) {
        	List<Integer> arr = new ArrayList<Integer>();
        	
        	num1 = commands[i][j];
        	num2 = commands[i][j+1];
        	num3 = commands[i][j+2];
        	
        	for (int k=num1-1;k<num2;k++) {
        		arr.add(array[k]);
        	}
        	
        	Collections.sort(arr);
        	answer[i] = arr.get(num3-1);
        }
            
        return answer;
	}
}
