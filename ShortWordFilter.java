public class ShortWordFilter implements Filter {

    public boolean accept(Object x){
        String s = (String) x;
        if(s.length() < 5){
            return true;
        }
        else {
            return false;
        }
    }
}
