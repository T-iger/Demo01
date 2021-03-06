package Learn.Day216.demo02;
/*
标准的类

1、所有的成员变量都要使用private关键字修饰
2、为每一个成员变量编写一个Getter/Setter方法
3、编写一个无参数的构造方法
4、编写一个全参数的构造方法

这样标准的类也叫做java bean
 */
public class Student {

    private String name;//姓名
    private int age;//年龄

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
