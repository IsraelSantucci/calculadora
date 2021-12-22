package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Calculadora {

	private JFrame frame;

	private JPanel panelNumeros;
	private JPanel panelVisor;

	private JTextField txtVisor;
	private JTextField txtResultado;
	private Font fontVisor;
	private Font fontResultado;
	private String sinal = "";
	private String sinalAntigo = "";
	private boolean numeroFoiDigitado = false;
	private boolean operacaoRealizada = false;

	static int LARGURA = 400;
	static int ALTURA = 550;

	public Calculadora() {

		this.configurar();
	}

	private void configurar() {

		this.configurarJanela();

		fontVisor = new Font("Arial", Font.BOLD, (int) (frame.getHeight() * 0.08));
		fontResultado = new Font("Arial", Font.BOLD, (int) (frame.getHeight() * 0.03));
		this.configurarVisor();

		this.configurarPanelNumeros();

		frame.add(panelVisor);
		frame.add(panelNumeros);

		frame.setVisible(true);

	}

	private void configurarJanela() {
		frame = new JFrame();
		frame.setTitle("CALCULADORA");
		frame.setSize(this.LARGURA, this.ALTURA);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
	}

	private void configurarVisor() {
		panelVisor = new JPanel();
		txtResultado = new JTextField("0");
		txtResultado.setBounds(90, 0, frame.getWidth(), 60);
		txtResultado.setEditable(false);
		txtResultado.setFont(fontResultado);
		txtResultado.setForeground(Color.gray);

		txtVisor = new JTextField("");
		txtVisor.setEditable(false);
		txtVisor.setBounds(0, 60, frame.getWidth(), 60);
		txtVisor.setBorder(new LineBorder(Color.GRAY, 1, false));

		txtVisor.setFont(fontVisor);

		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(fontResultado);
		lblResultado.setForeground(Color.gray);
		lblResultado.setBounds(0, 0, 100, 60);

		panelVisor.setLayout(null);
		panelVisor.setBounds(0, 0, this.LARGURA, 120);
		panelVisor.add(lblResultado);
		panelVisor.add(txtResultado);
		panelVisor.add(txtVisor);
	}

	private void configurarPanelNumeros() {
		panelNumeros = new JPanel();
		panelNumeros.setBounds(0, 120, frame.getWidth() - 15, 380);
		panelNumeros.setLayout(new GridLayout(4, 4));

		JButton botao9 = new JButton("9");
		JButton botao8 = new JButton("8");
		JButton botao7 = new JButton("7");
		JButton botao6 = new JButton("6");
		JButton botao5 = new JButton("5");
		JButton botao4 = new JButton("4");
		JButton botao3 = new JButton("3");
		JButton botao2 = new JButton("2");
		JButton botao1 = new JButton("1");
		JButton botaoC = new JButton("C");
		JButton botao0 = new JButton("0");
		JButton botaoIgual = new JButton("=");
		JButton botaoSoma = new JButton("+");
		JButton botaoSubtracao = new JButton("-");
		JButton botaoMultiplicacao = new JButton("*");
		JButton botaoDivisao = new JButton("/");

		botao9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + e.getActionCommand());
				numeroFoiDigitado = true;
				operacaoRealizada = false;

			}
		});

		botao8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + e.getActionCommand());
				numeroFoiDigitado = true;
				operacaoRealizada = false;
			}
		});
		botao7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + e.getActionCommand());
				numeroFoiDigitado = true;
				operacaoRealizada = false;
			}
		});
		botao6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + e.getActionCommand());
				numeroFoiDigitado = true;
				operacaoRealizada = false;
			}
		});

		botao5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + e.getActionCommand());
				numeroFoiDigitado = true;
				operacaoRealizada = false;
			}
		});

		botao4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + e.getActionCommand());
				numeroFoiDigitado = true;
				operacaoRealizada = false;
			}
		});
		botao3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + e.getActionCommand());
				numeroFoiDigitado = true;
				operacaoRealizada = false;
			}
		});
		botao2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + e.getActionCommand());
				numeroFoiDigitado = true;
				operacaoRealizada = false;
			}
		});
		botao1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + e.getActionCommand());
				numeroFoiDigitado = true;
				operacaoRealizada = false;
			}
		});

		botao0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + e.getActionCommand());
				numeroFoiDigitado = true;
				operacaoRealizada = false;
			}
		});

		botaoSoma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (numeroFoiDigitado && !operacaoRealizada && !sinal.isEmpty()) {
					operacao(sinalAntigo);
					sinalAntigo = sinal;
					numeroFoiDigitado = false;
					operacaoRealizada = true;
				}
				if (sinal.isEmpty() && numeroFoiDigitado) {
					txtResultado.setText(txtVisor.getText());
					txtVisor.setText("");
				}
				sinal = e.getActionCommand();
				if (sinalAntigo.equals(sinal)) {

				} else {
					sinalAntigo = sinal;
				}

				System.out.println(sinal);
			}
		});

		botaoSubtracao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (numeroFoiDigitado && !operacaoRealizada && !sinal.isEmpty()) {
					operacao(sinalAntigo);
					sinalAntigo = sinal;
					numeroFoiDigitado = false;
					operacaoRealizada = true;
				}
				if (sinal.isEmpty() && numeroFoiDigitado) {
					txtResultado.setText(txtVisor.getText());
					txtVisor.setText("");
				}
				sinal = e.getActionCommand();
				if (sinalAntigo.equals(sinal)) {

				} else {
					sinalAntigo = sinal;
				}

				System.out.println(sinal);
			}
		});

		botaoMultiplicacao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (numeroFoiDigitado && !operacaoRealizada && !sinal.isEmpty()) {
					operacao(sinalAntigo);
					sinalAntigo = sinal;
					numeroFoiDigitado = false;
					operacaoRealizada = true;
				}
				if (sinal.isEmpty() && numeroFoiDigitado) {
					txtResultado.setText(txtVisor.getText());
					txtVisor.setText("");
				}
				sinal = e.getActionCommand();
				if (sinalAntigo.equals(sinal)) {

				} else {
					sinalAntigo = sinal;
				}

				System.out.println(sinal);
			}
		});

		botaoDivisao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (numeroFoiDigitado && !operacaoRealizada && !sinal.isEmpty()) {
					operacao(sinalAntigo);
					sinalAntigo = sinal;
					numeroFoiDigitado = false;
					operacaoRealizada = true;
				}
				if (sinal.isEmpty() && numeroFoiDigitado) {
					txtResultado.setText(txtVisor.getText());
					txtVisor.setText("");
				}
				sinal = e.getActionCommand();
				if (sinalAntigo.equals(sinal)) {

				} else {
					sinalAntigo = sinal;
				}

				System.out.println(sinal);
			}
		});
		botaoIgual.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (numeroFoiDigitado && !operacaoRealizada && !sinal.isEmpty()) {
					operacao(sinalAntigo);
					sinal = "";
					sinalAntigo = sinal;
					numeroFoiDigitado = false;
					operacaoRealizada = true;
				}
			}
		});

		botaoC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sinal = "";
				sinalAntigo = sinal;
				txtResultado.setText("0");
				txtVisor.setText("");
				numeroFoiDigitado = false;
				operacaoRealizada = true;

			}
		});

		panelNumeros.add(botao9);
		panelNumeros.add(botao8);
		panelNumeros.add(botao7);
		panelNumeros.add(botaoDivisao);
		panelNumeros.add(botao6);
		panelNumeros.add(botao5);
		panelNumeros.add(botao4);
		panelNumeros.add(botaoMultiplicacao);
		panelNumeros.add(botao3);
		panelNumeros.add(botao2);
		panelNumeros.add(botao1);
		panelNumeros.add(botaoSoma);
		panelNumeros.add(botaoC);
		panelNumeros.add(botao0);
		panelNumeros.add(botaoIgual);
		panelNumeros.add(botaoSubtracao);

	}

	private void operacao(String sinal) {
		Double soma;
		switch (sinal) {
		case "+":
			soma = Double.parseDouble(txtResultado.getText().isEmpty() ? "0" : txtResultado.getText())
					+ Double.parseDouble(txtVisor.getText().isEmpty() ? "0" : txtVisor.getText());
			txtVisor.setText("");
			txtResultado.setText(soma.toString());
			break;
		case "-":
			soma = Double.parseDouble(txtResultado.getText().isEmpty() ? "0" : txtResultado.getText())
					- Double.parseDouble(txtVisor.getText().isEmpty() ? "0" : txtVisor.getText());
			txtVisor.setText("");
			txtResultado.setText(soma.toString());
			break;
		case "/":
			soma = (Double.parseDouble(txtResultado.getText().isEmpty() ? "0" : txtResultado.getText()))
					/ (Double.parseDouble(txtVisor.getText().isEmpty() ? "0" : txtVisor.getText()));
			txtVisor.setText("");
			txtResultado.setText(soma.toString());
			break;
		case "*":
			soma = Double.parseDouble(txtResultado.getText().isEmpty() ? "1" : txtResultado.getText())
					* Double.parseDouble(txtVisor.getText().isEmpty() ? "0" : txtVisor.getText());
			txtVisor.setText("");
			txtResultado.setText(soma.toString());
			break;

		}
	}

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
	}

}
