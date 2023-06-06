class student{
    private String name;
    private int grade;
    public student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
class undergraduate extends student{
    private String major;
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public undergraduate(String name, int grade, String major) {
        super(name, grade);
        this.major=major;
    }
    public String toString(){
        return super.toString()+"major:"+major;
    }
}
class postgraduate extends student{
    private String major;
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public postgraduate(String name, int grade,String major) {
        super(name, grade);
        this.major=major;
    }
    public String toString() {
        return super.toString()+"major:"+major;
    }
}
class mai{
    public static void main(String[] args) {
        student[] students=new student[3];
        students[0]=new undergraduate("第一个人", 0,"math");
        students[1]=new postgraduate("第二个人", 10,"law");
        System.out.println(students[0].toString());
        System.out.println(students[1].toString());
    }
}
