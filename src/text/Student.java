package text;

public class Student {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("吕柳俊");
        student.setAge(20);
        System.out.println(student.getName());
        System.out.println(student.getAge());

    }
}
