public class Main {
    public static void main(String[] args) {

        //pattern21(4);
        //pattern2(4);
       //pattern1(4);
       //pattern3(5);
       //pattern9(5);
        int a = '9';
        System.out.printf("%d", a);

    }
    static void pattern9(int n){
        for (int row = 0; row < n; row++) {
            int i=0;
            for (int col = 0; col < n; col++) {
                //int temp = i;
                //i = i+1 ;
                //i+1  = temp;
                System.out.print((char)('A'+ i)  );
                i++;


            }
            System.out.println();
        }
    }








    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if(row==1 || row ==n){
                    System.out.print("*");
                }
                else{
                    if (col!=1 && col !=n){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }

            }
            System.out.println();
        }
    }

    static void pattern21(int n){
        n = 2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = n/2 - (Math.min(Math.min(row,col),Math.min(n-row,n-col)));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 0; row < 2*n ; row++) {
            int numberOfCol = 0;
            if(row<n){numberOfCol = n - row ;}
            else{numberOfCol = row - n + 1;}
            int spaces = n - numberOfCol ;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < numberOfCol; col++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for (int row = 0; row < 2*n ; row++) {
            int numberOfCol = 0;
            if(row<=n){
                numberOfCol = row;
            }else{
                numberOfCol = n - (row - n + 1) + 1;
            }
            for (int col = 0; col < numberOfCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



}







/*
1.  *****
        *****
        *****
        *****
        *****


        2.  *
        **
        ***
        ****
        *****


        3.  *****
        ****
        ***
        **
        *


        4.  1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5


        5.  *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *


        6.       *
        **
        ***
        ****
        *****


        7.   *****
        ****
        ***
        **
        *


        8.      *
        ***
        *****
        *******
        *********


        9.  *********
        *******
        *****
        ***
        *


        10.      *
        * *
        * * *
        * * * *
        * * * * *


        11.  * * * * *
        * * * *
        * * *
        * *
        *


        12.  * * * * *
        * * * *
        * * *
        * *
        *
        *
        * *
        * * *
        * * * *
        * * * * *


        13.      *
        * *
        *   *
        *     *
        *********


        14.  *********
        *     *
        *   *
        * *
        *


        15.      *
        * *
        *   *
        *     *
        *       *
        *     *
        *   *
        * *
        *


        16.           1
        1   1
        1   2   1
        1   3   3   1
        1   4   6   4   1


        17.      1
        212
        32123
        4321234
        32123
        212
        1


        18.   **********
        ****  ****
        ***    ***
        **      **
        *        *
        *        *
        **      **
        ***    ***
        ****  ****
        **********


        19.
        *        *
        **      **
        ***    ***
        ****  ****
        **********
        ****  ****
        ***    ***
        **      **
        *        *


        20.    ****
        *  *
        *  *
        *  *
        ****

        21.    1
        2  3
        4  5  6
        7  8  9  10
        11 12 13 14 15

        22.
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1

        23.
           *      *
         *   *  *   *
        *      *      *

        24.
        *        *
        **      **
        * *    * *
        *  *  *  *
        *   **   *
        *   **   *
        *  *  *  *
        * *    * *
        **      **
        *        *

        25.
        *****
        *   *
        *   *
        *   *
        *****

        26.
        1 1 1 1 1 1
        2 2 2 2 2
        3 3 3 3
        4 4 4
        5 5
        6

        27.
        1 2 3 4  17 18 19 20
        5 6 7  14 15 16
        8 9  12 13
        10 11

        28.
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *

        29.
        *        *
        **      **
        ***    ***
        ****  ****
        **********
        ****  ****
        ***    ***
        **      **
        *        *

 30.           1
             2 1 2
           3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5


 31.    4 4 4 4 4 4 4
        4 3 3 3 3 3 4
        4 3 2 2 2 3 4
        4 3 2 1 2 3 4
        4 3 2 2 2 3 4
        4 3 3 3 3 3 4
        4 4 4 4 4 4 4

 32.    E
        D E
        C D E
        B C D E
        A B C D E

 33.    a
        B c
        D e F
        g H i J
        k L m N o

 34.    E D C B A
        D C B A
        C B A
        B A
        A

        35.    1      1
        12    21
        123  321
        12344321
*/
