package by.epam.introduction_to_java.algorithmization;

//Решаем Algorithmization - Одномерные массивы - задача #8
public class SolutionTask020108 {

	public static void main(String[] args) {
		// Дан массив элементов
		double[] a = { 1.0, -2.0, 3.0, 4.0, -2.0, 8.0, 80.0, 9.543, 0.2, 66 };
		int newSize = 0;
		double min = a[0];

		// определяем самый маленький элемент массива
		for (int i = 0; i < a.length; i++) {
			if (min > a[i])
				min = a[i];
		}

		// считаем количество маленькие элементы
		for (int i = 0; i < a.length; i++) {
			if (a[i] == min)
				newSize++;
		}

		// создаём новый массив
		double[] b = new double[a.length - newSize];

		// переносим элементы из старого массива в новый без самых маленьких
		for (int i = 0, j = 0; i < a.length; i++) {
			if (a[i] != min) {
				b[j] = a[i];
				j++;
			}
		}

		// выводим массив на печать в консоль
		
		System.out.println("Самый маленький элемент массива " + min);
		System.out.print("Начальный массив имеел вид ");
		for (double x : a) {
			System.out.print(x + " ");
		}

		System.out.print("\nНовый массив имеет вид     ");
		for (double x : b) {
			System.out.print(x + " ");
		}
	}

}
