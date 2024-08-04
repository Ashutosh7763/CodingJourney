public class RemoveSpace {
    public static void main(String[] args) {
        String nm="  Ashutosh Kumar Prasad ";
        nm=nm.replaceAll("\\s","");
        System.out.println(nm);
    }
}
