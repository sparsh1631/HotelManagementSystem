package com.HMS.Hotel.Management.service.interfac;

import com.HMS.Hotel.Management.dto1.Response;
import com.HMS.Hotel.Management.entity1.Booking;

public interface IBookingService {
    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
