package collections2;

import java.awt.Color;

public class BathRoom extends Room{
	private boolean hasBidet;
	private int numberOfSinks;
	private String bathtubType;
	public BathRoom(boolean hasBidet,int numberOfSinks, String bathtubType,FloorType floorType, double area, boolean heated, int numberOfWindows, Color wallColor) {
		super(floorType, area, heated, numberOfWindows, wallColor);
		this.hasBidet=hasBidet;
		this.numberOfSinks=numberOfSinks;
		this.bathtubType=bathtubType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bathtubType == null) ? 0 : bathtubType.hashCode());
		result = prime * result + (hasBidet ? 1231 : 1237);
		result = prime * result + numberOfSinks;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BathRoom other = (BathRoom) obj;
		if (bathtubType == null) {
			if (other.bathtubType != null)
				return false;
		} else if (!bathtubType.equals(other.bathtubType))
			return false;
		if (hasBidet != other.hasBidet)
			return false;
		if (numberOfSinks != other.numberOfSinks)
			return false;
		return true;
	}
	
}
