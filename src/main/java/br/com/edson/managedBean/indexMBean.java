package br.com.edson.managedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.edson.Model.Produto;

@ManagedBean
@ViewScoped
public class indexMBean implements Serializable{
	
	private Produto produto = new Produto();
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public void inserir() {
		this.produtos.add(produto);
		this.produto = new Produto();
		FacesMessage fm = new FacesMessage("Salvo com sucesso!!");
		fm.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage(null, fm);
	}
	
	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
