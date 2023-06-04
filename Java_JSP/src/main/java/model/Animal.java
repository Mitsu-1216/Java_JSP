package model;
import java.io.Serializable;

public class Animal implements Serializable {
	private String name;
	private int age;
	
}

public Animal () {
	public Human(String name,int age) {
	// フィールドはカプセル化する
	this.name=name;
	this.age=age;
		
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name=name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age=age;}
	
}
