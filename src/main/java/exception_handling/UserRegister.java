package exception_handling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public void registerUser(String username, String email) {
        logger.info("User registration started for username: {}", username);

        try {
            if (username == null || username.isBlank()) {
                throw new IllegalArgumentException("Username cannot be empty");
            }

            if (!email.contains("@")) {
                throw new IllegalArgumentException("Invalid email format");
            }

            // Simulate saving to database
            logger.debug("Saving user {} to database", username);
            System.out.println("User saved: " + username);

        } catch (IllegalArgumentException e) {
            logger.warn("Validation failed: {}", e.getMessage());
        } catch (Exception e) {
            logger.error("Unexpected error during user registration", e);
        }
    }

    public static void main(String[] args) {
        UserService service = new UserService();
        service.registerUser("john", "invalidEmail");
        service.registerUser(null, "john@example.com");
    }
}
