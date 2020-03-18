public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
            int castX = (int)(x * 1000);
            int castY = (int)(y * 1000);
            System.out.println("x = " + castX);
            System.out.println("y = " + castY);
            if(castX == castY)  return true;
            return false;
    }
}
