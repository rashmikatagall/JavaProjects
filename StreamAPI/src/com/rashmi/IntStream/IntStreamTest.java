package com.rashmi.IntStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamTest {

	public static void main(String[] args) {

		// 1. Create stream of values
		IntStream stream = IntStream.of(8, 9, -2, 7, 11, 6, 5, -4);
		System.out.println(stream.sorted().skip(3).findFirst().getAsInt());

		/*
		 * Infinite streams - relies on the fact that stream operations don't begin
		 * until terminal operation in encountered.
		 * a. generate(Supplier<T> s)
		 * b. iterate(T seed, UnaryOperator<T> f)
		 */
		Random random = new Random();
		IntStream stream1 = IntStream.generate(random::nextInt);
		stream1.limit(10).forEach(System.out::println);

		IntStream stream2 = IntStream.iterate(66, i -> i * 4);
		int[] a = stream2.limit(15).filter(i -> i % 6 == 0).toArray();
        System.out.println(Arrays.stream(a).summaryStatistics());

		//2. Create streams with range
	    Map<Integer,Integer> map = IntStream.range(896, 915).filter(i -> i%2==0).boxed().collect(Collectors.toMap(x -> x, x->x*2));
	    map.entrySet().stream().forEach(System.out::println);
	    
	    //3. Create streams with range closed
	    List<Employee> emp = IntStream.rangeClosed(58, 76).mapToObj(Employee::new).collect(Collectors.toList());
	    Employee e = emp.stream().findAny().get();
	    System.out.println(e);
	    
	    //4. flatmap() integer arrays
	    int[][] i = new int[][]{{1,2},{3,4},{5,6}};
	    System.out.println(Arrays.stream(i).count());
	    List<Integer> l = Arrays.stream(i).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList());
	    System.out.println(l);
	    
	    //5.flatmap() list of list of string
	    List<List<String>> str = new ArrayList<>();
	    str.add(Arrays.asList("t","h"));
	    str.add(Arrays.asList("i","s"));
	    str.add(Arrays.asList("a","n"));    
	    String s = str.stream().flatMap(x -> x.stream()).collect(Collectors.joining());
	    System.out.println(s);
	    
	    //6.peek()
	    List<String> st = Arrays.asList("hello", "hi","rashmi");
	    st.stream().peek(x -> System.out.println("Working .. " + x)).count();
	    
	    //7.reduce()
	    IntStream ins = IntStream.of(2,5,7,3,7,-3);
	    System.out.println(ins.reduce(0,(g,h) -> g+h));
	    
	    //8. reduces() is immutable operation
	    List<String> ls = Arrays.asList("test", "hello","there");
	    System.out.println(ls.stream().reduce("", (o,b) ->o+b));
	    
	}

}
