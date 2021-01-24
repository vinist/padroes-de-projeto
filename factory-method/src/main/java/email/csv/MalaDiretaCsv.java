package email.csv;

import email.IContato;
import email.MalaDireta;

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
