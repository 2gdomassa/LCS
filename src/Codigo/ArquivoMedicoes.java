package Codigo;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArquivoMedicoes {

    public static boolean arquivoExiste(String nomeArquivo) {
        File arquivo = new File(nomeArquivo);
        return arquivo.exists();
    
    }
    private static void criarCabecalho(String nomeArquivo) {
    try (PrintWriter escritor = new PrintWriter(new FileWriter(nomeArquivo, true))) {
        escritor.println("Data do Contato;Nome;Telefone;Pressao Diastolica;Estresse");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    public static ArrayList<Lead> lerArquivo(String nomeArquivo) {
          ArrayList<Lead> listaMExistentes = new ArrayList<>();
    if (!ArquivoMedicoes.arquivoExiste(nomeArquivo)){
        ArquivoMedicoes.criarCabecalho(nomeArquivo);
    }
    try {
        BufferedReader leitorDeArquivo = new BufferedReader(new FileReader(nomeArquivo));
        String linha;


        if ((linha = leitorDeArquivo.readLine()) == null) {
         
            criarCabecalho(nomeArquivo);
            return listaMExistentes;
        }

        do {
            String[] partes = linha.split(";");
            if (partes.length == 5) {
                String date = partes[0];
                String time = partes[1];
                String pressSi = partes[2];
                String pressDia = partes[3];
                String estress = partes[4];
                listaMExistentes.add(new Lead(date, time, pressSi, pressDia, estress));
            }
        } while ((linha = leitorDeArquivo.readLine()) != null);

    } catch (IOException io) {
        io.printStackTrace();
    }

    return listaMExistentes;
    }

public static void adicionarAoArquivo(String nomeDoArquivo, String novaLinha) {
    try (PrintWriter escritor = new PrintWriter(new FileWriter(nomeDoArquivo, true))) {
         
            
         
        escritor.println(novaLinha);
        
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public static void atualizarTabela(String nomeDoArquivo, JTable tabela) {
        ArrayList<Lead> listaMedicoes = lerArquivo(nomeDoArquivo);

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        for (Lead m : listaMedicoes) {     
            modelo.addRow(new String[]{
                m.getData(),
                m.getNome(),
                m.getOferta(),
                m.getOrigem(),
                m.getTelefone()
            });
        }
    }
}