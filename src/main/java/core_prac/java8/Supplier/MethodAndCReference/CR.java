package core_prac.java8.Supplier.MethodAndCReference;
class Sample{
    Sample()
    {
        System.out.println("Sample class constructor Executed ");
    }
}
interface inter1{
    public Sample get();
}
public class CR
{
    public static void main(String[] args) {
        inter1 i=Sample::new;
        Sample s1=i.get();
        Sample s2=i.get();
        Sample s3=i.get();
        Sample s4 =i.get();
    }
}
