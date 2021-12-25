package UI.Tuan_4_5;

public class B1D {
    
    public static String B1( String name) {
       
        name=name.trim().toLowerCase();
        name=name.replaceAll("\\s+", " ");
        System.out.println(""+name);
        return name;
    }
}
