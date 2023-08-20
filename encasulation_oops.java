package java_project;
class bankacc {
    private String name;
    private int points;
    private double acc_num;

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
    public double getAcc_num() {
        return acc_num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setAcc_num(double acc_num) {
        this.acc_num = acc_num;
    }
}
public class encasulation_oops {
    public static void main(String[] args) {
        bankacc bank = new bankacc();
        bank.setName("canara bank");
        bank.setPoints(4012);
        bank.setAcc_num(1.797693134862);
        System.out.println("Bank Name: " + bank.getName());
        System.out.println("cibil points" +bank.getPoints());
        System.out.println("account_number"+bank.getAcc_num());
    }
}
