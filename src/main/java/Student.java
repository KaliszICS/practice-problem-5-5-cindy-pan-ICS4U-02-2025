class Student implements Comparable<Student>{
    String name;
    int age;
    String studentNumber;

    public Student(String name1, int age1, String number){
        this.name =name1;
        this.age = age1;
        this.studentNumber = number;
    }

    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }

    public String getStudentNumber(){
        return this.studentNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    public void setStudentNumber(String number){
        this.studentNumber = number;
    }

    @Override
    public String toString(){
        return "N:"+this.name+" A:"+this.age+" SN:"+this.studentNumber;
    }

    @Override
    public int compareTo(Student student){
        return this.studentNumber.compareTo(student.studentNumber);
    }
}