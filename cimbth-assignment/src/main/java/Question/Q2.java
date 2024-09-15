package Question;

import org.apache.commons.lang.StringUtils;

import java.util.Scanner;

public class Q2 {

    public void q2(){
        System.out.println("Question 2");
        int res = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input version1");
        String version1 = scanner.nextLine();

        System.out.println("Input version2");
        String version2 = scanner.nextLine();
        if (isValid(version1, version2)) {
            double version1D = Double.parseDouble(version1);
            double version2D = Double.parseDouble(version2);

            if (version1D < version2D) {
                res = -1;
            } else {
                res = 1;
            }
        }

        System.out.println("Answer : " + res);
    }

    public Boolean isValid(String version1, String version2) {
        Boolean isValid = true;
        //Validate Input
        if(version1.equals(null) || version1.equals("") || version2.equals(null) || version2.equals("")){
            isValid = false;
        }
        //Validate Length
        if (version1.length() >= 500 || version2.length() >= 50) {
            isValid = false;
        }
        //Validate digits
        if (version1.contains(".") && version2.contains(".")) {
            //Count digit
            int count1 = StringUtils.countMatches(version1, ".");
            int count2 = StringUtils.countMatches(version2, ".");

            if (count1 > 1 || count2 > 1) {
                isValid = false;
            }
        } else  {
            isValid = false;
        }

        return isValid;
    }
}
