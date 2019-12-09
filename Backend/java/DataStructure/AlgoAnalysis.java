package com.capgimini.algo;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {
	public static void main(String[] args) {
		long number= 999999999L;
//		System.out.println(addUpto(number));
//		System.out.println(addUptoQuick(number));
		countingDuration1();
		countingDuration2();
		
	}

	private static long addUptoQuick(long number) {
		return number *(number+1)/2 ;
	}

	private static long addUpto(long number) {
		long total=0L;
		for(long i=0;i<=number;i++) {
			total=total+i;
		}
		return total;
	}
	public static void countingDuration1() {
		long number =999999999L;
		Instant start =Instant.now();
		System.out.println("addUpto: " + addUpto(number));
		Instant end=Instant.now();
		long duration=Duration.between(start, end).toMillis();
		double seconds =duration /1000.0;
		System.out.println("addUpto time: " + seconds + "Seconds");
		System.out.println("addUpto time: " + duration + "MilliSeconds");
	}
	public static void countingDuration2() {
		long number =999999999L;
		Instant start =Instant.now();
		System.out.println("addUptoQuick: " + addUptoQuick(number));
		Instant end=Instant.now();
		long duration=Duration.between(start, end).toNanos();
		double seconds =duration /1000.0;
		System.out.println("addUptoQuick time: " + seconds + "Seconds");
		System.out.println("addUptoQuick time: " + duration + "NanoSeconds");
	}

}
 