package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarafa {
	
	//atributo
	
	private List<Tarefa> tarefaList;

	public ListaTarafa() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<Tarefa>();
		
		for(Tarefa t : tarefaList ) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaTarafa listaTarefa = new ListaTarafa();
		
		
		listaTarefa.adicionarTarefa( "Tarafa 1");
		System.out.println("O numero total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());
		
		
	}

}
