package main.java.test;

public class CursoNotFoundException extends  RuntimeException{
    CursoNotFoundException(Long id){
        super("No se pudo encontrar el curso "+id);
    }
}
