/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disciplinas;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Principal {
    Scanner input = new Scanner(System.in);
    private Disciplinas d;
    
    public void inciarDisciplina(){
        System.out.println("Diga o nome da disciplina: ");
        String name = input.next();
        System.out.println("Digite a quantidade de alunos da turma:");
        int alunos = input.nextInt();
        
        d = new Disciplinas(name, alunos);
    }
    
    public void cadastrarNotas(){
        for (int i = 0; i < d.getQtdAlunos(); i++) {
            System.out.println("Digite as notas do aluno "+(i+1)+":");
            for (int j = 0; j < d.getQTDNOTAS(); j++) {
                d.setNota(i, j, input.nextDouble());
            }
        }
    }
    public void mostrarMedia(){
        d.getMedia();
        System.out.println("Media "+d.getNomeDisciplina()+":"+d.getMedia());
    }
}
