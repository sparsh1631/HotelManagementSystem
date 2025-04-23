package com.HMS.Hotel.Management.service.interfac;

import com.HMS.Hotel.Management.dto1.*;
import com.HMS.Hotel.Management.dto1.Response;
import com.HMS.Hotel.Management.entity1.User;

public interface IUserService {
    Response register(User user);
    Response login(LoginRequest loginRequest);
    Response getAllUsers();
    Response getUserBookingHistory(String userId);
    Response deleteUser(String userId);
    Response getUserById(String userId);
    Response getMyInfo(String email);
}
