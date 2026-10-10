@entity
@Table("categotias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;

    private String descricao;
    
}