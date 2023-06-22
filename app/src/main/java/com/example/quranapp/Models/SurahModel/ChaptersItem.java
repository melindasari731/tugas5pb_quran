package com.example.quranapp.Models.SurahModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ChaptersItem{

	@SerializedName("pages")
	private List<Integer> pages;

	@SerializedName("name_complex")
	private String nameComplex;

	@SerializedName("translated_name")
	private TranslatedName translatedName;

	@SerializedName("bismillah_pre")
	private boolean bismillahPre;

	@SerializedName("revelation_order")
	private int revelationOrder;

	@SerializedName("verses_count")
	private int versesCount;

	@SerializedName("id")
	private int id;

	@SerializedName("name_simple")
	private String nameSimple;

	@SerializedName("name_arabic")
	private String nameArabic;

	@SerializedName("revelation_place")
	private String revelationPlace;

	public void setPages(List<Integer> pages){
		this.pages = pages;
	}

	public List<Integer> getPages(){
		return pages;
	}

	public void setNameComplex(String nameComplex){
		this.nameComplex = nameComplex;
	}

	public String getNameComplex(){
		return nameComplex;
	}

	public void setTranslatedName(TranslatedName translatedName){
		this.translatedName = translatedName;
	}

	public TranslatedName getTranslatedName(){
		return translatedName;
	}

	public void setBismillahPre(boolean bismillahPre){
		this.bismillahPre = bismillahPre;
	}

	public boolean isBismillahPre(){
		return bismillahPre;
	}

	public void setRevelationOrder(int revelationOrder){
		this.revelationOrder = revelationOrder;
	}

	public int getRevelationOrder(){
		return revelationOrder;
	}

	public void setVersesCount(int versesCount){
		this.versesCount = versesCount;
	}

	public int getVersesCount(){
		return versesCount;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setNameSimple(String nameSimple){
		this.nameSimple = nameSimple;
	}

	public String getNameSimple(){
		return nameSimple;
	}

	public void setNameArabic(String nameArabic){
		this.nameArabic = nameArabic;
	}

	public String getNameArabic(){
		return nameArabic;
	}

	public void setRevelationPlace(String revelationPlace){
		this.revelationPlace = revelationPlace;
	}

	public String getRevelationPlace(){
		return revelationPlace;
	}

	@Override
 	public String toString(){
		return 
			"ChaptersItem{" + 
			"pages = '" + pages + '\'' + 
			",name_complex = '" + nameComplex + '\'' + 
			",translated_name = '" + translatedName + '\'' + 
			",bismillah_pre = '" + bismillahPre + '\'' + 
			",revelation_order = '" + revelationOrder + '\'' + 
			",verses_count = '" + versesCount + '\'' + 
			",id = '" + id + '\'' + 
			",name_simple = '" + nameSimple + '\'' + 
			",name_arabic = '" + nameArabic + '\'' + 
			",revelation_place = '" + revelationPlace + '\'' + 
			"}";
		}
}