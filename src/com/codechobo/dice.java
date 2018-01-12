package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dice")
public class dice extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//�ֻ���(�̹���) ���� �����ϰ� ���
		resp.setContentType("text/HTML");
		PrintWriter out = resp.getWriter();		
		
		for(int i=1; i<=6; i++){
			out.println("<img src='img/dice"+ i +".jpg'>");	
			//"<img src='img/dice1.jpg'>" / " "�ȿ� �ִ� �κ� ��� String���� ����! (" "+i+" ")�̷�����!
		}
			
		int cardNum = (int)(Math.random()*6+1);
		
		out.println("<img src='img/dice"+ cardNum +".jpg'>");
		
//		//�迭�̴ϱ� �迭���� ����ϸ� �ּҰ��� ����.
		//�� �Ʒ� ���� �ڵ�
//		String[] cardImg = {"<img src='img/dice1.jpg'>", "<img src='img/dice2.jpg'>", "<img src='img/dice3.jpg'>",
//							"<img src='img/dice4.jpg'>", "<img src='img/dice5.jpg'>", "<img src='img/dice6.jpg'>"};
//		
//		for(int i=0; i<cardImg.length; i++){
//			out.println(cardImg[i]);
//		}
//		
//		int shuffle = (int)(Math.random()*6);
//		
//		out.println(cardImg[shuffle]);
		
//		out.println(cardImg[0]);	//cardImg[0]��° ���		
	}
}
