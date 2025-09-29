package database;

import java.util.ArrayList;
import modulos.Pelicula;

public class Peliculas {

    public static ArrayList<Pelicula> peliculas = new ArrayList<>();

    static {
        // Agregamos películas y series con descripciones correctas y sin año
        peliculas.add(new Pelicula(
            1,
            "La buena mala madre",
            "Una madre granjera cría sola a su hijo para convertirlo en fiscal. Tras un accidente, él pierde la memoria y vuelve a ser como un niño, lo que les da la oportunidad de reconstruir su relación.",
            "assets/imagenes/buenaMala-madre.jpg"
        ));

        peliculas.add(new Pelicula(
            2,
            "Alice In Borderland",
            "Un joven obsesionado con los videojuegos es transportado junto a sus amigos a un Tokio alternativo, donde deben competir en juegos mortales para sobrevivir.",
            "assets/imagenes/alice.jpeg"
        ));

        peliculas.add(new Pelicula(
            3,
            "Bailarina",
            "Una exguardaespaldas emprende una brutal venganza después de que su mejor amiga, una bailarina, muere en circunstancias misteriosas.",
            "assets/imagenes/bailarina.jpeg"
        ));

        peliculas.add(new Pelicula(
            4,
            "Bon Appetit, Majestad",
            "Una comedia romántica en la que la cocinera de un príncipe lo conquista a través de sus platillos y ocurrencias divertidas.",
            "assets/imagenes/Bon_Appetit.jpg"
        ));

        peliculas.add(new Pelicula(
            5,
            "Hasta que el cielo nos reuna",
            "Una conmovedora historia de amor entre dos jóvenes que, a pesar de la enfermedad y los obstáculos, luchan por permanecer juntos.",
            "assets/imagenes/hastaqueelcielo.jpg"
        ));

        peliculas.add(new Pelicula(
            6,
            "King The Land",
            "Un heredero de un conglomerado y una empleada de hotel se enfrentan constantemente, hasta que poco a poco descubren sentimientos más profundos.",
            "assets/imagenes/kingtheland.jpg"
        ));
       
        peliculas.add(new Pelicula(
            7,
            "El Niñero",
            "Un comediante se convierte en el cuidador de tres niños traviesos, desencadenando situaciones cómicas y llenas de ternura.",
            "assets/imagenes/el-niñero.jpg"
        ));

        peliculas.add(new Pelicula(
            8,
            "La Monja",
            "Una joven monja y un sacerdote investigan un convento en Rumanía, donde descubren la presencia de una entidad demoníaca aterradora.",
            "assets/imagenes/lamonja.jpg"
        ));

        peliculas.add(new Pelicula(
            9,
            "Ginny & Georgia",
            "Una madre joven y su hija adolescente intentan adaptarse a una nueva ciudad, mientras enfrentan secretos del pasado y problemas familiares.",
            "assets/imagenes/G&G.jpg"
        ));

        peliculas.add(new Pelicula(
            10,
            "Stranger Things",
            "Un grupo de niños se enfrenta a fenómenos sobrenaturales y criaturas de otra dimensión tras la desaparición de un amigo en su pequeño pueblo.",
            "assets/imagenes/stranger.jpg"
        ));

        peliculas.add(new Pelicula(
            11,
            "Reina de las lagrimas",
            "Una pareja casada, al borde del divorcio, redescubre el amor mientras enfrenta pruebas personales y profesionales.",
            "assets/imagenes/reina_lagrimas.jpg"
        ));

        peliculas.add(new Pelicula(
            12,
            "Propuesta Laboral",
            "Una joven acepta hacerse pasar por la prometida de su jefe para salvar la reputación de su empresa, dando inicio a una divertida historia romántica.",
            "assets/imagenes/laboral.jpg"
        ));

        peliculas.add(new Pelicula(
            13,
            "Merlina",
            "Merlina Addams, con su humor oscuro y peculiaridad, investiga misterios en la Academia Nunca Más mientras descubre secretos familiares.",
            "assets/imagenes/merlina.jpg"
        ));

        peliculas.add(new Pelicula(
            14,
            "El Juego del Calamar",
            "Un grupo de personas con deudas acepta participar en juegos infantiles mortales con el fin de ganar una enorme suma de dinero.",
            "assets/imagenes/juegoCalamar.jpg"
        ));

        peliculas.add(new Pelicula(
            15,
            "La noche del Demonio",
            "Una familia descubre que su hijo está poseído por un espíritu maligno y busca ayuda para enfrentarse a fuerzas sobrenaturales.",
            "assets/imagenes/LnD.jpg"
        ));

        peliculas.add(new Pelicula(
            16,
            "Happy Gilmore",
            "Un aspirante a jugador de hockey con muy mal carácter descubre que tiene talento para el golf y decide competir para salvar la casa de su abuela.",
            "assets/imagenes/gilmore.jpg"
        ));

        peliculas.add(new Pelicula(
            17,
            "Dra. Cha",
            "Una ama de casa que dejó su carrera médica retoma la profesión después de 20 años, enfrentando desafíos en el hospital y en su vida personal.",
            "assets/imagenes/dracha.jpg"
        ));

        peliculas.add(new Pelicula(
            18,
            "Casa de Papel",
            "Un grupo de ladrones, liderados por 'El Profesor', ejecuta un ambicioso plan para asaltar la Fábrica Nacional de Moneda y Timbre de España.",
            "assets/imagenes/casaDePapel.jpg"
        ));

        peliculas.add(new Pelicula(
            19,
            "Dahmer",
            "La perturbadora historia real de Jeffrey Dahmer, uno de los asesinos en serie más notorios de Estados Unidos.",
            "assets/imagenes/dahmer.jpg"
        ));

        peliculas.add(new Pelicula(
            20,
            "Dark",
            "En un pequeño pueblo alemán, la desaparición de varios niños revela secretos familiares y viajes en el tiempo que conectan a distintas generaciones.",
            "assets/imagenes/Dark.jpg"
        ));
    }
}
