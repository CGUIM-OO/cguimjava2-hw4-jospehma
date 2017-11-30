package HW4;
import java.util.ArrayList;
public class Player {
	private String name;
	private int chips;
	private int bet;
	private ArrayList<Card> oneRoundCard;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public Player(String name, int chips){
		this.name=name;
		this.chips=chips;
	}
	public String getName(){
		return name;
	}
	public int makeBet(){
		bet = 1;
		if(chips<=0){
			return 0;
		}
		
		return bet;
	}
	public void setOneRoundCard(ArrayList<Card> cards){
		oneRoundCard = new ArrayList<Card>();
		oneRoundCard = cards;
	}
	public boolean hitMe(){
		int n=0;
		for(Card k : oneRoundCard){
			n +=k.getRank();
		}
		if(n < 17){
			return true;
		}
		else{
			return false;
		}
		
	}
	public int getTotalValue(){
		int sum =0;
		for(Card k : oneRoundCard){
			sum+=k.getRank();
		}
		return sum;
	}
	public int getCurrentChips(){
		return chips;
	}
	public void increaseChips (int diff){
		chips = (chips+diff);
	}
	public void sayHello(){
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}

}
