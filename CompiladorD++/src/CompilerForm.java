import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CompilerForm {
	static CompiladorDPP parser = null;

	public static void main(String[] args) {
		JFrame guiFrame = new JFrame();

		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Compilador D++");
		guiFrame.setSize(300, 600);
		guiFrame.setLocationRelativeTo(null);

		final JPanel inputPanel = new JPanel();
		JLabel inputLbl = new JLabel("Entre com uma expressão: ");
		final JTextField inputText = new JTextField("");
		inputText.setColumns(20);

		inputPanel.add(inputLbl);
		inputPanel.add(inputText);

		final JTextArea outputText = new JTextArea();
		outputText.setColumns(20);
		outputText.setRows(10);

		JPanel mainPanel = new JPanel();
		mainPanel.add(inputPanel);
		mainPanel.add(outputText);

		inputText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String sentence = inputText.getText();
				sentence = "(" + sentence + ")";
				InputStream is = new ByteArrayInputStream(sentence.getBytes());
				if (parser == null)
					parser = new CompiladorDPP(is);
				else
					CompiladorDPP.ReInit(is);
				try {
					switch (CompiladorDPP.Programa()) {
					case 0:
						outputText.setText("expressão analisada ok.");
						break;
					default:
						break;
					}
				} catch (Exception e) {
					outputText.setText("erro na expressão.\n" + e.getMessage());
				} catch (Error e) {
					outputText.setText("erro na expressão.\n" + e.getMessage());
				} finally {

				}
			}
		});

		guiFrame.add(mainPanel, BorderLayout.NORTH);
		guiFrame.add(outputText, BorderLayout.CENTER);
		guiFrame.pack();
		guiFrame.setVisible(true);
	}
}