public class Simple {
    static public boolean isSimple(int number) {

        for(int i = 2; i < Math.sqrt(number); i++) {
            if(number % i == 0)
                 return false;
        }
        return true;
    }
}
