package by.epam.introduction_to_java.algorithmization;

//Решаем Basics of software code development - Одномерные массивы - задача #7
public class SolutionTask010107 {

	public static void main(String[] args) {
		// Дана последовательность действительных чисел
		double[] a = { 1.0, -2.0, 3.0, 4.0, 0.0, 8.0, 80.0, 9.543, 0.2, 66 };
		double result = a[0];

		// Находим мах(a[n] + a[n+1])
		for (int i = 0; i < a.length - 1; i++) {
			if (result < Math.max(result, (a[i] + a[i + 1])))
				;
			result = Math.max(result, (a[i] + a[i + 1]));
		}

		// Выводим ответ в консоль
		System.out.print("Макс сумма a[n] + a[n+1] равна " + result);

	}

}
