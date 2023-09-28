package by.epam.introduction_to_java.algorithmization;

import java.util.Scanner;

/*Решаем Algorithmization - Одномерные массивы. Сортировки - задача #1
Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
*/
public class SolutionTask020301 {

	public static void main(String[] args) {
		//
		int[] arrayOne = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arrayTwo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] resultArray = new int[arrayOne.length + arrayTwo.length];

		Scanner read = new Scanner(System.in);
		System.out.println("Введите k от 1 до 10");
		int k = read.nextInt();

		for (int i = 0, h = 0; i < arrayOne.length; h++, i++) {
			resultArray[h] = arrayOne[i];
			if (h+1 == k) {
				int j = 1;
				for (; j <= arrayTwo.length; j++) {
					resultArray[h + j] = arrayTwo[j - 1];
				}
				h = h + j-1;

			}
		}
		
		for (int result : resultArray) {
			System.out.print(result + " \t");
		}

	}

}
