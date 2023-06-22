package com.example.quranapp.Models.AyatModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Verses {

	@SerializedName("meta")
	private Meta meta;

	@SerializedName("verses")
	private List<VersesItem> verses;

	public Meta getMeta(){
		return meta;
	}

	public List<VersesItem> getVerses(){
		return verses;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"meta = '" + meta + '\'' + 
			",verses = '" + verses + '\'' + 
			"}";
		}
}