package org.samp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExer {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(25);
		System.out.println(list);

//		List<Integer> list2 = new ArrayList<>();
//		for (Integer integer : list) {
//			if (integer % 2 == 0) {
//				list2.add(integer);
//			}
//		}
//
//		System.out.println(list2);
//
		List<Integer> collect = list.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());
		System.out.println(collect);

		List<Integer> collect2 = list.stream().map(i -> i + 2).collect(Collectors.toList());
		System.out.println(collect2);
//
//		List<Integer> filt = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//		System.out.println(filt);
//
//		List<Integer> map = list.stream().map(i -> i * 2).collect(Collectors.toList());
//		System.out.println(map);
//
//		long count = list.stream().filter(i -> i % 2 == 0).count();
//		System.out.println(count);
//
//		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
//		System.out.println(sorted);
//
//		List<Integer> sorted1 = list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
//		System.out.println(sorted1);
//
//		Integer min = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
//		System.out.println(min);
//
		Integer max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(max);

//		list.stream().forEach(s -> System.out.println(s));
//		list.stream().forEach(System.out::println);

//		Integer[] array = list.stream().toArray(Integer[]::new);
//		for (Integer integer : array) {
//			System.out.println(integer);
//		}
//
//		Stream<Integer> of = Stream.of(1, 111, 444, 555);
//		of.forEach(System.out::println);
//
//		Integer[] variab = { 23, 43, 65, 85, 95 };
//		Stream<Integer> of2 = Stream.of(variab);
//		of2.forEach(System.out::println);

	}

}
