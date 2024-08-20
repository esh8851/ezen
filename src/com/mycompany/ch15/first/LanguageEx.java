package com.mycompany.ch15.first;

import java.util.ArrayList;
import java.util.List;

public class LanguageEx {

	public static void main(String[] args) {

		Language language1 = new Language("Korean", 82);
		
//		System.out.println(language.name);
		
//		ArrayList<Language> arrayList = new ArrayList<>();
		
		List<Language> languages = new ArrayList<>();
		
//		list.add("asdfasdff"); // error : Language 객체를 넣어야 함.
		
		languages.add(language1);
		
		Language language2 = new Language("USA", 10);
		Language language3 = new Language("Japan", 11);
		
		languages.add(language2);
		languages.add(language3);
		
		languages.add(new Language("England", 15));
		
		
//		list.add(car); // error : Language 객체만 담을 수 있다.
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("Hyndai", 2000));
		cars.add(new Car("BMW", 2000));
		cars.add(new Car("KIA", 2000));
		
		for(int i=0; i<cars.size(); i++) {
//			System.out.println("i : " + i);
//			System.out.println(cars.get(i));
			System.out.println("cars.get(" + i + ").name : " + cars.get(i).getName());
		}
		
		System.out.println("-------------------------------------");
		
		for(Car car: cars) {
			System.out.println("car.name : " + car.getName());
		}
		
		System.out.println("-------------------------------------");
//		-------------------------------------

		languages.get(3).name = "UK";
		
		for(int i=0; i<languages.size(); i++) {
//			System.out.println("i : " + i);
//			System.out.println(languages.get(i));
			System.out.println("languages.get(" + i + ").name : " + languages.get(i).name);
		}
		
		System.out.println("-------------------------------------");
		
		for(Language language: languages) {
			System.out.println("language.name : " + language.name);
		}
		
	}

}
