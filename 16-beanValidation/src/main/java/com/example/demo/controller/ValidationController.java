package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserDTO;

@RestController
public class ValidationController {
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public ResponseEntity<String> check(@Valid @RequestBody UserDTO userDTO, BindingResult bindingResult) {
		System.out.println("ValidationController.check");
		System.out.println(userDTO);
		System.out.println(bindingResult);
		return new ResponseEntity<>("ok", HttpStatus.OK);
	}
}
