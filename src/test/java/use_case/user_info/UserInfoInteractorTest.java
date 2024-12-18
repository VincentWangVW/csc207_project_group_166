package use_case.user_info;

import entity.UserPreferences;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for UserInfoInteractor.
 * This class tests the methods in the UserInfoInteractor class.
 * The methods tested are addAllergy, deleteAllergy, getAllergies, changeShopAmount, and returnTomain.
 */
class UserInfoInteractorTest {
    private boolean mainReturned = false;

    /**
     * Test the addAllergy, deleteAllergy, and getAllergies methods.
     */
    @Test
    void addAllergyTest() {
        // Mock the UserInfo output boundary
        UserInfoOutputBoundary successPresenter = new UserInfoOutputBoundary() {

            @Override
            public void returnTomain() {
                // No action needed for this test
            }
        };

        // Mock the UserPreferences
        UserPreferences userPreferences = new UserPreferences(0, false, false,
                new String[0]);

        // Create the interactor
        UserInfoInteractor interactor = new UserInfoInteractor(successPresenter, userPreferences);

        // Add allergies
        interactor.addAllergy("Apple");
        interactor.addAllergy("Fish");
        interactor.addAllergy("Peanuts");
        interactor.addAllergy("Watermelon");

        // Verify the allergies
        String[] allergies = interactor.getAllergies();
        Arrays.sort(allergies); // Sort to match assertion order
        assertArrayEquals(new String[]{"Apple", "Fish", "Peanuts", "Watermelon"}, allergies);
    }

    /**
     * Test the deleteAllergy method.
     */
    @Test
    void deleteAllergyTest() {
        // Mock the UserInfo output boundary
        UserInfoOutputBoundary successPresenter = new UserInfoOutputBoundary() {

            @Override
            public void returnTomain() {
                // No action needed for this test
            }
        };

        // Mock the UserPreferences
        UserPreferences userPreferences = new UserPreferences(0, false, false,
                new String[0]);

        // Create the interactor
        UserInfoInteractor interactor = new UserInfoInteractor(successPresenter, userPreferences);

        // Add allergies
        interactor.addAllergy("Peanuts");
        interactor.addAllergy("Watermelon");

        // Delete an allergy
        interactor.deleteAllergy("Peanuts");

        // Verify the remaining allergies
        String[] allergies = interactor.getAllergies();
        assertArrayEquals(new String[]{"Watermelon"}, allergies);
    }

    /**
     * Test the getAllergies method when the allergies list is empty.
     */
    @Test
    void getAllergiesEmptyTest() {
        // Mock the UserInfo output boundary
        UserInfoOutputBoundary successPresenter = new UserInfoOutputBoundary() {

            @Override
            public void returnTomain() {
                // No action needed for this test
            }
        };

        // Mock the UserPreferences
        UserPreferences userPreferences = new UserPreferences(0, false, false,
                new String[0]);

        // Create the interactor
        UserInfoInteractor interactor = new UserInfoInteractor(successPresenter, userPreferences);

        // Verify the allergies list is empty in the initialization
        String[] allergies = interactor.getAllergies();
        assertArrayEquals(new String[0], allergies);
    }

    /**
     * Test the changeShopAmount method.
     */
    @Test
    void changeShopAmountTest() {
        // Mock the UserInfo output boundary
        UserInfoOutputBoundary successPresenter = new UserInfoOutputBoundary() {

            @Override
            public void returnTomain() {
                // No action needed for this test
            }
        };

        // Mock the UserPreferences
        UserPreferences userPreferences = new UserPreferences(0, false, false,
                new String[0]);

        // Create the interactor
        UserInfoInteractor interactor = new UserInfoInteractor(successPresenter, userPreferences);

        // Change the shop amount
        int result = interactor.changeShopAmount(15);
        assertEquals(15, result);

        result = interactor.changeShopAmount(30);
        assertEquals(30, result);
    }

    /**
     * Test the returnToMain method.
     */
    @Test
    void returnToMainTest() {
        // Mock the UserInfo output boundary
        UserInfoOutputBoundary successPresenter = new UserInfoOutputBoundary() {

            @Override
            public void returnTomain() {
                mainReturned = true;
            }
        };

        // Mock the UserPreferences
        UserPreferences userPreferences = new UserPreferences(0, false, false,
                new String[0]);

        // Create the interactor
        UserInfoInteractor interactor = new UserInfoInteractor(successPresenter, userPreferences);

        // Call return_to_main
        interactor.returnTomain();

        // Verify return_to_main was executed
        assertTrue(mainReturned);
    }
}
