package com.rashmi.empserialize;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value = OrderAnnotation.class)
class TestEmployee {

	static Employee emp;
	static Person person;

	@BeforeAll
	static void initData() {
		emp = new Employee(2, "rashmi");
		person = new Person(5,"ayush","student");
		File file = new File("emp.txt");
		file.delete();
	}

	@Test
	@Order(1)
	@DisplayName("Testing_if_two_emprefernces_are_same")
	void testEmployee() {
		Employee emp2 = emp;
		assertSame(emp2, emp);
	}

	@Order(2)
	@Test
	@DisplayName("Testing_serialization_works_without_exception")
	void testEmpSerialization() {
		assertDoesNotThrow(() -> {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.txt"));
			oos.writeObject(emp);
		});
	}

	@Order(3)
	@Test
	@DisplayName("Testing_deserialization_results_in_same_object")
	void testEmpDeserialization() {
	
	    ObjectInputStream ois;
	    Employee emp2 = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("emp.txt"));
            emp2 = (Employee)ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	   
	    assertEquals(emp2,emp);	    
	}
	
	@Order(4)
	@Test
	@DisplayName("Testing_serialization_works_without_exception_for_extendedclass")
	void testPersonSerialization() {
		assertDoesNotThrow(() -> {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
			oos.writeObject(person);
		});
	}
	
		 
	}
