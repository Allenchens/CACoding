package use_case.clear_users;

import java.util.List;

public class ClearInteractor implements ClearInputBoundary {
    private final ClearUserDataAccessInterface dataAccess;
    private final ClearOutputBoundary presenter;

    public ClearInteractor(ClearUserDataAccessInterface dataAccess, ClearOutputBoundary presenter) {
        this.dataAccess = dataAccess;
        this.presenter = presenter;
    }

    @Override
    public List<String> clearUsers() {
        List<String> clearedUsers = dataAccess.deleteAllUsers();
        presenter.presentDeletedUsers(clearedUsers);
        return clearedUsers;
    }
}