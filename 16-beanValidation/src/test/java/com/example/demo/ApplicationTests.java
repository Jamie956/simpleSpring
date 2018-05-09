package com.example.demo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void testValid() throws Exception {
		TestRestTemplate template = new TestRestTemplate();
		String url = "http://localhost:8080/validate";
		Map<String, Object> params = new HashMap<>();
		params.put("name", "");
		params.put("age", "20");
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
		headers.add("Content-Type", "application/json");
		HttpEntity<Map<String, Object>> request = new HttpEntity<>(params, headers);
		String res = template.postForObject(url, request, String.class);
		assertThat(res, equalTo("ok"));
	}

}
