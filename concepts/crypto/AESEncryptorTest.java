package concepts.crypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AESEncryptorTest {

    public static SecretKey stringToSecretKey(String encodedKey) {
        byte[] decodedKey = Base64.getDecoder().decode(encodedKey);
        return new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");
    }

    public static String encrypt(String pText, SecretKey secretKey) throws Exception {

        String encryptedString;
        try {
            SecretKeySpec skeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
            encryptedString = Base64.getEncoder().encodeToString(cipher.doFinal(pText.getBytes()));
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error";
        }
        return encryptedString;
    }

    public static String decrypt(String cText, SecretKey secretKey) throws Exception {

        String decryptedString;
        try {
            SecretKeySpec skeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
            byte[] encryptText = Base64.getDecoder().decode(cText);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            decryptedString = new String(cipher.doFinal(encryptText));
        } catch (Exception e) {
            e.printStackTrace();
            return "Error";
        }
        return decryptedString;
    }

    public static void main(String[] args) throws Exception {

        String plainText = "originalString1";
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        SecretKey secretKey = keyGen.generateKey();

        String encryptedText = encrypt(plainText, secretKey);
        System.out.println(encryptedText);
        System.out.println(decrypt(encryptedText, secretKey));

        String keyString = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        encryptedText = encrypt(plainText, stringToSecretKey(keyString));
        System.out.println(encryptedText);
        System.out.println(decrypt(encryptedText, stringToSecretKey(keyString)));
    }
}
