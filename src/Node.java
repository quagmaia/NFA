import java.util.*;

public class Node {
	int index;
	List<Node> nextA = new ArrayList<Node>();
	List<Node> nextB = new ArrayList<Node>();
	List<Node> nextNull = new ArrayList<Node>();
	Boolean accepting;
	
	public Node(){
	}
	
	public Node (int index, Boolean accepting){
		this.index = index;
		this.accepting = accepting;
	}
	
	public void setIndex(int i){
		index = i;
	}
	
	public void setAccepting(Boolean accepting){
		this.accepting = accepting;
	}
	
	public void addNextA(Node n){
		nextA.add(n);
	}
	
	public void addNextB(Node n){
		nextB.add(n);
	}
	
	public void addNextNull(Node n){
		nextB.add(n);
	}
	
	public int getIndex(){
		return index;
	}
	
	public Boolean getAccepting(){
		return accepting;
	}
	
	public List<Node> getNextA(){
		return nextA;
	}
	
	public List<Node> getNextB(){
		return nextB;
	}
	
	public List<Node> getNextNull(){
		return nextNull;
	}
	
}
