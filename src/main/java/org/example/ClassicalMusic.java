package org.example;


import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    @Override
    public String getSong() {
        return "Morgenshtern";
    }

//    private ClassicalMusic() {
//
//    }
//
//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }
//    public void doMyInit() {
//        System.out.println("Doing my init");
//    }
//
//    public void doMyDestroy() {
//        System.out.println("Doing my destruction");
//    }
//
//    @Override
//    public String getSong() {
//        return "Morgernshtern";
//    }
}
