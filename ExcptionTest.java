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

	// �����쳣���
	public static void definitException(int num) {

		try {
			switch (num) {
			case 1:
				throw new RuntimeException("�����쳣1");
			case 2:
				throw new RuntimeException("�����쳣2");
			case 3:
				throw new RuntimeException("�����쳣3");
			default:
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// һ��tryֻ���׳�һ���쳣
	static void onlyThrowOneException() {
		try {
			InputStream inputStream = new FileInputStream("jdfadf");// FileNotFoundException
			throw new RuntimeException("����쳣�����׳�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	// ���try�����׳�����쳣
	public static void throwManyException() {

		try {
			InputStream inputStream = new FileInputStream("jdfadf");// FileNotFoundException
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			throw new RuntimeException("����쳣���׳�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * /try�ڲ������� 
	 * throw new <�쳣> �󲻻�����try�ڽ������Ĵ��룬ֱ����ת��catch��finally���� 
	 * return �����try��return�Ľ���
	 * 
	 */
	public static void innerTry(){
		try {
			System.out.println("����������");
			
			boolean flag = false;//��С�ܿ���
			if(flag){
				System.out.println("�ÿ���");
			}else{
				throw new RuntimeException("������С��");
			}
			System.out.println("��������");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * ���try������ 
	 * throw new <�쳣> �󲻻�����try�ڽ������Ĵ��룬ֱ����ת��catch��finally���� 
	 * return �����try��return�Ľ���
	 * 
	 */
	
	// ���try�����׳�����쳣
		public static String manyTryRun() {

			try {
				return "��һ��try�Ľ��";
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				return "�ڶ���try�Ľ��";
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "���Ľ��";
		}
		
		
	//catch������throwһ���쳣����ûʲô���壬������
	public static void catchMany(){
		try {
			InputStream inputStream = new FileInputStream("jdfadf");// FileNotFoundException
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("�ܹ����׳�1");
		}
		
	}
		
	
}
