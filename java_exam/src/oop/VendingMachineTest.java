package oop;

public class VendingMachineTest {
	
	public void main (String[] arge) {
		
		VendingDrink parkcass = new VendingDrink("박카스", 900, 15);
		VendingDrink monster = new VendingDrink("몬스터", 1500, 20);
		VendingDrink hotsix = new VendingDrink("핫식스", 1300, 10);
		VendingDrink milkiss = new VendingDrink("밀키스", 1400, 5);
		
		VendingMachine lotte  = new VendingMachine(parkcass, monster, hotsix, milkiss, milkiss);
		
	
	}
}
