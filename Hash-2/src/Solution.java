import java.util.HashMap;

public class Solution {
	
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for (int i=0;i<phone_book.length;i++) {
        	for (int j=0;j<phone_book.length;j++) {
        		if (i == j)
        			continue;
        			
        		if (phone_book[i].length() < phone_book[j].length()) {
        			
        			// phone_book[i].startsWith(phone_book[j])
        			if (phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))) {
        				answer = false;
        				return answer;
        			}
        		}
        	}
        }
        
        return answer;
    }
	
}