package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
class Calculator {

    String calculate(String[] expression) {


        double result = 0;
        double result2 = 0;
        double number = 0; //0, 2, 4, if any

            double a = Double.parseDouble(expression[0]);
            double b = Double.parseDouble(expression[2]);
            double c = Double.parseDouble(expression[4]);

            switch (expression[1]) {
                case "+":
                    if (expression[3]=="*"){
                        result=b*c+a;
                    }
                    else if (expression[3]=="/"){
                        result = (b/c)+a;
                    }
                    else if(expression[3]=="-"){
                        result=a+b-c;
                    }
                    else{
                        result=a+b+c;
                    }
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
            }

        return String.valueOf(result);

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



