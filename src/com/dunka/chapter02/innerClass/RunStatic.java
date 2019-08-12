package com.dunka.chapter02.innerClass;

/**
 * @Author Dunka
 * @Description
 * @Date 15:43   2019/8/12
 * @ClassName Run
 */
public class RunStatic {
    public static void main(String[] args) {
        PublicClassStatic publicClass = new PublicClassStatic();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername()+"  "+publicClass.getPassword());

        PublicClassStatic.PrivateClass privateClass = new PublicClassStatic.PrivateClass();
        privateClass.setAddress("addressValue");
        privateClass.setAge("ageValue");
        System.out.println(privateClass.getAge()+"  "+privateClass.getAddress());
    }
}
