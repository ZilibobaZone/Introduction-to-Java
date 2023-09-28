package by.epam.introduction_to_java.algorithmization;

import java.util.Scanner;

// Решаем Algorithmization - Задачи. Массивы массивов - задача #6
/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1    1   1   1   1   1
0    1   1   1   1   0
0    0   1   1   0   0
0    1   1   1   1   0
1    1   1   1   1   1
*/

public class SolutionTask020206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите порядок квадратной матрицы n");
		int n = 1;
		while (n % 2 != 0) {
			System.out.println("n должно быть чётным числом ");
			n = sc.nextInt();
		}

		int[][] a = new int[n][n];

		// Заполняем матрицу значениями
		for (int i = 0; i <= n / 2; i++) {
			for (int j = 0; j <= i; j++) {
				a[i][j] = a[n - i - 1][j] = a[i][n - j - 1] = a[n - i - 1][n - j - 1] = 1;
			}
		}

		int[][] resultArray = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				resultArray[i][j] = a[j][i];
			}
		}

		// выводим массив на печать
		System.out.println("Получившаяся матрица имеет вид");
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print(resultArray[i][j] + " ");
			}
		}

	}

}
