//shared resource problems
public class RyanAndMonicaJob implements Runnable {
    // shared bank account
    def account = new BankAccount(balance : 100);

    public void run() {
        for (i in 1..<10 ) {
            this.makeWithdrawal(10);
            if (account.balance < 0) {
                System.out.println("Oops ... overdrawn!");
            }
        }
    }

    def makeWithdrawal(amount) {
        if (account.balance >= amount) {
            println Thread.currentThread().getName() + " is about to withdraw $amount"
            try {
                println Thread.currentThread().getName() + " is going to sleep"
                Thread.sleep(500)
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            println Thread.currentThread().getName() + " woke up."
            account.withdraw(amount);
            println Thread.currentThread().getName() + " completes the withdrawal"
        } else {
            println "Sorry, not enough for " + Thread.currentThread().getName()
        }
    }
}


def theJob = new RyanAndMonicaJob();
def one = new Thread(theJob);
def two = new Thread(theJob);
one.name = 'Ryan'
two.name = 'Monica'
one.start()
two.start()