package by.epam.introduction_to_java.basics_of_sftware_code_development;

import java.util.Scanner;

// Решаем Basics of software code development - Циклы - задача #7
// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
// m и n вводятся с клавиатуры. 

public class SolutionTask010307 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		//Вводим через консоль промежуток натуральных чисел
		System.out.println("Введите начальное число промежутка >> ");
		int m = console.nextInt();
		System.out.println("Введите конечное чило промежутка >> ");
		int n = console.nextInt();
		
		while (m <= n) {
			System.out.print("Число " + m + " если имеет делители то такие ");
			for (int i = 2; i < m; i++) {
				if ((m%i)==0) {
					System.out.print(i + " ");
				}
				
			}
			// Добавим перевод строки для удобства вывода
			System.out.println(" ");
			m++;
		}

	}

}
