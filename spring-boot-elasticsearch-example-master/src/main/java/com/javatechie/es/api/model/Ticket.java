package com.javatechie.es.api.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName="railway",type="passanger")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

    @Id
	private String ticket_id;

	private String booking_date;
	

	private String dest_station;

	private String email;

	private String passenger_name;

	private String source_station;
	
	
	


	public Ticket() {
		
	}







	public String getTicket_id() {
		return ticket_id;
	}







	public void setTicket_id(String ticket_id) {
		this.ticket_id = ticket_id;
	}







	public String getBooking_date() {
		return booking_date;
	}







	public void setBooking_date(String booking_date) {
		this.booking_date = booking_date;
	}







	public String getDest_station() {
		return dest_station;
	}







	public void setDest_station(String dest_station) {
		this.dest_station = dest_station;
	}







	public String getEmail() {
		return email;
	}







	public void setEmail(String email) {
		this.email = email;
	}







	public String getPassenger_name() {
		return passenger_name;
	}







	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}







	public String getSource_station() {
		return source_station;
	}







	public void setSource_station(String source_station) {
		this.source_station = source_station;
	}







	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticket_id + ", passengerName=" + passenger_name + ", bookingDate=" + booking_date
				+ ", sourceStation=" + source_station + ", destStation=" + dest_station + ", email=" + email + "]";
	}
}