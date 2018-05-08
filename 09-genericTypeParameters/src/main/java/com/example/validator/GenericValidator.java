package com.example.validator;

public interface GenericValidator<T> {
	public T validate(T object);
}