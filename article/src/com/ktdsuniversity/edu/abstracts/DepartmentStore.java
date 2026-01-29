package com.ktdsuniversity.edu.abstracts;

public class DepartmentStore  extends AbstractMart{

	public DepartmentStore(int prouctPrice) {
		super(prouctPrice);
	
	}
	@Override
	public int usePoint(Guest guest) {
	
		return 0;
	}
	@Override
	public void givePoint(Guest guest, int amount) {
		/**
		 * Guest: Guest is a Guest
		 * 	VIP: VIP is a Guest
		 * 		VVIP : VVIP is a VIP and Guest
		 * 
		 */
		if(guest instanceof VVIP  ) {
			guest.addPoint((int)(amount * 0.03));
			
		}else if(guest instanceof VIP ) {
			System.out.println( "포인트를 받을 수 없는 등급입니다");
			
		}else if (guest instanceof Guest ){
			guest.addPoint((int)(amount * 0.05));
		}
		return;
	}
	@Override
	public int discount(Guest guest, int amount) {
		
		
	
		
		return 0;
	}
}
