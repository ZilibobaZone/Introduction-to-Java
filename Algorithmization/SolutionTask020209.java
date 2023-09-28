package by.epam.introduction_to_java.algorithmization;

import java.util.Random;
import java.util.Scanner;

// Решаем Algorithmization - Задачи. Массивы массивов - задача #9 
/* Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
*/

public class SolutionTask020209 {

	public static void main(String[] args) {
		// Вводим размерность матрицы через консоль
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите порядок матрицы n");
		int n = sc.nextInt();

		int[][] a = new int[n][n];

		// Заполним её случайными значениеями
		// Для этого используем класс Rendom который возвращает случайное положительное
		// число
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = random.nextInt(100);
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

		// Считаем сумму эдементов по столбцам
		int maxSt = 0;
		int tempCount = 0;
		int maxCount = 0;

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				tempCount = tempCount + a[i][j];
			}
			if (maxCount < tempCount) {
				maxCount = tempCount;
				maxSt = j;
			}
		}

		System.out.println();
		System.out.println("В столбце номер " + maxSt + " самая большая сумма элементов");
		System.out.println("Столбец имеет вид ");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i][maxSt]);
		}

	}
}
