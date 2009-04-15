import console.Console

class UnresponsiveUI {
    private volatile Double d = 1;

    UnresponsiveUI() throws Exception {
        while (d > 0) {
            d = d + (Math.PI + Math.E) / d
        }
        def input = Console.readLine() // Never gets here
    }
}

class ResponsiveUI extends Thread {

    private static volatile Double d = 1;

    public ResponsiveUI() {
        setDaemon(true);
        start();
    }

    public void run() {
        while (true) {
            d = d + (Math.PI + Math.E) / d;
        }
    }
}
        
//! new UnresponsiveUI(); // Must kill this process
new ResponsiveUI();
Thread.sleep(300);
def input = Console.readLine() // 'monitor' provides input
println ResponsiveUI.d // Shows progress