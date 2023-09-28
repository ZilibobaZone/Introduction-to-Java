package by.epam.introduction_to_java.algorithmization;

// Решаем Algorithmization - Одномерные массивы - задача #2
// Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
// числом. Подсчитать количество замен.

public class SolutionTask020102 {

	public static void main(String[] args) {

		// Дана последовательность чисел а(n)
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		// Перебираем массив и заменяем все элементы больше z этим числом
		// Считаем количество замен и результат храним в count
		int z = 1;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > z) {
				a[i] = z;
				count++;
			}
		}

		// выводим ответ в консоль
		System.out.print("Было заменено элементов массива " + count);

	}

}
