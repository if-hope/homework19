import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class MainBuilder {

    public static void main(String[] args) {
        Customer customer = new Customer.Builder()
                .name("Eva")
                .email("info234@gmail.com")
                .phoneNumber("769769769")
                .address("USA, Washington, 12Ave/27A, 456-789")
                .dateOfBirth(LocalDate.of(1998, Month.FEBRUARY, 22))
                .gender('W')
                .preferredLanguage("en")
                .purchaseHistory(Arrays.asList("first order", "second order", "third order"))
                .customerType("regular user")
                .marketingPreferences("clothes")
                .build();

    }
}
