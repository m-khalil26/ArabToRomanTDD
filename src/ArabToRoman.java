import java.util.HashMap;

public class ArabToRoman {

    private int value;
    private HashMap<Integer,String> dict;
    public ArabToRoman(int value){
        this.value= value;
        dict = new HashMap<Integer, String>();
        populateHashMap();
    }

    private void populateHashMap(){
        dict.put(1,"V");
        dict.put(4,"IV");
        dict.put(5,"V");
        dict.put(9,"IX");
        dict.put(10,"X");

    }

    public String convert(){
        StringBuilder roman = new StringBuilder();
        while(value>0){
            if(value>=10){
                roman.append("X");
                value -= 10;
                continue;
            }

            if(value >=9){
                roman.append("IX");
                value -=9;
                continue;
            }

            if(value >= 5) {
                roman.append("V");
                value -= 5;
                continue;
            }
            if(value == 4){
                roman.append("IV");
                value -=4;
                continue;
            }

            while(value>=1){
                value-=1;
                roman.append('I');
            }
        }

        return roman.toString();
    }
}
