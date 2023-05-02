package by.epam.introduction_to_java.algorithmization;

//Решаем Algorithmization - Одномерные массивы - задача #9
public class SolutionTask020109 {

	public static void main(String[] args) {
		// Дан массив целых чисел
		int[] a = { 1, 2, 3, 6, 5, 6, 7, 8, 9, 1, 2, 3, 6, 3, 6, 5, 7, 8, 6, 5, 2, 5, 4, 8, 3, 5, 7, 8, 7, 4, 4 };
		int countMax1 = 0; // количество повторений
		int countMax2 = 0;
		int tempCount = 0;
		int maxCountNum1 = 0; // элемент который чаще всего повторяется
		int maxCountNum2 = 0;

		// Перебираем массив и считаем сколько раз повторяется каждый элемент массива
		for (int i = 0; i < a.length; i++) {
			tempCount = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					tempCount++;
				}

				// элемент с большим количеством повторений сохраняем в переменную maxCountNum1
				if (tempCount > countMax1 && a[i] != maxCountNum1) {
					countMax2 = countMax1;
					countMax1 = tempCount;
					maxCountNum2 = maxCountNum1;
					maxCountNum1 = a[i];
					break;
				}

				// Если таких элементов несколько то следующий сохроняем в maxCountNum2
				if (tempCount == countMax1 && tempCount > countMax2 && a[i] != maxCountNum1) {
					countMax2 = tempCount;
					maxCountNum2 = a[i];
				}
			}
		}

		// Если несколько элементов повторяются одинаковое количество раз вывождим на
		// печать больший из них
		if (countMax1 == countMax2) {
			System.out.println(
					"Элемент " + Math.max(maxCountNum1, maxCountNum2) + " встречается " + countMax1 + " раз(а).");
		} else {
			System.out.println("Элемент " + maxCountNum1 + " встречается " + countMax1 + " раз(а).");

		}

	}

}
