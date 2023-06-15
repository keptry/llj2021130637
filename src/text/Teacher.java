package text;

public class Teacher {
    private String name;
    private Integer age;
    private Student student;

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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        // 添加学生信息
        teacher.setStudent(new Student("AKI", 26));
        // 获取学生信息
        System.out.println(teacher.getStudent().getName() + ":" + teacher.getStudent().getAge());
        teacher.setName("小高");
        System.out.println("teacherName:" + teacher.getName());
    }
}
