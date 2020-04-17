package com.amitinside.dummy.provider;

import java.util.stream.IntStream;

import org.osgi.service.component.annotations.Component;

import com.amitinside.dummy.api.DummyManager;

@Component
public final class DummyManagerProvider implements DummyManager {
	
	@Override
	public IntStream getStream() {
		return IntStream.generate(() -> 20);
	}


}