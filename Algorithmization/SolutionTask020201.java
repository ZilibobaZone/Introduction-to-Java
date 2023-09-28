package by.epam.introduction_to_java.algorithmization;

import java.util.Random;

// Решаем Algorithmization - Задачи. Массивы массивов - задача #1
// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class SolutionTask020201 {

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

		// Выведем на печать все нечётные столбцы у которых первый элемент больше
		// последнего
		System.out.println();
		for (int j = 0; j < a[a.length - 1].length; j = j + 2) {
			if (a[0][j] > a[a.length - 1][j]) {
				System.out.println("столбец номер " + (j));
				for (int i = 0; i < a.length; i++) {
					System.out.println(a[i][j] + " ");
				}
			}
		}

	}

}
