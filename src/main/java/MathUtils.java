import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger log = LoggerFactory.getLogger(MathUtils.class);

    public static int max(int a, int b) {
        log.info("Thuc hien tim max cua {} va {}", a, b);
        if (a >= b) return a;
        return b;
    }

    public static int divide(int a, int b) {
        log.info("Thuc hien phep chia {} cho {}", a, b);
        if (b == 0) {
            log.error("So bi chia khong the la 0");
            throw new IllegalArgumentException("Divider must not be zero");
        }
        return a / b;
    }

    public static int subtract(int a, int b) {
        log.info("Thuc hien phep tru {} cho {}", a, b);
        return a - b;
    }

    public static int multiply(int a, int b) {
        log.info("Thuc hien phep nhan {} voi {}", a, b);
        return a * b;
    }

    public static boolean isPositive(int number) {
        log.info("Kiem tra so duong: {}", number);
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }
}