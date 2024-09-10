package MinhaTarefa;
import java.lang.annotation.Annotation;
@Tabela(cpf = { "09" }, nome = { "Ricardo" }, numeroDeChamada = 3, value = "Tabela")
public class MainApp {
	public static void main(String[] args) {
		Class<?> classe = MainApp.class;
		Tabela anotacao = classe.getAnnotation(Tabela.class);
		
		if(classe.isAnnotationPresent(Tabela.class)) {
			String tabela = anotacao.value();
					System.out.println("Nome da Tabela: " + tabela);
		}
	
	

}
}
