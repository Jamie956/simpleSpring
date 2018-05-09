package com.example.demo.entity;

import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotEmpty;

public class UserDTO {
	@NotEmpty
	private String name;
	@Min(18)
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", age=" + age + "]";
	}

}
