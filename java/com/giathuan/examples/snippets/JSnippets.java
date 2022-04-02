package com.giathuan.examples.snippets;

import com.google.common.collect.ImmutableList;

public class JSnippets {
  public static void main(String[] args) {
    JSnippets snippets = new JSnippets();

    System.out.println("Experiment starts: .immutableListCopyOfShouldNotMakeCopiesOfItems");
    snippets.immutableListCopyOfShouldNotMakeCopiesOfItems();
    System.out.println("Experiment ends: .immutableListCopyOfShouldNotMakeCopiesOfItems");
  }

  private void immutableListCopyOfShouldNotMakeCopiesOfItems() {
    ImmutableList<Student> students =
        ImmutableList.of(
            Student.newBuilder().setName("A").setAge(10).setSchool("MIT").setGrade(100).build(),
            Student.newBuilder().setName("B").setAge(11).setSchool("Harvard").setGrade(99).build(),
            Student.newBuilder().setName("C").setAge(10).setSchool("MIT").setGrade(98).build(),
            Student.newBuilder().setName("D").setAge(11).setSchool("MIT").setGrade(100).build());

    System.out.println();
    ImmutableList<Student> copiedStudents = ImmutableList.copyOf(students);
    for (int i = 0; i < copiedStudents.size(); i++) {
      System.out.printf("students[%d].hashCode() = %d\n", i, students.get(i).hashCode());
      System.out.printf(
          "copiedStudents[%d].hashCode() = %d\n", i, copiedStudents.get(i).hashCode());
      System.out.println();
    }
  }
}
