package com.example;

import com.example.component.Deer;
import com.example.component.Dog;
import com.example.service.AnimalService;
import com.example.util.ObjectFactory;

public class Main {
	public static void main(String[] args) {
		AnimalService animalService = (AnimalService) ObjectFactory.getInstance("AnimalService.class");
		
		Dog dog = (Dog) ObjectFactory.getInstance("Dog.class");
		animalService.setAnimal(dog);
		animalService.sayHi("tom", "wowo");
		
		Deer deer = (Deer) ObjectFactory.getInstance("Deer.class");
		animalService.setAnimal(deer);
		animalService.sayHi("niko", "oops");
	}
}