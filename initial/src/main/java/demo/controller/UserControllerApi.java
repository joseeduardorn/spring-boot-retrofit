package controller;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserControllerApi{

    @GET("/user")
    public String userList();

    @GET("/user/{id}")
    public String getEntryById(@Path("id") Long id);

    @POST("/user")
    public String create(@Body String firstName);

    @PUT("/user")
    public String update(@Body Long id);

    @DELETE("/user/{id}")
    public String delete(@Path("id") Long id);

}