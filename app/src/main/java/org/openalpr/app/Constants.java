package org.openalpr.app;

/**
 * Used to store constants in the app/persist variables.
 * Created by Cameron on 3/4/2016.
 *
 * date@(17.03.2016) @editor(cameronDz)
 * Added server address to constants.
 * TODO find more efficient way to persist variables in this class, or
 * TODO combine with Variables class
 */
public class Constants {

    // TODO clean up class
    //protected static String API_KEY = "AIzaSyAquIkYRsCMneSKGKaB8DvGhxmftJuvioU"; // gotten with SENDER_ID
    //protected static String SENDER_ID = "740457443747"; // ID for alpr-scanner
    //protected static String PROJECT_ID = "938965101228"; // ID for platescanner
    //protected static String APPLICATION_ID = "org.openalpr.app"; // registered under project
    // TODO TEST AWS address, make sure hard coding it is 'safe'
    protected static String aws_address = "http://107.21.62.238"; // server address
    //protected static String REG_TOKEN;
    protected static String INST_ID;
    //protected static int MSG_ID = 11111;

    private Constants() {
        // empty
    }
}
