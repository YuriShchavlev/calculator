package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
class Calculator {

    String calculate(String[] expression) {

        System.out.println(expression[0]);
        System.out.println(expression[1]);
        System.out.println(expression[2]);

        double a = Double.parseDouble(expression[0]);
        double b = Double.parseDouble(expression[2]);

        double result = 0;
        double result2 = 0;

        switch (expression[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                return "ERROR";
        }

        //   return String.valueOf(result);
        if (expression.length < 3) {


            return String.valueOf(result);}
            else {
            double c = Double.parseDouble(expression[4]);
            switch (expression[3]) {
                case "+":
                    result2 = result + c;
                    break;
                case "-":
                    result2 = result - c;
                    break;
                case "*":
                    result2 = result * c;
                    break;
                case "/":
                    result2 = result / c;
                    break;
                default:
                    return "ERROR";
            }

            return String.valueOf(result2);
        }
    }

}

/*
//universal amount of data:
//position
int number;
double[] data;

//number loop without error+sigh-loop
for (number=0;number<=4;number=number+2){
  data[number] = Double.parseDouble(expression[number]);




result= number&expression' operation;}


int i;
for (i=1;i<2;i++){
 sign-expression's check};

int number;
for (number=0;number+2;number++){
result= number&expression' operation;}


 */


