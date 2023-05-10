package by.epam.introduction_to_java.algorithmization;

import java.util.Scanner;

//Решаем Algorithmization - Задачи. Массивы массивов - задача #5
public class SolutionTask020205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите порядок квадратной матрицы n");
		int n = 1;
		while (n % 2 != 0) {
			System.out.println("n должно быть чётным числом ");
			n = sc.nextInt();
		}

		int[][] a = new int[n][n];

		// Заполняем матрицу значениями по условию
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j + 1) <= (n - i)) {
					a[i][j] = i + 1;
				} else {
					a[i][j] = 0;
				}

			}
		}

		System.out.println("Получившаяся матрица имеет вид");
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

	}

}
