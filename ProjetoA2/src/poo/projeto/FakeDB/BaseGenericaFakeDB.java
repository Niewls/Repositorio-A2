package poo.projeto.FakeDB;
import java.util.ArrayList;

public abstract class BaseGenericaFakeDB<Tdom> {
    protected ArrayList<Tdom> lista;

    public ArrayList<Tdom> getLista(){
        if(this.lista == null){
            this.lista = new ArrayList<Tdom>();
        }
        return this.lista;
    }

    protected abstract void CarregarDados();

    public BaseGenericaFakeDB(){
        this.lista = new ArrayList<Tdom>();
        this.CarregarDados();
    }

}
