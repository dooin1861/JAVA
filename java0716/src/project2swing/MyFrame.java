package project2swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java0716.MyListener;

public class MyFrame extends JFrame{
	
	JLabel lb1 = new JLabel("아이디");
	JTextField jt1 = new JTextField();
	JLabel lb2 = new JLabel("SSN");
	JTextField jt2 = new JTextField();
	JLabel lb3 = new JLabel("전화번호");
	JTextField jt3 = new JTextField();
	JButton jb1 = new JButton("로그인");
	JButton jb2 = new JButton("회원가입");
	JButton jb3 = new JButton("예금");
	JButton jb4 = new JButton("출금");
	JButton jb5 = new JButton("잔고");
	JTextArea ta1 = new JTextArea();
	List<Member> list;
	Member member;
	
	public MyFrame() {

		try (FileInputStream fis = new FileInputStream("c:\\temp\\members.dat");
	             ObjectInputStream ois = new ObjectInputStream(fis)) {
			Member[] list2 = (Member[]) ois.readObject();
			list = new ArrayList<>(Arrays.asList(list2));   // 배열을 ArrayList로
			System.out.println("파일에서 객체를 가져왔습니다.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (Member member : list) {
			System.out.println(member);
		}
		System.out.println("총회원수:"+list.size());
	
		Container con = this.getContentPane();
		con.setLayout(null);
		
		con.add(lb1);
		lb1.setLocation(30, 50);
		lb1.setSize(100, 30);
		
		con.add(jt1);
		jt1.setLocation(80, 50);
		jt1.setSize(100, 30);

		con.add(lb2);
		lb2.setLocation(200, 50);
		lb2.setSize(100, 30);
		
		con.add(jt2);
		jt2.setLocation(250, 50);
		jt2.setSize(100, 30);
		
		con.add(lb3);
		lb3.setLocation(370, 50);
		lb3.setSize(100, 30);
		
		con.add(jt3);
		jt3.setLocation(430, 50);
		jt3.setSize(100, 30);
		
		con.add(ta1);
		ta1.setLocation(20, 120);
		ta1.setSize(830, 200);
		
		con.add(jb1);
		jb1.setLocation(50, 350);
		jb1.setSize(100, 30);
		jb1.addActionListener(new MyListener());
		
		con.add(jb2);
		jb2.setLocation(200, 350);
		jb2.setSize(100, 30);
		
		con.add(jb3);
		jb3.setLocation(350, 350);
		jb3.setSize(100, 30);
		
		con.add(jb4);
		jb4.setLocation(500, 350);
		jb4.setSize(100, 30);
		
		con.add(jb5);
		jb5.setLocation(650, 350);
		jb5.setSize(100, 30);
		
		this.setTitle("안녕 스윙");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(900, 500);
		this.setLocation(700, 300);
		this.setVisible(true);       // 순서가 바뀌어도 문제없음
		
		class MyListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
	
				String name = jt1.getText();
				String strPassword = jt2.getText();
			
				for (Member member2 : list) {
					if (member2.getName().equals(name) && member2.getSsn().equals(strPassword)) {
						member = member2;
						System.out.println("로그인 성공!!");
						break;
					}
				}
				System.out.println(member);
			} 
		}	
	}
}
	
