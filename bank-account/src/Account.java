public class Account {
    String nameClient = "";
    int agency = 0;
    int numberAccount = 0;
    double balance = 0;

    public void setName(String name) {
        nameClient = name;
    }

    public void setAgency(int newAgency) {
        agency = newAgency;
    }

    public void setNumberAccount(int newNumberAccount) {
        numberAccount = newNumberAccount;
    }

    public void setBalance(int newBalance) {
        balance = balance + newBalance;
    }

    public void transferBalance(int transferCash) {
    balance = balance - transferCash;
    }
}
