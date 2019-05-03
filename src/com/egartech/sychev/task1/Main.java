/**
 * 
 */
package com.egartech.sychev.task1;

import java.util.Scanner;

/**
 * The Class Main.
 *
 * @author Sychev Evgenii
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int key = 0;
		String s = "";

		while (!"6".equals(s)) {
			System.out.println(" Задачи по строкам ");
			System.out.println("1. Найти в строке указанную подстроку и заменить ее на новую.\r\n"
					+ " Строку, ее подстроку для замены и новую подстроку вводит пользователь. \r\n"
					+ "Для перехода к задаче нажмите 1");
			System.out
					.println("2.Дан текст. Найти сумму имеющихся в нем цифр.\r\n" + "Для перехода к задаче нажмите 2");
			System.out.println(
					"3. Дана ненормированная строка, у которой пробелы в начале, в конце и между  словами более одного пробела.\r\n"
							+ " Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце, а между словами оставить только один пробел.\r\n"
							+ "Для выводов результатов нажмите 3");
			System.out.println(
					"4.Вводится строка. Если она начинается на 'abc', то заменить их на 'www', иначе добавить в конец строки 'zzz'\r\n"
							+ " Для выводов результатов нажмите 4");
			System.out.println("5. Вводится строка. Удалить из нее все пробелы."
					+ " После этого определить, является ли она палиндромом (перевертышем), т.е. одинаково пишется как с начала, так и с конца.\r\n"
					+ "Для перехода к задаче нажмите 5");
			System.out.println("6. Для выхода из приложения введите 6");
			System.out.println(" Введите номер меню:");
			s = scan.next();
			try {
				key = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				System.out.println("Неверный ввод");
			}

			switch (key) {
			case 1:
				TaskString.task1();
				break;
			case 2:
				TaskString.task2();
				break;
			case 3:
				TaskString.task3();
				break;
			case 4:
				TaskString.task4();
				break;
			case 5:
				TaskString.task5();
				break;

			}

		}
		System.out.println("Спасибо за внимание!");

	}

}