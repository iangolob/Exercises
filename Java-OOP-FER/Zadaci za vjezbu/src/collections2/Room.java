package collections2;

import java.awt.Color;
import java.util.Objects;

public class Room {
	private FloorType floorType;
	private double area;
	private boolean heated;
	private int numberOfWindows;
	private Color wallColor;
	
	public FloorType getFloorType() {
		return floorType;
	}
	public double getArea() {
		return area;
	}
	public boolean isHeated() {
		return heated;
	}
	public int getNumberOfWindows() {
		return numberOfWindows;
	}
	public Color getWallColor() {
		return wallColor;
	}
	public Room(FloorType floorType,double area, boolean heated, int numberOfWindows, Color wallColor) {
		this.floorType=floorType;
		this.area = area;
		this.heated = heated;
		this.numberOfWindows = numberOfWindows;
		this.wallColor = wallColor;
	}
	@Override
	public int hashCode() {
		return Objects.hash(floorType,area,heated,numberOfWindows,wallColor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (floorType != other.floorType)
			return false;
		if (heated != other.heated)
			return false;
		if (numberOfWindows != other.numberOfWindows)
			return false;
		if (wallColor == null) {
			if (other.wallColor != null)
				return false;
		} else if (!wallColor.equals(other.wallColor))
			return false;
		return true;
	}
	
	
	
}
