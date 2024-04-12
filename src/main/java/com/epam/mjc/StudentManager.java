package com.epam.mjc;

public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID){
    Student student = Student.getValueOf(studentID);
    if (student == null) {

      throw new customException(studentID);
    }
    return student;
  }
}

class customException extends IllegalArgumentException{
    public customException(long id){
      super("Could not find student with ID " + id);
    }
}