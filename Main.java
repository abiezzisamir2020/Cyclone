public class Main {

    public static double a, c, distance;

    public static void main(String[] args) {


        double distance1 = DistanceNumb(Math.toRadians(25), Math.toRadians(15), Math.toRadians(23), Math.toRadians(20));
        double distance2 = DistanceNumb(Math.toRadians(23), Math.toRadians(20), Math.toRadians(21), Math.toRadians(24));
        double distance3 = DistanceNumb(Math.toRadians(21), Math.toRadians(24), Math.toRadians(20), Math.toRadians(27));
        double distance4 = DistanceNumb(Math.toRadians(20), Math.toRadians(27), Math.toRadians(19), Math.toRadians(35));
        double distance5 = DistanceNumb(Math.toRadians(19), Math.toRadians(35), Math.toRadians(21), Math.toRadians(46));
        double distance6 = DistanceNumb(Math.toRadians(21), Math.toRadians(46), Math.toRadians(23), Math.toRadians(56));
        double distance7 = DistanceNumb(Math.toRadians(23), Math.toRadians(56), Math.toRadians(25), Math.toRadians(65));
        double distance8 = DistanceNumb(Math.toRadians(25), Math.toRadians(65), Math.toRadians(28), Math.toRadians(70));
        double distance9 = DistanceNumb(Math.toRadians(28), Math.toRadians(70), Math.toRadians(32), Math.toRadians(73));
        double distance10 = DistanceNumb(Math.toRadians(32), Math.toRadians(73), Math.toRadians(34), Math.toRadians(74));
        double distance11 = DistanceNumb(Math.toRadians(34), Math.toRadians(74), Math.toRadians(36), Math.toRadians(74));
        double distance12 = DistanceNumb(Math.toRadians(36), Math.toRadians(74), Math.toRadians(39), Math.toRadians(74));



        double totaldistance= distance1 + distance2 + distance3 + distance4 + distance5 + distance6 + distance7 + distance8 + distance9 + distance10 + distance11 + distance12;
        System.out.println("Hurricane Gloria traveled " + totaldistance+" kilometers.");
    }
    public static double DistanceNumb(double latitude1, double longitude1, double latitude2, double longitude2) {
        a = Math.pow(Math.sin((latitude1-latitude2)/2),2)+Math.cos(latitude1)*Math.cos(latitude2)*Math.pow(Math.sin((longitude1-longitude2)/2),2);
        c = 2 * Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
        distance = 6371 * c;
        return distance;
    }
}