import java.util.ArrayList;

public class Zajecia {
    
    private ArrayList<String> studenci = new ArrayList<String>();

    public void zapiszStudenta(String idStudenta){
        if(studenci.size() < 10){
            studenci.add(idStudenta);
            System.out.println("Zapisani studenci: "+ studenci);
        }
        else{
            System.out.println("Nie mozesz zapisac wiecej studentow");
        }
        
    }
}
