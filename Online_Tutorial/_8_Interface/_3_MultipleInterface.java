package _8_Interface;

interface publicTransport {
    void publicMode();
}

interface privateTransport {
    void privateMode();
}

class User implements publicTransport, privateTransport {
    public void publicMode() {
        System.out.println("Public Bus is a public mode of transport");
    }

    public void privateMode() {
        System.out.println("Cab is a private mode of transport");
    }
}

public class _3_MultipleInterface {
    public static void main(String args[]) {
        User u = new User();
        u.publicMode();
        u.privateMode();
    }
}

/*
************************** OUTPUT **************************
Public Bus is a public mode of transport
Cab is a private mode of transport
*/
