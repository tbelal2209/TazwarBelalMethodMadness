package TazwarBelal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(TBelalLib.Palindrome("racecar"));
    //Here for the first program I entered the string racecar to check whether it is a palindrome or not and it is palindrome so the program returns true.
        System.out.println(TBelalLib.cutOut("Alphamale"));
        //Here I entered Alphamale and the program removes the first two letters and the result is phamale with substr added to it.
        System.out.println(TBelalLib.sumUpTo(5));
    //Here I entered the integer value 5 and the program returns the sum of teh values starting from 0 to 5 and the result is 15
        System.out.println(TBelalLib.primePrinter(3));
    //Here I entered the integer value 3 and the program returns true since 3 is in fact a prime number in this case.
        System.out.println(TBelalLib.tensdigit("05/07/2001"));
    //For this last program I chose one of my own and basically I entered the date 05/07/2001 and the program returns 07-05-2001.
    }
}
