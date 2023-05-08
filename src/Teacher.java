public class Teacher extends  Person{
    private String tuulganJeri;
    private String phone;
    public Teacher(String name, int age, String tuulganJeri, String phone) {
        super(name, age);
        this.tuulganJeri=tuulganJeri;
        this.phone=phone;
    }

    public String getTuulganJeri() {
        return tuulganJeri;
    }

    public void setTuulganJeri(String tuulganJeri) {
        this.tuulganJeri = tuulganJeri;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tuulganJeri='" + tuulganJeri + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
