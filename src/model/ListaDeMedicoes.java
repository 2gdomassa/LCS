
package model;
import java.util.ArrayList;
public class ListaDeMedicoes {
 static ArrayList <Lead> listaMedicoes = new ArrayList<>();
 public static void AdicionaNaLista(Lead m){
        listaMedicoes.add(m);
    }
 public static ArrayList <Lead> ImprimeLista(){
     return listaMedicoes;   
    }
    public static void main(String[] args) {

String nomeArquivo="ArquivoExercicio.csv";


ArrayList<Lead> ListaExistente =ArquivoMedicoes.lerArquivo(nomeArquivo);


for(Lead e : ListaExistente){
            
}
}
}
