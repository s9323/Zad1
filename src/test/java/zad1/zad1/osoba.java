package zad1.zad1;

import java.util.Collection;
import java.util.List;


public class osoba{

private int id;

private Collection<Kawiarnia> kawiarnie;
private String name;


private String pesel;

public osoba(String name, String pesel)
{
	this.pesel=pesel;
	this.name=name;
	this.kawiarnie=new ListaKawiarni(this);
}

public osoba(String name) {

	this(name,"");
}

public osoba()
{
	this("","");
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getPesel() {
	return pesel;
}

public void setPesel(String pesel) {
	this.pesel = pesel;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Collection<Kawiarnia> getKawiarnia() {
	return kawiarnie;
}
public void setKawiarnia(List<Kawiarnia> kawiarnie) {
	this.kawiarnie = kawiarnie;
}




}