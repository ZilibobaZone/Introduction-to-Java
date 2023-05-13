package by.epam.introduction_to_java.algorithmization;

import java.util.Random;
import java.util.Scanner;

//Решаем Algorithmization - Задачи. Массивы массивов - задача #10
public class SolutionTask020210 {

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
		System.out.println();
		
		// Определяем положительные элементы на главной диагонали
		int count = 0;
		System.out.println("Элементы больше 0 находящиеся на главной диагонали это ");
		for (int i = 0; i < n; i++) {
			if (a[i][i] > 0) {
				System.out.println(a[i][i] + " ");
				count++;
			}
		}
	}

}
