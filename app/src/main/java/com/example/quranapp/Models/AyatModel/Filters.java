package com.example.quranapp.Models.AyatModel;

import com.google.gson.annotations.SerializedName;

public class Filters{

	@SerializedName("chapter_number")
	private String chapterNumber;

	public String getChapterNumber(){
		return chapterNumber;
	}

	@Override
 	public String toString(){
		return 
			"Filters{" + 
			"chapter_number = '" + chapterNumber + '\'' + 
			"}";
		}
}