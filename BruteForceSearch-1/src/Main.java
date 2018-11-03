
public class Main {

	public static void main(String[] args) {
		
		int [] answers = {1, 2, 3, 4, 5};
		
		Solution s = new Solution();
		int [] arr = s.solution(answers);
		
		for (int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}