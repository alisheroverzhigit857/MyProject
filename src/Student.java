public class Student extends Person {
    private int money;
    private String bag;

    public Student(String name, int age,int money, String bag) {
        super(name, age);
        this.money=money;
        this.bag=bag;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getBag() {
        return bag;
    }

    public void setBag(String bag) {
        this.bag = bag;
    }

    @Override
    public String toString() {
        return "Student{" +
                "money=" + money +
                ", bag='" + bag + '\'' +
                '}';
    }
}
