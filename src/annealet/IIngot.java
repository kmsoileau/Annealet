package annealet;

public interface IIngot 
{
	void duplicate(IIngot o) throws Exception;
	double evaluate();
	void mutate();
	void show();
	@Override
	String toString();
}
