import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

	public int[] solution(int[] answers) {
        /*
        Man [] man = new Man[3];
        
        for (int i=0;i<3;i++) {
        	man[i] = new Man(i+1, 0);
        }
        */
        
        // 맞춘 횟수를 저장하기 위한 배열
        int [] array = {0, 0, 0};
        
        // 배열의 index를 저장하기 위한 리스트
        List<Integer> arr = new ArrayList<Integer>();

        // 각각의 사람에 해당하는 정답패턴을 저장하기 위한 큐
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        Queue<Integer> q3 = new LinkedList<Integer>();

        int [] ans_q1 = {1, 2, 3, 4, 5};
        int [] ans_q2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] ans_q3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i=0;i<ans_q1.length;i++)
            q1.add(ans_q1[i]);

        for (int i=0;i<ans_q2.length;i++)
            q2.add(ans_q2[i]);
            
        for (int i=0;i<ans_q3.length;i++)
            q3.add(ans_q3[i]);
        
        for (int i=0;i<answers.length;i++) {
        	int temp1 = q1.poll();
        	if (temp1 == answers[i]) {
        		// man[0].score++;
        		array[0]++;
        	}
        	q1.add(temp1);
        	
        	int temp2 = q2.poll();
        	if (temp2 == answers[i]) {
        		// man[1].score++;
        		array[1]++;
        	}
        	q2.add(temp2);
        	
        	int temp3 = q3.poll();
        	if (temp3 == answers[i]) {
        		// man[2].score++;
        		array[2]++;
        	}
        	q3.add(temp3);
        }
        
        // Arrays.sort(man);
        // 최대값을 구함, 만일 최대값이 여러개인 경우 오름차순으로 반환
        
        int max = Math.max(array[0], Math.max(array[1], array[2]));

        for (int i=0;i<3;i++) {
        	if (max == array[i]) {
        		arr.add(i+1);
        	}
        }
        
        /*
        for (int i=0;i<3;i++) {
        	if (man[i].score != 0) {
        		arr.add(man[i].index);
        	}
        }
        */
        
        int [] answer = new int [arr.size()];
        int size = 0;
        
        for(int temp : arr) {
        	answer[size++] = temp;
        }

        return answer;
    }
	
}
/*
class Man implements Comparable<Man> {

	public int index;
	public int score;

	public Man(int index, int score){
		this.index = index;
		this.score = score;
	}

	public int compareTo(Man man) {
		if (this.score < man.score) {
			return -1;
		} 
		else if (this.score == man.score) {
			return 0;
		} 
		else {
			return 1;
		}
	}
}
*/
