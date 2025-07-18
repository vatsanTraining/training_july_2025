package com.example.demo.parallel.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo {

	
	public static void reductionDemo() {
		
		List<Double> salaryList = List.of(5000.00,70000.00,65000.00,40000.00);
		
		
		salaryList.parallelStream()
        .reduce((e1,e2) -> e1 > e2 ? e1 :e2)
		.ifPresent(System.out::println);


	}
	
	public static void reductionAccumulator() {
		
		

		int total = Stream.of("1", "2", "3", "4")
                .parallel()
                .reduce(0, (integer, s) -> Integer.sum(integer, Integer.parseInt(s)),
                           (integer, integer2) -> Integer.sum(integer, integer2));
		
		
		System.out.println(total);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Arrays.asList("Ramesh", "Suresh", "Ganesh", "Magesh", "Rajesh", "Sudan", "Jagan", "Madan").
		           parallelStream().
		                forEach(System.out::println);

		reductionDemo();
		
		reductionAccumulator();
	}

}
