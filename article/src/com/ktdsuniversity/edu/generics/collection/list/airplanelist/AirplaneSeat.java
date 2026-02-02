package com.ktdsuniversity.edu.generics.collection.list.airplanelist;

public class AirplaneSeat {

    private int number;
    private String seatName;
    private boolean isReserved; // 추가: 예약 여부 상태값

    public AirplaneSeat(int number, String seatName) {
        this.number = number;
        this.seatName = seatName;
        this.isReserved = false; // 기본값은 예약 안 됨(O)
    }


    public int getNumber() { 
    	return number; 
    	}
    public String getSeatName() { 
    	return seatName; 
    	}
    public boolean isReserved() { 
    	return isReserved; 
    	}
    public void setReserved(boolean reserved) { 
    	isReserved = reserved; 
    	}

    @Override
    public String toString() {
        // 예약 여부
        return number + " : " + (isReserved ? "X" : "O");
    }
}
