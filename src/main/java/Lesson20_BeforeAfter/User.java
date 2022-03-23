package Lesson20_BeforeAfter;

public class User {
    private  int age;
    private String Name;
    private  int purse;
    private  boolean status = false;

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }



    public User(int age, String name, int purse) {
        this.age = age;
        Name = name;
        this.purse = purse;
    }

    public void grow(){
        this.age = this.age+1;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPurse(int purse) {
        this.purse = purse;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return Name;
    }

    public int getPurse() {
        return purse;
    }
}
