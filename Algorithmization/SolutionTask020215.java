package by.epam.introduction_to_java.algorithmization;

import java.util.Random;

//Решаем Algorithmization - Задачи. Массивы массивов - задача #15
//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
public class SolutionTask020215 {

	public static void main(String[] args) {
		// Создаём случайный массив
		int m = 10;
		int n = 10;
		int[][] a = new int[m][n];
		int max; // создаём переменную для хранения максимального значения

		// Заполним массив случайными значениеями
		// Для этого используем класс Rendom который возвращает случайное положительное
		// число
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = random.nextInt(100);
			}
		}

		// Выводим матрицу в консоль
		System.out.println("Дана матрица");
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

		// найдём наибольший элемент массива
		max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
				}
			}
		}

		// заменим все нечётные элементы на наибольшее значение
		
		System.out.println("\n\nЗаменяем нечётные элементы на наибольший элемент массива \n");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if ((i + j) % 2 == 0) {
					a[i][j] = max;
				}
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

	}

}
