package labAss1;

public class Account {
	
	protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final int age;

    private Account(AccountBuilder ab) {
        this.firstName = ab.firstName;
        this.lastName = ab.lastName;
        this.email = ab.email;
        this.address = ab.address;
        this.phone = ab.phone;
        this.age = ab.age;
    }

    public static class AccountBuilder {
        String firstName;
        String lastName;
        String email;
        String address;
        String phone;
        int age;

        public AccountBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public AccountBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public AccountBuilder email(String email) {
            this.email = email;
            return this;
        }

        public AccountBuilder address(String address) {
            this.address = address;
            return this;
        }
        
        public AccountBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public AccountBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }
}
