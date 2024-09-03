import java.util.Scanner;

public class Main {
    static void main_menu(){
        System.out.println("------------------ ### Welcome To Car Showroom Management System ### ------------------");
        System.out.println("------------------ ### Enter Your Choice ### ------------------");
        System.out.println("1) Add Showroom \t\t\t 2) Add Employees \t\t\t 3) Add Cars");
        System.out.println("4) Get Showroom \t\t\t 5) Get Employees \t\t\t 6) Get Cars");
        System.out.println("------------------ ### Enter 0 to Exit ### ------------------");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Showroom showroom[] = new Showroom[5];
        Employees employees[] = new Employees[5];
        Cars cars[] = new Cars[5];

        int car_counter = 0;
        int showroom_counter = 0;
        int employee_counter=0;
        int choice = -1;
        while(choice!=0){

            main_menu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch(choice){
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter++].set_details();
                        System.out.println("1) Add new Showroom");
                        System.out.println("9) Go back to Main Menu");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employees[employee_counter] = new Employees();
                        employees[employee_counter++].set_details();
                        System.out.println("1) Add new Employee");
                        System.out.println("9) Go back to Main Menu");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        cars[car_counter] = new Cars();
                        cars[car_counter++].set_details();
                        System.out.println("1) Add new Showroom");
                        System.out.println("9) Go back to Main Menu");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for(int i=0; i<showroom_counter; i++){
                            showroom[i].get_details();
                            System.out.println();
                        }
                        System.out.println("9) Go back to Main Menu");
                        System.out.println("0) EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for(int i=0; i<employee_counter; i++){
                            employees[i].get_details();
                            System.out.println();
                        }
                        System.out.println("9) Go back to Main Menu");
                        System.out.println("0) EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for(int i=0; i<car_counter; i++){
                            cars[i].get_details();
                            System.out.println();
                        }
                        System.out.println("9) Go back to Main Menu");
                        System.out.println("0) EXIT");
                        choice = sc.nextInt();
                        break;
                }
            }
        }
    }
}
