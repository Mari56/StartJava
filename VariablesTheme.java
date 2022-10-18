public class VariablesTheme {
	public static void main(String[] args){ 

	allPrimitivesTypes ();
	priceGoodsWithDiscount ();
		wordJava ();

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

		// Intel(R) Core(TM) i7-8650U CPU @ 1.90GHz, 2112 Mhz, 4 Core(s), 8 Logical Processor(s)

		System.out.println("\n1. Создание переменных и вывод их значений на консоль."); 

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

		System.out.println("\n2. Расчет стоимости товара со скидкой.");

		System.out.println(String.format("\n Сумма скидки %f!", sumDiscount)); 
		System.out.println(String.format("\n Общую стоимость товаров со скидкой %f!", sumGoods));
}  

    public static void wordJava () {  
    	char j = 'J';  
    	char a = 'a';  
    	char v = 'V'; 
    	char v2 = 'v';

		System.out.println("\n3. Вывод на консоль слова JAVA\n");

    	System.out.println(t(2) + j + t(2) + a + t(2) + v2 + t(2) + v2 + t(2) + a);
    	System.out.println(t(2) + j + t(1) + a + t(1) + a + t(1) + v2 + t(1) + v2 + t(1) + a + t(1) + a);
    	System.out.println(j + t(2) + j + t(2) + a + a + a + a + a + t(2) + v + t(1) + v + t(2) + a + a + a + a + a);
    	System.out.println(t(1) + j + j + t(2) + a + t(3) + a + t(2) + v + t(2) + a + t(4) + a);
    }

	private static String t(int times){
		StringBuilder s = new StringBuilder();
		for (int i=1; i<= times; i++){
			s.append("\t");
		}
		return s.toString();
	}




}