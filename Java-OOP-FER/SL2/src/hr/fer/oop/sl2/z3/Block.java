package hr.fer.oop.sl2.z3;

public class Block{
	private byte[] prevHash;
//	private Hasher hasher;
	private String[] transactions;
	private int size=0;
	public Block(int maxTransactions) {
		transactions = new String[maxTransactions];
	}
	public int add(String transaction) {
		transactions[size]=transaction;
		size++;
		return size-1;
	}
	public void remove(int index) {
		for(int i=index;i<size;i++) {
			transactions[i]=transactions[i+1];
		}
		size--;
	}
	public byte[] getPrevHash() {
		return prevHash;
	}
	public void setPrevHash(byte[] prevHash) {
		this.prevHash = prevHash;
	}
	public byte[] hash(byte[] prevHash) {
        return new SHAHasher().hash(prevHash, this.transactions);
	}
}
