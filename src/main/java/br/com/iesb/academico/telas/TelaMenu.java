package br.com.iesb.academico.telas;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaMenu extends JFrame {

	private JMenuBar menuBar;
	
	private TelaCurso telaCurso = new TelaCurso();
	private TelaDisciplina telaDisciplina = new TelaDisciplina();
	private TelaProfessor telaProfessor = new TelaProfessor();
	private TelaAluno telaAluno = new TelaAluno();

	public TelaMenu() {

		setTitle("Menu do Sistema Acadêmico");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setExtendedState(JFrame.EXIT_ON_CLOSE);
		
		// Cria uma barra de menu para o JFrame
        menuBar = new JMenuBar();
        // Adiciona a barra de menu ao  frame
        setJMenuBar(menuBar);

        // Define e adiciona dois menus drop down na barra de menus
        JMenu cadastroMenu = new JMenu("Cadastros");
        menuBar.add(cadastroMenu);

        // Cria e adiciona um item simples para o menu
        JMenuItem acaoCurso = new JMenuItem("Cursos");
        acaoCurso.addActionListener(event -> {
        	this.telaCurso.exibir();
        });
        JMenuItem acaoDisciplinas = new JMenuItem("Disciplinas");
        acaoDisciplinas.addActionListener(event -> {
        	this.telaDisciplina.exibir();
        });
        cadastroMenu.add(acaoCurso);
        cadastroMenu.add(acaoDisciplinas);
        cadastroMenu.addSeparator();

        JMenuItem acaoProfessores = new JMenuItem("Professores");
        acaoProfessores.addActionListener(event -> {
        	this.telaProfessor.exibir();
        });
        cadastroMenu.add(acaoProfessores);
        cadastroMenu.addSeparator();
        
        JMenuItem acaoAlunos = new JMenuItem("Alunos");
        acaoAlunos.addActionListener(event -> {
        	this.telaAluno.exibir();
        });
        cadastroMenu.add(acaoAlunos);
        
        JMenu sairMenu = new JMenu("Opções");
        
        JMenuItem acaoSair = new JMenuItem("Sair");
        acaoSair.addActionListener(event -> {
        	System.exit(0);
        });
        menuBar.add(sairMenu);
        sairMenu.add(acaoSair);

	}

	public void exibir() {
		setVisible(true);
	}

}
