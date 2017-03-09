import java.util.*;

public class Main {

	public static void main(String[] args) {
		String input;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a regular expression over the alphabet {a,b}. ");
		input = sc.next().replace('A', 'a').replace('B', 'b');
	}
}

class Parser {
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

class Diagram {
	
}
