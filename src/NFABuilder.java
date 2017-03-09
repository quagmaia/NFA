import java.util.*;

public class NFABuilder {
	Stack<Character> ab = new Stack<Character>();
	Stack<Character> op = new Stack<Character>();
	Stack<Character> abTemp = new Stack<Character>();
	Stack<Character> opTemp = new Stack<Character>();
	
	public void convert(String input){
		for (int i = 0; i < input.length(); i++){
			char ch = input.charAt(i);
			
			switch (ch){
			case 'a':
			case 'b':
				ab.push(ch);
				break;
			case '+':
				break;
			case '*':
				break;
			case '(':
				op.push(ch);
				break;
			case ')':
				op.push(ch);
				break;
			}
			
		}//for
	}//convert
}