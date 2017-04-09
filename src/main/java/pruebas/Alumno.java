package pruebas;

import java.util.*;

public class Alumno {
	
	private long code;
	private String first_name;
	private String last_name;
	private String github_user;
	private ArrayList<Materia> assignments;
	
	public Alumno(long code, String nombre, String apellido, String gitUser) {
        this.code = code;
        this.first_name = nombre;
        this.last_name = apellido;
        this.github_user = gitUser;
    }

	public long getCode() {
		return code;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getGithub_user() {
		return github_user;
	}

	public ArrayList<Materia> getAssignments() {
		return assignments;
	}
}
