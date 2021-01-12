package com.rashmi.optional;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class TestOptional {

	@Test
	void testOptionalOf_withnull() {	
		assertThrows(NullPointerException.class, () -> {Optional<String> str = Optional.of(null);});
	}
	
	@Test
	void testOptionalOf_withvalue() {
		Optional<String> str = Optional.of("rashmi");
		assertEquals("rashmi", str.get());
	}
	
	@Test
	void testOptionalOfNullable_withnull() {
		Optional<String> str = Optional.ofNullable(null);
		assertThrows(NoSuchElementException.class, () -> str.get());
	}
	
	
	@Test
	void testOptionalOfNullable_withnull_isPresentFalse() {
		Optional<String> str = Optional.ofNullable(null);
		assertFalse(str.isPresent());
	}

	@Test
	void testOptionalOfNullable_withvalue() {
		Optional<String> str = Optional.ofNullable("rashmi");
		assertEquals("rashmi", str.get());
	}
	
	@Test
	void testOptionalOf_withvalue_ifPresent() {
		Optional<String> str = Optional.of("rashmi");
		assertDoesNotThrow(() -> str.ifPresent(System.out::println));
	}
	
	@Test
	void testOptionalOfNullable_withnull_orElse() {
		Optional<String> str = Optional.ofNullable(null);
		String test = str.orElse("rashmi");
		assertEquals("rashmi",test);
	}
	
	@Test
	void testOptionalOfNullable_withnull_orElseGet() {
		Optional<String> str = Optional.ofNullable(null);
		String test = str.orElseGet(() -> {return "rashmi";});
		assertEquals("rashmi",test);
	}
	
	
	
}
