package com.example.validator;

import org.springframework.stereotype.Component;

import com.example.entity.Bar;

@Component
public class BarValidator implements GenericValidator<Bar> {
	public Bar validate(Bar bar) {
		System.out.println("BarValidator.validate");
		return bar;
	}
}