public class TeenNumberChecker {
    public static boolean hasTeen(int x, int y, int z){
        if (isTeen(x) || isTeen(y) || isTeen(z)) return true;
        return false;
    }

    public static boolean isTeen(int x){
        if (x < 13 || x > 19) return false;
        return true;
    }
}

