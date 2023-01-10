package Validators;

import org.testng.asserts.SoftAssert;

/**
 * Class used to keep all the validation method that required TestvagrantSampleTest
 */
public class TestVagrantValidators {
    SoftAssert softAssert;

    /**
     * This method is used to validate two integers value
     *
     * @param actual
     * @param expected
     * @param validationMessage
     */
    public void validateForeignPlayersCount(int actual, int expected, String validationMessage) {
        softAssert = new SoftAssert();
        softAssert.assertEquals(actual, expected, validationMessage);
        softAssert.assertAll();
    }

    /**
     * This method is used to validate the given value is true or not
     *
     * @param actual
     * @param validationMessage
     */
    public void validateAtLeastOneWCPresent(int actual, String validationMessage) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(actual >= 1, validationMessage);
        softAssert.assertAll();
    }
}
