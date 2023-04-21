package by.epam.introduction_to_java.basics_of_sftware_code_development;

import java.util.Scanner;

//Решаем Basics of software code development - Циклы - задача #8
public class SolutionTask010308 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		//Вводим числа через консоль
		System.out.print("Введите первое число >> ");
		int x = console.nextInt();
		System.out.print("Введите второе число >> ");
		int y = console.nextInt();
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int count0 = 0;		
		
		while (x > 0) {
			while (y > 0) {
				if ((x % 10) == 0 && (y % 10) == 0) { 
					count0++;
				} else if ((x%10) == 1 && (y % 10) == 1) {
					count1++;
				} else if ((x%10) == 2 && (y % 10) == 2) {
					count2++;
				} else if ((x%10) == 3 && (y % 10) == 3) {
					count3++;
				} else if ((x%10) == 4 && (y % 10) == 4) {
					count4++;
				} else if ((x%10) == 5 && (y % 10) == 5) {
					count5++;
				} else if ((x%10) == 6 && (y % 10) == 6) {
					count6++;
				} else if ((x%10) == 7 && (y % 10) == 7) {
					count7++;
				} else if ((x%10) == 8 && (y % 10) == 8) {
					count0++;
				} else if ((x%10) == 9 && (y % 10) == 9) {
					count9++;
				}

				y = y / 10;
			}
			x = x / 10;
		}
		
		System.out.println("Определяем цифры которые входят в состав двух чисел ");
		System.out.print("Ответ - ");
		
		if (count0 > 0) {
			System.out.print("0");
		} else if (count1 > 0) {
			System.out.print("1");
		} else if (count2 > 0) {
			System.out.print("2");
		} else if (count3 > 0) {
			System.out.print("3");
		} else if (count4 > 0) {
			System.out.print("4");
		} else if (count5 > 0) {
			System.out.print("5");
		} else if (count6 > 0) {
			System.out.print("6");
		} else if (count7 > 0) {
			System.out.print("7");
		} else if (count8 > 0) {
			System.out.print("8");
		} else if (count9 > 0) {
			System.out.print("9");
		} else {
			System.out.print("Нету одинаковых цифр");
		}
		
		
	}
}
