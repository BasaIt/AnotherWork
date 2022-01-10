public class BoolHomeWork {
    public static void main(String[] args) {
        int mTimeDay = 12;
        boolean mWeather = false;
        boolean mSleep = mTimeDay >= 23 || mTimeDay <= 5;

        if (mSleep){

            System.out.println("Спать");
        }
        if (!mSleep && mWeather){

            System.out.println("Идем гулять");
        }
        if (!mSleep && !mWeather){

            System.out.println("Читать книгу");
        }

    }
}
