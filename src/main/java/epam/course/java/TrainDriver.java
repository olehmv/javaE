package epam.course.java;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainDriver {
	private List<Train> trains = new ArrayList<>();

	public static void main(String[] args) {
		TrainDriver railWay = new TrainDriver();
	}

	public List<Train> findTrainsByTimeAndLocation(LocalDateTime date, String location) {
		return getTrains().stream().filter(t -> {
			boolean result = t.getCurrentDateTime().isAfter(date) && t.getCurrentLocation().equals(location);
			return result;
		}).collect(Collectors.toList());
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}

	class Ticket {
		private String locationFrom;
		private String localtionTo;
		private LocalDateTime departureDate;
		private LocalDateTime arrivalDate;
		private TrainDriver.Train train;

		public String getLocationFrom() {
			return locationFrom;
		}

		public void setLocationFrom(String locationFrom) {
			this.locationFrom = locationFrom;
		}

		public String getLocaltionTo() {
			return localtionTo;
		}

		public void setLocaltionTo(String localtionTo) {
			this.localtionTo = localtionTo;
		}

		public LocalDateTime getDepartureDate() {
			return departureDate;
		}

		public void setDepartureDate(LocalDateTime departureDate) {
			this.departureDate = departureDate;
		}

		public LocalDateTime getArrivalDate() {
			return arrivalDate;
		}

		public void setArrivalDate(LocalDateTime arrivalDate) {
			this.arrivalDate = arrivalDate;
		}

		public TrainDriver.Train getTrain() {
			return train;
		}

		public void setTrain(TrainDriver.Train train) {
			this.train = train;
		}

	}

	class Train {
		private String currentLocation;
		private int freeSpace;
		private List<Ticket> tickets;
		private final int ZEROSPACE = 0;

		public Train(int freeSpace, List<Ticket> tickets) {
			this.freeSpace = freeSpace;
			this.tickets = tickets;
		}

		public void populateTrainTickets(List<TrainDriver.Ticket> tickets) {
			setTickets(tickets);
		}

		public List<Ticket> showTickets(String locationFrom, String locationTo) {
			if (!isFreeSpace()) {
				throw new IllegalArgumentException("No avelible tickets from " + locationFrom + " to " + locationTo);
			}
			return tickets.stream().filter(t -> {
				boolean result = t.getLocationFrom().equals(locationFrom) && t.getLocaltionTo().equals(locationTo);
				return result;
			}).collect(Collectors.toList());
		}

		public boolean isFreeSpace() {
			return getFreeSpace() > ZEROSPACE;
		}

		public int getFreeSpace() {
			return freeSpace;
		}

		public void setFreeSpace(int freeSpace) {
			this.freeSpace = freeSpace;
		}

		public List<Ticket> getTickets() {
			return tickets;
		}

		public void setTickets(List<Ticket> tickets) {
			this.tickets = tickets;
		}

		public String getCurrentLocation() {
			return currentLocation;
		}

		public void setCurrentLocation(String currentLocation) {
			this.currentLocation = currentLocation;
		}

		public LocalDateTime getCurrentDateTime() {
			return LocalDateTime.now();
		}

	}

}
