package com.example.demo;

import org.springframework.batch.infrastructure.item.file.FlatFileItemReader;
import org.springframework.batch.infrastructure.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class DemoApplication {

	protected FlatFileItemReader<String> reader(){
		return new FlatFileItemReaderBuilder<String>().
				resource(new ClassPathResource("data-file.csv")).
				name("csv-reader").
				lineMapper((line,lineNumber)-> line).build();
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
