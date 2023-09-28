package by.epam.introduction_to_java.algorithmization;

import java.util.Random;

//Решаем Algorithmization - Задачи. Массивы массивов - задача #13
//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
public class SolutionTask020213 {

	public static void main(String[] args) {
		// Создаём произвольную матрицу
		int[][] a = new int[10][10];
		int[][] b = new int[a.length][a[a.length - 1].length];
		boolean count = false;
		int temp = 0;

		// Заполним её случайными значениеями
		// Для этого используем класс Rendom который возвращает случайное положительное
		// число
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = random.nextInt(100);
			}
		}

		// Выводим матрицу в консоль
		System.out.println("Получившаяся матрица имеет вид");

		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t ");
			}
		}

		// Сортируем столбца по возрастанию
		System.out.println();

		for (int j = 0; j < a[a.length - 1].length; j++) {
			while (!count) {
				count = true;
				for (int i = 1; i < a.length; i++) {
					if (a[i - 1][j] > a[i][j]) {
						temp = a[i][j];
						a[i][j] = a[i - 1][j];
						a[i-1][j] = temp;
						count = false;
					}

				}
			}
			count = false;
		}

		// Выводим матрицу в консоль
		System.out.println("Cортируем столбцы по возрастанию и выводим получившийся массив в консоль");
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t ");
			}
		}

		// Сортируем столбцы по убыванию
		System.out.println();
		for (int j = 0; j < a[a.length-1].length; j++) {
			for (int i = 0; i < a.length; i++) {
				b[b.length - 1 - i][j] = a[i][j];
			}

		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = b[i][j];
			}

		}

		// Выводим матрицу в консоль
		System.out.println("Cортируем столбцы по убыванию и выводим получившийся массив в консоль");
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t ");
			}
		}

	}

}
