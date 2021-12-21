public class Students {

        private int id;
        private String name;
        private String surname;
        private int age;

        private String courseEnrolled;
        private int courseID;

    public Students(int id, String name, String surname, int age, String courseEnrolled, int courseID) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.courseEnrolled = courseEnrolled;
        this.courseID = courseID;
    }

    //Not going to alter Student name, id.
    //Used to update the student year

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

    public String getName() {
        return name;
    }
        public void setName(String name) {
            if (!(name.isEmpty())) {
                this.name = name;
            } else {
                System.out.println("Please add student's name");
                }
            }


        public String getSurname() {
            return surname;
        }

        public void setSurname(String name) {
            if (!(surname.isEmpty())) {
            this.surname = surname;
        } else {
            System.out.println("Please add student's surname");
        }
    }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 100 && age > 10) {
                    this.age = age;
            } else {
                System.out.println("Invalid age, please enter correctly");
            }
        }

        public String getCourseEnrolled() {
            return courseEnrolled;
        }

        public void setCourseEnrolled(String courseEnrolled) {
            this.courseEnrolled = courseEnrolled;
        }

        @Override
        public String toString() {
            return "Student's Name: " + name + surname + "\n" +
                    "ID: " + id + "\n" +
                    "Age: " + age + "\n"+
                    "courses.Course enrolled: " + courseEnrolled + "\n";
        }


    }
