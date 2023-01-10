import Constants.TestConstants;
import TestHelper.Helper;
import Validators.TestVagrantValidators;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestVagrantSampleTest {
    Helper helper = new Helper();
    TestVagrantValidators validators = new TestVagrantValidators();

    @Test(priority = 0, description = "Write a test that validate that the team has only 4 foreign players")
    public void validateCountOfForeignPlayersTest() throws IOException, ParseException {
        JSONArray array = helper.getJsonData(TestConstants.filePath);
        int count = helper.getForeignPlayersCount(array);
        validators.validateForeignPlayersCount(count, TestConstants.countOfForeignPlayers
                , TestConstants.validationMessageForForeignPlayersCount);
    }

    @Test(priority = 1, description = "Write the test that validates that there is at least one wicket keeper ")
    public void validateAtLeastOneWicketKeeperPresentTest() throws IOException, ParseException {
        JSONArray array = helper.getJsonData(TestConstants.filePath);
        int count = helper.getWicketKeepersAvailableCount(array);
        validators.validateAtLeastOneWCPresent(count, TestConstants.validationMessageForWicketkeeperPresentAtLeastOnce);
    }
}
