package com.example.service;

import com.example.component.Animal;

public class AnimalService {
	private Animal animal;

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void sayHi(String name, String color) {
		animal.sayHi(name, color);
	}
}