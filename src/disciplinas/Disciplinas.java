/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disciplinas;

/**
 *
 * @author Aluno
 */
public class Disciplinas {
    private String nomeDisciplina;
    private int qtdAlunos;
    private final int QTDNOTAS = 3;
    private double[][] notas;

    public Disciplinas(String nomeDisciplina, int qtdAlunos) {
        this.nomeDisciplina = nomeDisciplina;
        this.qtdAlunos = qtdAlunos;
        notas = new double[qtdAlunos][QTDNOTAS];
    }

    public int getQTDNOTAS() {
        return QTDNOTAS;
    }
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public int getQtdAlunos() {
        return qtdAlunos;
    }
    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }
    public double[][] getNotas() {
        return notas;
    }
    public void setNotas(double[][] notas) {
        this.notas = notas;
    }
    
    public void setNota(int i, int j, double valor){
        notas[i][j] = valor;
    }
    
    public double getNota(int i, int j){
        return notas[i][j];
    }
    
    public double getMedia(){
        double media = 0;
        for(double[] i:notas){
            for(double n: i){
                media += n;
            }
        }
        media /= qtdAlunos * QTDNOTAS;
        return media;
    }
}
