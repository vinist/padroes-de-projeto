package email.csv;

import email.ifaces.IContato;
import email.base.MalaDireta;

public class MalaDiretaCsv extends MalaDireta {
    
    private final String nomeArquivo;
    
    public MalaDiretaCsv(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
    
    @Override
    protected IContato criarContato() {
        return new ContatosCsv(nomeArquivo);
    }
}
