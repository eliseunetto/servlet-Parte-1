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


@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		System.out.println("Alterando dados da Empresa");
		
		Integer id = Integer.valueOf(request.getParameter("id"));
		System.out.println("ID capturado => " + id);
		String nomeEmpresa = request.getParameter("nome");
		String paranDataAbertura = request.getParameter("dataAbertura");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataAbertura = null;
		
		try {
			dataAbertura = sdf.parse(paranDataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
				
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPorId(id);
		
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		response.sendRedirect("listaEmpresas");
		

	}

}
