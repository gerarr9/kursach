public class Employee {

    private  static int idGenerate = 1;
    private final int id;
   private final String fullName ;
   private int money ;
   private int deportament;

   public  Employee(String fullName,  int deportament, int money){
        this.fullName= fullName;
        this.deportament = deportament;
       this.money = money;
        this.id = idGenerate ++;



   }

    public int getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public int getMoney() {
        return money;
    }

    public int getDeportament() {
        return deportament;
    }



    public void setMoney(int money) {
        this.money = money;
    }

    public void setDeportament(int deportament) {
        this.deportament = deportament;
    }
    @Override
    public  String toString() {
        return "id: " +id+", ФИО: "+fullName+", отдел:"+deportament+", ЗП: "+money+" рублей";
    }
}
