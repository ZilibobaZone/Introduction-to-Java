package by.epam.introduction_to_java.algorithmization;

import java.util.Random;

// Решаем Algorithmization - Задачи. Массивы массивов - задача #2
// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class SolutionTask020202 {

	public static void main(String[] args) {
		// Дана квадратная матрица
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
		System.out.println("Диагональ из верхнего левого в нижний правый ");
		// Выведем на экран элементы на диагоналях
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i][i]);
		}

		System.out.println();
		System.out.println("Диагональ из нижнего левого в верхний правый ");
		// Выведем на экран элементы на диагоналях
		for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
			System.out.println(a[i][j]);
		}

	}

}
