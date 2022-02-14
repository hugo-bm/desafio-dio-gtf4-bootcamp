package com.br.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Desafios extends Conteudos{
    private Set<Questoes> questoes = new LinkedHashSet<>();
    private Set<Questoes> questoesCompletas= new LinkedHashSet<>();

    public Desafios() {
    }

    public Set<Questoes> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(Set<Questoes> questoes) {
        this.questoes = questoes;
    }

    public Set<Questoes> getQuestoesCompletas() {
        return questoesCompletas;
    }

    public void setQuestoesCompletas(Set<Questoes> questoesCompletas) {
        this.questoesCompletas = questoesCompletas;
    }

    public Questoes getQuestaoAtual(){
        return this.questoes.stream().findFirst().get();
    }

    public boolean submeter(String resposta){
        //Validar resposta
            //Sem validação no momento
        //Realizar submissão
        Optional<Questoes> questao = this.questoes.stream().findFirst();
        if(questao.isPresent()){
            this.questoes.remove(questao.get());
            questao.get().setCodigo(resposta);
            this.questoesCompletas.add(questao.get());
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * questoesCompletas.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Desafios)) return false;
        Desafios desafios = (Desafios) o;
        return Objects.equals(getQuestoes(), desafios.getQuestoes()) && Objects.equals(getQuestoesCompletas(), desafios.getQuestoesCompletas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestoes(), getQuestoesCompletas());
    }

    @Override
    public String toString() {
        return "Desafios{" +
                "questoes=" + questoes +
                ", questoesCompletas=" + questoesCompletas +
                ", questaoAtual="+ getQuestaoAtual()+
                '}';
    }
}
