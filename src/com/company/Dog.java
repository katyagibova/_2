package com.company;

public class Dog {
    private String nickname;
    private int age;
    public Dog(String nickname, int age) {
        nickname = nickname;
        age = age;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public  int newAge()
    {
      return age*7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}
