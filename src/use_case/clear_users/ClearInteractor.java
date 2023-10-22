package use_case.clear_users;
import interface_adapter.clear_users.ClearViewModel;

import java.util.List;



/* public class ClearInteractor implements ClearInputBoundary {
    private final ClearUserDataAccessInterface clearUserDataAccess;
    private final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccess, ClearOutputBoundary clearPresenter) {
        this.clearUserDataAccess = clearUserDataAccess;
        this.clearPresenter = clearPresenter;
    }

    @Override
    public void execute() {
        try {
            clearUserDataAccess.clearAllUsers();
            ClearOutputData clearOutputData = new ClearOutputData(true);
            clearPresenter.prepareSuccessView(clearOutputData);
        } catch (Exception e) {
            clearPresenter.prepareFailView("Failed to clear users: " + e.getMessage());
        }
    }
}

 */

public class ClearInteractor implements ClearInputBoundary {
    private final ClearUserDataAccessInterface clearUserDataAccess;
    private final ClearOutputBoundary clearPresenter;
    private final ClearViewModel clearViewModel; // Add this as a parameter

    public ClearInteractor(
            ClearUserDataAccessInterface clearUserDataAccess,
            ClearOutputBoundary clearPresenter,
            ClearViewModel clearViewModel) {
        this.clearUserDataAccess = clearUserDataAccess;
        this.clearPresenter = clearPresenter;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void execute() {
        try {
            clearUserDataAccess.clearAllUsers();
            ClearOutputData clearOutputData = new ClearOutputData(true);
            clearPresenter.prepareSuccessView(clearOutputData);

            // Get the names of deleted users and set them in ClearState
            String deletedUsers = getDeletedUsersFromDataAccess(); // Implement this method
            clearViewModel.getState().setDeletedUsers(deletedUsers);

        } catch (Exception e) {
            clearPresenter.prepareFailView("Failed to clear users: " + e.getMessage());
        }
    }

    // Implement a method to get the names of deleted users from your data access layer
    private String getDeletedUsersFromDataAccess() {
        List<String> deletedUserNames = clearUserDataAccess.getDeletedUserNames();
        return deletedUserNames.toString();
    }
}