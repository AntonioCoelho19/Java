public class App {
    public static void main(String[] args){
        // Manager manager = new Manager();
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee){
        
        System.out.printf("=======%s=======\n",employee.getClass().getCanonicalName());
        
    //     if(employee instanceof Manager manager){

    //     employee.setName("João");
    //     manager.setLogin("joão");
    //     manager.setPassword("12346");

    //     System.out.println(employee.getName());
    //     System.out.println(manager.getLogin());
    //     System.out.println(manager.getPassword());
    // }
    
    switch(employee){
        case Manager manager -> {
            manager.setCode("123");
            manager.setSalary(5000);
            manager.setName("João");
            manager.setLogin("joão");
            manager.setPassword("12346");
            manager.setComission(1300);

            System.out.println(manager.getCode());
            System.out.println(manager.getName());
            System.out.println(manager.getSalary());
            System.out.println(manager.getComission());
            System.out.println(manager.getLogin());
            System.out.println(manager.getPassword());
            System.out.println(manager.getFullSalary(500));
        }
        case Salesman salesman -> {
            salesman.setCode("1234");
            salesman.setSalary(2800);
            salesman.setName("Lucas");
            salesman.setPercentPerSale(10);
            salesman.setSoldAmount(1000);

            System.out.println(salesman.getCode());
            System.out.println(salesman.getName());
            System.out.println(salesman.getSalary());
            System.out.println(salesman.getPercentPerSale());
            System.out.println(salesman.getSoldAmount());

        }
    }
    System.out.println(employee.getFullSalary());
    System.out.println("==============");
    }
}
