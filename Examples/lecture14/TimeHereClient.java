// Client program for TimeHereBean

public class TimeHereClient {
    public static void main(String[] args) throws Exception {
        // Get a JNDI context using
        // the JNDI Naming service:
        javax.naming.Context context = new
        javax.naming.InitialContext();
        // Look up the home interface in the JNDI Naming service:
        Object ref = context.lookup("TimeHere");
        // Cast the remote object to the home interface:
        TimeHereHome home = (TimeHereHome)  javax.rmi.PortableRemoteObject.narrow(ref, TimeHereHome.class);
        // Create a remote object from the home interface:
        TimeHere pt = home.create();
        // Invoke getTimeHere()
        System.out.println("Perfect Time EJB invoked, time is: " + pt.getTimeHere());
    }
} 