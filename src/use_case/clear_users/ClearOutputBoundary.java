package use_case.clear_users;

import java.util.List;

/**
 * An interface that represents the output boundary for the ClearUsers use case.
 * Implementers of this interface will provide the presentation logic for
 * displaying the results of the clear users operation.
 */
public interface ClearOutputBoundary {

    /**
     * Presents a list of users that were deleted.
     *
     * @param deletedUsers A list of user identifiers/names that were deleted.
     */
    void presentDeletedUsers(List<String> deletedUsers);
}