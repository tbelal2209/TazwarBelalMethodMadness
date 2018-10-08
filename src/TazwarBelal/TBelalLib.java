package TazwarBelal;

public class TBelalLib {
    public static boolean Palindrome(String str) {
        String racecar = "";
        for (int i = str.length() + 1; i > 1; i--) {
            racecar = racecar + str.substring(i - 2, i - 1);
        }
        if (racecar.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
//For this code you would basically enter a word and if the word spells the same way backwards and forwards the program would return true.
//However if the String entered does not spell the same word backwards and forwards the program will return false.

    public static String cutOut(String mainstr){
        String substr = "cat";
        return  mainstr.substring(2, mainstr.length()) + " " + substr ;
    }
    //For this program you would enter a word for mainstr and the program will remove the first two letters of the string and return it.

    public static int sumUpTo(int num){
        int sum = 0;
        int i = 0;
        while( i <= num){
            sum = sum + i;
            i++;
        }
        return sum;
    }
    //For this program you would enter in a number and program will return the sum of the numbers starting from 0 to the integer value entered.

    public static boolean primePrinter(int n) {
        for (int i = 2; i <= n; i++) {
            n =  n % i;
        }
        if (n != 0) {
            return true;
        }

        else {
            return false;
        }
    }
    //For this program you would enter in a value and if the value is a prime number the program will return true.
    //However if the value is not a prime number the program will just return false.
    public static String tensdigit(String str){
        String last = "";
        String first = str.substring(0,2);
        String second = str.substring(3,5);
        String third = str.substring(6,10);
        last = second + "-" + first + "-" + third;
        return last;
    }
    //For this program you will enter a date in the format of (“mm/dd/yyyy”) and the program will return an alternate.
    //The alternate date will be in the format of  (“dd – mm - yyyy”).
    //Also I chose this as another program for the rubric requirements.

}


