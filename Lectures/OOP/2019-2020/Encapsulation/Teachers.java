
public class Teachers{
    private String name;
    private String uni;
    
    public void setName(String n){ this.name = n; }
    public void setUni(String u){ this.uni = u; }
    public String getName(){ return this.name; }
    public String getUni(){ return this.uni; }
    public static void main(String[] args){
        Teachers zhino = new Teachers();
        zhino.setName("Zhino");
        zhino.setUni("UHD");
        System.out.println(zhino.getName());
        zhino.setName("Zheno");
        System.out.println(zhino.getName());
    }
}