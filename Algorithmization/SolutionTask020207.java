package by.epam.introduction_to_java.algorithmization;

import java.util.Scanner;

// Решаем Algorithmization - Задачи. Массивы массивов - задача #7
/* Сформировать квадратную матрицу порядка N по правилу:
A[i,j] = sin((i*i - j*j) / n)
и подсчитать количество положительных элементов в ней.
*/

public class SolutionTask020207 {

	public static void main(String[] args) {
		// Вводим размерность матрицы с консоли
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите порядок квадратной матрицы n");
		int n = sc.nextInt();

		// Создаём переменную для хранения
		int count = 0;

		// Создаём матрицу
		double[][] a = new double[n][n];

		// Заполняем матрицу значениями
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = Math.sin((i * i - j * j) / n);

				if (a[i][j] > 0)
					count++;
			}
		}

		// Выводим матрицу в консоль
		System.out.println("Получившаяся матрица имеет вид");
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("В данной матрице элементов больше 0 >> " + count);

	}

}
