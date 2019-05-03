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

	// Найти в строке указанную подстроку и заменить ее на новую.
	/**
	 * Task 1.
	 */
	// Строку, ее подстроку для замены и новую подстроку вводит пользователь.
	public static void task1() {
		System.out.println("	// Найти в строке указанную подстроку и заменить ее на новую.\r\n"
				+ "Строку, ее подстроку для замены и новую подстроку вводит пользователь.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите строку (абракадабра): ");
		String string = scanner.nextLine();
		System.out.println("Введите подстроку для замены (када): ");
		String target = scanner.nextLine();
		System.out.println("Введите новую подстроку (никада): ");
		String replacement = scanner.nextLine();
		System.out.println("Исходная строка = " + string);
		System.out.println("Подстрока = " + target);
		System.out.println("Новая подстрока= " + replacement);
		string = string.replace(target, replacement);
		System.out.println("Измененная строка = " + string);
	}

	/**
	 * Task 2.
	 */
	// Дан текст. Найти сумму имеющихся в нем цифр.
	public static void task2() {
		System.out.println("Дан текст. Найти сумму имеющихся в нем цифр.");
		Scanner scanner = new Scanner(System.in);
		String s = "0123456789";
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку");

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

	// Дана ненормированная строка, у которой пробелы в начале, в конце и между
	// словами более одного пробела.
	// Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце,
	/**
	 * Task 3.
	 */
	// а между словами оставить только один пробел.
	public static void task3() {
		System.out.println(
				"Дана ненормированная строка, у которой пробелы в начале, в конце и между словами более одного пробела.\r\n"
						+ "	Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце, а между словами оставить только один пробел. ");
		String s1;
		s1 = "   Core   Java   Volume    I     Fundamentals    ";
		System.out.println("Исходная строка = " + s1);

		s1 = s1.trim();
		String s2 = s1.replaceAll("  ", " ");
		System.out.println("Новая строка = " + s2);

	}

	// Вводится строка. Если она начинается на 'abc', то заменить их на 'www', иначе
	// добавить в конец строки 'zzz'

	/**
	 * Task 4.
	 */
	public static void task4() {

		System.out.println(" Вводится строка. Если она начинается на 'abc', то заменить их на 'www', иначе\r\n"
				+ "добавить в конец строки 'zzz' ");
		System.out.print("Введите строку: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String res = str.startsWith("abc") ? "www" + str.substring(3) : str + "zzz";
		System.out.print("Новая строка: ");
		System.out.println(res);

	}

	// Вводится строка. Удалить из нее все пробелы.
	// После этого определить, является ли она палиндромом (перевертышем), т.е.
	// одинаково пишется как с начала, так и с конца.

	/**
	 * Task 5.
	 */
	public static void task5() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите текст например до вод ");
		String a = scanner.nextLine();
		System.out.println("Вы ввели: " + a);

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
			System.out.println(" Строка является полиндромом");
		} else {
			System.out.println("Строка не является полиндромом");
		}
		return b.equals(reverseString(b));

	}

}
