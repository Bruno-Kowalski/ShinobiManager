package dev.kowalski.ShinobiManager.Missoes;

import dev.kowalski.ShinobiManager.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor

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

}
