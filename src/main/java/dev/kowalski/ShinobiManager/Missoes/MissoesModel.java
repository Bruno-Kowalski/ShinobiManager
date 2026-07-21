package dev.kowalski.ShinobiManager.Missoes;

import dev.kowalski.ShinobiManager.Ninjas.NinjaModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_missoes")

public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    private String descricao;

    // MANY TO ONE = UMA MISSÃO PODE TER VÁRIOS NINJAS || 1:N UM PARA MUITOS

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(Long id, String nome, String dificuldade, String descricao, NinjaModel ninja) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.descricao = descricao;
        this.ninjas = ninjas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeMissao() {
        return nome;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nome = nomeMissao;
    }

    public String getDificuldadeMissao() {
        return dificuldade;
    }

    public void setDificuldadeMissao(String dificuldadeMissao) {
        this.dificuldade = dificuldadeMissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<NinjaModel> getNinjas() {
        return ninjas;
    }

    public void setNinjas(List<NinjaModel> ninjas) {
        this.ninjas = ninjas;
    }
}
