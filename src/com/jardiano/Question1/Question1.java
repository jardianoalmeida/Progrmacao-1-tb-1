package com.jardiano.Question1;

import com.jardiano.Question1.model.Address;
import com.jardiano.Question1.model.Course;
import com.jardiano.Question1.model.Student;

import java.util.ArrayList;

public class Question1 {

    public static void main(String[] args) {
        //classes, objetos e alocacao de memoria
        Course course = new Course(1, "Sistemas de Informação");

        //classes, objetos e alocacao de memoria
        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(new Address(1, "69316-202", "R. NCO, 203 - Nova Cidade", "RR", "Boa Vista"));

        //classes, objetos e alocacao de memoria
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course);

        //classes, objetos e alocacao de memoria
        Student student = new Student(1, "Jardiano", "Almeida", "Jardiano.almeida@gmail.com",
                "123456", addresses, 2020, 5, courses);
    }
}
