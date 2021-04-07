import Student.Student;

public class main {
    public static void main(String[] args) {
        //Bubble Sort
        int[] array = {6,1,1,8,4,9,2};
        boolean cont = true;
        int count = 0;
        while(cont){
            cont = false;
            for(int i=0;i<array.length-count-1;++i){
                if(array[i]>array[i+1]){
                    array[i] = array[i]^array[i+1];
                    array[i+1] = array[i]^array[i+1];
                    array[i] = array[i] ^array[i+1];
                    cont = true;
                }
            }
            ++count;
        }
        for(int item:array){
            System.out.println(item);
        }


        //OOP
        Student first = new Student();
        Student second = new Student();
        first.setName("Armen");
        second.setName("Ani");
        first.setLastname("Sargsyan");
        second.setLastname("Vanyan");
        first.setAge(19);
        second.setAge(23);
        first.setUniversity("YSU");
        second.setUniversity("AUA");
        first.setFaculty("CS");
        second.setFaculty("Business");
        first.setGender("male");
        second.setGender("female");
        first.setGpa(4);
        second.setGpa(4.96);

        System.out.println("First Student");
        first.printStudentInfo();
        System.out.println();
        System.out.println("Second Student");
        second.printStudentInfo();

    }
}
