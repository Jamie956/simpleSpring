package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "classpath:nexus.properties" })
public class NexusBean {
	@Value("${nexus.user}")
	private String user;
	@Value("${nexus.pass}")
	private String pass;
	@Value("${nexus.rest.uri}")
	private String restUri;

	public NexusBean() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("NexusBean constructor");
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRestUri() {
		return restUri;
	}

	public void setRestUri(String restUri) {
		this.restUri = restUri;
	}

}