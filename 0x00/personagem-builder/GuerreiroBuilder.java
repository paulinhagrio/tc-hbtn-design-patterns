public class GuerreiroBuilder implements Builder{
    private String nome;

    private TipoPersonagem tipo;
    private int inteligencia;
    private int forca;
    private int vigor;
    private int resistencia;
    private int destreza;


    @Override
    public void setNome(String nome) {

    }

    @Override
    public void setTipo(TipoPersonagem tipo) {

    }

    @Override
    public void setForca(int forca) {

    }

    @Override
    public void setInteligencia(int inteligencia) {

    }

    @Override
    public void setVigor(int vigor) {

    }

    @Override
    public void setResistencia(int resistencia) {

    }

    @Override
    public void setDestreza(int destreza) {

    }

    public Guerreiro build(){
        return new Guerreiro(nome, inteligencia, forca, vigor, resistencia, destreza);
    }
}
