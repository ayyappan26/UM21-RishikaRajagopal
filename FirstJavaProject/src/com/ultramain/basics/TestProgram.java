package com.ultramain.basics;

import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		for (int i=1;i<n;i++)
		{
			for(int j=2;j<i;i++)
		{
		if(i%2==0)
		{
			continue;
		}
		}
		}
		else
		{
			System.out.println(i);
		}

	}

}
}
