package by.epam.introduction_to_java.algorithmization;

import java.util.Random;

// Решаем Algorithmization - Задачи. Массивы массивов - задача #11
// Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
// которых число 5 встречается три и более раз.

public class SolutionTask020211 {

	public static void main(String[] args) {
		//
		int[][] a = new int[10][20];

		// Заполним её случайными значениеями
		// Для этого используем класс Rendom который возвращает случайное положительное
		// число
		int count = 0;
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			count = 0;
			for (int j = 0; j < 20; j++) {
				a[i][j] = random.nextInt(15);
				if (a[i][j] == 5) {
					count = count + 1;
				}

			}
			if (count >= 3) {
				System.out.println("В строке " + (i + 1) + " число 5 повторяется 3 и более раз");
			}
		}

		// Выводим матрицу в консоль
		System.out.println("Получившаяся матрица имеет вид");
		for (int i = 0; i < 10; i++) {
			System.out.println();
			for (int j = 0; j < 20; j++) {
				System.out.print(a[i][j] + "\t");
			}
		}
		System.out.println();

	}

}
