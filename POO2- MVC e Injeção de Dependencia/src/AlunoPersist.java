
public class AlunoPersist {

	private IAlunoPersist persist;
	
	public AlunoPersist(IAlunoPersist persist) {
		this.persist = persist;
	}
	
	public void gravar(Aluno alu) {
		persist.gravar(alu);
	}
	

}
