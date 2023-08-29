package JoseHenriqueADO1;

public class Animal {
    private String nome;
    private String caracteristica1;
    private String caracteristica2;

    public Animal(){
    }

    public Animal (String nome, String caracteristica1, String caracteristica2) {

        this.nome = nome;
        this.caracteristica1 = caracteristica1;
        this.caracteristica2 = caracteristica2;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaracteristica1() {
        return caracteristica1;
    }

    public void setCaracteristica1(String caracteristica1) {
        this.caracteristica1 = caracteristica1;
    }

    public String getCaracteristica2() {
        return caracteristica2;
    }

    public void setCaracteristica2(String caracteristica2) {
        this.caracteristica2 = caracteristica2;
    }

    public void habilidade() {
        System.out.println("a" + nome + "é especialista em subir em árvores");
    }

    public void alimento() {
        System.out.println("a" + nome + "se alimenta de pequenos e médios vertebrados");
    }
}
