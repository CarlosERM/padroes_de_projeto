
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Formulario
	extends JFrame
	implements ActionListener {

	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel nome;
	private JTextField tnome;
	private JLabel idade;
	private JTextField tIdade;
	private JLabel disc;
	private JComboBox tDisc;
    private JButton sub;
    private JButton reset;
	private JLabel res;
    private JTextArea resadd;
	private JTextArea tout;

	Secretaria secretaria = new Secretaria();

	private String[] disciplinas = {
        "Matemática",
        "Português",
        "Inglês",
        "Geografia",
        "História",
    };
	public Formulario()
	{
		setTitle("Matrícula de Disciplinas");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Formulário de Matrícula");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(400, 30);
		title.setLocation(300, 30);
		c.add(title);

		nome = new JLabel("Nome");
		nome.setFont(new Font("Arial", Font.PLAIN, 20));
		nome.setSize(100, 20);
		nome.setLocation(100, 100);
		c.add(nome);

		tnome = new JTextField();
		tnome.setFont(new Font("Arial", Font.PLAIN, 15));
		tnome.setSize(150, 20);
		tnome.setLocation(200, 100);
		c.add(tnome);

		idade = new JLabel("Idade");
		idade.setFont(new Font("Arial", Font.PLAIN, 20));
		idade.setSize(100, 20);
		idade.setLocation(100, 150);
		c.add(idade);

		tIdade = new JTextField();
		tIdade.setFont(new Font("Arial", Font.PLAIN, 15));
		tIdade.setSize(150, 20);
		tIdade.setLocation(200, 150);
		c.add(tIdade);

		disc = new JLabel("Disciplinas");
		disc.setFont(new Font("Arial", Font.PLAIN, 20));
		disc.setSize(100, 20);
		disc.setLocation(100, 200);
		c.add(disc);

		tDisc = new JComboBox(disciplinas);
		tDisc.setFont(new Font("Arial", Font.PLAIN, 15));
		tDisc.setSize(150, 20);
		tDisc.setLocation(200, 200);
		c.add(tDisc);

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 250);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 250);
		reset.addActionListener(this);
		c.add(reset);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		c.add(resadd);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sub) {
			String nome = tnome.getText();
			String idade = tIdade.getText();
			String disciplina = (String) tDisc.getSelectedItem();
            Disciplina disciplina_atualizada = secretaria.executarMatriculaAluno(
                nome, 
                Integer.parseInt(idade), 
                disciplina
            );

			tout.setText(disciplina_atualizada.toString());
			tout.setEditable(false);
			res.setText("Registro realizado com sucesso!");
		}
		else if (e.getSource() == reset) {
			String def = "";
			tnome.setText(def);
			tIdade.setText(def);
			tDisc.setSelectedIndex(0);
			resadd.setText(def);
		}
	}
}