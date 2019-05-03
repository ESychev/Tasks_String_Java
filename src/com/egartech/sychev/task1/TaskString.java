/**
 * 
 */
package com.egartech.sychev.task1;

import java.util.Scanner;

/**
 * The Class TaskString.
 *
 * @author Sychev Evgenii
 */
public class TaskString {

	// ����� � ������ ��������� ��������� � �������� �� �� �����.
	/**
	 * Task 1.
	 */
	// ������, �� ��������� ��� ������ � ����� ��������� ������ ������������.
	public static void task1() {
		System.out.println("	// ����� � ������ ��������� ��������� � �������� �� �� �����.\r\n"
				+ "������, �� ��������� ��� ������ � ����� ��������� ������ ������������.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ������ (�����������): ");
		String string = scanner.nextLine();
		System.out.println("������� ��������� ��� ������ (����): ");
		String target = scanner.nextLine();
		System.out.println("������� ����� ��������� (������): ");
		String replacement = scanner.nextLine();
		System.out.println("�������� ������ = " + string);
		System.out.println("��������� = " + target);
		System.out.println("����� ���������= " + replacement);
		string = string.replace(target, replacement);
		System.out.println("���������� ������ = " + string);
	}

	/**
	 * Task 2.
	 */
	// ��� �����. ����� ����� ��������� � ��� ����.
	public static void task2() {
		System.out.println("��� �����. ����� ����� ��������� � ��� ����.");
		Scanner scanner = new Scanner(System.in);
		String s = "0123456789";
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������");

		String s1 = sc.next();
		String s2 = "";
		int sum = 0;
		for (int i = 0; i < s1.length(); i++) {

			if (s.indexOf(s1.charAt(i)) != -1) {

				sum += Character.digit(s1.charAt(i), 10);
			}
		}
		System.out.println("sum = " + sum);

	}

	// ���� ��������������� ������, � ������� ������� � ������, � ����� � �����
	// ������� ����� ������ �������.
	// �������� �� � �������������� ����, �.�. ������� ��� ������� � ������ � �����,
	/**
	 * Task 3.
	 */
	// � ����� ������� �������� ������ ���� ������.
	public static void task3() {
		System.out.println(
				"���� ��������������� ������, � ������� ������� � ������, � ����� � ����� ������� ����� ������ �������.\r\n"
						+ "	�������� �� � �������������� ����, �.�. ������� ��� ������� � ������ � �����, � ����� ������� �������� ������ ���� ������. ");
		String s1;
		s1 = "   Core   Java   Volume    I     Fundamentals    ";
		System.out.println("�������� ������ = " + s1);

		s1 = s1.trim();
		String s2 = s1.replaceAll("  ", " ");
		System.out.println("����� ������ = " + s2);

	}

	// �������� ������. ���� ��� ���������� �� 'abc', �� �������� �� �� 'www', �����
	// �������� � ����� ������ 'zzz'

	/**
	 * Task 4.
	 */
	public static void task4() {

		System.out.println(" �������� ������. ���� ��� ���������� �� 'abc', �� �������� �� �� 'www', �����\r\n"
				+ "�������� � ����� ������ 'zzz' ");
		System.out.print("������� ������: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String res = str.startsWith("abc") ? "www" + str.substring(3) : str + "zzz";
		System.out.print("����� ������: ");
		System.out.println(res);

	}

	// �������� ������. ������� �� ��� ��� �������.
	// ����� ����� ����������, �������� �� ��� ����������� (������������), �.�.
	// ��������� ������� ��� � ������, ��� � � �����.

	/**
	 * Task 5.
	 */
	public static void task5() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("������� ����� �������� �� ��� ");
		String a = scanner.nextLine();
		System.out.println("�� �����: " + a);

//		      String a = "a b c d e";
		String b = a.replaceAll(" ", "");
		System.out.println("b=" + b);
		isPalindrome(b);
	}

	/**
	 * Reverse string.
	 *
	 * @param b the b
	 * @return the string
	 */
	public static String reverseString(String b) {
		return new StringBuilder(b).reverse().toString();

	}

	/**
	 * Checks if is palindrome.
	 *
	 * @param b the b
	 * @return the boolean
	 */
	public static Boolean isPalindrome(String b) {
		if (b.equals(reverseString(b))) {
			System.out.println(" ������ �������� �����������");
		} else {
			System.out.println("������ �� �������� �����������");
		}
		return b.equals(reverseString(b));

	}

}
