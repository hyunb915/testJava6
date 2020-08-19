package com.tech1.score;

import java.util.Scanner;

public class scrArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] student = { "bob", "jack", "kim", "jay", "ku" };
		int[] score = new int[5];
		float avg = 0f;
		int Totalscore = 0;
		while(true) {
			for (int i = 0; i < score.length; i++) {
				System.out.println("점수입력");
				score[i] = sc.nextInt();
				if (score[i] == -1) {
					System.out.println("종료");
					return;
				}
				else if (score[i] < 50 || score[i] > 100) {
					System.out.println("다시입력");
					i--;
				}
				Totalscore += score[i];
			}
			avg = (float) Totalscore / 5;
			for (int i = 0; i < score.length; i++) {
				System.out.println(student[i] + ": " + score[i]);
			}
			System.out.println("total:" + Totalscore + " avg:" + avg);
		}

	}

}
