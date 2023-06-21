public class PlayingCat {
    public static void main(String[] args){
        boolean parameter = false;
        parameter = isCatPlaying(true, 10);
        System.out.println(parameter);
        parameter = isCatPlaying(false, 36);
        System.out.println(parameter);
        parameter = isCatPlaying(false, 35);
        System.out.println(parameter);
        parameter = isCatPlaying(true, 46);
        System.out.println(parameter);
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean paramenter = false;
        if (temperature >= 25 && temperature <= 35){
            paramenter =  true;
        } else  if (!summer && temperature > 35){
            paramenter =  false;
        } else if (summer && (temperature >= 25 && temperature <= 45)){
            paramenter =  true;
        } else {
            paramenter =  false;
        }

        return paramenter;
    }
}
