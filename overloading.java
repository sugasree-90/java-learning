class addition{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}
public class overloading {
    public static void main(String args[]){
        addition ad=new addition();
        int n=ad.add(23,45);
        int c=ad.add(45,34,56);
        System.out.println(n);
        System.out.println(c);
    }
}
