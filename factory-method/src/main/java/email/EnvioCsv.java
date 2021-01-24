package email;

import email.base.MalaDireta;
import email.csv.MalaDiretaCsv;

import javax.swing.*;

public class EnvioCsv {
    
    public static void main(String[] args) {
        MalaDireta malaDireta = new MalaDiretaCsv("contatos.csv");
        
        String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail:");
        
        var status = malaDireta.enviarEmail(mensagem);
        
        JOptionPane.showConfirmDialog(null, "E-mails enviados: "+ status);
    }
}
