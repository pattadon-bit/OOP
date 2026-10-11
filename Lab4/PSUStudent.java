public abstract class PSUStudent {
    protected int age;
    protected double gpa;

    public PSUStudent(int age, double gpa) {
        if (age < 0 || gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("Invalid age or gpa");
        }
        this.age = age;
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("Invalid gpa");
        }
        this.gpa = gpa;
    }

    public abstract double revealGrade();
}