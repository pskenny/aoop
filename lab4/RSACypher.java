package lab4;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class RSACypher {
	private Cipher cypher;
	private KeyPair keyRing;

	public RSACypher() throws NoSuchAlgorithmException, NoSuchPaddingException {
		// TODO: define the three variables composition to this object
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(2048);
		keyRing = keyGen.generateKeyPair();
		cypher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
	}

	public byte[] encrypt(byte[] plainText) throws Throwable {
	}

	public byte[] decrypt(byte[] cypherText) throws Throwable {
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(this.hashCode());
	}
}
