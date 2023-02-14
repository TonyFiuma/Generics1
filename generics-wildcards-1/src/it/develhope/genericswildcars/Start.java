package it.develhope.genericswildcars;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start{
    public static void main(String[] args){
        List<Double> individualMarksLisa = new ArrayList<>();
        individualMarksLisa.add(0,7.5);
        individualMarksLisa.add(1,8.5);

        List<Double> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add(0,5.0);
        projectMarksListJeremy.add(1,4.0);

        System.out.println(Student.getAverageMark(individualMarksLisa));
        System.out.println(Student.getAverageMark(projectMarksListJeremy));

        List<Student> students = Arrays.asList(new Student("Jeremy","Walker",Student.getAverageMark(projectMarksListJeremy)),
                new Student("Lisa","Window",Student.getAverageMark(individualMarksLisa)));

        System.out.println(students);
    }
}
