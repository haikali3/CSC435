class ThreadDeposit extends Thread {

    Bank object;
    String name;
    int dollar;
    ThreadDeposit(Bank ob, String name, int money)
    {
        // This keyword refers t ocurrent instance itself
        this.object = ob;
        this.name = name;
        this.dollar = money;
    }

    public void run() { object.deposit(name, dollar); }
}