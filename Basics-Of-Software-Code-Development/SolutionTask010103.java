package by.epam.introductionToJava.basicsOfSoftwareCodeDevelopment; 

//Решаем Basics of software code development - Линейные программы - задача #3
public class SolutionTask010103 {
	public static void main (String[] args) { 
		double x = 90, y = 45; 
		double z;
		double xRad,yRad;
		/*
		 * Math.toRadians(double deg)	
		 * Функция позволяет перевести градусы в радианы 
		 */
		
		xRad = Math.toRadians(x);
		yRad = Math.toRadians(y);
		
		/*
		Math.tan(double a)
		Функция высчитывает тангенс угла. Переменная а должна быть в радианах
		  	
		Math.sin(double a)
		Функция высчитывает синус угла. Переменная а должна быть в радианах
			
		Math.cos(double a)
		Функция высчитывает косинус угла. Переменная а должна быть в радианах
		
		*/
		
		z = (Math.sin(xRad) + Math.cos(yRad)) / (Math.cos(xRad) - Math.sin(yRad)) * Math.tan(xRad * yRad);
		
		System.out.print("z = " + z); //выводим ответ на консоль
	}

}
