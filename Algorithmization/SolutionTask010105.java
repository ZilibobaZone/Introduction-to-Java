package by.epam.introduction_to_java.algorithmization;

//Решаем Basics of software code development - Одномерные массивы - задача #5
public class SolutionTask010105 {

	public static void main(String[] args) {
		// Дана произвольные целые числа
		int[] a = { -1, -6, -22, 55, 1, 2, 3, 4, 5, 99, 7, 8, 9 };

		// Выводим те которые a[i]>i
		System.out.print("Числа больше i это : ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > i)
				System.out.print(a[i] + " ");
		}

	}

}
