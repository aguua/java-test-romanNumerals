public class RomanNumeral {
    int number;
    public RomanNumeral(int num){
        this.number = num;
    }
    public String getRomanNumeral(){
        switch (number) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return  "III";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 9:
                return "IX";


        }
        return "";
    }
}