package model;

import java.util.Objects;

public class Student {

    //Attribute
    public String id;

    public String name;

    public int age;

    public float score;

    public Student(String id, String name, int age, float score){
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            obj = (Student)obj;
            if(getId().equals(((Student) obj).getId())&&
                    getName().equals(((Student) obj).getName()) &&
                    getAge() == ((Student) obj).getAge() &&
                    getScore() == ((Student) obj).getScore())
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }




}
