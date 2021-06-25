package hr.fer.oop.sl2.z3;

import java.util.Arrays;

public class Blockchain {
	private Block[] blocks;
	private int size=0;
	public Blockchain(int maxBlocks) {
		blocks= new Block[maxBlocks];
	}
	public int add(Block newBlock) {
		if(size==0) {
			newBlock.setPrevHash(new byte[] {0});
		}else {
			newBlock.setPrevHash(blocks[size-1].hash(blocks[size-1].getPrevHash()));
		}
		blocks[size]=newBlock;
		size++;
		return size-1;
	}
	public Block get(int index) {
		return blocks[index];
	}
	public boolean isAltered(int blockIndex,byte[] expectedHash) {
		for(int i=0;i<=blockIndex;i++) {
			if(i==0) {
				if(!Arrays.equals(blocks[i].getPrevHash(), new byte[] {0})) {
					return true;
				}
				blocks[i].setPrevHash(new byte[] {0});
			}else {
				if(!Arrays.equals(blocks[i].getPrevHash(),blocks[i-1].hash(blocks[i-1].getPrevHash()))) {
					return true;
				}
				blocks[i].setPrevHash(blocks[i-1].hash(blocks[i-1].getPrevHash()));
			}
		}
		return !Arrays.equals(blocks[blockIndex].hash(blocks[blockIndex].getPrevHash()), expectedHash);
	}
}
