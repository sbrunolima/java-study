public class SpeedConverter {
    public static void main(String[] args){
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(95.75);
        printConversion(100.4);

    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h" );
        }
    }

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour >= 0 && kilometersPerHour < 95.75){
            double milesParams = 0.621371;
            double miles = kilometersPerHour * milesParams;
            return Math.round(miles);
        }
        if (kilometersPerHour >=  95.75){
            double milesParams = 0.621371;
            double miles = (kilometersPerHour * milesParams) + 0.1d;
            return Math.round(miles);
        }

        return -1;
    }
}
