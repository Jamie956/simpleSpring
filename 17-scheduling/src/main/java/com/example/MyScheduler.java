package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduler {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

	public MyScheduler() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("MyScheduler constructor");
	}

	@Scheduled(cron = "*/1 * * * * *")
	public void runTask() {
		System.out.println("Current Time： " + sdf.format(new Date()));
	}
}