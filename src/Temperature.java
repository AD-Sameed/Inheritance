public class Temperature {
    double ftemp;

    public Temperature(double ftemp) {
        this.ftemp = ftemp;
    }
    public double getFtemp_C() {
        return (ftemp-32)*5/9;
    }
    public double getFtemp_K() {
        return (ftemp-32)*5/9 + 273.5 ;
    }
    public void setFtemp_c(double ftemp) {
        this.ftemp = ftemp;
    }
    public void setFtemp_k(double ftemp) {
        this.ftemp = ftemp;
    }




    public static void main(String[] args) {
        Temperature temp = new Temperature(98);
        System.out.println(temp.getFtemp_C());
        System.out.println(temp.getFtemp_K());
    }
}
