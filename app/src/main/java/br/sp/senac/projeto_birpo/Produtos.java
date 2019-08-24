package br.sp.senac.projeto_birpo;

public class Produtos {
    private String nProduto;
    private String dProduto;
    private int bProduto;
    private int imgProduto;

    public Produtos() {
    }

    public Produtos(String nProduto, String dProduto, int bProduto, int imgProduto) {
        this.nProduto = nProduto;
        this.dProduto = dProduto;
        this.bProduto = bProduto;
        this.imgProduto = imgProduto;
    }

    public String getnProduto() {
        return nProduto;
    }

    public String getdProduto() {
        return dProduto;
    }

    public int getbProduto() {
        return bProduto;
    }

    public int getImgProduto() {
        return imgProduto;
    }

    public void setnProduto(String nProduto) {
        this.nProduto = nProduto;
    }

    public void setdProduto(String dProduto) {
        this.dProduto = dProduto;
    }

    public void setbProduto(int bProduto) {
        this.bProduto = bProduto;
    }

    public void setImgProduto(int imgProduto) {
        this.imgProduto = imgProduto;
    }
}
