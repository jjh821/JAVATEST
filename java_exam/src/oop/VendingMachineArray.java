package oop;

public class VendingMachineArray {
	
	VendingDrink[] vdrinks;
	
	public VendingMachineArray(VendingDrink parkcass ,VendingDrink monster, VendingDrink hotsix, VendingDrink milkiss) {
		this.vdrinks = new VendingDrink[4];
		this.vdrinks[0] = parkcass;
		this.vdrinks[1] = monster;
		this.vdrinks[2] = hotsix;
		this.vdrinks[3] = milkiss;
	}
	
	public int pressdDrinkButton(int dnum, int quantity) {
		if( dnum <= 0 || dnum > this.vdrinks.length) {	
			return 0;
		}
		VendingDrink vdrink = this.vdrinks[dnum];
		System.out.println(vdrink.name +  "음료를 " + quantity + "개 주문했습니다.");
		return vdrink.price * quantity;
	}
	public void printAllDrinkInfo() {
		for(int i = 0; i < this.vdrinks.length; i++) {
			System.out.println(this.vdrinks[i].name + "" + this.vdrinks[i].stock);
		}
		
	}
	
	
}
