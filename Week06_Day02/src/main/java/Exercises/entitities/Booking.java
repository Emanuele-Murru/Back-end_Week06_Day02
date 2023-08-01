package Exercises.entitities;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Booking {
	private int id;
	private LocalDate bookingDate;
	private Workspace workspace;
	private User user;
	private LocalDate expiryBookingDate;
}
