package com.example.todoapi.controller.sample;

import com.example.todoapi.repository.sample.SampleRepository;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class SampleDTO {

	String content;
	LocalDateTime timestamp;
}
