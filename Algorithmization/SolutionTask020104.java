package by.epam.introduction_to_java.algorithmization;

// Решаем Algorithmization - Одномерные массивы - задача #4
// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class SolutionTask020104 {

	public static void main(String[] args) {

		// дана последовательность а
		int[] a = { 0, 91, 8, 7, 6, 92, 4, 3, 2, 1 };

		// в переменных iMax и iMin будем хранить номера элементов с Макс и Мин
		// значениями
		int temp = a[0];
		int iMax = 0;
		int iMin = 0;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > temp) {
				temp = a[i];
				iMax = i;
			}
		}

		temp = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < temp) {
				temp = a[i];
				iMax = i;
			}
		}

		System.out.println("Дана последовательность");
		for (int i : a) {
			System.out.print(i + " ");
		}

		System.out.println();

		temp = a[iMax];
		a[iMax] = a[iMin];
		a[iMin] = temp;

		System.out.println("Поменяем мин и мах элемнты местами");

		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
