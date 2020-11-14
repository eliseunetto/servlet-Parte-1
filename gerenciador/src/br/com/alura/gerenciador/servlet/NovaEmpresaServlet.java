package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		System.out.println("Cadastrando Nova Empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		String paranDataAbertura = request.getParameter("dataAbertura");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataAbertura = null;
		
		try {
			dataAbertura = sdf.parse(paranDataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
	
		request.setAttribute("empresa", empresa.getNome());
		
		response.sendRedirect("listaEmpresas");
		// Chamada JSP
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		rd.forward(request, response);
	}

}
