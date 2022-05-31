
// Method - Withdraw
// It is called from ThreadWithdrawal class using
// the object of Bank class passed from the main method
class ThreadWithdrawal extends Thread {

    // Attributes of thid class
    Bank object;
    String name;
    int dollar;

    // Constructor of this class
    ThreadWithdrawal(Bank ob, String name, int money)
    {
        // This keyword refers to parent class
        this.object = ob;
        this.name = name;
        this.dollar = money;
    }

    // run() method for the thread
    public void run() { object.withdrawn(name, dollar); }
}