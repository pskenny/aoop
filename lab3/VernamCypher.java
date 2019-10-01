package lab3;

/* This assumes both cipher key and plain text are the same length. See
 * http://cryptowiki.net/index.php?title=Vernam_cipher
*/
public class VernamCypher implements Cypherable {

	private String cypherKey;

	public VernamCypher(String cypherKey) {
		this.cypherKey = cypherKey;
	}

	@Override
	public String encrypt(String plainText) throws CypherException {
		return new String(encrypt(plainText.getBytes()));
	}

	@Override
	public byte[] encrypt(byte[] plainText) throws CypherException {
		if (cypherKey.length() != plainText.length) {
			throw new CypherException("Cipher key and cipher text must be the same length,");
		}
		
		byte[] bytes = new byte[plainText.length];
		byte[] cypherBytes = cypherKey.getBytes();

		for (int i = 0; i < plainText.length; i++) {
			// XOR operation (^) applied
			bytes[i] = (byte) (plainText[i] ^ cypherBytes[i]);
		}
		return bytes;
	}

	@Override
	public String decrypt(String cypherText) throws CypherException {
		return new String(encrypt(cypherText.getBytes()));
	}

	@Override
	public byte[] decrypt(byte[] cypherText) throws CypherException {
		return encrypt(cypherText);
	}
}
