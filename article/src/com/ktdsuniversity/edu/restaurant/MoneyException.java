package com.ktdsuniversity.edu.restaurant;
// 잔액부족
public class MoneyException extends RuntimeException {
	public MoneyException(String message) {
		super(message);
	}
}
