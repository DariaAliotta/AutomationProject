package borschtsoup;

import org.testng.Assert;

public class MakeBorschtSoup {

    // Field:
    String nameX;

    // Method
    String nameXX(){
        return "wow";
    }

    public static void main(String[] args) {

        // Non-Primitive Data Type
        String name = "Daria";
        String city = "Brooklyn";

        // Primitive Data types    (8 data types)
        boolean isHairColorRed = false;
        char weight = 'a';
        int luckyNumber = 7;
        short n1 = 10;
        long n2 = 2132213;
        byte n3 = 12;
        float n4 = 14.25f;
        double n5 = 14.25;

        System.out.println("Her name is " + name);
        System.out.println(name + " " + city + " " + n1);

        // ASSERTION:  means compare value between excepted result and actual result
        String cityName1 = "Brooklyn"; // Excepted result
        String cityName2 = "Brooklyn"; // Actual result

        Assert.assertEquals(cityName1, cityName2);





    }


}
