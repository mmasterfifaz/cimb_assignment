package Question;

import java.util.Scanner;

public class Q3 {

    public void q3(){
        System.out.println("Question 3");
        int answer = 0;

        System.out.println("Input number between 1 and 45");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (isValid(n)){
            for (int i = 0; i <= n; i++){
                if (i == n) {
                    answer = count(n);
                    System.out.println("Answer : " + answer);
                }
            }
        } else {
            System.out.println("Number out of length");
        }

    }

    public Boolean isValid(int n) {
        Boolean isValid = true;

        //Validate Input
        if (n < 1 || n > 45) {
            isValid = false;
        }

        return isValid;
    }

    public int count(int n){
        return n == 0 ? 0 : fibonacci(n+1);
    }
    public int fibonacci(long n){
        int numPri = 0;
        int numSec = 1;
        int next = 0;
        for (int i =1; i <= n;i++){
            next = numPri + numSec;
            numPri = numSec;
            numSec = next;
        }
        return numPri;
    }
}
