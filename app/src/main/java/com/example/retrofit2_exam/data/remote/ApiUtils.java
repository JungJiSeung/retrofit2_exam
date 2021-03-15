package com.example.retrofit2_exam.data.remote;

public class ApiUtils {
    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static SOService getSOSoService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}
