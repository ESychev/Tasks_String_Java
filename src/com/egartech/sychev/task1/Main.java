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
			System.out.println(" ������ �� ������� ");
			System.out.println("1. ����� � ������ ��������� ��������� � �������� �� �� �����.\r\n"
					+ " ������, �� ��������� ��� ������ � ����� ��������� ������ ������������. \r\n"
					+ "��� �������� � ������ ������� 1");
			System.out
					.println("2.��� �����. ����� ����� ��������� � ��� ����.\r\n" + "��� �������� � ������ ������� 2");
			System.out.println(
					"3. ���� ��������������� ������, � ������� ������� � ������, � ����� � �����  ������� ����� ������ �������.\r\n"
							+ " �������� �� � �������������� ����, �.�. ������� ��� ������� � ������ � �����, � ����� ������� �������� ������ ���� ������.\r\n"
							+ "��� ������� ����������� ������� 3");
			System.out.println(
					"4.�������� ������. ���� ��� ���������� �� 'abc', �� �������� �� �� 'www', ����� �������� � ����� ������ 'zzz'\r\n"
							+ " ��� ������� ����������� ������� 4");
			System.out.println("5. �������� ������. ������� �� ��� ��� �������."
					+ " ����� ����� ����������, �������� �� ��� ����������� (������������), �.�. ��������� ������� ��� � ������, ��� � � �����.\r\n"
					+ "��� �������� � ������ ������� 5");
			System.out.println("6. ��� ������ �� ���������� ������� 6");
			System.out.println(" ������� ����� ����:");
			s = scan.next();
			try {
				key = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				System.out.println("�������� ����");
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
		System.out.println("������� �� ��������!");

	}

}