/**
 * Created by Emilia on 2025-05-09!
 * Description:
 * ^ • ω • ^
 */

public class Multiples {

    public static void main(String[] args) {
        multiples();

    }

    private static int multiples() {
        int count = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }

        }
        return count;
    }

}
