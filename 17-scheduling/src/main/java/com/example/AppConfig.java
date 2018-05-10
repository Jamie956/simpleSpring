package com.example;

import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;

@Configuration
@EnableScheduling
public class AppConfig {
	@Bean
	public MyScheduler myScheduler() {
		return new MyScheduler();
	}

	@Bean
	public TaskScheduler taskExecutor() {
		return new ConcurrentTaskScheduler(Executors.newScheduledThreadPool(3));
	}
}