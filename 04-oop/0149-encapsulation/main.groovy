class Account {
    private int balance

    Account(int initial) { balance = initial }

    void deposit(int amount) { balance += amount }

    int getBalance() { balance }
}

def account = new Account(100)
account.deposit(50)
println account.balance
