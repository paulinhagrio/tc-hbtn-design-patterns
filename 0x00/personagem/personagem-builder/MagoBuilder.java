public class MagoBuilder implements Builder{
    String nome;
    TipoPersonagem tipo;
    int inteligencia;
    int forca;
    int vigor;
    int resistencia;
    int destreza;

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

    public Mago build(){
        return new Mago(nome, inteligencia, forca, vigor, resistencia, destreza);

    }
}
