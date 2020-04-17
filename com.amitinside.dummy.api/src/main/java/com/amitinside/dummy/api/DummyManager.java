package com.amitinside.dummy.api;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface DummyManager {

    IntStream getStream();

}