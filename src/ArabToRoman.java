
public class ArabToRoman {

    private int value;
    public ArabToRoman(int value){
        this.value= value;
    }

    public String convert(){
        StringBuilder roman = new StringBuilder();
        while(value >= 10 ){
            System.out.println((value));
            roman.append("X");
            value -= 10;
        }
        if(value >= 5){
            roman.append("V");
            value -= 5;
        }

        for(int i = 0; i<value ; i++){
            roman.append('I');
        }
        return roman.toString();
    }
}
