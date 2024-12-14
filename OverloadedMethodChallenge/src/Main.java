public class Main{
    // conversion formula: 
    // 1 inch = 2.54cm
    // 1 foot = 12 inches
    // 1 foot = 30.48cm
    // e.g 6ft = 182.8800 cm

    public static void main(String args[]){
        System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");


    }

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        return ((feet * 12) + inches) * 2.54;
    }
}