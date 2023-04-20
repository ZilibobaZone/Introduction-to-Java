package by.epam.introduction_to_java.basics_of_sftware_code_development;

import java.util.Scanner;

//Решаем Basics of software code development - Циклы - задача #1
public class SolutionTask010301 {

	public static void main(String[] args) {
		int result;
		result = 0;

		System.out.println("Введите любое целое положительное число");

		// Используем класс Scanner для чтения числа из консоли
		Scanner console = new Scanner(System.in);
		int x = console.nextInt();

		for (int i = 1; i < x; i++) {
			result = result + i;
		}

		System.out.print("Сумма всех чисел от 1 до " + x + " равна " + result);

	}

}
