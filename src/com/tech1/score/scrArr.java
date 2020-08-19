package com.tech1.score;

import java.util.Scanner;

public class scrArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] student = {"bob", "jack", "kim","jay","ku"};
		int[] score = new int[5];
		int avg = 0;
		int Totalscore = 0;
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt(); 
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(student[i]+ ": "+score[i]);
		}
		
	}

}
