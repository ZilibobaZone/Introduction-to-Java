package by.epam.introduction_to_java.algorithmization;

import java.util.Random;

//Решаем Algorithmization - Задачи. Массивы массивов - задача #14
//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.
public class SolutionTask020214 {

	public static void main(String[] args) {
		// Создаём случайный массив
		Random random = new Random();
		int m = random.nextInt(10);
		int n = random.nextInt(10);
		int[][] a = new int[m][n];
		int count;

		// Заполняем его значениями по условию
		for (int j = 0; j < a[a.length - 1].length; j++) {
			count = 0;
			for (int i = 0; i < a.length; i++) {
				if (count <= j) {
					a[i][j] = 1;
					count++;
				} else
					break;
			}
		}

		// Получившуюся матрицу в консоль
		System.out.println("Получившаяся матрица имеет вид");

		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t ");
			}
		}

	}

}
