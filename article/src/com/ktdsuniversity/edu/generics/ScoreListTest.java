package com.ktdsuniversity.edu.generics;



public class ScoreListTest {
	public static void main(String[] args) {
		
		ScoreList<Integer, Integer> list = new ScoreList<>();
		list.add(21321);//0
		list.add(21113);// 1
		list.add(212313); // 2
		list.add(21423);// 3
		list.add(21553);//4
		list.add(21663);// 5
		list.add(21773);// 6
		
		Reducer<Integer, Integer> listReducer = new Reducer<>(){
			public Integer reduce(Integer input, Integer output) {
				return input + output;
			}
		};
		
		
		int value = list.get(3);
		System.out.println(value);
	
	
		
		ScoreList<String, String> strlist = new ScoreList<>();
		strlist.add("sad");
		strlist.add("ㅈㅂㄷ");
		
		String concat = "";
		for(int i = 0; i < 2; i++) {
			concat += strlist.get(0);
		}
		
		String strValue = strlist.get(0);
		System.out.println(strValue);
		
		ScoreList<String[],Integer>  arraylist = new ScoreList<>();
		arraylist.add(new String[] {"adsf","asdf"});
		arraylist.add(new String[] {"kksf","kkdf"});
		
		
		
		Reducer<String[], String> arrayReducer = new Reducer<>() {

			@Override
			public String reduce(String[] input, String output) {
				for (int i = 0; i < input.length; i++) {
					output += input[i];
				}
				return output;
			}
			
		};
			
		
	}
}
