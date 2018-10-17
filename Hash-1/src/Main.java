
public class Main {

	public static void main(String[] args) {
		
		String [] participant = {"mislav", "stanko", "mislav", "ana"};
		String [] completion = {"stanko", "ana", "mislav"};
		
		Solution s = new Solution();
		System.out.println(s.solution(participant, completion));
	}
}