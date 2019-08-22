package br.sp.senac.projeto_birpo;

public class Produtos {
    private String nome;
    private String codigo;
    private String desc;
    private int imagem;

    public Produtos() {
    }

    public Produtos(String nome, String codigo, String desc, int imagem) {
        this.nome = nome;
        this.codigo = codigo;
        this.desc = desc;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
