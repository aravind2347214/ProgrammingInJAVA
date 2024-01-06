package Learning.AggregateFunctions;

class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private int age;

    public Person(){}
    public Person(String firstName,String lastString,String email,Gender gender,int age){
        this.firstName = firstName;
        this.lastName = lastString;
        this.email=email;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Gender getGender(){
        return this.gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int compareTo(Person another){
        return this.age - another.getAge();
    }

    public int toString5(Person another){
        return this.age - another.getAge();
    }








}

enum Gender{MALE,FEMALE}

/**
 * Main
 */
public class Main {

    
}