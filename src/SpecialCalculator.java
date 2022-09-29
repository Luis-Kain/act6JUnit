    public class SpecialCalculator {

    public SpecialCalculator(){

    }

    public float squareArea(float num1, float num2){
        float result;
        result = num1 * num2;
        return result;
    }

    public float circleDiameter(float radius){
        float result;
        result = radius*2;
        return  result;
    }

    public boolean isPrime(int num){
        boolean result = false;

        if(num == 2 || num == 3){
            result  = true;
        }
        else if (num%2 != 0 && num%3!=0 && num%5 != 0 && num%7 !=0) {
            result = true;
        }

        return result;
    }

    public boolean isDigit(String myString) {
        boolean result = false;
        char[] myChars = myString.toCharArray();
        for (char chars : myChars) {
            if (Character.isDigit(chars))
                result = true;
        }
        return result;
    }

    public boolean isUppercase(String myString){
        boolean result = false;
        char[] myChars = myString.toCharArray();
        for (char chars : myChars) {
            if (Character.isUpperCase(chars))
                result = true;
        }
        return  result;

    }

}


