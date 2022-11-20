public class MyFirstGame {
    public static void main(String[] args) {        	       
        MyFirstGame rnd = new MyFirstGame();  
        long random = rnd.randomDgt();          

        for (int i = 0; i <= 100; i++) { 
            if (random == i) {
                System.out.println("Вы победили!");
                return;
            } else if (random > i) {
                System.out.println("Число " + i + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Число " + i + " больше того, что загадал компьютер");
            }
        }                           
    }     

    private static long randomDgt() {
    	return System.currentTimeMillis() % 100 + 1;

    }
}