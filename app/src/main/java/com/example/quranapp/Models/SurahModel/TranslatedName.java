package com.example.quranapp.Models.SurahModel;

import com.google.gson.annotations.SerializedName;

public class TranslatedName{

	@SerializedName("name")
	private String name;

	@SerializedName("language_name")
	private String languageName;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLanguageName(String languageName){
		this.languageName = languageName;
	}

	public String getLanguageName(){
		return languageName;
	}

	@Override
 	public String toString(){
		return 
			"TranslatedName{" + 
			"name = '" + name + '\'' + 
			",language_name = '" + languageName + '\'' + 
			"}";
		}
}