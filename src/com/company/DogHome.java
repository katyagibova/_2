package com.company;

public class DogHome {
    Dog[] sobaka = new Dog[5];
    public void dog() {
        for (int i = 0;i<sobaka.length; i++) {
            sobaka[i] = new Dog("jora",i+1);
        }
    }


}
