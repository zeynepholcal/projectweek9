package Student;

import Data.StudentData;
import School.SchoolLocation;

import java.util.LinkedHashMap;

public class StudentClass extends SchoolLocation {

    public StudentClass(String location) {
        super(location);
    }

    /*
      This class is child of the SchoolLocation

      Create 3 private instance variables

      String username and password

      Linked hash map key is String value is Integer name is classNameAndScore

       */
    private String username;
    private String password;
    private LinkedHashMap<String, Integer> classNameAndScore;


     /*
        Create an constructor
        three parameter String username, String password and  String studentSchoolLocation

        Call the setUsernameAndPassword method in the constructor

     */

    public StudentClass( String username, String password, String studentSchoolLocation) {
        super(studentSchoolLocation);
        this.username = username;
        this.password = password;
        setUsernamePassword(username,password);
    }


    /*
    Create a method name is  setUsernamePassword
    Parameter is String username and String  password
    no return type

    Check if given username and password pair exist in the StudentData class
    You will use AddUserNameAndPassword method to check it
    (create a new LinkedHashMap and make it equal to AddUserNameAndPassword from
    the StudentData class)
    if the pair exists,  make instance variable username equal to parameter username,
    and make instance variable password equal to parameter password

    if it doesn't not exist then throw an RunTimeException which is
    "Not able to find a username and password. Please sign up to website"
     */

    public void setUsernamePassword(String username, String password) {

        StudentData sd = new StudentData();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(sd.AddUserNameAndPassword());


        if (linkedHashMap.containsKey(username) && linkedHashMap.containsValue(password)) {
            this.username = username;
            this.password = password;
        } else
            throw new RuntimeException("Not able to find a username and password. Please sign up to website");

    }


/*
        create a set method for the classNameAndScore
     */

    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }

    /*
            create a get method for the classNameAndScore
         */

    public void setClassNameAndScore(LinkedHashMap<String, Integer> classNameAndScore) {
        this.classNameAndScore = classNameAndScore;
    }




    /*
    Create a toString method
    print username
          password
          Price
          schoolLocation
          ClassNameAndScore
     */

    @Override
    public String toString() {
        return
                "\nusername " + username +
                        "\npassword " + password +
                        "\nPrice " + getPrice() +
                        "\nSchoolLocation " + getLocation() +
                        "\nclassNameAndScore  " + getClassNameAndScore();
    }
}