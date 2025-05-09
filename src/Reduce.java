/**
 * Created by Emilia on 2025-05-09!
 * Description:
 * ^ • ω • ^
 */

import java.util.*;
import java.io.*;

public class Reduce {

    public static void main(String[] args) {
        reduce();


    }

    private static int reduce() {
        int n = 0;
        int c = 100;
        while (c != 0) {
            n++;
            if (c % 2 == 0) {
                c /= 2;
            }
            else {
                c --;

            }
        }
        return n;
    }

}
