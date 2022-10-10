public class Test {
    String fname;
    String lname;
    int roll;

    public Test(String fname, String lname, int roll) {
        this.roll = roll;
        this.fname = fname;
        this.lname = lname;
    }

    public Test() {}

    public Test(Test test) {
        this.fname = test.fname;
        this.lname = test.lname;
        this.roll = test.roll;
    }

    public String toString() {
        return String.format("Name: %s %s\nRoll No: FA21-BCS-%d", fname, lname, roll);
    }

    public boolean equals(Object o) {
        Test temp = (Test)o;
        boolean isTrue = false;

        if (this.fname == temp.fname && this.lname == temp.lname) {
            isTrue = true;
        } else {
            isTrue = false;
        }
        return isTrue;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Test clone() {
        return new Test(this.fname, this.lname, this.roll);
    }
}
 