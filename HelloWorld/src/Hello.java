public class Hello {
    public static void main(String[] args){
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not an alien");
        }

        int topScore = 100;
        if (topScore == 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less tha 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic){
            System.out.println("This car is domestic at our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theReminder = myValuesTotal % 40.00d;
        System.out.println("theReminder = " + theReminder);
        boolean isNoRemainder = (theReminder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }

    }
}
