package by.epam.introduction_to_java.algorithmization;

//Решаем Algorithmization - Одномерные массивы - задача #10
public class SolutionTask020110 {

	public static void main(String[] args) {
		// дан целочисленный массив
		int[] a = { 1, 2, 3, 4, 3, 6, 7, 8, 9, 1, 2, 3, 4, 3, 5, 6, 7, 8, 4, 5, 2, 5, 6, 8, 3, 5, 7, 8, 7, 4, 4 };

		// заменяем каждый 2 элемент на 0
		for (int i = 0; i < a.length; i++) {
			if ((i + 1) % 2 == 0) {
				a[i] = 0;
			}
		}

		// выводим массив на печать в консоль
		System.out.print("Новый массив имеет вид ");
		for (int x : a) {
			System.out.print(x + " ");
		}

	}

}
