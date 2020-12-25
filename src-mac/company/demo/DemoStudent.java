package company.demo;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu2 = new Student("帅",22);
        System.out.println("姓名: " + stu2.getName() + "，年龄："+stu2.getAge());
    }
}
