package uff.ic.biblioteca.model;
// Generated Oct 3, 2013 6:26:57 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Operacao generated by hbm2java
 */
public class Operacao implements java.io.Serializable {

    private long numero;
    private Usuario usuario;
    private Date data;
    private Set devolucaos = new HashSet(0);
    private Set reservas = new HashSet(0);
    private Set emprestimos = new HashSet(0);

    public Operacao() {
    }

    public Operacao(long numero, Usuario usuario, Date data) {
        this.numero = numero;
        this.usuario = usuario;
        this.data = data;
    }

    public Operacao(long numero, Usuario usuario, Date data, Set devolucaos, Set reservas, Set emprestimos) {
        this.numero = numero;
        this.usuario = usuario;
        this.data = data;
        this.devolucaos = devolucaos;
        this.reservas = reservas;
        this.emprestimos = emprestimos;
    }

    public long getNumero() {
        return this.numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Set getDevolucaos() {
        return this.devolucaos;
    }

    public void setDevolucaos(Set devolucaos) {
        this.devolucaos = devolucaos;
    }

    public Set getReservas() {
        return this.reservas;
    }

    public void setReservas(Set reservas) {
        this.reservas = reservas;
    }

    public Set getEmprestimos() {
        return this.emprestimos;
    }

    public void setEmprestimos(Set emprestimos) {
        this.emprestimos = emprestimos;
    }
}