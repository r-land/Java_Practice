package MasterpieceJava.ch4;

public class Dog {

        private String name;
        private String breed;
        private int age;
        
        public Dog(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Dog(String name, String breed, int age){
            this.name = name;
            this.breed = breed;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String n) {
       name = n;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String b) {
           breed = b;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int a) {
            age = a;
        }

    }

