package by.epam.introduction_to_java.basics_of_sftware_code_development;

// Решаем Basics of software code development - Циклы - задача #6
// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class SolutionTask010306 {

	public static void main(String[] args) {
		// Возьмём произвольные символы
		char a = 'a';
		char b = 'j';
		char c = '3';
		char d = '5';
		char e = 'z';

		int aInt;
		int bInt;
		int cInt;
		int dInt;
		int eInt;

		// Приведём переменные char к типу int и тем самым получим числовое значения
		// находящееся в памяти переменной char
		aInt = a;
		bInt = b;
		cInt = c;
		dInt = d;
		eInt = e;

		System.out.println("В памяти компьютера символ " + a + " имеет вид " + aInt);
		System.out.println("В памяти компьютера символ " + b + " имеет вид " + bInt);
		System.out.println("В памяти компьютера символ " + c + " имеет вид " + cInt);
		System.out.println("В памяти компьютера символ " + d + " имеет вид " + dInt);
		System.out.println("В памяти компьютера символ " + e + " имеет вид " + eInt);

	}

}
