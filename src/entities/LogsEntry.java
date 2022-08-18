package entities;

import java.util.Date;
import java.util.Objects;

public class LogsEntry {
    private String nome;
    private Date momento;

    public LogsEntry(String nome, Date momento) {
        this.nome = nome;
        this.momento = momento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogsEntry logsEntry = (LogsEntry) o;
        return Objects.equals(nome, logsEntry.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
