public class Client {
    String name;
    int balance;

    public Client(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdrawBalance(int price) {
        balance -=  price;
    }
}
