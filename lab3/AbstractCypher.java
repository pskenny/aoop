package lab3;

public abstract class AbstractCypher {

	public AbstractCypher() {
		super();
	}
	
	public abstract byte encrypt(byte b) throws CypherException;
	public abstract byte decrypt(byte b) throws CypherException;
	
	public String encrypt(String plainText) throws CypherException {
		return new String(encrypt(plainText.getBytes()));
	}

	public byte[] encrypt(byte[] plainText) throws CypherException {
		return doCypher(plainText, true);
	}

	public String decrypt(String cypherText) throws CypherException {
		return new String(decrypt(cypherText.getBytes()));
	}

	public byte[] decrypt(byte[] cypherText) throws CypherException {
		return doCypher(cypherText, false);
	}

	private byte[] doCypher(byte[] bytes, boolean encrypt) throws CypherException {
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = encrypt ? encrypt(bytes[i]) : decrypt(bytes[i]);
		}
		return bytes;
	}
}