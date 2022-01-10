public class Score {
    public static void main(String[] args) {
        //Тип данных double является мение точным
        double r = 8.5;
        double pi = 3.14;
        double s = pi * r * r;
        System.out.println("Площадь круга равна " + s);
        //Тип данных float является более точным
        float mR = 7.5f;
        float mPi = 3.14f;
        float mS = mPi * mR * mR;
        System.out.println("Площадь круга типа float " + mS);

    }
}
