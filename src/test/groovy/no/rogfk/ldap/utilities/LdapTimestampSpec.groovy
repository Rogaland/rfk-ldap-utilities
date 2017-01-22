package no.rogfk.ldap.utilities

import spock.lang.Specification


class LdapTimestampSpec extends Specification {
    def "Get LDAP timestamp (generalized time)"() {
        when:
        def timestamp = LdapTimestamp.getTimestampString()
        then:
        timestamp.size() == 15
        timestamp.endsWith("Z")
    }
}
