import poo.projeto.dominio.*;
import poo.projeto.dominio.FakeDB.*;
import poo.projeto.dominio.Aluno;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        AlunoFakeDB n1 = new AlunoFakeDB();
        ArrayList<Aluno> lista = n1.getLista();
        System.out.println("INICIO");
        for(Aluno c1 : lista){
            System.out.println(c1.getCodigo());
        }
    }
}
