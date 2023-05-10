package by.epam.introduction_to_java.algorithmization;

import java.util.Scanner;

//Решаем Algorithmization - Задачи. Массивы массивов - задача #4
public class SolutionTask020204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите порядок квадратной матрицы n");
		int n = 1;
		while ( n%2 != 0) {
			System.out.println("n должно быть чётным числом ");
		n = sc.nextInt();
		}

		int[][] a = new int[n][n];

		// Заполняем матрицу значениями
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i % 2 == 0) {
					a[i][j] = j + 1;
				} else {
					a[i][j] = n - j;
				}
			}
		}

		System.out.println("Получившаяся матрица имеет вид");
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

	}

}
