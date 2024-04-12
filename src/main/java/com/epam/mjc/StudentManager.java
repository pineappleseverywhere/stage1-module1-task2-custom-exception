package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws StudentNotFoundException {
    Student student = Student.getValueOf(studentID);
    if (student == null) {
      throw new StudentNotFoundException(studentID);
    }
    return student;
  }

  class StudentNotFoundException extends IllegalArgumentException {

    public StudentNotFoundException(long id) {
      super("Could not find student with ID " + id);
    }
  }
}