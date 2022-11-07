package InterviewQuestions;

import java.util.Random;

public class GenerateRandamNoandString {
    public static void main(String[] args) {

        //Approach 1:- Using random class
        Random rand = new Random();

        int rangInt = rand.nextInt(10);
        System.out.println(rangInt);

        double double_No = rand.nextDouble();
        System.out.println(double_No);

        //Approach 2:- Using Math class. here no need to create a method
        System.out.println(Math.random()); //to generate random decimal number

        //Approach 3:- Using Apache common-lang  API to get random. http://commons.apache.org
        //String randNum=RandomStringUtils.randomNumeric(5)
        //sout(randNum) -> output - 12324

        //String randString=RandomStringUtils.randomAlphabetic(5)
        //sout(randString) -> Csdew

    }
}
