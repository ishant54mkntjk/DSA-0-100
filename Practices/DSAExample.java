import java.security.*;

public class DSAExample {
    public static void main(String[] args) throws Exception {

        String message = "Hello digital signature";

        // generate keypair
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA");
        keyGen.initialize(2048);
        KeyPair pair = keyGen.generateKeyPair();

        PrivateKey privateKey = pair.getPrivate();
        PublicKey publicKey = pair.getPublic();

        // create signature object
        Signature sign = Signature.getInstance("SHA256withDSA");

        // initialize with private key
        sign.initSign(privateKey);

        // add data
        sign.update(message.getBytes());

        // generate signature
        byte[] signatureBytes = sign.sign();
        System.out.println("Signature generated");

        // verify
        Signature verify = Signature.getInstance("SHA256withDSA");

        // initialize with public key
        verify.initVerify(publicKey);
        verify.update(message.getBytes());

        boolean isValid = verify.verify(signatureBytes);

        System.out.println("Signature valid " + isValid);
    }
}