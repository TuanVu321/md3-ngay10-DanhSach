public class Person {
    String name;
    int age;
    String phone;
    String adress;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Person(String name, int age, String phone, String adress) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.adress = adress;

    }
}
