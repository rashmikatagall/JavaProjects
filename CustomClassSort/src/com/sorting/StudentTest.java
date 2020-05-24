package com.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {

	private List<Student> students;
	
	
	@BeforeEach
	public void init() {
		students = Arrays.asList(new Student("Ayush",9,"4A"),
				                               new Student("Samaksh",4,"1A"),
						                       new Student("Rashmi",13,"8A"),
						                       new Student("Ayush",10,"3A"));
	}
	
	@Test
	void testStudentCompare() {
		
		Collections.sort(students);
		assertEquals("Rashmi", students.get(2).getName(), "Fails");
		
	}

	@Test
	void testStudentCompareByClass() {
		
		Comparator<Student> c = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getClassName().compareTo(o2.getClassName());
			}
			
		};
		
		Collections.sort(students, c);
		assertEquals("1A", students.get(0).getClassName());
	}

	@Test
	void testStudentCompareByNameAndClass() {
		
		Comparator<Student> c = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getName().equals(o2.getName()))
					return o1.getClassName().compareTo(o2.getClassName());
				else
					return o1.getName().compareTo(o2.getName());
				    
			}
		};
			
			Collections.sort(students,c);
			assertEquals("3A",students.get(0).getClassName());
		}

    @Test
    void testStudentCompareAgeLambda() {
    	
    	Collections.sort(students,(s1,s2) -> s1.getAge()-s2.getAge());
    	assertEquals("Samaksh",students.get(0).getName());
    	
    }
    
    @Test
    void testStudentCompareNameV8Comparator() {
    	
    	students.sort(Comparator.comparing(Student::getName));
    	assertEquals("Samaksh",students.get(3).getName());
    	
    }
    
	@Test
	void testStudentCompareAgeV8ComaparatorReverse() {
		
		students.sort(Comparator.comparing(Student::getClassName,(s1,s2)->s2.compareTo(s1)));
		assertEquals("Rashmi",students.get(0).getName());
	}
	
	@Test
	void testStudentComparingThenComparing() {
		students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getClassName));
		assertEquals("4A",students.get(1).getClassName());
	}
	
}
