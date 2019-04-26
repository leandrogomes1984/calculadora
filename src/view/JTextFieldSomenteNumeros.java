package view;

import javax.swing.JTextField;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public final class JTextFieldSomenteNumeros extends JTextField{
	private int maximoCaracteres=-1;	// definição de -1
	
	public JTextFieldSomenteNumeros(){
		super();
		addKeyListener(new java.awt.event.KeyAdapter(){
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt){
				jTextFieldKeyTyped(evt);}});
	}
	
	public JTextFieldSomenteNumeros(int maximo){
		super();
		setMaximoCaracteres(maximo);	// define o tamanho máximo
		addKeyListener(new java.awt.event.KeyAdapter(){
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt){
				jTextFieldKeyTyped(evt);}});
	}
	
	private void jTextFieldKeyTyped(KeyEvent evt){
		String caracteres="0987654321.";
		if(!caracteres.contains(evt.getKeyChar()+"")){
			evt.consume();
		}
		if((getText().length()>=getMaximoCaracteres())&&(getMaximoCaracteres()!=-1)){
			evt.consume();
			setText(getText().substring(0,getMaximoCaracteres()));
		}
	}
	
	public int getMaximoCaracteres(){
		return maximoCaracteres;
	}
	
	public void setMaximoCaracteres(int maximoCaracteres){
		this.maximoCaracteres = maximoCaracteres;
	}
	
}