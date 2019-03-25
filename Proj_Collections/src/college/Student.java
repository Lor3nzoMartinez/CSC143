package college;

import utility.Comparable;

public class Student implements Comparable<Student>{
	private final int age;
	private final double gpa;
	private final Major major;
	private final String name;
	private final Rank rank;

	
	public Student(Builder builder) {
		this.age 	= builder.age;
		this.gpa 	= builder.gpa;
		this.major 	= builder.major;
		this.name 	= builder.name;
		this.rank 	= builder.rank;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getFirstName() {
		String [] info = name.split(" ");
		String FirstName = info [0];
		return FirstName;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	public String getLastName() {
		String [] info = name.split(" ");
		String LastName = info [1];
		return LastName;
	}
	
	public Rank getRank() {
		return this.getRank();
	}
	
	public Major getMajor() {
		return this.getMajor();
	}
	
	public static int compareByAge(Student s1, Student s2) {
		if(s1.age < s2.age) {return -1;} 
		else if(s1.age == s2.age) {return 0;}
		else {return 1;}
	}
	
	public static int compareByFirstName(Student s1, Student s2) {
		return s1.getFirstName().compareTo(s2.getFirstName());
	}
	
	public static int compareByGPA(Student s1, Student s2) {
		if(s1.gpa < s2.gpa) {return -1;} 
		else if(s1.gpa == s2.gpa) {return 0;}
		else {return 1;}
	}
	
	public int compareTo(Student stud) {
		return this.getLastName().compareTo(stud.getLastName());
	}
	
	public boolean equals(Object other) {
		return false;
	}
	
	public boolean isOnDeansList() {
		if (this.gpa > 3.5) { return true; }
		else{return false;}
	}
	
	public boolean isOnProbation() {
		if (this.gpa < 2.0) { return true; }
		else {return false;}
	}
	
	public String toFile() {
		return this.name + "," + this.age + "," + this.major + "," + this.rank + "," + this.gpa;
	}
	
	public String toString() {
		return    "Name:   " + name
				+ "Age:    " + age
				+ "Rank:   " + rank
				+ "Major:  " + major
				+ "GPA:    " + gpa
				+ "Deans List:   " + isOnDeansList()
				+ "On Probation:   " + isOnProbation();
	}
	
	public static class Builder{

        private String name;
        private int age;
        private Rank rank;
        private Major major;
        private double gpa;

        public Builder() {
            this.name = "";
            this.age = 0;
            this.rank = null; 
            this.major = null;
            this.gpa = 0.0;
        }
        
        public Student build() {
            return new Student(this);
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        
        public Builder setGPA(double gpa) {
            this.gpa = gpa;
            return this;
        }
        
        public Builder setMajor(Major major) {
            this.major = major;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRank(Rank rank) {
            this.rank = rank;
            return this;
        }

    }

}
