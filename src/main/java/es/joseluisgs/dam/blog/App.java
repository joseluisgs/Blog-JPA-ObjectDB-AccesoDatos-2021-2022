package es.joseluisgs.dam.blog;

import es.joseluisgs.dam.blog.utils.ApplicationProperties;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        ApplicationProperties properties = new ApplicationProperties();
        System.out.println("Bienvenid@s a " +
                properties.readProperty("app.title") + " "
                + properties.readProperty("app.version") + " de " +
                properties.readProperty("app.curso"));

        Blog blog = Blog.getInstance();

        if (properties.readProperty("database.init").equals("true"))
            blog.initDataBase();

        // Categorías
        blog.Categories();

        // Usuarios
        blog.Users();

        // Login
        blog.Login();

        // Posts
        blog.Posts();

        // Comments
        blog.Comments();
    }
}
