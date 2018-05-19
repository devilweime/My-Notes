package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExcptionTest {

	public static void main(String[] args) {
		// definitException(2);

		// onlyThrowOneException();

		// throwManyException();

		// innerTry();
		
		//System.out.println(manyTryRun());
		
		catchMany();
		
	}

	// 定义异常情况
	public static void definitException(int num) {

		try {
			switch (num) {
			case 1:
				throw new RuntimeException("这是异常1");
			case 2:
				throw new RuntimeException("这是异常2");
			case 3:
				throw new RuntimeException("这是异常3");
			default:
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 一个try只能抛出一个异常
	static void onlyThrowOneException() {
		try {
			InputStream inputStream = new FileInputStream("jdfadf");// FileNotFoundException
			throw new RuntimeException("这个异常不会抛出");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	// 多个try可以抛出多个异常
	public static void throwManyException() {

		try {
			InputStream inputStream = new FileInputStream("jdfadf");// FileNotFoundException
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			throw new RuntimeException("这个异常会抛出");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * /try内部的运行 
	 * throw new <异常> 后不会运行try内接下来的代码，直接跳转的catch、finally部分 
	 * return 请参照try与return的解释
	 * 
	 */
	public static void innerTry(){
		try {
			System.out.println("今天是周五");
			
			boolean flag = false;//大小周控制
			if(flag){
				System.out.println("好开心");
			}else{
				throw new RuntimeException("这周是小周");
			}
			System.out.println("今晚尽情嗨");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * 多个try的运行 
	 * throw new <异常> 后不会运行try内接下来的代码，直接跳转的catch、finally部分 
	 * return 请参照try与return的解释
	 * 
	 */
	
	// 多个try可以抛出多个异常
		public static String manyTryRun() {

			try {
				return "第一个try的结果";
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				return "第二个try的结果";
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "最后的结果";
		}
		
		
	//catch部分能throw一个异常，但没什么意义，很少用
	public static void catchMany(){
		try {
			InputStream inputStream = new FileInputStream("jdfadf");// FileNotFoundException
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("能够被抛出1");
		}
		
	}
		
	
}
