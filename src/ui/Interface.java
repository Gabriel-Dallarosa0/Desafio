package ui;



import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import java.text.ParseException;
import javax.swing.JSeparator;
import javax.swing.JTextPane;


public class Interface {

	private JFrame frame;
	private JTextField tfNomeSala;
	private JTextField tfLotacaoSala;
	private JTextField tfNomePessoa;
	private JTextField tfSobrenome;
	private JTextField tfConsultarNome;
	private JTextField tfConsultaSala;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("\r\n");
		frame.setBounds(100, 100, 536, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(0, 0, 0));
		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setBounds(21, 11, 474, 359);
		frame.getContentPane().add(tabbedPane);
		
		JLayeredPane tabCadastroSala = new JLayeredPane();
		tabCadastroSala.setForeground(new Color(255, 255, 255));
		tabCadastroSala.setBackground(Color.WHITE);
		tabbedPane.addTab("Cadastrar Salas", null, tabCadastroSala, null);
		tabbedPane.setForegroundAt(0, Color.BLACK);
		tabbedPane.setBackgroundAt(0, Color.WHITE);
		
		JLabel lblNomeSala = new JLabel("Nome:");
		lblNomeSala.setBounds(21, 25, 46, 14);
		tabCadastroSala.add(lblNomeSala);
		
		tfNomeSala = new JTextField();
		tfNomeSala.setBounds(78, 22, 145, 20);
		tabCadastroSala.add(tfNomeSala);
		tfNomeSala.setColumns(10);
		
		JLabel lblLotacaoSala = new JLabel("Lota\u00E7\u00E3o: ");
		lblLotacaoSala.setBounds(21, 89, 60, 14);
		tabCadastroSala.add(lblLotacaoSala);
		
		tfLotacaoSala = new JTextField();
		tfLotacaoSala.setBounds(101, 86, 122, 20);
		tabCadastroSala.add(tfLotacaoSala);
		tfLotacaoSala.setColumns(10);
		
		JButton btnCadastroSala = new JButton("Cadastrar");
		btnCadastroSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastroSala.setBounds(252, 42, 101, 23);
		tabCadastroSala.add(btnCadastroSala);
		

		
		JLayeredPane tabCadastroCafe = new JLayeredPane();
		tabCadastroCafe.setForeground(Color.WHITE);
		tabCadastroCafe.setBackground(Color.WHITE);
		tabbedPane.addTab("Cadastrar Espaços de Café", null, tabCadastroCafe, null);
		
        JLayeredPane tabCadastroPessoa = new JLayeredPane();
        tabbedPane.addTab("Cadastrar Pessoas", null, tabCadastroPessoa, null);
        tabCadastroPessoa.setForeground(Color.WHITE);
        tabCadastroPessoa.setBackground(Color.WHITE);
        
        JLabel lblNomePessoa = new JLabel("Nome:");
        lblNomePessoa.setBounds(20, 11, 46, 14);
        tabCadastroPessoa.add(lblNomePessoa);
        
        tfNomePessoa = new JTextField();
        tfNomePessoa.setBounds(91, 8, 176, 20);
        tabCadastroPessoa.add(tfNomePessoa);
        tfNomePessoa.setColumns(10);
        
        JLabel lblSobrenome = new JLabel("Sobrenome:");
        lblSobrenome.setBounds(20, 68, 96, 14);
        tabCadastroPessoa.add(lblSobrenome);
        
        tfSobrenome = new JTextField();
        tfSobrenome.setBounds(102, 65, 165, 20);
        tabCadastroPessoa.add(tfSobrenome);
        tfSobrenome.setColumns(10);
        
        JButton btnCadastroPessoa = new JButton("Cadastrar");
        btnCadastroPessoa.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnCadastroPessoa.setBounds(288, 31, 101, 23);
        tabCadastroPessoa.add(btnCadastroPessoa);
		
		JLayeredPane tabConsultaPessoa = new JLayeredPane();
		tabConsultaPessoa.setForeground(Color.WHITE);
		tabConsultaPessoa.setBackground(Color.WHITE);
		tabbedPane.addTab("Consultar Pessoas", null, tabConsultaPessoa, null);
		
		JLabel lblConsultarPessoa = new JLabel("Digite o Nome:");
		lblConsultarPessoa.setBounds(10, 26, 100, 14);
		tabConsultaPessoa.add(lblConsultarPessoa);
		
		tfConsultarNome = new JTextField();
		tfConsultarNome.setBounds(120, 23, 160, 20);
		tabConsultaPessoa.add(tfConsultarNome);
		tfConsultarNome.setColumns(10);
		
		JButton btnConsultarPessoa = new JButton("Consultar");
		btnConsultarPessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultarPessoa.setBounds(326, 22, 100, 23);
		tabConsultaPessoa.add(btnConsultarPessoa);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 66, 449, 238);
		tabConsultaPessoa.add(scrollPane);
		
		JTextPane textPaneConsultaPessoa = new JTextPane();
		scrollPane.setViewportView(textPaneConsultaPessoa);

		JLayeredPane paneConsultaSalas = new JLayeredPane();
		paneConsultaSalas.setForeground(new Color(255, 255, 255));
		tabbedPane.addTab("Consultar Salas", null, paneConsultaSalas, null);
		
		JLabel lblConsultaSala = new JLabel("Digite o Nome:");
		lblConsultaSala.setBounds(10, 32, 84, 14);
		paneConsultaSalas.add(lblConsultaSala);
		
		tfConsultaSala = new JTextField();
		tfConsultaSala.setBounds(122, 29, 167, 20);
		paneConsultaSalas.add(tfConsultaSala);
		tfConsultaSala.setColumns(10);
		
		JButton btnConsultaSala = new JButton("Consultar");
		btnConsultaSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultaSala.setBounds(339, 28, 89, 23);
		paneConsultaSalas.add(btnConsultaSala);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 77, 449, 227);
		paneConsultaSalas.add(scrollPane_1);
		
		JTextPane textPaneConsultaSala = new JTextPane();
		scrollPane_1.setViewportView(textPaneConsultaSala);


	}
}
