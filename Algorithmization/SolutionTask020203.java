package by.epam.introduction_to_java.algorithmization;

import java.util.Random;
import java.util.Scanner;

//Решаем Algorithmization - Задачи. Массивы массивов - задача #3
public class SolutionTask020203 {

	public static void main(String[] args) {
		// Дана матрица
		int[][] a = new int[10][10];

		// Заполним её случайными значениеями
		// Для этого используем класс Rendom который возвращает случайное положительное
		// число
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = random.nextInt(100);
			}
		}

		System.out.println("Изначально наша матрица имеет вид");
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

		System.out.println();
		int k = scan("столбца");
		int p = scan("строки");

		// Выводим столбец номер к
		System.out.println("Столбец номер " + k + " имеет вид");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i][k]);
		}

		// Выводим строку номер р
		System.out.println("Строка номер " + p + " имеет вид");
		System.out.println();
		for (int i = 0; i < a[p].length; i++) {
			System.out.print(a[p][i] + " ");
		}

	}

	public static int scan(String a) {
		Scanner scan = new Scanner(System.in);

		int x = 0;
		String str;

		System.out.println("Введите № " + a);

		while (scan.hasNextInt() == false) {
			str = scan.nextLine();
			System.out.println("Введите № " + a);
		}
		x = scan.nextInt();
		return x;

	}

}
