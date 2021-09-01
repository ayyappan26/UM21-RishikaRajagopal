package com.ultramain.basics;

public class Greet {
int time;

public Greet()
{
	time=6;
}
public Greet(int time)
{
	this.time=time;
}
public void greetMessage()
{
	greetMorning();
	greetEvening();
}
public void greetMorning() {
	System.out.println("Good Morning");
}
public void greetEvening() {
	System.out.println("Good evening");
	greetNight();
}
	public void greetNight() {
		
		

	}

}
