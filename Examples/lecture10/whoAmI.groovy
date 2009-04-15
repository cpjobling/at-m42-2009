// examine InetAddress object.

if (args.size() != 1) {
    println 'Usage: WhoAmI MachineName'
} else {
    def address = InetAddress.getByName(args[0])
    println address
}