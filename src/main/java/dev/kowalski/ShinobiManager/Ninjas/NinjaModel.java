package dev.kowalski.ShinobiManager.Ninjas;

import dev.kowalski.ShinobiManager.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // @MANY TO ONE = UM NINJA TEM UMA ÚNICA MISSÃO || N:1

    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreng key ou Chave estrangeira
    private MissoesModel missoes;

}