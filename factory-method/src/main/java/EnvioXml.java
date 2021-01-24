import email.MalaDireta;
import email.xml.MalaDiretaXml;

import javax.swing.*;

public class EnvioXml {
    
    public static void main(String[] args) {
        MalaDireta malaDireta = new MalaDiretaXml("contatos.xml");
        
        String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail:");
        
        var status = malaDireta.enviarEmail(mensagem);
        
        JOptionPane.showConfirmDialog(null, "E-mails enviados: "+ status);
    }
}
