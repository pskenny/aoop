package lab3;

public class CaesarCypher extends AbstractCypher implements CypherKey, Cypherable {

	private CypherKey key;

	public CaesarCypher(int key) throws CypherException {
		super();
		setKey(key + "");
	}

	public void setKey(String key) throws CypherException {
		this.key = new CypherKeyImpl(key);
	}

	public String getKey() {
		return key.getKey();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	public class CypherKeyImpl implements CypherKey {
		private int keyText;

		public CypherKeyImpl(String keyText) {
			super();
			this.keyText = Integer.parseInt(keyText);
		}

		@Override
		public void setKey(String key) throws CypherException {
			keyText = Integer.parseInt(key);
		}

		@Override
		public String getKey() {
			return Integer.toString(keyText);
		}

	}

	@Override
	public byte encrypt(byte b) throws CypherException {
		return (byte) (b + Integer.parseInt(getKey()));
	}

	@Override
	public byte decrypt(byte b) throws CypherException {
		return (byte) (b - Integer.parseInt(getKey()));
	}
}
