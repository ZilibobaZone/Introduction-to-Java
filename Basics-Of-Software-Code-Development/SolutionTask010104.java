package by.epam.introductionToJava.basicsOfSoftwareCodeDevelopment;

//Решаем Basics of software code development - Линейные программы - задача #4
public class SolutionTask010104 {
	public static void main (String[] args) {
		double a = 123.456; //Создаём переменную и инициализируем данным числом
		double x; //Создаём переменную где будем хранить ответ
		
		//Для отделения целой части от дробной испольщуем принудительное приведение типов (int)a
		
		x = (a*1000)%1000+(int)a*0.001;
		
		//Ещё один вариат решения
		double y = (int)((a-(int)a)*1000) + (int)a/1000.0;
		
		// Выводим изначальное число в консоль
		// Параметр println выводит данные в консоль и переводит курсор на следующую строку после окончания вывода.
		System.out.println("Дано число " + a + " поменяем целую и дробную части. Ответ сохраним в переменную x.");
		
		// Выводим ответ в консоль
		System.out.println("x = " + x);
		
		System.out.println("y = " + y);
		
		
	}

}
