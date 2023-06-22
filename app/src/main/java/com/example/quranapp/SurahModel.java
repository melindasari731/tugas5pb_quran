package com.example.quranapp;

import android.os.Parcel;
import android.os.Parcelable;

public class SurahModel implements Parcelable {

    private int id;
    private String nameSimple;
    private String nameArabic;
    private TranslatedName translatedName;

    public SurahModel(int id, String nameSimple, String nameArabic, TranslatedName translatedName) {
        this.id = id;
        this.nameSimple = nameSimple;
        this.nameArabic = nameArabic;
        this.translatedName = translatedName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSimple() {
        return nameSimple;
    }

    public void setNameSimple(String nameSimple) {
        this.nameSimple = nameSimple;
    }

    public String getNameArabic() {
        return nameArabic;
    }

    public void setNameArabic(String nameArabic) {
        this.nameArabic = nameArabic;
    }

    public TranslatedName getTranslatedName() {
        return translatedName;
    }

    public void setTranslatedName(TranslatedName translatedName) {
        this.translatedName = translatedName;
    }

    @Override
    public String toString() {
        return "SurahModel{" +
                "id=" + id +
                ", nameSimple='" + nameSimple + '\'' +
                ", nameArabic='" + nameArabic + '\'' +
                ", translatedName=" + translatedName +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.nameSimple);
        dest.writeString(this.nameArabic);
        dest.writeParcelable(this.translatedName, flags);
    }

    public void readFromParcel(Parcel source) {
        this.id = source.readInt();
        this.nameSimple = source.readString();
        this.nameArabic = source.readString();
        this.translatedName = source.readParcelable(TranslatedName.class.getClassLoader());
    }

    protected SurahModel(Parcel in) {
        this.id = in.readInt();
        this.nameSimple = in.readString();
        this.nameArabic = in.readString();
        this.translatedName = in.readParcelable(TranslatedName.class.getClassLoader());
    }

    public static final Creator<SurahModel> CREATOR = new Creator<SurahModel>() {
        @Override
        public SurahModel createFromParcel(Parcel source) {
            return new SurahModel(source);
        }

        @Override
        public SurahModel[] newArray(int size) {
            return new SurahModel[size];
        }
    };
}
class TranslatedName implements Parcelable {

    private String name;

    public TranslatedName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected TranslatedName(Parcel in) {
        name = in.readString();
    }

    public static final Creator<TranslatedName> CREATOR = new Creator<TranslatedName>() {
        @Override
        public TranslatedName createFromParcel(Parcel in) {
            return new TranslatedName(in);
        }

        @Override
        public TranslatedName[] newArray(int size) {
            return new TranslatedName[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
    }
}