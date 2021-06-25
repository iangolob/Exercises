package excersise11.z2;

import java.util.*;

import collections.z2.Pair;

public class Airplane {
	private String name;
	private int currentSpeed = 0;
	private List<Cargo> cargo = new LinkedList<>();
	private String from;
	private String to;

	public Airplane(String name) {
		this.name = name;
	}

	public void addCargo(Cargo cargo) {
		this.cargo.add(cargo);
	}

	private void increaseSpeed(int increment) {
		currentSpeed += increment;
	}

	private int getOverallCargoWeight() {
		int weight = 0;
		for (Cargo c : cargo)
			weight += c.weight;
		return weight;
	}

	private void flyAround(Pair<Double>... airportsCoord) {
		double distance = 0;
		Pair<Double> currentCoord = new Pair<>(airportsCoord[0].getFirst(), airportsCoord[0].getSecond());
		final class Distance {
			double distance;

			public Distance(Pair<Double> airport1, Pair<Double> airport2) {
				// haversine formula
				double dlon = Math.toRadians(airport2.getSecond()) - Math.toRadians(airport1.getSecond());
				double dlat = Math.toRadians(airport2.getFirst()) - Math.toRadians(airport1.getFirst());
				double a = Math.pow(Math.sin(dlat / 2), 2) + Math.cos(Math.toRadians(airport1.getFirst()))
						* Math.cos(Math.toRadians(airport2.getFirst())) * Math.pow(Math.sin(dlon / 2), 2);

				double c = 2 * Math.asin(Math.sqrt(a));
				double r = 6371;
				distance = c * r;
			}

			public double getDistance() {
				return distance;
			}
		}
		for (Pair<Double> coord : airportsCoord) {
			distance += (new Distance(currentCoord, coord)).getDistance();
			currentCoord = new Pair<>(coord.getFirst(), coord.getSecond());
		}
		System.out.println("We have approx " + distance + " km to our end destination");
	}

	public class Captain {
		private String name;

		public Captain(String name) {
			this.name = name;
		}

		public void sayWelcomeAndPilot(String from, String to) {
			Airplane.this.from = from;
			Airplane.this.to = to;
			for (Cargo c : cargo)
				c.checkCargo();
			increaseSpeed(100);
			System.out.println("This is your captain " + name + " speaking.");
			System.out.format("The %s plane on flight from %s to %s is loaded with %d kg.%n", Airplane.this.name,
					Airplane.this.from, Airplane.this.to, Airplane.this.getOverallCargoWeight());

			System.out.println("Enjoy your flight. Currently, our speed is " + Airplane.this.currentSpeed);
			flyAround(new Pair<>(45.216944, 14.570278), new Pair<>(45.503164654, 12.351165262));
		}
	}

	public static class Cargo {
		private String type;
		private int weight;

		public Cargo(String type, int weight) {
			this.type = type;
			this.weight = weight;
		}

		public void checkCargo() {
			System.out.format("%s, %d kg, checked.%n", type, weight);
		}

	}
}
