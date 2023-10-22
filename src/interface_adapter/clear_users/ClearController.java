package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

public class ClearController {
    private final ClearInputBoundary interactor;
    private final ClearPresenter presenter;

    public ClearController(ClearInputBoundary interactor, ClearPresenter presenter) {
        this.interactor = interactor;
        this.presenter = presenter;
    }

    public void clearAllUsers() {
        interactor.clearUsers();
        // Optionally, use the presenter for feedback if needed.
    }
}