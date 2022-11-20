public class Calculator {
    public static void main(String[] args) {
        double fisrtNum = 23.0; 
        double secondNum = 3.0; 
        char sign = '^';  
        double result = 0.0; 

        if (sign == '+') { 
            result = (fisrtNum + secondNum);  
        } else if (sign == '-') {
            result = (fisrtNum - secondNum); 
        } else if (sign == '/') {
            result = (fisrtNum / secondNum);             
        } else if (sign == '*') {
            result  = (fisrtNum * secondNum);
        } else if (sign == '%') {
            result = (fisrtNum % secondNum); 
        } else if (sign == '^') {
            double result1 = 1;
        for (int i = 1; i <= secondNum; i++){
            result1 = (result1 * fisrtNum); 

        } 
        result = result1;         
        }    
        System.out.println(fisrtNum + " " + sign + " " + secondNum + " = " + result);            
    }    
}