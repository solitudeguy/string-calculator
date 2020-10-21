package com.calculator.demo.main;

import java.util.Scanner;
import com.calculator.demo.service.FunctionService;

public class CalculatorMain {
	
	public static void main(String[] args) {
		FunctionService functionService = new FunctionService() ;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(" Enter Equation : ");
			try{
			System.out.println(functionService.calculateSum(sc.nextLine()));
			}catch(Exception e){
				System.out.println(e.getMessage());
			}

		}
		
	}

}
