
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.Call;

import retrofit2.http.*;

public interface HelloControllerApi{

    @GET("/")
    public String index();

}