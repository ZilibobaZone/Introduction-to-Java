package by.epam.introduction_to_java.algorithmization;

//Решаем Basics of software code development - Одномерные массивы - задача #3
public class SolutionTask010103 {

	public static void main(String[] args) {

		// Дан произвольный массив натуральных чисел
		int[] a = { 1, 2, 3, 4, 5, 6, 0, 0, 0, -1, -5, -6, -2, 0 };

		// посчитаем количество элементов больше, меньше и равных нулю. Результат будем
		// хранить в переменных countMinus, countPlus, CountXero
		int countMinus = 0;
		int countPlus = 0;
		int countZero = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0)
				countMinus++;
			if (a[i] > 0)
				countPlus++;
			if (a[i] == 0)
				countZero++;
		}

		// Выводим результаты в консоль
		System.out.println("В массиве действительных чисел положительных элементов " + countPlus);
		System.out.println("В массиве действительных чисел отницательных элементов " + countMinus);
		System.out.println("В массиве действительных чисел элементов равных нулю " + countZero);
	}

}
