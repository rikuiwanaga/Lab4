/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

public class ReclamationProject {
    static String doit(String alpha,String beta) {
        if (alpha.length() > beta.length()) {
            String gamma = alpha; // TODO: set c to a
            alpha = beta;
            beta = gamma;
        }
        String r = (alpha.equals(beta)) ? "" : "";
        /*
         * For loop with i
         */
        for (int i = 0; i < alpha.length(); i++) {
            for (int j = alpha.length() - i; j > 0; j--) {
                for (int k = 0; k < beta.length()- j; k++) {
                    r = (alpha.regionMatches(i, beta, k, j) && j >r.length()) ? alpha.substring(i,i + j) : r; // Do it!
                    }

                }

        }

        return r;
    }

}
