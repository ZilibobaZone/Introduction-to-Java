package by.epam.introduction_to_java.algorithmization;

import java.util.Random;
import java.util.Scanner;

// Решаем Algorithmization - Задачи. Массивы массивов - задача #8
/* В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
*/

public class SolutionTask020208 {

	public static void main(String[] args) {
		// Вводим размерность матрицы через консоль
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите порядок матрицы n");
		int n = sc.nextInt();

		// Создаём матрицу
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

		// Выбираем два столбца которые нужно поменять
		System.out.println();
		System.out.println("Поменяем пару столбцов местами");
		System.out.println("Выбиоаем первый столбец >>");
		int st1 = sc.nextInt();
		System.out.println("Выбираем второй столбец >>");
		int st2 = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int temp;
			temp = a[i][st1];
			a[i][st1] = a[i][st2];
			a[i][st2] = temp;
		}

		// Выводим матрицу в консоль
		System.out.println("После замены столбцов получившаяся матрица имеет вид");
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

	}

}
