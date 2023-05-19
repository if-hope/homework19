import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {

    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private LocalDate dateOfBirth;
    private Character gender;
    private String preferredLanguage;
    private List<String> purchaseHistory;
    private String customerType;
    private String marketingPreferences;

    public Customer() {
    }

    public static class Builder {

        private final Customer customer;
        private String name;
        private String email;
        private String phoneNumber;
        private String address;
        private LocalDate dateOfBirth;
        private Character gender;
        private String preferredLanguage;
        private List<String> purchaseHistory;
        private String customerType;
        private String marketingPreferences;


        public Builder() {
            customer = new Customer();
        }

        public Builder name(String name){
            customer.name = name;
            return this;
        }

        public Builder email(String email){
            customer.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber){
            customer.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(String address){
            customer.address = address;
            return this;
        }

        public Builder dateOfBirth(LocalDate dateOfBirth){
            customer.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder gender(Character gender){
            customer.gender = gender;
            return this;
        }

        public Builder preferredLanguage(String preferredLanguage){
            customer.preferredLanguage = preferredLanguage;
            return this;
        }

        public Builder purchaseHistory(List<String> purchaseHistory){
            customer.purchaseHistory = purchaseHistory;
            return this;
        }

        public Builder customerType(String customerType){
            customer.customerType = customerType;
            return this;
        }

        public Builder marketingPreferences(String marketingPreferences){
            customer.marketingPreferences = marketingPreferences;
            return this;
        }

        public Customer build(){
            return customer;
        }

    }


}
