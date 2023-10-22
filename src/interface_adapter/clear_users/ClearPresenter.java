package interface_adapter.clear_users;

// TODO Complete me

import use_case.clear_users.ClearOutputBoundary;

import java.util.List;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel viewModel;

    public ClearPresenter(ClearViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void presentDeletedUsers(List<String> deletedUsers) {
        viewModel.setDeletedUsers(deletedUsers);
    }
}