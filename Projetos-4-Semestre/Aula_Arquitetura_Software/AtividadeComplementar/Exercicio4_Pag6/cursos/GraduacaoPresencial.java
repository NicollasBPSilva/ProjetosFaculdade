package cursos;

public class GraduacaoPresencial implements EscolhaCurso {

	@Override
	public String diplomaRequerido() {
		
		return "Ensino Médio";
	}

}