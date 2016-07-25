package xyz.skycat.work.dbrecordgentool.util;

import com.ninja_squad.dbsetup.destination.Destination;
import com.ninja_squad.dbsetup.destination.DriverManagerDestination;

/**
 * @author Shotaro.S
 *
 */
public class DbSetupUtil {

    public static Destination getDestination(String dbUrl, String dbUser,
            String dbPassword) {
        return new DriverManagerDestination(dbUrl, dbUser, dbPassword);
    }

}
