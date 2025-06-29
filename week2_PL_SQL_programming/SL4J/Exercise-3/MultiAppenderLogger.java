import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultiAppenderLogger {
    private static final Logger logger = LoggerFactory.getLogger(MultiAppenderLogger.class);

    public static void main(String[] args) {
        logger.info("This will go to both console and file");
    }
}
