package test.reyesmagos.com.co.litho_test.Presentation.Model;

/**
 * Created by yacalder on 29/04/2018.
 */

public class Person {

    private String name;
    private String age;
    private int photoId;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
}
