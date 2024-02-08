import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Contato {

    private static int contador = 0;

    private int id;
    private String nome;
    private String telefone;
    private String email;

    public Contato(){
        contador++;
        id = contador;
    }
}
