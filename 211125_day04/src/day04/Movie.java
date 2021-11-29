package day04;

public class Movie {
	String title;
	String direct;
	int cost;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirect() {
		return direct;
	}
	public void setDirect(String direct) {
		this.direct = direct;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	Movie(String title, String direct, int cost){
		this.title = title;
		this.direct = direct;
		this.cost = cost;
	}
	
	void printInfo() {
		System.out.println(title + " " + direct + " " + cost);
	}
	
}
