package com.example.quranapp.retrofit;

import com.example.quranapp.Models.AyatModel.Verses;
import com.example.quranapp.Models.SurahModel.Chapters;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiEndpoint {
    @GET("chapters?language=id")
    Call<Chapters> getNama();

    @GET("quran/verses/uthmani")
    Call<Verses> getAyat(@Query("chapter_number") int id);

    @GET("quran/translations=id")
    Call<Translations> getTranslations(@Query("translations_number") int id);

    @GET("chapter_recitations=id")
    Call<Recitations> getAudio();



}
