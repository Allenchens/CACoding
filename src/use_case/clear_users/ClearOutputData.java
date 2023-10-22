package use_case.clear_users;

public class ClearOutputData {
    private final boolean isCleared;

    public ClearOutputData(boolean isCleared) {
        this.isCleared = isCleared;
    }

    public boolean isCleared() {
        return isCleared;
    }
}