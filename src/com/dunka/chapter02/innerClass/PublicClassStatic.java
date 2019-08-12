package com.dunka.chapter02.innerClass;

/**
 * @Author Dunka
 * @Description //静态内置类
 * @Date 15:41   2019/8/12
 * @ClassName PublicClass
 */
public class PublicClassStatic {
    static private String username;
    static private String password;
    static  class PrivateClass{
        private String age;
        private String address;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "PrivateClass{" +
                    "age='" + age + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PublicClass{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
