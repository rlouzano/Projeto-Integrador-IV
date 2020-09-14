package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto  {

    @Id //Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto_increment
    private Integer id;
    private String tamanho;
    private String cor;
    private String manga;
    private String material;
    private String composicao; //100% algodão
    private String tipoTecido;
    private String tipoLavagem;
    private String medidaPeca;


    public Produto() {
    }

    public Produto(Integer id, String tamanho, String cor, String manga, String material, String composicao, String tipoTecido, String tipoLavagem, String medidaPeca) {
        this.id = id;
        this.tamanho = tamanho;
        this.cor = cor;
        this.manga = manga;
        this.material = material;
        this.composicao = composicao;
        this.tipoTecido = tipoTecido;
        this.tipoLavagem = tipoLavagem;
        this.medidaPeca = medidaPeca;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id.equals(produto.id);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public String getTipoTecido() {
        return tipoTecido;
    }

    public void setTipoTecido(String tipoTecido) {
        this.tipoTecido = tipoTecido;
    }

    public String getTipoLavagem() {
        return tipoLavagem;
    }

    public void setTipoLavagem(String tipoLavagem) {
        this.tipoLavagem = tipoLavagem;
    }

    public String getMedidaPeca() {
        return medidaPeca;
    }

    public void setMedidaPeca(String medidaPeca) {
        this.medidaPeca = medidaPeca;
    }
}

