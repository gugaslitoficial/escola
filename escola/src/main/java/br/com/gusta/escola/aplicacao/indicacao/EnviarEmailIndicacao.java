package br.com.gusta.escola.aplicacao.indicacao;

import br.com.gusta.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
