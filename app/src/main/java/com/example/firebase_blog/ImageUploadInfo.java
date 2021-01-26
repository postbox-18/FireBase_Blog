package com.example.firebase_blog;

public class ImageUploadInfo {
    public String Desc;
    public String imageName;

   public String imageURL;

    public ImageUploadInfo() {

    }

    public ImageUploadInfo(String name,String name2,String url) {

        this.imageName = name;
        this.Desc=name2;
        this.imageURL= url;
    }

    public String getImageName() {
        return imageName;
    }
    public String getDec() {
        return Desc;
    }
    public String getImageURL() {
        return imageURL;
    }
}
