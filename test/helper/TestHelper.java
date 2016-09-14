package helper;

import static org.junit.Assert.assertTrue;

public final class TestHelper {
    private TestHelper() {
        // Utility classes should not have public constructors
    }

    public static void assertNotEquals(Object expected, Object actual) {
        assertTrue("expected <" + actual + "> to be different from <" + expected
                + ">", !expected.equals(actual));
    }
}
