import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class Exercises {

    public static double HarmonicSumL2R(int n) {
        double harmonic = 0;
        for (int i = 1; i <= n; i++) {
            harmonic += (double) 1 / i;
        }
        return harmonic;
    }

    public static double HarmonicSumR2L(int n) {
        double harmonic = 0;
        for (int i = n; i >= 1; i--) {
            harmonic += (double) 1 / i;
        }
        return harmonic;
    }

    public static double PI() {
        double sum = 0.0;
        int maxDenominator = 1000000;
        for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {  // 1, 3, 5, 7,...
            if (denominator % 4 == 1) {
                sum += 1.0 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1.0 / denominator;
            } else {   // remainder of 0 or 2
                System.out.println("The computer has gone crazy?!");
            }
        }
        return 4 * sum;
    }

    public static double PI2() {
        double sum = 0.0;
        int maxTerm = 1000000;
        for (int term = 1; term <= maxTerm; term++) {
            if (term % 2 == 1) {
                sum += 1.0 / (term * 2 - 1);
            } else {
                sum -= 1.0 / (term * 2 - 1);
            }
        }
        return 4 * sum;

    }


    public static void CozaLozaWoza() {
        boolean printed;
        for (int i = 1; i <= 110; i++) {
            printed = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                printed = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                printed = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                printed = true;
            }
            if (!(printed)) {
                System.out.print(i);
            }

            if (i % 11 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }


    public static void Fibonacci() {
        int F = 1;
        int prev = 0;
        int next;

        for (int i = 1; i < 20; i++) {
            next = F + prev;
            prev = F;
            F = next;
            if (i == 1) {
                System.out.print(i + " ");
            }
            System.out.print(F + " ");

        }
    }

    public static void Fibonacci2() {
        int n = 3;          // the index n for F(n), starting from n=3
        int fn;             // F(n) to be computed
        int fnMinus1 = 1;   // F(n-1), init to F(2)
        int fnMinus2 = 1;   // F(n-2), init to F(1)
        int nMax = 20;      // maximum n, inclusive
        int sum = fnMinus1 + fnMinus2;  // Need sum to compute average
        double average;
        int Sumsum = sum;

        System.out.println("The first " + nMax + " Fibonacci numbers are:");
        System.out.print(fnMinus2 + " " + fnMinus1 + " ");

        while (n <= nMax) {  // n starts from 3
            // Compute F(n), print it and add to sum
            sum = fnMinus1 + fnMinus2;
            fn = sum;
            System.out.print(fn + " ");
            Sumsum += sum;
            // Increment the index n and shift the numbers for the next iteration
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }

        // Compute and display the average (=sum/nMax).
        average = (double) Sumsum / nMax;
        System.out.println();
        System.out.println("The average is " + average);

        // Beware that int/int give int.


    }

    public static void PrintPattern(int n, String c) {

        /*
#                    # # # # # # # #      # # # # # # # #                    #
# #                  # # # # # # #          # # # # # # #                  # #
# # #                # # # # # #              # # # # # #                # # #
# # # #              # # # # #                  # # # # #              # # # #
# # # # #            # # # #                      # # # #            # # # # #
# # # # # #          # # #                          # # #          # # # # # #
# # # # # # #        # #                              # #        # # # # # # #
# # # # # # # #      #                                  #      # # # # # # # #
     (a)                   (b)                  (c)                  (d)

# # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #
#           #      #                        #        #       #      # #       # #
#           #        #                    #            #   #        #   #   #   #
#           #          #                #                #          #     #     #
#           #            #            #                #   #        #   #   #   #
#           #              #        #                #       #      # #       # #
# # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #
     (e)               (f)             (g)              (h)              (i)

         */
        System.out.println("(a)");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("(b)");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(c);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("(c)");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print(c);
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("(d)");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j > n - i) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("(e)");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(c);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("(f)");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == i) {
                    System.out.print(c);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("(g)");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == n - i + 1) {
                    System.out.print(c);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("(h)");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == n - i + 1 || j == i) {
                    System.out.print(c);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("(i)");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == n - i + 1 || j == i || j == 1 || j == n) {
                    System.out.print(c);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }

    public static void Timetable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static void ExtractDigits(int n) {

        while (n > 0) {
            int digit = n % 10;  // Extract the least-significant digit
            System.out.print(digit + " ");

            n = n / 10;  // Drop the least-significant digit and repeat the loop
        }
    }

    public static void SquareBoard(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row % 2 != 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(" #");
                }

            }
            System.out.println();
        }
    }


    public static int[] PascalTriangle(int n) {
        /*
          0.            1
          1.           1 1  //previous row
          2.          1 2 1 //next row
          3.         1 3 3 1
          4.        1 4 6 4 1
          5.      1 5 10 10 5 1
        */


        if (n == 0) {
            int[] result = {1};
            return result;
        }
        if (n == 1) {
            int[] result = {1, 1};
            return result;
        }
        int[] previous = {1, 1};
        for (int i = 2; i <= n; i++) {
            int[] next = new int[i + 1];
            next[0] = 1;
            for (int j = 1; j < i; j++) {
                next[j] = previous[j - 1] + previous[j];
            }
            next[i] = 1;
            previous = next;
        }

        return previous;
    }


    public static void Pyramimd(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            int[] result = PascalTriangle(i);
            for (int r : result) {
                System.out.printf("%5d",r);
            }

            System.out.println();
        }


    }

    public static void Dymond(int n, String c){

        for(int i=0;i<=n;i++){
            for (int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print(c);
            }

            System.out.println();
        }

        for(int i=n-1;i>=0;i--){
            for (int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print(c);
            }

            System.out.println();
        }




    }

    public static boolean ReverseString(){
        String inputString;
        int inputStringlength;
        boolean exit;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        inputString = scan.nextLine();
        inputStringlength = inputString.length();
        String reverse ="";

        for (int i=inputStringlength-1; i>=0;i--){
            reverse +=inputString.charAt(i);
        }

        System.out.println(reverse);

        if(inputString.equals(reverse)){
            exit = true;
            System.out.println("It is a palindrome");
            return exit;
        }
        else{
            System.out.println("It is not a palindrome");
            exit = false;
            return exit;
        }

    }

    public static void CheckVowelsDigit(){
        int digitcounter = 0;
        int vowelcounter = 0;
        String inputString;
        int inputStringlength;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string :");
        inputString = scan.nextLine().toLowerCase();
        inputStringlength = inputString.length();

        for(int i=0; i<inputStringlength;i++){
            switch(inputString.charAt(i)){
                case 'a' : case 'e' : case 'i' : case 'o': case 'u':
                vowelcounter++;  break;
            }
            if(inputString.charAt(i)>='0' && inputString.charAt(i)<='9'){
                digitcounter++;
            }
        }

        System.out.print("Number of vowels: "+ vowelcounter + " ");
        System.out.printf("(%.2f%%)",(double)vowelcounter/inputStringlength*100);
        System.out.println();
        System.out.print("Number of digits: "+ digitcounter + " ");
        System.out.printf("(%.2f%%)",(double) digitcounter/inputStringlength*100);

    }

    public static void PhoneKeyPad(){
        Scanner scan = new Scanner(System.in);
        String inputString;
        String outputString="";
        System.out.println("Enter a string: ");
        inputString = scan.nextLine().toLowerCase();
        scan.close();
        int inputStringLength = inputString.length();

        for(int i=0;i<inputStringLength;i++){
            switch (inputString.charAt(i)){
                case 'a' : case 'b' : case 'c' :
                    outputString+="2"; break;
                case 'd' : case 'e' : case 'f' :
                    outputString+="3"; break;
                case 'g' : case 'h' : case 'i' :
                    outputString+="4"; break;
                case 'j' : case 'k' : case 'l' :
                    outputString+="5"; break;
                case 'm' : case 'n' : case 'o' :
                    outputString+="6"; break;
                case 'p' : case 'q' : case 'r' : case 's' :
                    outputString+="7"; break;
                case 't' : case 'u' : case 'v' :
                    outputString+="8"; break;
                case 'w' : case 'x' : case 'y' : case 'z' :
                    outputString+="9"; break;
                default:
                    outputString+="0";

            }
        }

        System.out.println(outputString);
    }


    public static void Bin2Dec(){
        /*
        binStr             : 1 0 1 1 1 0 0 1
        charAt(pos)        : 0 1 2 3 4 5 6 7  (pos from the left)
        Math.pow(2, order) : 7 6 5 4 3 2 1 0  (order from the right)

        */
        String binString;
        int binStrLen;
        int dec = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        binString = scan.next();
        scan.close();
        binStrLen = binString.length();

        for(int pos=0; pos<binStrLen;pos++){
            int order = binStrLen-1-pos;
            if(binString.charAt(pos)=='1'){
                dec+=Math.pow(2,order);
            }
            else if(binString.charAt(pos)!='0'){
                System.out.println("error: invalid binary string \""+binString+"\"");
                System.exit(1);
            }
        }

        System.out.println(dec);
    }


    public static void main(String[] args) {


//        System.out.println("Harmonic 50000 L2R: "+HarmonicSumL2R(50000));
//        System.out.println("Harmonic 50000 R2L "+HarmonicSumR2L(50000));
//        double difference = HarmonicSumL2R(50000) - HarmonicSumR2L(50000);
//        System.out.println("L2R-R2L: "+difference);
//        System.out.println(PI());
//        System.out.println(PI2());
//
//        CozaLozaWoza();
//
//        Fibonacci();
//        System.out.println();
//        Fibonacci2();
//        PrintPattern(11," #");

//        Timetable(12);
//          ExtractDigits(15673);
//
//        SquareBoard(7);
            Dymond(11,"$ ");

//            Pyramimd(15);

//        ReverseString();

//        CheckVowelsDigit();

//        PhoneKeyPad();
//        Bin2Dec();

    }

}
