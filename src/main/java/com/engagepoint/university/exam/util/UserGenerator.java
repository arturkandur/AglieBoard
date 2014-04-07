package com.engagepoint.university.exam.util;

import com.engagepoint.university.exam.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserGenerator {
    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static Random rnd = new Random();
    static long id = 0;

    public static List<User> getRandomUserList(){
        List<User> userCollection = new ArrayList<User>();
        userCollection.add(genUser());
        userCollection.add(genUser());
        userCollection.add(genUser());

        return userCollection;
    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }

    public static User genUser(){
        User randUser = new User();
        randUser.setId(id++);
        randUser.setName("User" + id);
        return randUser;
    }

    private static String randomString(int len){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ ){
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        }
        return sb.toString();
    }
}
