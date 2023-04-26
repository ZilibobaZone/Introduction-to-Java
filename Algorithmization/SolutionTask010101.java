package by.epam.introduction_to_java.algorithmization;

//Решаем Basics of software code development - Одномерные массивы - задача #1
public class SolutionTask010101 {

	public static void main(String[] args) {

		// Объявляем массив с произвольным числом элементов и заполняем его натуральными
		// числами
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		// Перебираем весь массив и ищем элементы кратные К, сумируем их
		int k = 2;
		int result = 0;

		for (int i = 0; i < a.length; i++) {
			if ((a[i] % k) == 0) {
				result = result + a[i];
			}
		}

		// Выводим ответ в консоль
		System.out.print("Сумма всех элементов кратных К равна " + result);

	}

}
