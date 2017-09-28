/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * this is the ReclamationProject.
 */
public class ReclamationProject {
    /** This program returns a matching region between two strings.
     * @param a for string
     * @param b for string
     * @return String
     */
    static String matchingRegion(final String a, final String b) {
        String matching = "";
        String str1 = a;
        String str2  = b;
        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
           }
        for (int i = 0; i < str1.length(); i++) {
            for (int j = str1.length() - i; j > 0; j--) {
                for (int k = 0; k < str2.length() - j; k++) {
                    if (str1.regionMatches(i, str2, k, j) && j > matching.length()) {
                        matching = str1.substring(i, i + j);
                        }
                }
        }
     }
        return matching; //returns matching string
}
}

