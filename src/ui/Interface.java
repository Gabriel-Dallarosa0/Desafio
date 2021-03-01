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

import manager.EventManager;
import models.PersonModel;
import models.Room;
import views.PersonView;
import views.RoomView;


public class Interface {

	private JFrame frame;
	private JTextField tfNomeSala;
	private JTextField tfLotacaoSala;
	private JTextField tfNomePessoa;
	private JTextField tfSobrenome;
	private JTextField tfConsultarNome;
	private JTextField tfConsultaSala;
	private PersonView personView = new PersonView();
	private JTextField tfCadastroCafe;
	private RoomView roomView = new RoomView();
	
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
				
				
				try {
					int lotacao = Integer.parseInt(tfLotacaoSala.getText());
					roomView.addRoom(tfNomeSala.getText(), lotacao);
					JOptionPane.showMessageDialog(frame, "Sala cadastrada com sucesso!");
				} catch (NullPointerException error) {
					JOptionPane.showMessageDialog(frame, "Sala não cadastrada!");
					
				} catch (NumberFormatException error2) {
					JOptionPane.showMessageDialog(frame, "Sala não cadastrada!");
				}
				
				
				
				
			}
		});
		btnCadastroSala.setBounds(252, 42, 101, 23);
		tabCadastroSala.add(btnCadastroSala);
		

		
		JLayeredPane tabCadastroCafe = new JLayeredPane();
		tabCadastroCafe.setForeground(Color.WHITE);
		tabCadastroCafe.setBackground(Color.WHITE);
		tabbedPane.addTab("Cadastrar Espaços de Café", null, tabCadastroCafe, null);
		
		JLabel lblCadatroCafe = new JLabel("Nome:");
		lblCadatroCafe.setBounds(28, 30, 46, 14);
		tabCadastroCafe.add(lblCadatroCafe);
		
		tfCadastroCafe = new JTextField();
		tfCadastroCafe.setBounds(96, 27, 171, 20);
		tabCadastroCafe.add(tfCadastroCafe);
		tfCadastroCafe.setColumns(10);
		
		JButton btnCadastroCafe = new JButton("Cadastrar");
		btnCadastroCafe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				roomView.addRoom(tfCadastroCafe.getText());
				
				
			}
		});
		btnCadastroCafe.setBounds(323, 26, 89, 23);
		tabCadastroCafe.add(btnCadastroCafe);
		
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
        		
        		personView.addPerson(tfNomePessoa.getText(), tfSobrenome.getText());        				
        				
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
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 66, 449, 238);
		tabConsultaPessoa.add(scrollPane);
		
		JTextPane textPaneConsultaPessoa = new JTextPane();
		scrollPane.setViewportView(textPaneConsultaPessoa);
		
		JButton btnConsultarPessoa = new JButton("Consultar");
		btnConsultarPessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textPaneConsultaPessoa.setText(roomView.getPerson(tfConsultarNome.getText()));
				
				
			}
		});
		btnConsultarPessoa.setBounds(326, 22, 100, 23);
		tabConsultaPessoa.add(btnConsultarPessoa);
		
		

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
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 77, 449, 227);
		paneConsultaSalas.add(scrollPane_1);
		
		JTextPane textPaneConsultaSala = new JTextPane();
		scrollPane_1.setViewportView(textPaneConsultaSala);
		
		JButton btnConsultaSala = new JButton("Consultar");
		btnConsultaSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textPaneConsultaSala.setText(roomView.getRoom(tfConsultaSala.getText()));
				
			}
		});
		btnConsultaSala.setBounds(339, 28, 89, 23);
		paneConsultaSalas.add(btnConsultaSala);
		
		JLayeredPane tabOrganizarPessoas = new JLayeredPane();
		tabbedPane.addTab("Organizar Pessoas", null, tabOrganizarPessoas, null);
		
		JButton btnOrganizar = new JButton("Organizar");
		btnOrganizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventManager eventManager = new EventManager(personView, roomView);
				
			}
		});
		btnOrganizar.setBounds(190, 54, 105, 23);
		tabOrganizarPessoas.add(btnOrganizar);
		
		


	}
}
