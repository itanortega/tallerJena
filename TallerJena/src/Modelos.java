import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.jena.util.FileManager;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.VCARD;

/**
 *
 * @author io
 */
public class Modelos {
    
    private static String URI_BASE = "http://www.animals.com/";
    private static String AUTORES = "Christian Segundo Ortega & Sonia Patricia Narvaez";
    
    public boolean crearModeloA(String ruta) {
        Model animalsModel = ModelFactory.createDefaultModel();
        
        Resource marinos = animalsModel.createResource(URI_BASE + "marinos")
            .addProperty(VCARD.LABEL, "Los animales marinos viven en el mar su principal distintivo es la necesidad de permanecer en el agua salada o gran parte dentro de ella.")
            .addProperty(VCARD.AGENT, "Nadadores")                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "besugo/")
                    .addProperty(VCARD.LABEL, "Recibe tambien el nombre de voraz o pancho, este pez vive formando bancos pequeños en fondos arenosos cerca de acantilados rocosos. Su alimentacion es de peces, crustaceos y moluscos")
                    .addProperty(VCARD.Other, "Aletas")
                    .addProperty(VCARD.PHOTO,"")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "tiburon/")
                    .addProperty(VCARD.LABEL, "Todos los tiburones tienen varias filas de dientes, y aunque pierden dientes regularmente, nuevos dientes les continúan creciendo y reemplazando a los que se pierden.")
                    .addProperty(VCARD.Other, "Aletas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/88/d1/dd/88d1dd169bad606facec21c23c1f0782.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "ballena/")
                    .addProperty(VCARD.LABEL, "Las ballenas pertenecen a la orden de los cetáceos, lo que significa que son mamíferos totalmente  adaptados a la vida acuática. Son descendientes de animales terrestres que volvieron al agua después de haber vivido millones de años en la tierra. ")
                    .addProperty(VCARD.Other, "Aletas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/c9/1f/77/c91f7783c3584a1d00f64b878143a67f.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "delfin/")
                    .addProperty(VCARD.LABEL, "Los delfines interactúan con los seres humanos desde que su existencia es conocida. Desde entonces, su depredador más peligroso, y el único que ha reducido drásticamente su población es el hombre")
                    .addProperty(VCARD.Other, "Aletas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/8b/bd/c8/8bbdc83b4d8cf2d08e0838a5423179f7.jpg")
            )               
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "pez/")
                    .addProperty(VCARD.LABEL, "Son animales vertebrados primariamente acuáticos, generalmente ectotérmicos (regulan su temperatura a partir del medio ambiente) y con respiración por branquias.")
                    .addProperty(VCARD.Other, "Aletas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/e8/78/5e/e8785ed1ac5741da44321c042daf3b37.jpg")
            )
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "pinguino/")
                    .addProperty(VCARD.LABEL, "Los pingüinos son bien conocidos por su elegante (como vestido de traje), apariencia, – con su blanco y negro, lo cual les da una apariencia única. Son una especie de ave, sin embargo no son capaces de volar.")
                    .addProperty(VCARD.Other, "Aletas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/a7/dc/9a/a7dc9a19e4665443d9962671017b1022.jpg")
            );
        
        Resource domesticos = animalsModel.createResource(URI_BASE + "domesticos")
            .addProperty(VCARD.LABEL, "Consideramos animales domésticos a todos aquellos que tienen una buena relación para convivir con humanos y que se adaptan bien a la vida casera.")
            .addProperty(VCARD.AGENT, "Acompañan")                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "Hamster/")
                    .addProperty(VCARD.LABEL, "El hámster es un pequeño roedor usado como mascota pero también como animal de laboratorio. Este pequeño animal es originario de Oriente Medio y del sureste de Estados Unidos. También son conocidos como hámsteres. Su nombre científico es Cricetinae.")
                    .addProperty(VCARD.Other, "Patas")
                    .addProperty(VCARD.PHOTO,"https://i.redd.it/oc6ckxs7h6f21.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "perro/")
                    .addProperty(VCARD.LABEL, "Pese a que todos los perros actuales tienen un antepasado común, hoy en día se conocen alrededor de 800 razas distintas con tamaños y fisonomías muy diferentes y originadas a partir de la selección artificial por parte de los seres humanos.")
                    .addProperty(VCARD.Other, "Patas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/45/f3/14/45f31448500d1a19e0ef36fd7fcd8c77.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "canario/")
                    .addProperty(VCARD.LABEL, "El canario, también conocido como canario silvestre o serín canario y científicamente como Serinus canaria es un símbolo natural de las Islas Canarias en España.")
                    .addProperty(VCARD.Other, "Alas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/f9/a1/81/f9a181357a920008789a0304fc4d4fee.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "gato/")
                    .addProperty(VCARD.LABEL, "Mamífero felino de tamaño generalmente pequeño, cuerpo flexible, cabeza redonda, patas cortas, cola larga, pelo espeso y suave, largos bigotes y uñas retráctiles; es carnívoro y tiene gran agilidad, buen olfato, buen oído y excelente visión nocturna.")
                    .addProperty(VCARD.Other, "Patas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/82/57/26/82572686571feba4a7c8e6dd1874e39f.jpg")
            )              
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "pajaro/")
                    .addProperty(VCARD.LABEL, "Los pájaros constituyen más de la mitad de todas las aves que existen, aproximadamente sobre 5300 especies. En general se trata de animales pequeños, con cabeza pequeña y cuerpo esbelto.")
                    .addProperty(VCARD.Other, "Alas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/bf/ff/eb/bfffeb8f9ede82e502d847d3d45c2b9c.jpg")
            )             
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "pez/")
                    .addProperty(VCARD.LABEL, "Son animales vertebrados primariamente acuáticos, generalmente ectotérmicos (regulan su temperatura a partir del medio ambiente) y con respiración por branquias.")
                    .addProperty(VCARD.Other, "Aletas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/c6/22/46/c62246068f0ee19a89903e4ecc6010f0.jpg")
            );
        
        Resource aves = animalsModel.createResource(URI_BASE + "aves")
            .addProperty(VCARD.LABEL, " Las Aves son animales vertebrados terrestres que tienen el cuerpo recubierto de plumas y las extremidades anteriores transformadas en alas. Todas tienen dos patas. Tienen pico y cola.")
            .addProperty(VCARD.AGENT, "Vuelan")                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "papagayo/")
                    .addProperty(VCARD.LABEL, "Ave trepadora de 30 a 40 cm de longitud, con el plumaje de colores muy vistosos y variados, y el pico fuerte, grueso y curvo; es capaz de imitar la voz humana; es propio de los bosques de los países tropicales, pero en domesticidad puede vivir en climas templados.")
                    .addProperty(VCARD.Other, "Alas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/4e/61/4c/4e614c752f79dcef73077bcbbeb96dff.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "buitre/")
                    .addProperty(VCARD.LABEL, "Los buitres son aves rapaces del orden Falconiformes que suelen alimentarse especialmente de animales muertos, aunque a falta de estos, son capaces de cazar presas vivas.")
                    .addProperty(VCARD.Other, "Alas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/0a/56/59/0a5659e38f290a4b08b8dc261c7ac798.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "aguila/")
                    .addProperty(VCARD.LABEL, "Águila es el nombre dado a las mayores aves depredadoras. Las diversas especies y subespecies de águilas pueden encontrarse en casi cualquier parte del mundo excepto en la Antártida.")
                    .addProperty(VCARD.Other, "Alas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/474x/30/55/16/30551699faf7000c1e59457b840c65e1--the-birds-birds-of-prey.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "pajaro/")
                    .addProperty(VCARD.LABEL, "Los pájaros constituyen más de la mitad de todas las aves que existen, aproximadamente sobre 5300 especies. En general se trata de animales pequeños, con cabeza pequeña y cuerpo esbelto.")
                    .addProperty(VCARD.Other, "Alas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/bf/ff/eb/bfffeb8f9ede82e502d847d3d45c2b9c.jpg")
            );

        
        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            animalsModel.write(fos);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean crearModeloB(String ruta) {        
        Model animalsModel = ModelFactory.createDefaultModel();
        
        Resource osos = animalsModel.createResource(URI_BASE + "osos")
            .addProperty(VCARD.LABEL, "Todos los osos son carnívoros, aunque en la práctica son omnívoros oportunistas, incluyendo grandes porciones de materia vegetal en sus dietas. Se cree que evolucionaron hace 30-38 millones de años y sus antepasados fue el perro.")
            .addProperty(VCARD.AGENT, "Patas")                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "polar/")
                    .addProperty(VCARD.LABEL, "Los osos polares viven sólo donde hace mucho frío, alrededor de la región  Ártica. La única excepción son aquellos que viven en cautiverio en zoológicos de todo el mundo.")
                    .addProperty(VCARD.Other, "Pelaje")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/18/dd/5c/18dd5c509dfff6c6c6a5ef04efe10b78.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "panda/")
                    .addProperty(VCARD.LABEL, "Los osos panda son quizás uno de los animales con mayor referencia en el mundo, debido a que son muy pocos quienes no conocen la existencia y apariencia sobre esta clase de mamíferos.")
                    .addProperty(VCARD.Other, "Pelaje")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/37/78/02/37780239464eba3cd5d089ad9cc3aef6.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "pardo/")
                    .addProperty(VCARD.LABEL, "El oso pardo es a menudo confundido con el oso grizzli, una subespecie, debido a la semejanza en su apariencia física. No deje que su nombre lo engañe los osos pardos pueden ser de color marrón, rubios, e incluso de color casi negro.")
                    .addProperty(VCARD.Other, "Pelaje")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/96/d1/98/96d198c55e264042bb6edd7aceff50a9.jpg")
            )
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "pinguino/")
                    .addProperty(VCARD.LABEL, "Los pingüinos son bien conocidos por su elegante (como vestido de traje), apariencia, – con su blanco y negro, lo cual les da una apariencia única. Son una especie de ave, sin embargo no son capaces de volar.")
                    .addProperty(VCARD.Other, "Aletas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/a7/dc/9a/a7dc9a19e4665443d9962671017b1022.jpg")
            );
        
        Resource zoologico = animalsModel.createResource(URI_BASE + "zoologico")
            .addProperty(VCARD.LABEL, "Desde hace algunos años los zoológicos preocupados por la fauna, están tratando de imitar el entorno natural de los animales que viven en ellos. Han empezado por concebir sus espacios más grandes imitando los diferentes ambientes o regiones, han quitado los barrotes y los han remplazado por zanjas y fosos muy anchos y profundos.")
            .addProperty(VCARD.AGENT, "Exibición")                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "mono/")
                    .addProperty(VCARD.LABEL, "Suele decirse que los monos son los animales más parecidos a las personas. Estos mamíferos no solo comparten rasgos físicos con el Homo sapiens, sino que además pueden tener conductas y actitudes semejantes.")
                    .addProperty(VCARD.Other, "Patas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/81/ae/64/81ae648c15f490d698ea5393bdbbc245.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "tigre/")
                    .addProperty(VCARD.LABEL, "El tigre es el mayor de los cuatro grandes felinos, es un animal muy hermoso y admirado en el mundo entero. Los tigres son feroces depredadores y muy inteligentes, esto los hace uno de los líderes en su entorno natural, han sido capaces de evolucionar con éxito.")
                    .addProperty(VCARD.Other, "Patas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/04/83/44/04834483f4a01c637f2caff05bfe4d11.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "leon/")
                    .addProperty(VCARD.LABEL, "El león es un animal mamífero originario de África que se caracteriza por su cabeza de gran tamaño (coronada por una melena en el caso de los machos), sus dientes fuertes, sus garras y su cola extensa que finaliza en un fleco")
                    .addProperty(VCARD.Other, "Patas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/0e/e1/87/0ee187f032c24cf83bba80a272d64248.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "jirafa/")
                    .addProperty(VCARD.LABEL, "La jirafa es un animal inconfundible, su cuerpo alto y delgado cubierto de manchas es inusual, y la mayoría de la gente disfruta viéndolo. ")
                    .addProperty(VCARD.Other, "Patas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/c3/f8/1c/c3f81c4612f41865964d787175f0663b.jpg")

            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "cocodrilo/")
                    .addProperty(VCARD.LABEL, "Los cocodrilos se encuentran entre los más feos de todas las especies animales, y aunque la mayoría de la gente piense que todos los animales son lindos de bebe, el cocodrilo, junto con las serpientes son la excepción.")
                    .addProperty(VCARD.Other, "Colmillos")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/63/dc/db/63dcdb2bdcc7453f8f12b1a178711e8c.jpg")
            );
        
        Resource reptiles = animalsModel.createResource(URI_BASE + "reptiles")
            .addProperty(VCARD.LABEL, "Los reptiles (Reptilia) son una clase parafilética de animales vertebrados amniotas provistos de escamas epidérmicas de queratina.")
            .addProperty(VCARD.AGENT, "Son de cuidado")                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "lagarto/")
                    .addProperty(VCARD.LABEL, "Existen muchas especies de lagartos en el mundo, y muchas más diferencias entre ellos. Algunos son muy grandes y otros extremadamente pequeños.")
                    .addProperty(VCARD.Other, "Patas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/4b/c4/3a/4bc43ae60e85096f68fe8d9d06656329.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "lagartija/")
                    .addProperty(VCARD.LABEL, "La lagartija es el diminutivo de lagarto, y en diferentes países se utiliza como nombre común para denominar a algunas o todas las especies de ciertos géneros de las familias Lacertidae y Gekkonidae.")
                    .addProperty(VCARD.Other, "Patas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/32/bd/ae/32bdae0495ce8094d421a458110a5db9.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "iguana/")
                    .addProperty(VCARD.LABEL, "La iguana común o iguana verde (Iguana iguana) es un gran lagarto arbóreo de América Central y de Sudamérica. Se encuentra desde México hasta el sudeste de Brasil y el Pantanal del Paraguay, así como también en islas del Caribe y, de manera asilvestrada.")
                    .addProperty(VCARD.Other, "Patas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/ff/f0/28/fff028ca3313fbf04f9bc234c897604a.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "serpiente/")
                    .addProperty(VCARD.LABEL, "La anatomía de las serpientes está especialmente adaptada para poder desplazarse careciendo de extremidades. Comparadas con vertebrados cuadrúpedos, las serpientes tienen un centro de gravedad muy bajo, pegado al suelo, una mayor superficie corporal en contacto con el suelo lo que genera mayor fricción y reparte más la masa corporal.")
                    .addProperty(VCARD.Other, "Escamas")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/1c/df/27/1cdf27faac1c9d437d55884cc134b922.jpg")
            )                
            .addProperty(VCARD.N,
                animalsModel.createResource(URI_BASE + "cocodrilo/")
                    .addProperty(VCARD.LABEL, "Los cocodrilos se encuentran entre los más feos de todas las especies animales, y aunque la mayoría de la gente piense que todos los animales son lindos de bebe, el cocodrilo, junto con las serpientes son la excepción.")
                    .addProperty(VCARD.Other, "Colmillos")
                    .addProperty(VCARD.PHOTO,"https://i.pinimg.com/originals/63/dc/db/63dcdb2bdcc7453f8f12b1a178711e8c.jpg")
            );
        
        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            animalsModel.write(fos);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean crearUnion(String inputFileName1, String inputFileName2, String ruta) {        
        Model model1 = ModelFactory.createDefaultModel();
        InputStream is1 = FileManager.get().open(inputFileName1);
        if (is1 == null) {
            throw new IllegalArgumentException("File " + inputFileName1 + " not exists");
        }

        Model model2 = ModelFactory.createDefaultModel();
        InputStream is2 = FileManager.get().open(inputFileName2);
        if (is2 == null) {
            throw new IllegalArgumentException("File " + inputFileName2 + " not exists");
        }

        model1.read(is1, "");
        model2.read(is2, "");

        Model model = model1.union(model2);

        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            model.write(fos);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean crearInterseccion(String inputFileName1, String inputFileName2, String ruta) {        
        Model model1 = ModelFactory.createDefaultModel();
        InputStream is1 = FileManager.get().open(inputFileName1);
        if (is1 == null) {
            throw new IllegalArgumentException("File " + inputFileName1 + " not exists");
        }

        Model model2 = ModelFactory.createDefaultModel();
        InputStream is2 = FileManager.get().open(inputFileName2);
        if (is2 == null) {
            throw new IllegalArgumentException("File " + inputFileName2 + " not exists");
        }

        model1.read(is1, "");
        model2.read(is2, "");

        Model model = model1.intersection(model2);

        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            model.write(fos);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
