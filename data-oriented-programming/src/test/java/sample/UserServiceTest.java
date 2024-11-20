package sample;

import org.junit.jupiter.api.Test;
import sample.services.UserService;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static sample.records.UserRecords.*;

class UserServiceTest {
    @Test
    void testGetPersonInfo() {
        Person user = new User(1, "John Reas", "john.reas@gmail.com");
        Person admin = new Admin(2, "Harold Finch", "harold.finch@gmail.com", "ALL");

        assertAll(
                () -> assertThat(UserService.getPersonInfo(user))
                        .isEqualTo("User: John Reas (john.reas@gmail.com)"),
                () -> assertThat(UserService.getPersonInfo(admin))
                        .isEqualTo("Admin: Harold Finch (harold.finch@gmail.com) with permissions: ALL")
        );
    }

    @Test
    void testUpdateEmail() {
        Person user = new User(1, "John Reas", "john.reas@gmail.com");
        Person admin = new Admin(2, "Harold Finch", "harold.finch@gmail.com", "ALL");

        Person updatedUser = UserService.updateEmail(user, "john.reas2@gmail.com");
        Person updatedAdmin = UserService.updateEmail(admin, "harold.finch2@gmail.com");


        assertAll(
                () -> assertThat(updatedUser)
                        .isInstanceOf(User.class)
                        .extracting(u -> ((User)u).email())
                        .isEqualTo("john.reas2@gmail.com"),
                () -> assertThat(updatedAdmin)
                        .isInstanceOf(Admin.class)
                        .extracting(a -> ((Admin) a).email())
                        .isEqualTo("harold.finch2@gmail.com")
        );
    }
}
