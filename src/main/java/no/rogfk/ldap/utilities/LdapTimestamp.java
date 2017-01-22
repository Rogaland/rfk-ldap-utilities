package no.rogfk.ldap.utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LdapTimestamp {
    public static final String LDAP_TIMESTAMP_FORMAT = "yyyyMMddHHmmss'Z'";

    public static String getTimestampString() {

        DateFormat dateFormat = new SimpleDateFormat(LDAP_TIMESTAMP_FORMAT);

        return dateFormat.format(new Date());
    }
}
