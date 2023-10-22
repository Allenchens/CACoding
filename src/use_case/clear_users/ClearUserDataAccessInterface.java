package use_case.clear_users;

import java.util.List;

/**
 * An interface that represents the data access operations for the ClearUsers use case.
 * Implementers of this interface will provide the specific methods for deleting
 * all users from the underlying data storage.
 */
public interface ClearUserDataAccessInterface {

    /**
     * Deletes all users from the underlying data storage.
     *
     * @return A list of user identifiers/names that were deleted.
     */
    List<String> deleteAllUsers();
}