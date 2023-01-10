package Constants;

/**
 * This interface is created to keep the constant values and validation messages
 */
public interface TestConstants {

    String role = "Wicket-keeper";
    String country = "India";
    int countOfForeignPlayers = 4;
    String filePath = "C:\\Users\\shanm\\Documents\\TestVagrant\\src\\main\\resources\\TestJsonFile.json";
    String validationMessageForForeignPlayersCount = "Foreign players count is not expected";
    String validationMessageForWicketkeeperPresentAtLeastOnce = "There is no one present as Wicket Keeper in given data";
}
