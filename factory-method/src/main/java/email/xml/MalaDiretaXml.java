package email.xml;

import email.ifaces.IContato;
import email.base.MalaDireta;

public class MalaDiretaXml extends MalaDireta {
    
    private final String nomeArquivo;
    
    public MalaDiretaXml(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
    @Override
    protected IContato criarContato() {
        return new ContatosXml(nomeArquivo);
    }
}
