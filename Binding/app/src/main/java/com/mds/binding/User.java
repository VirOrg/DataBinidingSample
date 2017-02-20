package com.mds.binding;

/**
 * Created by Ashish on 15/02/17.
 */

public class User{
    private String name;
    private String age;
    private MyUserDetails myUserDetails;

    public MyUserDetails getMyUserDetails() {

        return myUserDetails;
    }

    public void setMyUserDetails(MyUserDetails myUserDetails) {
        this.myUserDetails = myUserDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public static class MyUserDetails{

        private String name;
        private String age;

        public MyUserDetails(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }

}
