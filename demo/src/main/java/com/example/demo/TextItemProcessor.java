package com.example.demo;

import org.jspecify.annotations.Nullable;
import org.springframework.batch.infrastructure.item.ItemProcessor;
import org.springframework.stereotype.Component;
@Component
public class TextItemProcessor implements ItemProcessor<String, String>{

	@Override
	public String process(String message) throws Exception {
		return message.replaceAll("\\d", "#");
	}

}
