public class Box <T> {
    T var1;
    public Box(T var1) {
        this.var1 = var1;
    }
 public  static <T> Box metod(Box box){
        return box;
}
    public T getVar1() {
        return var1;
    }

    public void setVar1(T var1) {
        this.var1 = var1;
    }

    @Override
    public String toString() {
        return "Box{" +
                "var1=" + var1 +
                '}';
    }
}
