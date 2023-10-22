package app; // Or whichever package you're using for factory classes.

import interface_adapter.clear_users.ClearController;
import interface_adapter.clear_users.ClearPresenter;
import interface_adapter.clear_users.ClearViewModel;
import use_case.clear_users.ClearInteractor;
import use_case.clear_users.ClearUserDataAccessInterface;

public class ClearUseCaseFactory {


    private ClearUseCaseFactory() {}

    public static ClearController create(ClearViewModel clearViewModel, ClearUserDataAccessInterface userDataAccessObject) {
        ClearPresenter clearPresenter = new ClearPresenter(clearViewModel);
        ClearInteractor clearInteractor = new ClearInteractor(userDataAccessObject, clearPresenter, clearViewModel);
        return new ClearController(clearInteractor);
    }
}