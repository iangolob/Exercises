package hr.fer.oop.sl2.z3;

public interface Hasher {
    public byte[] hash(byte[] prevHash, String[] transactions);
}