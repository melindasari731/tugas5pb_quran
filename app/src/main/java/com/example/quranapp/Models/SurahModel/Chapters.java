package com.example.quranapp.Models.SurahModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Chapters {

	@SerializedName("chapters")
	private List<ChaptersItem> chapters;

	public void setChapters(List<ChaptersItem> chapters){
		this.chapters = chapters;
	}

	public List<ChaptersItem> getChapters(){
		return chapters;
	}

	@Override
 	public String toString(){
		return 
			"Chapters{" +
			"chapters = '" + chapters + '\'' + 
			"}";
		}
}