package com.example.rickandmortyapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
public interface LocationService {

    String BASE_URL = "https://rickandmortyapi.com/api/";

    @GET ("location/{number}")
    Call<Location> getCharacterByNumber (@Path("number") String number);
}
