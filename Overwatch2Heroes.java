import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Overwatch2Heroes {
    public static void main(String[] args) {
        Map<String, String> heroes = new HashMap<>();
        // Tanques
        heroes.put("D.Va", "Piloto surcoreana famosa, exjugadora profesional, pilota un meca para proteger a Busan de amenazas ómnicas.");
        heroes.put("Doomfist", "Akande Ogundimu, luchador nigeriano. Cree que el conflicto es esencial para el progreso. Líder en Talon.");
        heroes.put("Junker Queen", "Matriarca de Junkertown, luchadora dura y carismática, rival de Roadhog y organizadora de la Arena.");
        heroes.put("Orisa", "Ómnica de Numbani creada por Efi Oladele, es protectora de la ciudad y defiende con barreras y su fortaleza.");
        heroes.put("Ramattra", "Ómnico jefe de Null Sector, busca libertad para los ómnicos, aunque sea por medios violentos.");
        heroes.put("Reinhardt", "Cruzado alemán honorable, exmiembro de Overwatch, su armadura y escudo lo hacen esencial en la defensa.");
        heroes.put("Roadhog", "Mercenario australiano, fue mano derecha de Junker Queen, conocido por su brutalidad y gancho.");
        heroes.put("Sigma", "Astrofísico holandés que desarrolló poderes de gravedad tras un experimento fallido. Servidor de Talon.");
        heroes.put("Winston", "Gorila súper inteligente, criado en la colonia lunar Horizon, defensor de la humanidad y miembro clave de Overwatch.");
        heroes.put("Wrecking Ball", "Hamster genéticamente modificado llamado Hammond, pilota una esfera mecánica enorme y causa caos.");
        heroes.put("Zarya", "Campeona rusa de halterofilia, especializada en escudos de energía, defensora de su pueblo contra invasiones ómnicas.");
        
        // Daño
        heroes.put("Ashe", "Líder de los Deadlock, pistolera experta y estratega. Rival de Cassidy.");
        heroes.put("Bastion", "Ómnico con gran capacidad de transformación y adaptación táctica, curioso por la naturaleza.");
        heroes.put("Cassidy", "Vaquero y justiciero, antiguo agente de Blackwatch, hábil con el revólver y en tácticas de asalto.");
        heroes.put("Echo", "Ómnica de alta inteligencia creada por Mina Liao, con capacidad de volar y adaptarse a múltiples roles.");
        heroes.put("Genji", "Ninja cíborg, busca la armonía entre su parte humana y mecánica. Hermano de Hanzo.");
        heroes.put("Hanzo", "Arquero japonés y exlíder del clan Shimada, busca redención tras herir a su hermano Genji.");
        heroes.put("Junkrat", "Demolicionista australiano, obsesionado con el caos y las explosiones. Socio de Roadhog.");
        heroes.put("Mei", "Científica china experta en criotecnología, usa el hielo para controlar el campo de batalla y proteger al planeta.");
        heroes.put("Pharah", "Egipcia defensora con armadura de vuelo, dedicada a seguir el legado de su madre Ana.");
        heroes.put("Reaper", "Gabriel Reyes, asesino con poderes de sombra, exlíder de Blackwatch. Manipula la vida y muerte.");
        heroes.put("Sojourn", "Comandante canadiense cíborg, especialista en armas de riel y táctica avanzada.");
        heroes.put("Soldier: 76", "Jack Morrison, exlíder de Overwatch convertido en vigilante, usa tecnología avanzada y táctica militar.");
        heroes.put("Sombra", "Hacker mexicana que manipula información para influir gobiernos, trabaja para Talon y Null Sector.");
        heroes.put("Symmetra", "Arquitecta india, experta en tecnología de luz dura, construye estructuras para controlar el entorno.");
        heroes.put("Torbjörn", "Ingeniero sueco, creador de torretas automáticas y gran defensor de la seguridad mundial.");
        heroes.put("Tracer", "Piloto británica con poderes de manipulación temporal, icono de Overwatch; lidera misiones globales.");
        heroes.put("Venture", "Explorador de caverna experto, capaz de excavar y manipular el terreno bajo sus rivales.");
        heroes.put("Widowmaker", "Asesina francesa, exagente de Talon, experta en francotirador tras ser sometida a condicionamiento mental.");
        
        // Apoyo
        heroes.put("Ana", "Francotiradora y sanadora egipcia, madre de Pharah, exintegrante de Overwatch, experta táctica.");
        heroes.put("Baptiste", "Sanador haitiano excombatiente, usa biotecnología avanzada y todo tipo de tácticas versátiles.");
        heroes.put("Brigitte", "Ingeniera sueca y escudera de Reinhardt, protege y sana con armadura y maza mecánica.");
        heroes.put("Illari", "Guerrera solar peruana, combina rayos de luz para soportar y atacar desde la distancia.");
        heroes.put("Kiriko", "Ninja sanadora japonesa, utiliza tecnología espiritual y shuriken para proteger y curar a sus aliados.");
        heroes.put("Lifeweaver", "Biólogo tailandés que manipula la vida mediante tecnología de bioluminescencia verde.");
        heroes.put("Lúcio", "DJ brasileño, usa música para motivar y curar, símbolo de la esperanza en comunidades afectadas.");
        heroes.put("Mercy", "Doctora suiza, ángel del campo de batalla, especialista en nanobiología y curaciones milagrosas.");
        heroes.put("Moira", "Científica irlandesa, manipula la genética para sanar y dañar, trabaja para Talon en busca de avances extremos.");
        heroes.put("Zenyatta", "Monje ómnico, guía espiritual y luchador, busca la trascendencia entre humanidad y robótica.");

        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Introduce el nombre de cualquier héroe de Overwatch 2 para saber su lore (o 'salir' para terminar):");
        do {
            input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("salir")) {
                System.out.println("¡Hasta luego!");
                break;
            }
            String lore = heroes.get(input);
            if (lore != null) {
                System.out.println("Lore de " + input + ": " + lore);
            } else {
                System.out.println("No se encontró ese héroe, comprueba el nombre o prueba otro.");
            }
            System.out.println("Escribe otro héroe o 'salir':");
        } while (true);
        scanner.close();
    }
    
}

