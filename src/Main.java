import objects.Animals;
import objects.Customer;
import exercises.MyCollections;
import objects.Person;
import objects.Employee;

public class Main {

    public static void main(String[] args) {

    /*    int y=1;
        int total;
        while(y<7){

            System.out.print("["+y+"]");

            y++;

            total= ;
            System.out.print(total);

        }

        int x=4;
        if(x==5) {

            System.out.println ("X is equal to 5");

        }
        else {
            System.out.println ("X is not equal to 5");
        }
*/


    //do while loops
    /*    int i=1;
        do{
            System.out.print("["+i+"]");
            i++;}
        while (i<7);*/

        //for loop
      /*  int a;
        int total=0;
        for(a=1;a<=6;a++){

          //  System.out.print("["+a+"]");

            total = total+a;


        }

        System.out.println(total);*/
        //array with for loop
       /* String [] myInstructors = {"Neil","Bert","Amille"};
            int i;
        for (i=1;i<=2;i++){
            System.out.println(myInstructors[0]);

        }

        if (myInstructors[i]== "Bert") {
            System.out.println("Amante");
        }else{
            Syste

        }*/









        System.out.println("Hello World!");
        System.out.println("OMG it display, I Got It. yehey");

        /*TODO basic notes about vaiable*/
/*
        byte byteVariable = 15;
        short mediumRangeDecimalVariable = 32767;
        int decimalVariableUpTo = 2147483647;
        long largeDecimalVariableForm = -9223372036854775808L;
        long largeDecimalVariableUpTo = 9223372036854775807L;
        float numberWithDecimalPlaces = 8.1232f;
        double veryLargeNumberWithDecimalPlaces = 12312312.1232;
        boolean isTrueOrFalse = true;
        char singleCharacter = '\u0041';
        String someText = "this is sparta";
        //largeDecimalVariableUpTo = decimalVariableUpTo;

        System.out.println(byteVariable);
        System.out.println(mediumRangeDecimalVariable);
        System.out.println(decimalVariableUpTo);
        System.out.println(largeDecimalVariableForm);
        System.out.println(largeDecimalVariableUpTo);
        System.out.println(numberWithDecimalPlaces);
        System.out.println(veryLargeNumberWithDecimalPlaces);
        System.out.println(isTrueOrFalse);
        System.out.println(singleCharacter);
        System.out.println(someText);*/

        /*TODO learn learn this
         * get 3 properties
          * integer, boolean, string*/
        //objectives


        //Person person = new Person("Jude Clark Pogi","Erana");

      //  person.seteMail("erana156@yahoo.com");
       // String firstName = person.getfirstName();
       // System.out.println(firstName);
      //  String lastName = person.getlastName();
       // System.out.println(lastName);
       // String eMail = person.geteMail();
       // System.out.println(eMail);

        /*TODO create a public that introduce yourself
         */
        //from person
        //String intro =person.introduceYourself();
        //System.out.println(intro);

        //override
        Employee employee = new Employee();
        employee.setfirstName("Jude");
        employee.setlastName("Barbs");
        String introduce = employee.introduceYourself();
        System.out.println(introduce);


        //from employee
        //String intro2=employee.introduceYourself();
       // System.out.println(intro2);

        //from customer
        Customer customer = new Customer();
        customer.setfirstName("Shantey");
        customer.setlastName("Lier");
       // String introcustom=customer.introduceYourself();
        System.out.println(customer.introduceYourself());
        System.out.println(customer.introduceYourself("house"));

        Animals animals = new Animals();
        animals.setSpecies("Amphibians");
        animals.setCanFly(true);
        animals.setAge(89);

        String spec =animals.getSpecies();
        System.out.println(spec);
        Boolean fly =animals.isCanFly();
        System.out.println(fly);
        Integer age = animals.getAge();
        System.out.println(age);



    MyCollections.myList();
    MyCollections.myEx();
    MyCollections.myRelations();
    MyCollections.random();

    }



    }

