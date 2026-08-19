package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomedaMissao;
    private String dificuldade;

    // OneToMany uma missão pode ter vario ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

    public MissoesModel(){

    }

    public MissoesModel(String nomedaMissao, String dificuldade, NinjaModel ninja) {
        this.nomedaMissao = nomedaMissao;
        this.dificuldade = dificuldade;
        this.ninja = ninja;
    }

    public String getNomedaMissao() {
        return nomedaMissao;
    }

    public void setNomedaMissao(String nomedaMissao) {
        this.nomedaMissao = nomedaMissao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public NinjaModel getNinja() {
        return ninja;
    }

    public void setNinja(NinjaModel ninja) {
        this.ninja = ninja;
    }
}
