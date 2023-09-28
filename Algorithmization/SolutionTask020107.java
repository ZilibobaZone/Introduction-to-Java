package by.epam.introduction_to_java.algorithmization;

// Решаем Algorithmization - Одномерные массивы - задача #7
// Даны действительные числа a1 , a2 ,, an . Найти max( a1 + a2 n , a2 + a2 n −1 ,, an + an +1 ) .

public class SolutionTask020107 {

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
