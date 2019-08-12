package com.dunka.chapter02.innerClass;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:43   2019/8/12
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername()+"  "+publicClass.getPassword());

        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAddress("addressValue");
        privateClass.setAge("ageValue");
        System.out.println(privateClass.getAge()+"  "+privateClass.getAddress());
    }
}
