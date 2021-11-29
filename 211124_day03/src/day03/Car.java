package day03;

public class Car {
	
	Car(String type, String name){
		this(type, name, 0);
	}
	
	Car(String type, String name, double cc){
		this.type = type;
		this.name = name;
		this.cc = cc;
//		System.out.println(this);
	}
	
	void printInfo() {
		System.out.println("type:"+type+",name:"+name+",cc"+cc);
		
	}
	
	String type;
	String name;
	double cc;

}
