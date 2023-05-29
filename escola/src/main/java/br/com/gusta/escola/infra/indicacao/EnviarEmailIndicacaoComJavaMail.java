package br.com.gusta.escola.infra.indicacao;

import br.com.gusta.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.gusta.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
