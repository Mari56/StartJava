public class VariablesTheme {
	public static void main(String[] args){ 

	allPrimitivesTypes ();
	priceGoodsWithDiscount ();
		wordJava ();  
        showAllNumberType();
		moveValues ();  
		showCharactrViaAscii ();  
		showNumberComposition (); 
		showJavaTalisman (); 
		printSumAndMultiplicationNumbers (); 
		showTimeComposition (); 

	} 
	public static void allPrimitivesTypes () {  

		int a = 4;  // cores
		double d = 255.255; // Embedded Controller Version
		byte p = 8;  // Logical Processor(s)
		short s = 10; // OS Name: Microsoft Windows
		long ln = 739_120_465L; //System Model - Latitude
		float f = 2.1f; // Base Speed
		char c = 'A'; // BaseBoard Version A00
		boolean b = 10 == s; // Hyper-V - VM Monitor Mode Extensions  

		System.out.println("\n1. Создание переменных и вывод их значений на консоль");  
		System.out.println(String.format("\nOS Name: Microsoft Windows %d Pro", s));  
		System.out.println(String.format("\n%d Cores", a));  
		System.out.println(String.format("\nBase Speed %f GHz", f));
		System.out.println(String.format("\nEmbedded Controller Version %.02f", d));
		System.out.println(String.format("\nBaseBoard Version %c00", c)); 
		System.out.println(String.format("\nSystem Model - Latitude %o", ln));  
		System.out.println(String.format("\n%d Logical Processors", p));				
		System.out.println("\nDoes OS Name is Microsoft Windows 10 Pro? " + b); 
	}  
	public static void priceGoodsWithDiscount () {
		int pen = 100;
		int book = 200;
		double discountPercent = 11.0/100;

		int sum = pen + book;

		double sumGoods = sum * (1 - discountPercent);
	    double sumDiscount = sum * discountPercent;

		System.out.println("\n2. Расчет стоимости товара со скидкой");  
		System.out.println(String.format("\n Сумма скидки %f!", sumDiscount)); 
		System.out.println(String.format("\n Общую стоимость товаров со скидкой %f!", sumGoods));
} 
    public static void wordJava () {  
    	
		System.out.println("\n3. Вывод на консоль слова JAVA\n"); 
    	System.out.println("   J   a  v     v  a  ");
    	System.out.println("   J  a a  v   v  a a");
    	System.out.println("J  J aaaaa  V V  aaaaa");
    	System.out.println(" JJ a     a  V  a     a");
    }
	public static void showAllNumberType() {  
		int number = 2147483647;  
		byte b = 127;  
		short sh = 32767; 
		long ln = 9223372036854775807L;   

		int numberInc = ++number;
		int numberDec = --number;
		byte bInc = ++b;
		byte bDec = --b;
		short shInc = ++sh;
		short shDec = --sh;
		long lnInc = ++ln;
		long lnDec = --ln; 

		System.out.println("\n4. Отображение min и max значений числовых типов данных\n");

    	System.out.println("Original for int numder = " + number + ", after increment action int numder = " + numberInc + ", after decrement action int numder = " + numberDec);
    	System.out.println("Original for byte b = " + b + ", after increment action byte b = " + bInc + ", after decrement action byte b = " + bDec);
    	System.out.println("Original for short sh = " + sh + ", after increment action short sh = " + shInc + ", after decrement action short sh = " + shDec);
    	System.out.println("Original for long ln = " + ln + ", after increment action long ln = " + lnInc + ", after decrement action long ln = " + lnDec);
	}
	public static void moveValues () { 
		int a = 2; 
		int b = 5;  

		System.out.println("\n5. Перестановка значений переменных\n"); 
		moveValuesWithOtherVariable (a,b); 
		moveValuesWithArithmeticalAction (a,b); 
		moveValuesWithXorSwap (a,b);
	}
	private static void moveValuesWithOtherVariable (int a, int b) {  
		int a1 = a; 
		int b1 = b;
		int c = a1 + b1; 
		b1 = c - b1;
		a1 = c - b1;  
		
        System.out.println("Поменять значения переменных местами с помощью третьей переменной:\n");

    	System.out.println("Исходые значения переменных: a = " + a + "; b = " + b + ";\n"); 
    	System.out.println("Новые значения переменных: a + " + a1 + "; b = " + b1 + ";\n");
    	}
	private static void moveValuesWithArithmeticalAction (int a, int b) {
		int a1 = a; 
		int b1 = b;
		a1 = a1 + b1; 
		b1 = a1 - b1; 
		a1 = a1 - b1;  

		System.out.println("Поменять значения переменных местами с помощью арифметических операций:\n"); 
    	System.out.println("Исходые значения переменных: a = " + a + "; b = " + b + ";\n"); 
    	System.out.println("Новые значения переменных: a = " + a1 + "; b = " + b1 + ";\n"); 
	}
	private static void moveValuesWithXorSwap (int a, int b) { 
		int a1 = a; 
		int b1 = b;
		a1 = a1 ^ b1;  
		b1 = a1 ^ b1;  
		a1 = a1 ^ b1;     

		System.out.println("Поменять значения переменных местами с помощью побитовой операции ^:\n"); 
    	System.out.println("Исходые значения переменных: a = " + a + "; b = " + b + ";\n"); 
    	System.out.println("Новые значения переменных: a = " + a1 + "; b = " + b1 + ";");  
	}
	public static void showCharactrViaAscii () {
		int ch1 = 35; 
		int ch2 = 38; 
		int ch3 = 64; 
		int ch4 = 94;  
		int ch5 = 95; 
		
		System.out.println("\n6. Вывод символов и их кодов\n"); 
		System.out.println(ch1 + " -> " + (char)ch1);
		System.out.println(ch2 + " -> " + (char)ch2);
		System.out.println(ch3 + " -> " + (char)ch3);
		System.out.println(ch4 + " -> " + (char)ch4);
		System.out.println(ch5 + " -> " + (char)ch5); 
	}    
	public static void showNumberComposition () {
		int n = 123; 
		int e; 
		int d; 
		int s; 

		e = n % 10;  
		d = n /  10 % 10; 
		s = n / 100;  

		System.out.println("\n7. Отображение количества сотен, десятков и единиц числа\n"); 
		System.out.printf("Число %d содержит:\n", n);
		System.out.printf("%d сотен\n", s);
		System.out.printf("%d десятков\n", d);
		System.out.printf("%d едениц", e);
		}
	public static void showJavaTalisman () {
		char ch1 = '/'; 
		char ch2 = '\\'; 
		char ch3 = '('; 
		char ch4 = ')'; 
		char ch5 = '_'; 

		System.out.println("\n\n8. Вывод на консоль ASCII-арт Дюка\n"); 
		System.out.println("    " + ch1 + ch2);
		System.out.println("   " + ch1 + "  " + ch2);
		System.out.println("  " + ch1 + ch5 + ch3 + ch4 + " " + ch2);
		System.out.println(" " + ch1 + "      " + ch2);
		System.out.println(""+ ch1+ ch5 + ch5 + ch5 + ch5 + ch1 + ch2 + ch5 + ch5 + ch2);  
	}  
	public static void printSumAndMultiplicationNumbers () { 
		int n = 345; 
		int e; 
		int d; 
		int s; 

		e = n % 10;  
		d = n /  10 % 10; 
		s = n / 100; 

		int sum = e + d + s; 
		int multipl = e * d * s;  

		System.out.println("\n9. Произведение и сумма цифр числа\n"); 
		System.out.println("Cумма цифр числа " + n + " = " + sum);
		System.out.println("Произведение цифр числа " + n + " = " + multipl);  
	}  
	public static void showTimeComposition () {
		int seconds = 86399; 
		int s = seconds % 60; 
		int m = seconds / 60 % 60; 
		int hours = seconds / 60 / 60;

		System.out.println("\n10. Вывод времени\n"); 
		System.out.println(hours + ":" + m + ":" + s); 
	}  
}