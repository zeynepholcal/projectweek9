package Lessons;


import Student.StudentClass;

import java.util.ArrayList;

public  class Biology extends LessonClass {

 /*
    This class child of the LessonClass

    Create a private String Arraylist name is topicList

    Biology class is the child of the LessonClass

      add following values to arrayList(topicList) in the override method that comes from the abstract class
     Ecology
     Opportunities in Biology
     Principles of Biology 1
     Principles of Biology 2
     Principles of Genetics
     return topicList

     */

    private ArrayList<String > topicList = new ArrayList<>();

    public Biology(StudentClass sc) {
     super(sc);
 }

    @Override
   public ArrayList<String> topics() {
        topicList.add("Ecology");
        topicList.add("Opportunities in Biology");
        topicList.add("Principles of Biology 1");
        topicList.add("Principles of Biology ");
        topicList.add("Principles of Genetics");
        return topicList;
    }
}
