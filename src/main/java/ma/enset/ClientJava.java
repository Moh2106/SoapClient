package ma.enset;

import ma.enset.proxy.BanqueService;
import ma.enset.proxy.BanqueWS;


public class ClientJava {
    public static void main(String[] args) {

        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.conversion(76));
    }
}
