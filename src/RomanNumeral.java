public class RomanNumeral {

    private static String[] romanNums= {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C"};
    private static int[] nums ={1, 4, 5, 9, 10,40, 50, 90, 100};

    int number;

    public RomanNumeral(int num){
        this.number = num;
    }

    public String getRomanNumeral(){

        StringBuilder builder = new StringBuilder();
        for (int i = romanNums.length -1 ; i >= 0; --i)
        {
            while (number >= nums[i])
            {
                number = number - nums[i];
                builder.append(romanNums[i]);
            }
        }
        return builder.toString();

    }
}