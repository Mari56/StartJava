public class IfElseStatementTheme {
	public static void main(String[] args) {
		transformOfPseudocodeIntoJava();
		IfElseStatementTheme a = new IfElseStatementTheme();
		a.printMaxAndMinForNumbers(); // вызов метода через конструктор (у экземпляра класса)
		a.worksWithNumbers();
		a.findSameDigitsIntoNumbers();
		a.findWhatLieIntoChar();
		a.getSumAndInterestOfTheDeposit();
		a.getAnAverage();
		a.countProfit();
		a.getCountOfBanknotes();
	}

	public static void transformOfPseudocodeIntoJava() {
		int age = 28;
		char gender = 'M';
		double height = 1.6;

		if (age > 20) {
			System.out.println("сообщение");
		} else {
			System.out.println("сообщение");
		}
		if (gender != 'M') {
			System.out.println("сообщение");
		} else {
			System.out.println("сообщение");
		}
		if (height < 1.80) {
			System.out.println("сообщение");
		} else {
			System.out.println("сообщение");
		}

		char firstLetterName = "Имя".charAt(0);
		if (firstLetterName == 'M') {
			System.out.println("сообщение");
		} else if (firstLetterName == 'I') {
			System.out.println("сообщение");
		} else {
			System.out.println("сообщение");
		}
	}

	public void printMaxAndMinForNumbers() {
		int a = 9;
		int b = 6;

		System.out.println("\n2. Поиск max и min числа\n");

		if (a > b) {
			System.out.println("Max is " + a + " And Min is " + b);
		} else if (b > a) {
			System.out.println("Max is " + b + " And Min is " + a);
		} else {
			System.out.println("These numbers are equal: " + a + " == " + b);
		}
	}

	public void worksWithNumbers() {
		int d = 23;
		boolean even = d % 2 == 0;

		System.out.println("\n3. Работа с числом\n");

		if (d == 0) {
			System.out.println("Число является " + d);
			return;
		}
		if (d < 0) {
			if (even) {
				System.out.printf("Число %d является четным и отрицательным", d);
			} else {
				System.out.printf("Число %d является нечетным и отрицательным", d);
			}
		} else {
			if (even) {
				System.out.printf("Число %d является четным и положительным", d);
			} else {
				System.out.printf("Число %d является нечетным и положительным\n", d);
			}
		}
	}  
	public void findSameDigitsIntoNumbers() {
		int firstNum = 513;
		int secondNum = 312;
		String str = "First number is " + firstNum + " and second number is " + secondNum;

		int unForFirstNum = getUnits(firstNum);
		int unForSecondNum = getUnits(secondNum);
		int dForFirstNum = getDecade(firstNum);
		int dForSecondNum = getDecade(secondNum);
		int hForFirstNum = getHundreds(firstNum);
		int hForSecondNum = getHundreds(secondNum);

		System.out.println("\n4. Поиск одинаковых цифр в числах\n");
		if (unForFirstNum == unForSecondNum) {
			str += ". Some units: " + unForFirstNum + " and " + unForSecondNum;
		}
		if (dForFirstNum == dForSecondNum) {
			str += ". Some decade: " + (dForFirstNum * 10) + " and " + (dForSecondNum * 10);
		}
		if (hForFirstNum == hForSecondNum) {
			str += ". Some hundreds: " + (hForFirstNum * 100) + " and " + (hForSecondNum * 100);
		}
		System.out.println(str);
	}

	private int getUnits(int n) {
		int un = n % 10;
		return un;
	}

	private int getDecade(int n) {
		int d = n / 10 % 10;
		return d;
	}

	private int getHundreds(int n) {
		int h = n / 100;
		return h;
	} 
	public void findWhatLieIntoChar() {
		char ch = '\u0057';

		System.out.println("\n5. Определение буквы, числа или символа по их коду\n");

		if (0 >= ch && ch <= 9) {
			System.out.println("Символ " + ch + " является числом");
		} else if ('A' >= ch && ch <= 'Z') {
			System.out.println("Символ " + ch + " является большой/заглавной буквой");
		} else if ('a' >= ch && ch <= 'z') {
			System.out.println("Символ " + ch + " является маленькой/строчной буквой");
		} else {
			System.out.println(ch + " - является символом");
		}
	} 
	public void getSumAndInterestOfTheDeposit() {
		int deposit = 300000;
		double interest = 0.0;
		double presentOfDeposit;
		double sumWithInterestOfDeposit;
		System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");
		if (deposit < 100000) {
			interest = 5.0 / 100;
			presentOfDeposit = deposit * interest;
			sumWithInterestOfDeposit = deposit + presentOfDeposit;
			System.out.println("Сумма вклада " + deposit + ". Начисленые " + presentOfDeposit + " %. Итоговая сумма с процентами " + sumWithInterestOfDeposit);
		} else if (100000 <= deposit && deposit <= 300000) {
			interest = 7.0 / 100;
			presentOfDeposit = deposit * interest;
			sumWithInterestOfDeposit = deposit + presentOfDeposit;
			System.out.println("Сумма вклада " + deposit + ". Начисленые " + presentOfDeposit + " %. Итоговая сумма с процентами " + sumWithInterestOfDeposit);
		} else if (deposit > 300000) {
			interest = 10.0 / 100;
			presentOfDeposit = deposit * interest;
			sumWithInterestOfDeposit = deposit + presentOfDeposit;
			System.out.println("Сумма вклада " + deposit + ". Начисленые " + presentOfDeposit + " %. Итоговая сумма с процентами " + sumWithInterestOfDeposit);
		}
	}  
	public void getAnAverage() {
		int percentOfHistory = 59;
		int percentOfProgramming = 91;

		int gradeOfHistory = getGrade(percentOfHistory);
		int gradeOfProgramming = getGrade(percentOfProgramming);

		double averageOfPercent = average(new int[]{percentOfHistory, percentOfProgramming});
		double averageOfGrade = average(new int[]{gradeOfHistory, gradeOfProgramming});

		System.out.println("\n7. Определение оценки по предметам\n");
		System.out.println(gradeOfHistory + " - оценка по истории");
		System.out.println(gradeOfProgramming + " - оценка по программированию");
		System.out.println(averageOfGrade + " - средний балл оценок по предметам");
		System.out.println("Cредний " + averageOfPercent + "% по предметам");
	}  
	private int getGrade(int n) {
		if (n > 91) {
			return 5;
		} else if (n > 73) {
			return 4;
		} else if (n > 60) {
			return 3;
		} else {
			return 2;
		}
	} 
	private double average(int[] args) {
		int length = args.length;
		double anAverage;
		int allDigidsOfArrey = 0;

		for (int i = 0; i < length; i++) {
			allDigidsOfArrey += args[i];
		}
		anAverage = allDigidsOfArrey / length;
		return anAverage;
	} 
	public void countProfit() {
		int rent = 5000;
		int averageProfitForMonth = 13000;
		int netCost = 9000;
		int profitForYear = 0;
		int expenseForYear = 0;
		int netProfit = 0;

		for (int i = 0; i <= 12; i++) {
			expenseForYear += rent + netCost;
		}
		for (int i = 0; i <= 12; i++) {
			profitForYear += averageProfitForMonth;
		}
		netProfit = profitForYear - expenseForYear;

		System.out.println("\n8. Расчет прибыли\n");
		if (netProfit >= 0) {
			System.out.println("прибыль за год:" + " + " + netProfit);
		} else {
			System.out.println("прибыль за год: " + netProfit);
		}
	}  
	public void getCountOfBanknotes() {
		int sumMoney = 567;
		int banknotesOf100 = 10;
		int countbank100 = 0;
		int banknotesOf10 = 5;
		int countbank10 = 0;
		int banknotesOf1 = 50;
		int countbank1 = 0;
		int finishSumMoney = 0;
		int countNecessoryBanknotes = 0;
		String str = "";  		

		int countUnits = getUnits(sumMoney);
		int countDec = getDecade(sumMoney);
		int countHund = getHundreds(sumMoney);

		System.out.println("\n9. Подсчет количества банкнот\n"); 

		if (sumMoney == finishSumMoney) {
			System.out.println(str);
			System.out.println("Итоговая сумма = " + finishSumMoney);
			return;
		} else {  
			if (banknotesOf100 < countHund) {
			countNecessoryBanknotes = (banknotesOf100 - countHund) * (-1);
			countbank100 = banknotesOf100;
			finishSumMoney += (banknotesOf100 * 100);
			countDec += countNecessoryBanknotes * 10;
			if (banknotesOf100 <= 0) {
				banknotesOf100 = 0;
			}  
			str += "100 USD - " + countbank100;
			countNecessoryBanknotes = 0;
		} else {
			finishSumMoney += countHund * 100;
			countbank100 = countHund;
			banknotesOf100 = banknotesOf100 - countHund;  
			str += "100 USD - " + countbank100; 			
		} 
		} 
		if (sumMoney == finishSumMoney) {
			System.out.println(str);
			System.out.println("Итоговая сумма = " + finishSumMoney);
			return;
		} else {
			if (banknotesOf10 < countDec) {
				countNecessoryBanknotes = (banknotesOf10 - countDec) * (-1);
				countbank10 += banknotesOf10;
				finishSumMoney += (banknotesOf10 * 10);
				countUnits += countNecessoryBanknotes * 10;
				if (banknotesOf10 <= 0) {
					banknotesOf10 = 0;
				}  
				countNecessoryBanknotes = 0;    
				str += "; 10 USD - " + countbank10; 				
			} else {
				finishSumMoney += countDec * 10;
				countbank10 += countDec; 
				banknotesOf10 += countbank10 - countDec; 
				str += "; 10 USD - " + countbank10;
			}
			if (sumMoney == finishSumMoney) {
				System.out.println(str);
				System.out.println("Итоговая сумма = " + finishSumMoney); 
				return;
			} else {
				if (banknotesOf1 < countUnits) {
					countNecessoryBanknotes = (banknotesOf1 - countUnits) * (-1);
					System.out.println("Game over! Недостаточно мелких купюр/едениц, пожалуйста измените сумма");
					
					return;
				} else {
					finishSumMoney += countUnits;
					countbank1 += countUnits;
					banknotesOf1 = banknotesOf1 - countUnits;  
					str += "; 1 USD - " + countbank1;  					
				}
				if (sumMoney == finishSumMoney) {
					System.out.println(str);
					System.out.println("Итоговая сумма = " + finishSumMoney);
					return;
				}
			}
		}
	}
}


