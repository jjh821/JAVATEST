package com.ktdsuniversity.edu.fp.basic.stream.advanced;

import java.util.List;
import java.util.Optional;

public class CityTest {
	
	
	
	
	public static void main(String[] args) {
		
		List<City> cities = City.loadCityData();
		
		cities.forEach(System.out :: println);
		
		//stateId가 3907번인 City의 ContryName을 출력
		for(City city: cities) {
			if(city.getStateId() == 3907) {
				System.out.println(city.getCountryName());
			}
		}
		
		//==== Stream Code 로 구현
		cities.stream() //Stream<City>
		.filter(city -> city.getStateId () == 3907) //
		.map(city -> city.getCountryName()) // Stream<String>의 stream이 된다.
		.distinct() //Stream<String>
//		.forEach(contryname -> System.out.println(city.getCountryName());
		.forEach(System.out::println);
		
		//contryName이 "South Korean"인 city의 _native를 출력
		cities.stream()
			.filter(city -> city.getCountryName().equals( "South Korea") )
			.forEach(city -> System.out.println(city.get_native()));
		
		//contryName이 "South Korean"이면서 _native의 길이가 3이상인 city의 _native를 출력
		cities.stream()
		.filter(city -> city.getCountryName().equals( "South Korea") )
		.filter(city -> city.get_native().length() >= 3)
		.forEach(city -> System.out.println(city.get_native()));
		
		System.out.println("=".repeat(40));
		cities.stream()
		.filter(city -> city.getCountryName().equals( "South Korea") )
		.filter(city -> city.get_native().length() >= 3)
		.skip(3)
		.limit(3)
		.forEach(city -> System.out.println(city.get_native()));// 기장군//해운대구//사하구
		
		
		
		
		
		/**
		 * 의령군
		
		
		
			
보성군
담양군
강진군
고흥군
곡성군
구례군
광양시
해남군
함평군
화순군
장흥군
장성군
진도군
쿠리에
목포시
무안군
나주시
신안군
순천시
완도군
영암군
영광군
울주군
========================================
기장군
해운대구
사하구
		 */
	
	
		// _native의 값이 한글로만 이루어진(안배움)  값 중 에서 _native의 길이가 4글자 이상인 것의 
				// name을 중복 없이 조회한다.
				/// 
				//
				// 예시 한글로만 이루어져있는가?
		
		cities.stream()
		.filter(city -> city.get_native().matches("^[가-힣]{4,}$"))
		.map(City::getName)
		.distinct()
		.map(String::length)
		.distinct()
		.forEach(System.out::println);
		
		
//		String name = "장민창";		System.out.println(name + "은 한글로만 이루어진 4글자 이상의 이름인가?" + name.matches("^[가-힣]{4,}+$"));//4,= 네글자 이상이냐
		//Neietus  //
		//Gaigeturi     //애월읍
		
		
		//애월읍의 stateName을 출력한다
		Optional<City> found = cities.stream() //Stream<City>
			.filter(city -> city.getName().equals("Gaigeturi")) //Stream<City>
			.findFirst(); // Optional<City>
		System.out.println(found.orElse(null).getStateName()); //값이 있든없든 orElse로  꺼내는 게 안전하다.
		
		
		Optional<City> found2 = cities.stream() //Stream<City>
				.filter(city -> city.getName().equals("fasdsaedas")) //Stream<City>
				.findFirst(); // Optional<City>
	//	System.out.println(found2.orElse(null).getStateName());
		//  null포인터가 뜨는이유
		City city = found2.orElse(null);
		if(city != null) {
			System.out.println(city.getStateName());
			
		}
		if (found2.isPresent()) {
			System.out.println(found2.get().getStateName());
		}
		
		City city2 = found2.orElse(new City(""));
		System.out.println(city2.getStateName());
		
		
		cities.stream()
			.peek(_city -> System.out.println(_city.getCountryCode()))
			.filter(_city -> true)
			.map(_city -> city.get_native());
		
		System.out.println("~~~~~");
	}
	
	
}
