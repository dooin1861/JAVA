package project2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	
	JLabel la1 = new JLabel("아이디");
	JLabel la2 = new JLabel("SSN");
	JLabel la3 = new JLabel("전화번호");
	
	JTextField tf1 = new JTextField(5);
	JTextField tf2 = new JTextField(5);
	JTextField tf3 = new JTextField(9);
	
	JTextArea ta1 = new JTextArea(50, 50);
	
	JButton jb1 = new JButton("로그인");
	JButton jb2 = new JButton("회원가입");
	JButton jb3 = new JButton("예금");
	JButton jb4 = new JButton("출금");
	JButton jb5 = new JButton("잔고");
	
	MyFrame() {
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add(jp1, BorderLayout.NORTH);
		jp1.setLayout(new FlowLayout());
		jp1.add(la1); jp1.add(tf1);
		jp1.add(la2); jp1.add(tf2);
		jp1.add(la3); jp1.add(tf3);
		
		jp2.setLayout(new FlowLayout());
		con.add(jp2, BorderLayout.CENTER);
		jp2.add(ta1);
		
		jp3.setLayout(new FlowLayout());
		con.add(jp3, BorderLayout.SOUTH);
		jp3.add(jb1); jp3.add(jb2); jp3.add(jb3); jp3.add(jb4); jp3.add(jb5);
		
		ta1.setLineWrap(true);       // 텍스트가 영역을 넘어가면 자동 줄 바꿈
		ta1.setWrapStyleWord(true);  // 단어 단위로 줄 바꿈
	
		this.setTitle("ABCD");
		this.setVisible(true);
		this.setBounds(1200, 200, 700, 400);  // setLocation, setSize를 합친 것
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addWindowListener(new JFrameWindowClosingEventHandler());
	}
	
	class JFrameWindowClosingEventHandler extends WindowAdapter {
		
		@Override
		public void windowClosing(WindowEvent e) {
			// 파일 저장 위치
			
			JFrame frame = (JFrame)e.getWindow();
			frame.dispose();
			System.out.println("windowClosing()");
		}
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
