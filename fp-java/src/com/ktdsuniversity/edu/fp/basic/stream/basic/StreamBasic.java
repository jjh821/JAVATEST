package com.ktdsuniversity.edu.fp.basic.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.fp.basic.stream.object.Dish;
import com.ktdsuniversity.edu.fp.basic.stream.object.DishList;
import com.ktdsuniversity.edu.fp.basic.stream.object.DishType;
import com.ktdsuniversity.edu.fp.basic.stream.object.FoodType;

public class StreamBasic {
	public void printDishUseFor(){
		System.out.println("전체 요리 목록 - 칼로리가 500 미만인 && FoodType이  MEAT인 -for");
		
		List<Dish> dishList = DishList.makeDishList();
		for(Dish dish : dishList) {
			if(dish.getCalories() < 500 && dish.getFoodType() == FoodType.MEAT) {
				System.out.println(dish);
			}
			
		}
	}
	public void printDishUseStream(){
		
		System.out.println("전체요리 목록 - 칼로리가 500미만인 -&& FoodType이  MEAT인-&& DishType이 FISH인 List.forEach");
		List<Dish> dishList = DishList.makeDishList();
//		dishList.forEach(dish -> System.out.println(dish));
//		dishList.forEach(System.out :: println);
		dishList.forEach(dish -> {
			if(dish.getCalories() < 500 && dish.getFoodType() == FoodType.MEAT && dish.getDishType() == DishType.FISH) {//필터가 이러면 너무길다
				System.out.println(dish);
			}
		});
		
		System.out.println("전체 요리 목록 Stream");
		//Stream 을 사용할 수 있는 대상 -> List, Set
		dishList//List<dish> 스트림 인스턴스의 디쉬라는 제너릭을 가진
				.stream()//Stream<Dish> 반복은 stream 얘가한다
//				.peek(dish -> {// Stream<Dish> 현재 반복중인 인스턴스 확인 - 디버깅용
//					System.out.println("첫번째 filter를 수행하기 이전의 인스턴스값");
//					System.out.println("1. "+ dish.getName());
//					System.out.println("1. "+ dish.getCalories());
//					System.out.println("1. "+ dish.getFoodType());
//					System.out.println("1. "+ dish.getDishType());
//				})
				.filter(dish -> dish.getCalories() < 500)
//				.peek(dish -> {// Stream<Dish> 현재 반복중인 인스턴스 확인 - 디버깅용
//					System.out.println("두번째 filter를 수행하기 이전의 인스턴스값");
//					System.out.println("2. "+ dish.getName());
//					System.out.println("2. "+ dish.getCalories());
//					System.out.println("2. "+ dish.getFoodType());
//					System.out.println("2. "+ dish.getDishType());
//				})
				.filter(dish -> dish.getFoodType() == FoodType.MEAT) //이런식으로 필터를 여러번 사용해서
//				.peek(dish -> {// Stream<Dish> 현재 반복중인 인스턴스 확인 - 디버깅용
//					System.out.println("세번째 filter를 수행하기 이전의 인스턴스값");
//					System.out.println("3. "+ dish.getName());
//					System.out.println("3. "+ dish.getCalories());
//					System.out.println("3. "+ dish.getFoodType());
//					System.out.println("3. "+ dish.getDishType());
//				})
				.filter(dish -> dish.getDishType() == DishType.FISH) //이런식으로 필터를 여러번 사용해서
//				.peek(dish -> {// Stream<Dish> 현재 반복중인 인스턴스 확인 - 디버깅용
//					System.out.println("네번째 filter를 수행하기 이전의 인스턴스값");
//					System.out.println("4. "+ dish.getName());
//					System.out.println("4. "+ dish.getCalories());
//					System.out.println("4. "+ dish.getFoodType());
//					System.out.println("4. "+ dish.getDishType());
//				})
				.forEach(dish -> System.out.println(dish));
				
				
	}
	public void printEvenNumbers() {
		List<Integer> numbers = Arrays.asList(1,231,213,4,125,5436,1557,765754,8,879,897987,888484);
		//1. numbares에  있는 값을 전부 ㅓ2로 곱해서 짝수로 만들어 출려한다.
		numbers.stream()
			.map(num -> num * 2)
			.forEach( System.out::println);
		//2. numbers에 있는 값에서 중복된 숫자는 모두 제거하고 나머지 숫자에 전부 2를 곱해서 짝수로 만들어서 출력
		numbers.stream()
		.distinct()//중복된값을 제거해줌  T를 그대로 반환하기 때문에 제네릭이 바뀌지않음
		.map(num -> num * 2) //Stream<Integer>
		.forEach( System.out::println);
	}
	public String makeString() {
		
		
		// 모든 VEGETABLES 메뉴의 이름들을 "," 로 연결한 문자열을 반환한다.
		
		List<Dish> dishList = DishList.makeDishList();
		
		String dishesName = dishList.stream()// Stream<Dish>
				.filter(dish -> dish.getFoodType() == FoodType.VEGETABLES)
				.map(Dish::getName)// Stream<string>
				.collect(Collectors.joining(", "));
		
		return dishesName; //for로 만들려고하면 복잡함
	}
	public List<Dish> getHealthyDishes(){
		// 변경 불가능한 리스트 (add불가)
		List<Dish> dishes = DishList.makeDishList();
		
		List<Dish> result = dishes.stream()
						.filter(dish -> dish.getCalories() < 400)
						.toList();
		
		
		return result;
	}
	
	public List<Dish> getHealthyDishes2(){
		// 변경 가능한 리스트 (add가능)
		List<Dish> dishes = DishList.makeDishList();
		
		List<Dish> result = dishes.stream()
						.filter(dish -> dish.getCalories() < 400)
						.collect(Collectors.toList());
		
		
		return result;
	}
	public static void main(String[] args) {
		StreamBasic basic = new StreamBasic();
//		basic.printDishUseFor();
//		basic.printDishUseStream();
		basic.printEvenNumbers();
		String dishesName = basic.makeString();
		System.out.println(dishesName);
		
		List<Dish> result = basic.getHealthyDishes();
		System.out.println(result);
//		result.add(new Dish("곱창",FoodType.MEAT,3000,DishType.MEAT));
		
		List<Dish> result2 = basic.getHealthyDishes2();
		System.out.println(result2);
		result2.add(new Dish("곱창",FoodType.MEAT,3000,DishType.MEAT));
		System.out.println(result2);
	}
}
