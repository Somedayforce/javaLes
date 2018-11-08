public class Employee {

    private String name;
    private int departNum;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartNum() {
        return departNum;
    }

    public void setDepartNum(int departNum) {
        this.departNum = departNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Employee(){};
    public Employee (String name, int departNum,int salary){
        this.name = name;
        this.departNum = departNum;
        this.salary = salary;
    }
    public static void sortSalary(Employee[] emp){

        Employee temp = new Employee();
        for (int i = 0;i<emp.length;i++){
            for (int j = i;j<emp.length;j++){
                if(emp[i].getSalary()<emp[j].getSalary()){

                    temp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = temp;
                }
            }
        }

    }
}
