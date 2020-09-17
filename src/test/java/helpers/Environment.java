package helpers;

import static java.lang.Boolean.parseBoolean;

public class Environment {

    public final static String
            SELENOID_URL = System.getProperty("selenoid_url", "http://selenoid:4444/wd/hub/"),
            VIDEO_URL = System.getProperty("video_url", "http://selenoid:8081/video/"),
            TINKOFF_URL = System.getProperty("tinkoffUrl", "https://tinkoff.ru/");

    public final static boolean
            IS_HEADLESS = parseBoolean(System.getProperty("isHeadless", "false")),
            IS_SELENOID = SELENOID_URL != "";

}
