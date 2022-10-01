public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int temp = 0;
        int reverse =0;
        
        if (number <0 ){
            number *= -1;
            temp= number;
            while (temp!=0) {
                reverse = reverse * 10 + temp % 10;
                temp/=10;
            }


        }else {
            temp = number;
            while (temp != 0) {
                reverse = reverse * 10 + temp % 10;
                temp /= 10;
            }
        }

        if (reverse== number){
            return true;
        }
        return false;
    }
}
