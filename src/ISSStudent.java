
public class ISSStudent implements Comparable {
    private String name;
    private String address;
    private int id;
    
    public ISSStudent (String n, String a, int i){
        name=n;
        address=a;
        id=i;
    }
    public String ToString(){
        String str = "Name\t" + name;
        str+="\nAddress:\t" + address;
        str+="\nID Number:\t" +id;
        return str;
    }
    public int getID(){
        return id;
    }
    
    public int compareTo(Object o) {
        int difference=id - ((ISSStudent)o).getID();
        return difference;
    }
    
}
