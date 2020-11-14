package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> listaEmpresas = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1; 
	
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Alura");
		empresa1.setId(chaveSequencial++);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		empresa2.setId(chaveSequencial++);
		
		listaEmpresas.add(empresa1);
		listaEmpresas.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		Banco.listaEmpresas.add(empresa);
	}

	public static List<Empresa> getListaEmpresas() {
		return Banco.listaEmpresas;
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = listaEmpresas.iterator();
		
		while(it.hasNext()) {
			
			Empresa emp = it.next();
			
			if(emp.getId() == id) {			
				it.remove();
			}
		}	
	}

	public Empresa buscaEmpresaPorId(Integer id) {
		
		for (Empresa empresa : listaEmpresas) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}


	public void alteraEmpresa(Empresa empresa) {
		
		removeEmpresa(empresa.getId());
		adiciona(empresa);
	}
}
