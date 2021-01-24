package email.xml;

import com.thoughtworks.xstream.XStream;
import email.model.Contato;
import email.ifaces.IContato;

import java.net.URL;
import java.util.List;

public class ContatosXml implements IContato {
    
    private final String nomeArquivo;
    
    public ContatosXml(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
    @Override
    public List<Contato> todos() {
        XStream xstream = new XStream();
        xstream.alias("contatos", List.class);
        xstream.alias("contato", Contato.class);
    
        URL arquivo = this.getClass().getResource("/" + nomeArquivo);
        return (List<Contato>) xstream.fromXML(arquivo);
    }
}
