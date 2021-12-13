package tests;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TinmanTest extends BaseTest{


    @Test(description = "The correct result during the calculation of the data")
    public void correctInputOfValidData() {
        loginSteps
                .correctLogin(user, password);
        tinmanSteps
                .enterDataTheRaceTime("2", "32", "11");
    }

    @Test(enabled = false, description = "Error result if we do not enter data")
    @Description("If the calculator is filled out incorrectly, we do not receive any information about the error - Bug")
    public void errorEnteringValues() {
        loginSteps
                .correctLogin(user, password);
        tinmanSteps
                .dataEntryError("","","","\"×\\n\" +\n" +
                        "       \"Please fix the following errors:\\n\" +\n" +
                        "       \"*Please enter an Integer value for Minutes.\"");
    }
}
