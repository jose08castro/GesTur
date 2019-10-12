package com.example.gestur.DB;

import com.example.gestur.DB.definitionFormClasses.ChapterDefBinary;
import com.example.gestur.DB.definitionFormClasses.ChapterDefHotel;
import com.example.gestur.DB.definitionFormClasses.ChapterDefScore;
import com.example.gestur.DB.definitionFormClasses.ChapterDefSpa;
import com.example.gestur.DB.definitionFormClasses.FormDefBinary;
import com.example.gestur.DB.definitionFormClasses.FormDefCafeteriaFondaSoda;
import com.example.gestur.DB.definitionFormClasses.FormDefConCenters;
import com.example.gestur.DB.definitionFormClasses.FormDefHotel;
import com.example.gestur.DB.definitionFormClasses.FormDefRestaurant;
import com.example.gestur.DB.definitionFormClasses.FormDefSpa;
import com.example.gestur.DB.definitionFormClasses.QuestionDefBinary;
import com.example.gestur.DB.definitionFormClasses.QuestionDefHotel;
import com.example.gestur.DB.definitionFormClasses.QuestionDefScore;
import com.example.gestur.DB.definitionFormClasses.QuestionDefScoreObs;

import java.util.ArrayList;

public abstract class FormDefFactory {
    //“
    public static FormDefBinary getFormTematicsDef(){ //Calificación para Actividades Turísticas Temáticas:
        String pregunta1 = "Cumple con las regulaciones para su operación establecidas por el Ministerio de Salud.";
        String pregunta2 = "Cumple con las Regulaciones para su operación establecidas por la Municipalidad local.";
        String pregunta3 = "En caso de ofrecer los servicios de hospedaje se encuentra debidamente inscrito ante las autoridades locales.";
        String pregunta4 = "La empresa dispone de un Seguro de Responsabilidad Civil y gastos médicos.";
        String pregunta5 = "Cuando se involucran actividades de Turismo de Aventura las mismas se apegan a lo establecido por el Ministerio de Salud.";
        String pregunta6 = "La empresa dispone de una bitácora de Mantenimiento";
        String pregunta7 = "La empresa dispone de un Manual de Seguridad";
        String pregunta8 = "Los Guías tienen el certificado de Primeros Auxilios y RCP";
        String pregunta9 = "Se dispone de Guías para atender a los turistas tanto en forma individual o grupal";
        String pregunta10 = "La empresa dispone de un Reglamento Interno de Operación para el desarrollo de sus visitas.";

        String pregunta11 = "Considera un aspecto temático  como eje principal  de su Actividad Turística.";
        String pregunta12 = "En lo que respecta a su ubicación el proyecto se encuentra rodeado de atractivos turísticos tanto naturales como culturales de importancia.\n";
        String pregunta13 = "Se cuenta con  Disposiciones Generales de Información y Seguridad al Turista.";
        String pregunta14 = "\"Se cuenta con una sala  para la recepción del turista individual o en grupo," +
                "donde se le proporcionan servicios varios y de información general.\"";
        String pregunta15 = "Todos los servicios y accesos a las actividades  se encuentran  señalados.                   \n";
        String pregunta16 = "En caso de contar con un restaurante, su planta física  se encuentra en buen estado de mantenimiento y limpieza.\n";
        String pregunta17 = "Se dispone de una carta de menú, donde se detalla la composición de los platos y precios con los impuestos de ley.\n";
        String pregunta18 = "Las mesas y sillas del salón se encuentran en buen estado de mantenimiento y limpieza. \n";
        String pregunta19 = "En caso de contar con kioskos o sodas para el consumo de alimentos y bebidas estos se encuentran en buen estado de mantenimiento y limpieza.\n";
        String pregunta20 = "El mobiliario de los kioskos o sodas se encuentran en buen estado de mantenimiento y limpieza.\n";
        String pregunta21 = "La empresa dispone de equipo de comunicación portátil entre  los guías con la base de operaciones.\n";
        String pregunta22 = "La empresa dispone de equipo especializado para el desarrollo de sus programas (Caminatas, Caballos, Cavernas, "+
                "Canopy y de aventura en general) el cual según su modalidad será certificado y se encontrará en buen estado de mantenimiento y limpieza,"+
                "lo que implica que según la modalidad de prestación de servicio deberá contar con equipo certificado para la práctica de este tipo de "+
                "deportes que se caracteriza por su nivel de acto riesgo. El equipo disponible no debe tener malos olores, ni presentar desgaste o deterioro alguno. \n";
        String pregunta23 = "La empresa dispone de un local para la venta de recuerdos y artesanías.\n";

        String pregunta24 = " La Planta Física a nivel de áreas comerciales  se observa en buen estado "+
                "de Mantenimiento y Limpieza, lo que significa que cualquier construcción que se haya desarrollado "+
                "en el proyecto con fines de explotación turística, deberá contar con pisos, paredes, cielo raso, "+
                "equipo y accesorios disponibles que le garanticen al turista su buen uso y seguridad. \n";
        String pregunta25 = "Cualquier instalación con fines turísticos, a nivel de bodegas, establos, "+
                "viveros u otros de uso y acceso para el turista deberá encontrarse en buen estado de mantenimiento "+
                "a nivel de pisos, paredes, cielo raso y techos, como a nivel de equipo y accesorios. En cuanto a la "+
                "limpieza se refiere, esta incluye superficie libres de suciedad, manchas o cualquier otro detalle que "+
                "resulte desagradable a la vista del turista incluyendo la ausencia de malos olores.\n";
        String pregunta26 = " Los senderos, puentes, barandas y cualquier otro acceso peatonal \n" +
                "se observa en buen estado de mantenimiento y limpieza.";
        String pregunta27 = "Los servicios sanitarios públicos están equipados con los accesorios básicos : "+
                "Porta-papel, porta-toallas, secador de manos,  espejos, jabonera líquida, y basureros";
        String pregunta28 = "La loza sanitaria a nivel de inodoros, lavabos, y otros, se encuentra en buen estado de mantenimiento y limpieza, esto significa que debe tener todas sus piezas completas a nivel de inodoro, tanque y lavatorio, siendo el acabado del mismo acorde  para sus propósitos de operación. En lo que respecta a la limpieza dicha loza debe encontrarse libre de manchas y de suciedad alguna como de malos olores.\n";
        String pregunta29 = "La planta física a nivel de Servicios Sanitarios se encuentra en buen estado de mantenimiento y limpieza a nivel de pisos, paredes, cielo raso, puertas y ventanas debe encontrase libre de deterioro alguno, reflejando un buen acabado en sus materiales constructivos, como en su textura y pinturas tanto exteriores como interiores.\n";
        String pregunta30 = "El personal que atiende a los turistas lleva su correspondiente gafete.\n";
        String pregunta31 = "El personal estará debidamente uniformado.\n";
        String pregunta32 = "El personal se encontrará capacitado según los puestos de trabajo.\n";
        String pregunta33 = "\"Se dispone   de  Areas y de Información ( Visual, sonora o de texto)  para Personas \n" +
                "con Capacidad Física Restringida.\"\n";

        String pregunta34 = "La empresa da a conocer el patrimonio natural existente en el sitio en donde se realizan las actividades.\n";
        String pregunta35 = "La empresa da a conocer el patrimonio cultural existente en el sitio donde se realizan las actividades.\n";
        String pregunta36 = "La empresas demuestra que promueve la Educación Ambiental y consolida la Cultura Ambientalista.\n";
        String pregunta37 = "Se establecen recomendaciones para el Turista sobre su comportamiento para con el medio natural.\n";
        String pregunta38 = "La empresa demuestra que esta interesada en implementar medidas para reducir su impacto con el medio ambiente (uso de productos biodegradables, etc.).\n";
        String pregunta39 = "La empresa demuestra  que desarrolla prácticas ambientales sostenibles.\n";
        String pregunta40 = "La empresa incluye dentro de sus actividades espectáculos o expresiones artístico-culturales. \n";
        String pregunta41 = "La empresa apega sus diseños al modelo de Arquitectura  propios de su región.\n";
        String pregunta42 = "\"Se da  la puesta en valor de la gastronomía local, como un elemento de \n" +
                "rescate del patrimonio costarricense.\"\n";
        String pregunta43 = "La empresa desarrolla programas ambientales con la comunidad inmediata\n";
        String pregunta44 = "La empresa dispone de programas ambientales específicos para la conservación de los recursos naturales\n";
        String pregunta45 = "La experiencia dentro del sitio  permite  reconocer elementos culturales locales además de los nacionales.\n";

        String pregunta46 = "La declaración de Misión de la Organización menciona \"el servicio al cliente\" como parte de su carácter especial.\n";
        String pregunta47 = "La empresa demuestra  que tiene una política escrita de servicio al cliente\n";
        String pregunta48 = "El servicio al cliente esta incluido en el  Plan de Mercadeo\n";
        String pregunta49 = "Se comunican las políticas de servicio a los clientes. \n";
        String pregunta50 = "La empresa dispone de un sistema de medición de la satisfacción del cliente.\n";
        String pregunta51 = "La Junta Directiva o el más alto nivel de la empresa utiliza la información del servicio al cliente como base para tomar decisiones.\n";
        String pregunta52 = "La Junta Directiva consigna recursos suficientes para dar mantenimiento o seguimiento la tema de servicio al cliente. \n";
        String pregunta53 = "Para el servicio al cliente  se recogen datos esenciales mediante la aplicación de una boleta.\n";
        String pregunta54 = "Las boletas o formularios relacionados con el servicio al cliente  se llevan en un archivo  debidamente foliado.\n";
        String pregunta55 = "Al personal se le dan instrucciones claras respecto a la naturaleza de su esperada contribución  al servicio al cliente. \n";
        String pregunta56 = "El servicio al cliente se evalúa periódicamente en busca de la mejora continúa.\n";
        String pregunta57 = "La empresa tiene un procedimiento legal para tratar las quejas de los turistas consumidores y que esta reflejado en su documento de contrato.\n";
        String pregunta58 = "Sigue y contesta las quejas que surgen de sus Representantes o Comercializadores" +
                "(Otros prestadores de Servicios como las Oficinas de Reservaciones, Agencias de Viajes, Hoteles, etc.";
        String pregunta59 = "La empresa proporciona  entrenamiento periódico para reforzar la importancia del servicio al cliente.";

        ArrayList<QuestionDefBinary> questions1 = new ArrayList<>(); // 1-10
        questions1.add(new QuestionDefBinary("1",pregunta1));
        questions1.add(new QuestionDefBinary("2",pregunta2));
        questions1.add(new QuestionDefBinary("3",pregunta3));
        questions1.add(new QuestionDefBinary("4",pregunta4));
        questions1.add(new QuestionDefBinary("5",pregunta5));
        questions1.add(new QuestionDefBinary("6",pregunta6));
        questions1.add(new QuestionDefBinary("7",pregunta7));
        questions1.add(new QuestionDefBinary("8",pregunta8));
        questions1.add(new QuestionDefBinary("9",pregunta9));
        questions1.add(new QuestionDefBinary("10",pregunta10));

        ArrayList<QuestionDefBinary> questions2 = new ArrayList<>();//11-33
        questions2.add(new QuestionDefBinary("11",pregunta11));
        questions2.add(new QuestionDefBinary("12",pregunta12));
        questions2.add(new QuestionDefBinary("13",pregunta13));
        questions2.add(new QuestionDefBinary("14",pregunta14));
        questions2.add(new QuestionDefBinary("15",pregunta15));
        questions2.add(new QuestionDefBinary("16",pregunta16));
        questions2.add(new QuestionDefBinary("17",pregunta17));
        questions2.add(new QuestionDefBinary("18",pregunta18));
        questions2.add(new QuestionDefBinary("19",pregunta19));
        questions2.add(new QuestionDefBinary("20",pregunta20));
        questions2.add(new QuestionDefBinary("21",pregunta21));
        questions2.add(new QuestionDefBinary("22",pregunta22));
        questions2.add(new QuestionDefBinary("23",pregunta23));
        questions2.add(new QuestionDefBinary("24",pregunta24));
        questions2.add(new QuestionDefBinary("25",pregunta25));
        questions2.add(new QuestionDefBinary("26",pregunta26));
        questions2.add(new QuestionDefBinary("27",pregunta27));
        questions2.add(new QuestionDefBinary("28",pregunta28));
        questions2.add(new QuestionDefBinary("29",pregunta29));
        questions2.add(new QuestionDefBinary("30",pregunta30));
        questions2.add(new QuestionDefBinary("31",pregunta31));
        questions2.add(new QuestionDefBinary("32",pregunta32));
        questions2.add(new QuestionDefBinary("33",pregunta33));

        ArrayList<QuestionDefBinary> questions3 = new ArrayList<>();//34-45
        questions3.add(new QuestionDefBinary("34",pregunta34));
        questions3.add(new QuestionDefBinary("35",pregunta35));
        questions3.add(new QuestionDefBinary("36",pregunta36));
        questions3.add(new QuestionDefBinary("37",pregunta37));
        questions3.add(new QuestionDefBinary("37",pregunta38));
        questions3.add(new QuestionDefBinary("37",pregunta39));
        questions3.add(new QuestionDefBinary("40",pregunta40));
        questions3.add(new QuestionDefBinary("41",pregunta41));
        questions3.add(new QuestionDefBinary("42",pregunta42));
        questions3.add(new QuestionDefBinary("43",pregunta43));
        questions3.add(new QuestionDefBinary("44",pregunta44));
        questions3.add(new QuestionDefBinary("45",pregunta45));

        ArrayList<QuestionDefBinary> questions4 = new ArrayList<>();//46-59
        questions4.add(new QuestionDefBinary("46",pregunta46));
        questions4.add(new QuestionDefBinary("47",pregunta47));
        questions4.add(new QuestionDefBinary("48",pregunta48));
        questions4.add(new QuestionDefBinary("49",pregunta49));
        questions4.add(new QuestionDefBinary("50",pregunta50));
        questions4.add(new QuestionDefBinary("51",pregunta51));
        questions4.add(new QuestionDefBinary("52",pregunta52));
        questions4.add(new QuestionDefBinary("53",pregunta53));
        questions4.add(new QuestionDefBinary("54",pregunta54));
        questions4.add(new QuestionDefBinary("55",pregunta55));
        questions4.add(new QuestionDefBinary("56",pregunta56));
        questions4.add(new QuestionDefBinary("57",pregunta57));
        questions4.add(new QuestionDefBinary("58",pregunta58));
        questions4.add(new QuestionDefBinary("59",pregunta59));

        ArrayList<ChapterDefBinary> chapters = new ArrayList<>();
        chapters.add(new ChapterDefBinary("De la Organizacion","1",17,questions1));
        chapters.add(new ChapterDefBinary("De la Operacion","2",39,questions2));
        chapters.add(new ChapterDefBinary("Variables Ambientales y Culturales","3",20,questions3));
        chapters.add(new ChapterDefBinary("Del Servio al cliente","4",24,questions4));

        return new FormDefBinary("CALIFICACION DE ACTIVIDADES TURISTICAS TEMATICAS",1,chapters);
    } //READY 1

    public static FormDefHotel getFormHotelDef(){
        String capitulo1 = "Arquitectura y Jardinería/ Áreas Verdes"; //p: 2,  5

        String pregunta1 = "En zonas de veraneo, los jardines forman parte integral de la experiencia del huésped. Por lo tanto, " +
                "deben cuidarse meticulosamente. Por lo general las áreas dedicadas a jardines son más amplias en los hoteles en zonas de veraneo que en los hoteles de ciudad.";
        String pregunta1_1 = "Fachadas exteriores sencillas, buen mantenimiento, señalamiento  claro (i.e. sin que falten letras, todos los focos deben estar iluminados en la noche)";
        String pregunta1_2 = "Fachadas igual que 1 estrella";
        String pregunta1_3 = "La fachada del edificio debe estar en buenas condiciones, debe parecer recién pintada, con buena iluminación y plantas que se noten saludables.";
        String pregunta1_4 = "Las fachadas serán igual que 3 estrellas. Extremadamente bien mantenida. Entrada cubierta para proteger de la lluvia";
        String pregunta1_5 = "Las fachadas serán igual que 4 estrellas, y tanto los edificios como las áreas verdes impecablemente mantenidos.";

        String pregunta2 = "La ubicación del establecimiento – proximidad a carriles ferroviarios, carreteras, fábricas, el nivel de ruido, etc. – puede afectar la clasificación";
        String pregunta2_1 = "La propiedad está situada en una zona buena. Puede estar cerca de una carretera o de otra fuente de ruido.";
        String pregunta2_2 = "Con respecto a la ubicación igual que 1 estrella";
        String pregunta2_3 = "No se pude oír ruido  de la carretera, ni de otras fuentes de ruidos. La zona alrededor del establecimiento es agradable y sin peligro.";
        String pregunta2_4 = "Con respecto a la ubicación igual que 3 estrellas.";
        String pregunta2_5 = "Igual que 4 estrellas. La ubicación debe ser óptima con buenas vistas desde las habitaciones y áreas públicas.";


        String capitulo2 = "Vestíbulo y Espacios Públicos";//p: 1, 2.5

        String pregunta3 = "Se requieren ascensores en todos los hoteles de cuatro o más pisos. Los hoteles de cinco estrellas deben tener ascensores adicionales de servicio.";
        String pregunta3_1 = "Espacio de carácter modesto con escritorio o mostrador de recepción; algunas sillas o butacas para huéspedes; decorado en forma sencilla.";
        String pregunta3_2 = "Vestíbulos y Pasillos igual que 1 estrella. Se nota que se le ha dado atención a la decoración; mobiliario puede mostrar desgaste; por ejemplo algunos " +
                "colores desteñidos o maderas algo dañadas.";
        String pregunta3_3 = "Se nota que se le ha dado atención especial al decorado, por ejemplo se han coordinado los colores; los muebles y las alfombras, si hay alfombras deben " +
                "estar en buenas condiciones; plantas naturales.";
        String pregunta3_4 = "Vestíbulos y Pasillos igual que 3 estrellas. Flores frescas; objetos de arte original; uno o más tiendas.";
        String pregunta3_5 = "Mobiliario elegante y lujoso, plantas y flores en abundancia; sensación de amplitud; mantenimiento impecable; varias tiendas (ropa, joyería, " +
                "artesanía, regalos); puede también ofrecer salón de belleza y barbería.";

        String capitulo3 = "Pasillos y Corredores";//p:1,  2.5

        String pregunta4 = "Todos los corredores interiores deben tener detectores de fuego y extintores";
        String pregunta4_1 = "Buena iluminación en todos los corredores, exteriores e interiores. Las paredes y pisos pueden mostrar desgaste.";
        String pregunta4_2 = "Los Pasillos y Corredores igual que 1 estrella. Las paredes y los pisos deben mostrar un desgaste mínimo.";
        String pregunta4_3 = "Los Pasillos y Corredores igual que 2 estrellas; excelente iluminación; se presta más atención  a la decoración, " +
                "por ejemplo se observan: cuadros, artesanías, fotos o espejos decorando las paredes.";
        String pregunta4_4 = "Los Pasillos y Corredores igual que 3 estrellas; corredores espaciosos que fácilmente pueden acomodar a la vez " +
                "el carro de limpieza y el de los botones; paradas para ascensores con plataformas adentradas en cada piso";
        String pregunta4_5 = "Los Pasillos y Corredores igual que 4 estrellas";


        String capitulo4 = "Habitaciones";//p:8, 20

        String pregunta5 = "Todas las habitaciones, independientemente de la clasificación del establecimiento, deberán tener instrucciones para " +
                "salidas de emergencia, mirillas, cerraduras secundarias (cerrojo, pasador o cadena), cerrojos en las ventanas, planta baja, cesto para " +
                "papeles, superficie para escribir o para utilizar computadora, recipientes para hielo, un vaso por huésped, controles individuales de temperatura y luz para leer.";
        String pregunta5_1 = "Habitación con pocos muebles (por ejemplo, una o dos camas, una o dos sillas simples); mobiliario en buenas condiciones, pero no " +
                "necesariamente haciendo juego en el estilo. Puede mostrar desgaste.";
        String pregunta5_2 = "Igual que 1 estrella, escritorio y una mesa de noche; algún artículo decorativo simple en las paredes; mobiliario en buenas " +
                "condiciones y coordinando en el estilo, puede mostrar desgaste.";
        String pregunta5_3 = "Igual que 2 estrellas, más mesas de noche a cada lado de la cama, gavetero; mobiliario en muy buenas condiciones";
        String pregunta5_4 = "Mobiliario igual que 3 estrellas";
        String pregunta5_5 = "Igual que 4 estrellas, todos los muebles deben parecer como nuevos; plantas naturales.";

        String pregunta6 = "La ropa de cama no debe estar rota ni manchada";
        String pregunta6_1 = "Las ropas de cama pueden mostrar desgaste.";
        String pregunta6_2 = "Ropa de cama generalmente en buenas condiciones.";
        String pregunta6_3 = "Ropa de cama en muy buenas condiciones.";
        String pregunta6_4 = "La ropa de cama igual que 3 estrellas";
        String pregunta6_5 = "Igual que 4 estrellas; cubrecamas haciendo juego con las butacas o con las cortinas.";

        String pregunta7 = "Armario o closet";
        String pregunta7_1 = "El espacio destinado a colgar las ropas y el número de gavetas puede ser limitado";
        String pregunta7_2 = "El espacio destinado a colgar la ropa igual que 1 estrella";
        String pregunta7_3 = "Suficiente espacio para guardar y colgar ropa (un gancho mínimo de 0.6  m para cada persona); " +
                "perchas desmontables, haciendo juego, de madera o plástico. Closet o armario con puerta";
        String pregunta7_4 = "Closet o armario igual que 3 estrellas";
        String pregunta7_5 = "Closet o armario igual que 4 estrellas";

        String pregunta8 = "Colchones y almohadas:";
        String pregunta8_1 = "Los colchones y almohadas pueden ser de espuma de caucho (foam)";
        String pregunta8_2 = "Los colchones y almohadas igual que 1 estrella";
        String pregunta8_3 = "Colchones, cajas de resortes y almohadas de buena calidad, no de caucho.";
        String pregunta8_4 = "Mínimo de dos almohadas por huésped; almohadas y frazadas adicionales disponibles en el closet.";
        String pregunta8_5 = "Los colchones y almohadas igual que 4 estrellas.";

        String pregunta9 = "El acabado de los pisos debe ser apropiado al tipo de establecimiento, ubicación y arquitectura o diseño del inmueble. " +
                "El cielo raso no debe tener grietas, ni telarañas,  ni huecos u orificios por donde pudiera introducirse un animal";
        String pregunta9_1 = "El acabado de los pisos y las alfombras pueden mostrar algún desgaste";
        String pregunta9_2 = "El acabado de los pisos y las alfombras igual que 1 estrella";
        String pregunta9_3 = "El acabado de los pisos y las alfombras no muestran desgaste, por ejemplo manchas en alfombras o grietas en los azulejos";
        String pregunta9_4 = "El acabado de los pisos y las alfombras igual que 3 estrellas";
        String pregunta9_5 = "El acabado de los pisos y las alfombras igual que 4 estrellas.";

        String pregunta10 = "Ventilación en todos los cuartos; ventilador, aire acondicionado, o calefacción en caso necesario.";
        String pregunta10_1 = "Requiere de al menos un ventilador según la zona.";
        String pregunta10_2 = "Requiere de al menos un ventilador según la zona";
        String pregunta10_3 = "Requiere de al menos un ventilador  o aire acondicionado según la zona";
        String pregunta10_4 = "Requiere de Aire Acondicionado";
        String pregunta10_5 = "Requiere de Aire Acondicionado";

        String pregunta11 = "Cobertura de ventanas";
        String pregunta11_1 = "Cobertura de  ventanas que provea intimidad (pueden ser cortinas, persianas o contraventanas)";
        String pregunta11_2 = "Cobertura de ventanas igual que 1 estrella";
        String pregunta11_3 = "Si se usan cortinas éstas deben ser largas hasta el piso y opacas.";
        String pregunta11_4 = "Cobertura de ventanas igual que 3 estrellas";
        String pregunta11_5 = "Cobertura en las ventanas debe ser hasta el piso y opacas de manera que no entre la luz (blackout); de utilizar cortinas éstas deben tener corredores laterales.";

        String pregunta12 = "Iluminación y accesorios:";
        String pregunta12_1 = "Una lámpara para leer con un foco de 60 vatios o equivalente";
        String pregunta12_2 = "Iluminación igual que 1 estrella";
        String pregunta12_3 = "Teléfono, televisor y cable; radio reloj despertador, papel y sobre; espejo de cuerpo entero.\n" +
                "Dos lámparas para leer, una al lado de la cama, con foco de al menos 60 vatios o equivalente.\n";
        String pregunta12_4 = "Iluminación y accesorios igual  que 3 estrellas";
        String pregunta12_5 = "Igual que 4 estrellas, más salida de baño de felpa, y dos portaequipajes plegables;  revista con información " +
                "local para el turista o dicha información programada en el televisor.";

        String capitulo5 = "Cuarto de Baño";//p:5, 20

        String pregunta13 = "En todas las categorías de establecimiento se requiere agua corriente caliente y fría disponible las 24 horas del día; presión del agua debe " +
                "ser adecuada; ventilación (a través de descarga o ventana); intimidad.";
        String pregunta13_1 = "Tamaño para que una persona pueda moverse cómodamente; puede tener aparatos sanitarios más antiguos; espejo pequeño arriba de la pileta de manos, con luz suficiente para afeitarse.\n" +
                "\n" +
                "Conexión para aparatos eléctricos cerca de la pileta de manos.\n";
        String pregunta13_2 = "Igual que 1 estrella, espacio limitado para neceser o estante, espejo de buen tamaño; mejor iluminación.\n" +
                "\n" +
                "Conexión para aparatos eléctricos cerca de la pileta de manos.\n";
        String pregunta13_3 = "Igual que 2 estrellas, los aparatos sanitarios y los espejos no deben mostrar ningún desgaste; mostrador o espacio de neceser para los artículos de  dos personas.\n" +
                "\n" +
                "Dos conexiones eléctricas al lado de la pileta de manos\n";
        String pregunta13_4 = "Igual que 3 estrellas, aparatos sanitarios en excelentes condiciones; mostrador amplio para neceser, espejo de pared a pared, enmarcado, biselado, o bien terminado, excelente iluminación.\n" +
                "\n" +
                "Dos conexiones eléctricas al lado de la pileta de manos\n";
        String pregunta13_5 = "Igual que 4 estrellas, más espacioso (debe poder utilizarse confortablemente por dos personas a la vez); espacio de espejo para uso de dos personas; excelente iluminación; espejo de aumento para aplicarse maquillaje.\n" +
                "\n" +
                "Dos conexiones eléctricas al lado de la pileta de manos\n";

        String pregunta14 = "Las paredes deben ser recubiertas de azulejos o mármol o espejos. El área de la ducha debe ser  recubierta  de azulejos o mármol.\n" +
                "Superficie antideslizante o alfombrilla en las duchas o bañeras.\n";
        String pregunta14_1 = "Ducha solamente o combinación bañera/ducha.Las herramientas no deben tener manchas de agua ni estar sucias.";
        String pregunta14_2 = "La ducha igual que 1 estrella. Las herramientas igual que 1 estrella";
        String pregunta14_3 = "La ducha igual que 2 estrellas. Las herramientas igual que 2 estrellas";
        String pregunta14_4 = "Combinación bañera/ducha. Las herramientas deben estar más nuevas, pulidas y sin marcas.";
        String pregunta14_5 = "Combinación bañera/ducha. Las herramientas igual que 4 estrellas.";

        String pregunta15 = "Las toallas no deben estar ni manchadas ni rotas";
        String pregunta15_1 = "Una toalla por huésped como mínimo";
        String pregunta15_2 = "Igual que 1 estrella, con toallero.";
        String pregunta15_3 = "Juego de toallas de baño y de mano; toallero.";
        String pregunta15_4 = "Dos juegos de toallas por huésped. Las toallas deben parecer como nuevas.";
        String pregunta15_5 = "Igual que 4 estrellas, cesto para toallas usadas";

        String pregunta16 = "Los cuartos de baño no deben ser alfombrados. Todos deben tener un cesto para papeles.";
        String pregunta16_1 = "Piso de baldosas o linóleum.";
        String pregunta16_2 = "Pisos igual que 1 estrella";
        String pregunta16_3 = "Pisos igual que 2 estrellas, más esterilla";
        String pregunta16_4 = "Piso de baldosas o mármol, esterilla o alfombra pequeña.";
        String pregunta16_5 = "Pisos igual que 4 estrellas.";

        String pregunta17 = "Cortesías:";
        String pregunta17_1 = "Mínimo una barra de jabón por huésped o un dispensador de jabón líquido en cada cuarto de baño.";
        String pregunta17_2 = "Cortesías igual que 1 estrella";
        String pregunta17_3 = "Igual que 2 estrellas, además pañuelitos faciales y por lo menos dos artículos de cortesía como champú, gorra de baño, loción, estuche para costura, etc.";
        String pregunta17_4 = "Artículos de cortesías igual que 3 estrellas, secador de cabello.";
        String pregunta17_5 = "Artículos de cortesías igual que 4 estrellas.";

        String capitulo6 = "Equipo Recreativo";//p:1, 5

        String pregunta18 = "Una empresa recibe puntos por el equipo recreativo solamente cuando esté en buena condición, funcione bien y esté limpio. Por ejemplo, " +
                "el mobiliario y el equipo no deben estar rotos, la tela de las sombrillas no debe estar rota ni manchada, el mobiliario debe estar ordenado y limpio, " +
                "los azulejos de la piscina no deben estar rotos, el agua no debe parecer turbia y no debe haber basura en el fondo de la piscina.";
        String pregunta18_1 = "Un hotel de clasificación de 1 estrella, no tiene que ofrecer actividades de recreo o poseer instalaciones para las mismas";
        String pregunta18_2 = "Tiene que tener por lo menos un tipo de equipo recreativo: piscina y muebles alrededor de la piscina, servicio de comida/bebidas al lado de " +
                "la piscina, campo de golf, cancha de voleibol, equipo de ejercicio, sauna, jacuzzi/spa, equipo de deporte acuático (botes de vela, jetski, etc.), excursiones " +
                "de pesca o naturaleza, caballos, juegos (ajedrez, billar, ping pong, etc.)";
        String pregunta18_3 = "Tiene que tener por lo menos 2 tipos de equipo recreativo.";
        String pregunta18_4 = "Tiene que tener por lo menos tres tipos de equipo recreativo.";
        String pregunta18_5 = "Tiene que tener por lo menos cuatro tipos o más de equipo recreativo.\n" +
                "Se debe ordenar continuamente los muebles en las terrazas y alrededor de la piscina.\n";

        String capitulo7 = "Comedores o Restaurantes";//p:3,  7.5

        String pregunta19 = "Todos los comedores deben estar limpios, ordenados y bien iluminados. El restaurante debe tener servicios sanitarios accesibles.";
        String pregunta19_1 = "Cuenta con un comedor con servicio de desayuno con horas limitadas.\n" +
                "Mobiliario en buenas condiciones.\n";
        String pregunta19_2 = "Cuenta con un comedor con servicio de desayuno y almuerzo/merienda.\n" +
                "Igual que 1 estrella. Cristalería/lencería de acuerdo con el tipo de establecimiento.\n";
        String pregunta19_3 = "Un restaurante con servicio de desayuno, almuerzo y cena.\n" +
                "Igual que 2 estrellas.\n";
        String pregunta19_4 = "En áreas urbanas pueden tener dos tipos de comedores, incluyendo un restaurante con servicio de desayuno, almuerzo y cena.\n" +
                "Muebles en excelentes condiciones.\n";
        String pregunta19_5 = "Igual que 4 estrellas, con un restaurante de lujo.\n" +
                "Cristalería y lencería en óptimas condiciones.\n";

        String pregunta20 = "Los camareros  deben tener aspecto aseado y nítido.";
        String pregunta20_1 = "Los camareros pueden tener vestimenta “informal”";
        String pregunta20_2 = "Los camareros pueden usar vestimenta “informal”";
        String pregunta20_3 = "Los camareros debe tener vestimenta coordinada para personal en posiciones similares";
        String pregunta20_4 = "Los camareros deben tener uniformes de carácter  formal";
        String pregunta20_5 = "Los camareros deben tener uniformes de carácter formal.";

        String pregunta21 = "Sobremesa:";
        String pregunta21_1 = "La sobremesa tiene que tener vajilla, cubiertos y servilletas de papel.";
        String pregunta21_2 = "La sobremesa tiene que tener vajilla y cubiertos coordinados; mantel o individuales de papel/hule/vinil; servilletas de papel.";
        String pregunta21_3 = "La sobremesa debe tener vajilla y cubiertos coordinados, mantel y servilletas de tela.";
        String pregunta21_4 = "La sobremesa debe tener vajilla de porcelana, cubiertos plateados o de acero inoxidable, vasos y copas de vidrio, manteles y servilletas de tela, y centro mesa.";
        String pregunta21_5 = "La sobremesa en el restaurante de lujo debe tener vajilla de porcelana, cubiertos plateados, vasos y copas de cristal, mantel y servilletas de tela, un centro " +
                "de mesa (flores), y velas/candelabros.";

        String capitulo8 = "Servicio para Huéspedes";//p:2, 7.5

        String pregunta22 = "Debe haber siempre un empleado de turno a la entrada del establecimiento en zonas urbanas.\n" +
                "\n" +
                "Servicios:\n";
        String pregunta22_1 = "Por lo menos uno de los servicios siguientes: portero, botones, conserje, personal bilingüe (en idiomas típicos de la clientela del hotel)," +
                " transporte del/al aeropuerto, periódico local de cortesía, regalito (flores, chocolate, etc.), lavandería, servicios de negocios (fax, fotocopiadoras, etc.), servicio de despertador.";
        String pregunta22_2 = "Por lo menos dos de los servicios mencionados.";
        String pregunta22_3 = "Por lo menos tres de los servicios mencionados.";
        String pregunta22_4 = "Por lo menos cuatro de los servicios mencionados.\n" +
                "\n" +
                "Se ofrece servicios a las habitaciones al atardecer, incluyendo: doblar las cubrecamas, acomodar las almohadas, poner en orden el baño, cambiar las toallas " +
                "de ser necesario, vaciar los cestos para papelera, cerrar las cortinas y prender las luces dejando un pequeño obsequio, caramelo, flor o mensaje para el huésped\n";
        String pregunta22_5 = "Todos los servicios mencionados.\n" +
                "\n" +
                "Los Servicios igual que 4 estrellas, pero a la hora que lo desee el huésped\n";

        String pregunta23 = "Los empleados deben tener el aspecto aseado y nítido.";
        String pregunta23_1 = "Los empleados pueden tener vestimenta informal.";
        String pregunta23_2 = "Los empleados pueden usar vestimenta informal.";
        String pregunta23_3 = "Los empleados deben tener vestimenta coordinada para personal en posiciones similares.";
        String pregunta23_4 = "Los empleados deben tener uniforme y gafetes.";
        String pregunta23_5 = "Los empleados deben tener uniforme y gafetes.";

        String capitulo9 = "Limpieza";//p:1,   15

        String pregunta24 = "Independientemente de la clasificación del hotel, todas las áreas deben estar limpias.\n" +
                "Servicio diario de camareras en las habitaciones de huéspedes.\n" +
                "La clasificación dada al servicio de limpieza acarrea una gran importancia en la totalidad de la evaluación y puede afectar la evaluación del hotel  y bajar su clasificación, sino se satisfacen las expectativas.\n";
        String pregunta24_1 = "Todo debe estar limpio (i.e., no hay polvo debajo de las camas, ni manchas de agua en las mesas del restaurante, ni basura en las áreas públicas).";
        String pregunta24_2 = "Igual que 1 estrella, pero se ha prestado más atención a los detalles; por ejemplo debajo de los teléfonos, sobre las ventanas y cuadros, y en los rincones de las habitaciones.";
        String pregunta24_3 = "Igual que 2 estrellas, pero todo debe brillar como la madera del suelo y las herramientas de los cuartos de baño.";
        String pregunta24_4 = "Igual que 3 estrellas, pero todo debe parece como nuevo.";
        String pregunta24_5 = "Todo debe estar impecable.";

        String capitulo10 = "Mantenimiento";//p:1,  15

        String pregunta25 = "Todo lo provisto por el hotel debe estar bien mantenido y reparado debidamente, independientemente de la clasificación del hotel.\n" +
                "Al igual que con el servicio de limpieza, la evaluación recibida en mantenimiento acarrea una gran importancia en la evaluación total y puede " +
                "disminuir la evaluación del hotel, sino se satisfacen las expectativas\n";
        String pregunta25_1 = "Todo debe funcionar, aunque se observe desgaste.";
        String pregunta25_2 = "Igual que 1 estrella, pero la pintura debe de estar en buenas condiciones y se debe observar poco desgaste.";
        String pregunta25_3 = "Buen mantenimiento, es decir que no se observe ningún desgaste.";
        String pregunta25_4 = "Mantenimiento excelente y consistente para que no se observe madera dañada, muebles rotos, etc.";
        String pregunta25_5 = "Mantenimiento impecable. Todo debe lucir y funcionar como nuevo.";

        ArrayList<QuestionDefHotel> questions1 = new ArrayList<>();
        questions1.add(new QuestionDefHotel("1",pregunta1,pregunta1_1,pregunta1_2,pregunta1_3,pregunta1_4,pregunta1_5));
        questions1.add(new QuestionDefHotel("2",pregunta2,pregunta2_1,pregunta2_2,pregunta2_3,pregunta2_4,pregunta2_5));

        ArrayList<QuestionDefHotel> questions2 = new ArrayList<>();
        questions2.add(new QuestionDefHotel("3",pregunta3,pregunta3_1,pregunta3_2,pregunta3_3,pregunta3_4,pregunta3_5));

        ArrayList<QuestionDefHotel> questions3 = new ArrayList<>();
        questions3.add(new QuestionDefHotel("4",pregunta4,pregunta4_1,pregunta4_2,pregunta4_3,pregunta4_4,pregunta4_5));

        ArrayList<QuestionDefHotel> questions4 = new ArrayList<>();
        questions4.add(new QuestionDefHotel("5",pregunta5,pregunta5_1,pregunta5_2,pregunta5_3,pregunta5_4,pregunta5_5));
        questions4.add(new QuestionDefHotel("6",pregunta6,pregunta6_1,pregunta6_2,pregunta6_3,pregunta6_4,pregunta6_5));
        questions4.add(new QuestionDefHotel("7",pregunta7,pregunta7_1,pregunta7_2,pregunta7_3,pregunta7_4,pregunta7_5));
        questions4.add(new QuestionDefHotel("8",pregunta8,pregunta8_1,pregunta8_2,pregunta8_3,pregunta8_4,pregunta8_5));
        questions4.add(new QuestionDefHotel("9",pregunta9,pregunta9_1,pregunta9_2,pregunta9_3,pregunta9_4,pregunta9_5));
        questions4.add(new QuestionDefHotel("10",pregunta10,pregunta10_1,pregunta10_2,pregunta10_3,pregunta10_4,pregunta10_5));
        questions4.add(new QuestionDefHotel("11",pregunta11,pregunta11_1,pregunta11_2,pregunta11_3,pregunta11_4,pregunta11_5));
        questions4.add(new QuestionDefHotel("12",pregunta12,pregunta12_1,pregunta12_2,pregunta12_3,pregunta12_4,pregunta12_5));

        ArrayList<QuestionDefHotel> questions5 = new ArrayList<>();
        questions5.add(new QuestionDefHotel("13",pregunta13,pregunta13_1,pregunta13_2,pregunta13_3,pregunta13_4,pregunta13_5));
        questions5.add(new QuestionDefHotel("14",pregunta14,pregunta14_1,pregunta14_2,pregunta14_3,pregunta14_4,pregunta14_5));
        questions5.add(new QuestionDefHotel("15",pregunta15,pregunta15_1,pregunta15_2,pregunta15_3,pregunta15_4,pregunta15_5));
        questions5.add(new QuestionDefHotel("16",pregunta16,pregunta16_1,pregunta16_2,pregunta16_3,pregunta16_4,pregunta16_5));
        questions5.add(new QuestionDefHotel("17",pregunta17,pregunta17_1,pregunta17_2,pregunta17_3,pregunta17_4,pregunta17_5));

        ArrayList<QuestionDefHotel> questions6 = new ArrayList<>();
        questions6.add(new QuestionDefHotel("18",pregunta18,pregunta18_1,pregunta18_2,pregunta18_3,pregunta18_4,pregunta18_5));

        ArrayList<QuestionDefHotel> questions7 = new ArrayList<>();
        questions7.add(new QuestionDefHotel("19",pregunta19,pregunta19_1,pregunta19_2,pregunta19_3,pregunta19_4,pregunta19_5));
        questions7.add(new QuestionDefHotel("20",pregunta20,pregunta20_1,pregunta20_2,pregunta20_3,pregunta20_4,pregunta20_5));
        questions7.add(new QuestionDefHotel("21",pregunta21,pregunta21_1,pregunta21_2,pregunta21_3,pregunta21_4,pregunta21_5));

        ArrayList<QuestionDefHotel> questions8 = new ArrayList<>();
        questions8.add(new QuestionDefHotel("22",pregunta22,pregunta22_1,pregunta22_2,pregunta22_3,pregunta22_4,pregunta22_5));
        questions8.add(new QuestionDefHotel("23",pregunta23,pregunta23_1,pregunta23_2,pregunta23_3,pregunta23_4,pregunta23_5));

        ArrayList<QuestionDefHotel> questions9 = new ArrayList<>();
        questions9.add(new QuestionDefHotel("24",pregunta24,pregunta24_1,pregunta24_2,pregunta24_3,pregunta24_4,pregunta24_5));

        ArrayList<QuestionDefHotel> questions10 = new ArrayList<>();
        questions10.add(new QuestionDefHotel("25",pregunta25,pregunta25_1,pregunta25_2,pregunta25_3,pregunta25_4,pregunta25_5));

        ArrayList<ChapterDefHotel> chapters = new ArrayList<>();
        chapters.add(new ChapterDefHotel(capitulo1,"1",5f,questions1));
        chapters.add(new ChapterDefHotel(capitulo2,"2",2.5f,questions2));
        chapters.add(new ChapterDefHotel(capitulo3,"3",2.5f,questions3));
        chapters.add(new ChapterDefHotel(capitulo4,"4",20f,questions4));
        chapters.add(new ChapterDefHotel(capitulo5,"5",20f,questions5));
        chapters.add(new ChapterDefHotel(capitulo6,"6",5f,questions6));
        chapters.add(new ChapterDefHotel(capitulo7,"7",7.5f,questions7));
        chapters.add(new ChapterDefHotel(capitulo8,"8",7.5f,questions8));
        chapters.add(new ChapterDefHotel(capitulo9,"9",15f,questions9));
        chapters.add(new ChapterDefHotel(capitulo10,"10",15f,questions10));

        FormDefHotel formDefHotel = new FormDefHotel("MANUAL DE HOTELES",2,chapters);


        return formDefHotel;
    }//READY 2

    public static FormDefBinary getFormTravelAgenciesDef(){
        String pregunta0 = "Tiene el Permiso de Funcionamiento vigente.";
        String pregunta1 = "La Patente Municipal se encuentra vigente.";
        String pregunta2 = "Tiene Seguro de Responsabilidad Civil y gastos médicos.";
        String pregunta3 = "Cuando se ofertan las actividades de Turismo de Aventura,  las mismas se dan en apego a la normativa vigente. (Ministerio de Salud)";
        String pregunta4 = "Se dispone de un Protocolo para la recepción, atención y partida de los turistas.";
        String pregunta5 = "Se dispone de información y protocolos  para contactar servicios de emergencia y médicos.";
        String pregunta6 = "Los Guías tienen el carnet de acreditacion del ICT.";
        String pregunta7 = "En el caso de los Guías de Turismo Freelance  tienen al día  el curso de Primeros Auxilios y RCP.";
        String pregunta8 = "La empresa usa folletos u otro material promocional ya sea impreso o digital.";
        String pregunta9 = "El material promocional indica los servicios a los cuales el turista tiene acceso.";
        String pregunta10 = "Se dispone de medios audio visuales para ofrecer los paquetes.";
        String pregunta11 = "Tiene la empresa Reglamento Interno de Operación para el desarrollo de sus actividades.";

        String pregunta12 = "Cuenta con oficina de atención al público.";
        String pregunta13 = "En la oficina se exhibe el material promocional impreso de los programas que ofrece la Agencia. ";
        String pregunta14 = "El personal de oficinas  se encuentra uniformado.";
        String pregunta15 = "El personal de servicio se encuentra identificado con gafete o carnet visible, que incluye el logo de la empresa.";
        String pregunta16 = "Se cuenta con instructivos de información sobre Seguridad al Turista.";
        String pregunta17 = "La oficina se encuentra rotulada con el nombre comercial de la Agencia";
        String pregunta18 = "Se identifican las diferentes áreas de servicio al cliente";
        String pregunta19 = "La oficina tiene como uso exclusivo la actividad turística";
        String pregunta20 = "Se dispone de sanitarios para uso de los clientes";
        String pregunta21 = "Los sanitarios se encuentran en  buen estado de mantenimiento y limpieza.";
        String pregunta22 = "La decoración y ambientación es acorde a la actividad turística que se desarrolla.";
        String pregunta23 = "El equipo y las instalaciones funcionan correctamente.";
        String pregunta24 = "La instalaciones se encuentran en buen estado de mantenimiento y limpieza";
        String pregunta25 = "Los vehículos utilizados se encuentran debidamente rotulados con el nombre comercial de la Agencia.";

        String pregunta26 = "Se identifica el paquete con el nombre, tarifas y vigencia del mismo.";
        String pregunta27 = "Se identifica la duración e itinerarios del paquete o tours";
        String pregunta28 = "Se identifican los servicios que están incluídos en el paquete o tours.";
        String pregunta29 = "Se identifican los servicios opcionales por programa o paquetes.";
        String pregunta30 = "Se identifican los medios y periodicidad para la revisión de los paquetes o programas.";
        String pregunta31 = "Se dan a conocer las responsabilidades en que incurre la Agencia de Viajes en cada uno de los paquetes.";
        String pregunta32 = "Se indican el tipo de seguros incluídos en cada paquete o tours.";
        String pregunta33 = "Cuando los paquetes sean ofrecidos por otros prestadores se incluye la información sobre sus responsabilidades legales y de seguros vigentes.";

        String pregunta34 = "Se dispone de un procedimiento documentado para las reservas y ventas";
        String pregunta35 = "Cuenta con  mecanismos para las reservas con distintos proveedores de servicios.";
        String pregunta36 = "Cuenta con  un procedimiento para la cancelación de las reservaciones de parte de los turistas (No Show).";
        String pregunta37 = "Cuenta con información sobre los  sistemas de pagos que puede aplicar el cliente ( Pre pago, anticipos).";
        String pregunta38 = "Se cuenta con un procedimiento escrito que indique plazos, condiciones de cancelación modificación o postergación de los servicios contratados.";
        String pregunta39 = "Se establecen los procedimientos para multas, penalidades y cargos por conceptos de servicios.";
        String pregunta40 = "Se cuenta con  información sobre paquetes o programas por temporada, con tarifas diferenciadas.";
        String pregunta41 = "Se cuenta con un procedimiento que regule las ofertas y promociones.";

        String pregunta42 = "La empresa cuenta con una política ambiental, escrita.";
        String pregunta43 = "Se da conocimiento al turista de la política ambiental de la empresa (folleto informativo)";
        String pregunta44 = "Se establecen recomendaciones para el Turista sobre su comportamiento para con el medio natural.";
        String pregunta45 = "La empresa demuestra  que  dispone de políticas y procedimientos para el manejo de desechos en sus oficinas centrales. ";
        String pregunta46 = "La empresa demuestra que tiene   politicas y  procedimientos  para el manejo de desechos generados durante el desarrollo de la actividad.";
        String pregunta47 = "Cuando las actividades  se desarrollan en un Area Natural Protegida,  la agencia cuenta con material informativo sobre las políticas de manejo dentro del sitio.";
        String pregunta48 = "La empresa demuestra  que esta interesada en implementar medidas para reducir su impacto  con el medio ambiente (uso de productos biodegradables, etc).";
        String pregunta49 = "La empresa desarrolla programas ambientales con la comunidad inmediata.";

        String pregunta50 = "La declaración de Misión de la Organización contempla  “el servicio al cliente.“";  //“
        String pregunta51 = "La empresa  tiene una política escrita de servicio al cliente";
        String pregunta52 = "La Junta Directiva consigna recursos suficientes para dar mantenimiento o seguimiento al tema e \"Servicio al Cliente\".";
        String pregunta53 = "El servicio al cliente esta incuido en el  programa de inducción.\n";
        String pregunta54 = "La empresa dispone de un sistema de medición de la satisfacción del cliente.\n";
        String pregunta55 = "Se han establecido mecanismos de seguimiento y responsables de la medición de las encuestas al cliente.\n";
        String pregunta56 = "La empresa tiene un procedimiento escrito  para tratar las quejas de los turistas.\n";
        String pregunta57 = "La empresa proporciona  entrenamiento periódico para reforzar la importancia del servicio al cliente.\n";



        ArrayList<QuestionDefBinary> questions1 = new ArrayList<>(); // [0-11]
        questions1.add(new QuestionDefBinary("1",pregunta0));
        questions1.add(new QuestionDefBinary("2",pregunta1));
        questions1.add(new QuestionDefBinary("3",pregunta2));
        questions1.add(new QuestionDefBinary("4",pregunta3));
        questions1.add(new QuestionDefBinary("5",pregunta4));
        questions1.add(new QuestionDefBinary("6",pregunta5));
        questions1.add(new QuestionDefBinary("7",pregunta6));
        questions1.add(new QuestionDefBinary("8",pregunta7));
        questions1.add(new QuestionDefBinary("9",pregunta8));
        questions1.add(new QuestionDefBinary("10",pregunta9));
        questions1.add(new QuestionDefBinary("11",pregunta10));
        questions1.add(new QuestionDefBinary("12",pregunta11));

        ArrayList<QuestionDefBinary> questions2 = new ArrayList<>(); // [12-25]
        questions2.add(new QuestionDefBinary("1",pregunta12));
        questions2.add(new QuestionDefBinary("2",pregunta13));
        questions2.add(new QuestionDefBinary("3",pregunta14));
        questions2.add(new QuestionDefBinary("4",pregunta15));
        questions2.add(new QuestionDefBinary("5",pregunta16));
        questions2.add(new QuestionDefBinary("6",pregunta17));
        questions2.add(new QuestionDefBinary("7",pregunta18));
        questions2.add(new QuestionDefBinary("8",pregunta19));
        questions2.add(new QuestionDefBinary("9",pregunta20));
        questions2.add(new QuestionDefBinary("10",pregunta21));
        questions2.add(new QuestionDefBinary("11",pregunta22));
        questions2.add(new QuestionDefBinary("12",pregunta23));
        questions2.add(new QuestionDefBinary("13",pregunta24));
        questions2.add(new QuestionDefBinary("14",pregunta25));

        ArrayList<QuestionDefBinary> questions3 = new ArrayList<>(); // [26-33]
        questions3.add(new QuestionDefBinary("1",pregunta26));
        questions3.add(new QuestionDefBinary("2",pregunta27));
        questions3.add(new QuestionDefBinary("3",pregunta28));
        questions3.add(new QuestionDefBinary("4",pregunta29));
        questions3.add(new QuestionDefBinary("5",pregunta30));
        questions3.add(new QuestionDefBinary("6",pregunta31));
        questions3.add(new QuestionDefBinary("7",pregunta32));
        questions3.add(new QuestionDefBinary("8",pregunta33));

        ArrayList<QuestionDefBinary> questions4 = new ArrayList<>(); // [34-41]
        questions4.add(new QuestionDefBinary("1",pregunta34));
        questions4.add(new QuestionDefBinary("2",pregunta35));
        questions4.add(new QuestionDefBinary("3",pregunta36));
        questions4.add(new QuestionDefBinary("4",pregunta37));
        questions4.add(new QuestionDefBinary("5",pregunta38));
        questions4.add(new QuestionDefBinary("6",pregunta39));
        questions4.add(new QuestionDefBinary("7",pregunta40));
        questions4.add(new QuestionDefBinary("8",pregunta41));

        ArrayList<QuestionDefBinary> questions5 = new ArrayList<>(); // [42-49]
        questions5.add(new QuestionDefBinary("1",pregunta42));
        questions5.add(new QuestionDefBinary("2",pregunta43));
        questions5.add(new QuestionDefBinary("3",pregunta44));
        questions5.add(new QuestionDefBinary("4",pregunta45));
        questions5.add(new QuestionDefBinary("5",pregunta46));
        questions5.add(new QuestionDefBinary("6",pregunta47));
        questions5.add(new QuestionDefBinary("7",pregunta48));
        questions5.add(new QuestionDefBinary("8",pregunta49));

        ArrayList<QuestionDefBinary> questions6 = new ArrayList<>(); // [50-57]
        questions6.add(new QuestionDefBinary("1",pregunta50));
        questions6.add(new QuestionDefBinary("2",pregunta51));
        questions6.add(new QuestionDefBinary("3",pregunta52));
        questions6.add(new QuestionDefBinary("4",pregunta53));
        questions6.add(new QuestionDefBinary("5",pregunta54));
        questions6.add(new QuestionDefBinary("6",pregunta55));
        questions6.add(new QuestionDefBinary("7",pregunta56));
        questions6.add(new QuestionDefBinary("8",pregunta57));

        ArrayList<ChapterDefBinary> chapters = new ArrayList<>();
        chapters.add(new ChapterDefBinary("De la Organizacion","1",20,questions1));
        chapters.add(new ChapterDefBinary("De la Operacion y Planta Fisica","2",24,questions2));
        chapters.add(new ChapterDefBinary("Diseño de los paquetes","3",13,questions3));
        chapters.add(new ChapterDefBinary("Reservas y Ventas","4",13,questions4));
        chapters.add(new ChapterDefBinary("Variables ambientales","5",13,questions5));
        chapters.add(new ChapterDefBinary("Servicio al Cliente","6",17,questions6));

        return new FormDefBinary("Calificación para las Agencias de Viajes",3,chapters);

    } //READY 3

    public static FormDefBinary getFormRentVehiclesDef(){
        String pregunta0 = "Tiene el Permiso de Funcionamiento vigente.";
        String pregunta1 = "La Patente Municipal se encuentra vigente.";
        String pregunta2 = "Los vehículos están inscritos ante el Registro de la Propiedad.";
        String pregunta3 = "Los vehículos inscritos en el Registro son propiedad de la empresa que ostenta la Declaratoria Turística/ Leasing.";
        String pregunta4 = "Tiene la aprobación de la Inspección Técnica Vehicular";
        String pregunta5 = "Tiene Seguro de Responsabilidad Civil y gastos médicos.";
        String pregunta6 = "El Derecho de Circulación de los autos está vigente";
        String pregunta7 = "Se cuenta con la Aprobación del Ministerio de Salud para las actividades de Cuadraciclos";
        String pregunta8 = "La empresa lleva un registro de los Contratos de arrendamiento. ";
        String pregunta9 = "La empresa usa folletos u otro material promocional.";
        String pregunta10 = "El material promocional indica los servicios a los cuales el turista tiene acceso.";
        String pregunta11 = "Tiene la empresa Reglamento Interno de Operación para el desarrollo de sus actividades.";

        String pregunta12 = "Cuenta con oficina de atención de público, debidamente acondicionada.";
        String pregunta13 = "Las Oficinas de atención al cliente estan debidamente identificadas con el nombre comercial de la empresa";
        String pregunta14 = "Se cuenta con una sala de espera con facilidades para uso de los clientes.";
        String pregunta15 = "En la oficina se exhibe el material promocional en donde se indican los servicios que se brindan. ";
        String pregunta16 = "El personal de oficinas se encuentra uniformado.";
        String pregunta17 = "El personal de servicio se encuentra uniformado.";
        String pregunta18 = "El personal que atiende a los turistas lleva su correspondiente gafete.";
        String pregunta19 = "Se cuenta con instructivos de información sobre Seguridad al Turista.";
        String pregunta20 = "Todos los servicios y accesos a las actividades se encuentran señalados.";
        String pregunta21 = "Presenta facilidades de acceso para personas con capacidad física reString ida";
        String pregunta22 = "Los servicios sanitarios públicos están equipados con los accesorios básicos: Porta-papel, porta-toallas, secador de manos, espejos, jabonera líquida, y basureros. ";
        String pregunta23 = "La loza sanitaria (inodoros, lavabos, y otros), se encuentra en buen estado de mantenimiento y limpieza.";
        String pregunta24 = "Los servicios sanitarios se encuentra en buen estado de mantenimiento y limpieza.";
        String pregunta25 = "La sala de espera se encuentra en buen estado de mantenimiento ";
        String pregunta26 = "La sala de espera se encuentra en buen estado de limpieza";
        String pregunta27 = "Se dispone de Sucursales";
        String pregunta28 = "Las áreas de estacionamiento para la flotilla estan señalizadas";
        String pregunta29 = "Existe un Programa de Mantenimiento para las instalaciones";
        String pregunta30 = "Existe un Programa de Limpieza para las instalaciones";

        String pregunta31 = "Se cuenta con un Plan de Evacuación en las instalaciones";
        String pregunta32 = "Existe equipo para combatir el fuego en las oficinas";
        String pregunta33 = "El Plan de evacuación está colocado en un área visible ";
        String pregunta34 = "El Protocolo indica que debe hacer el Personal de Planta en caso de averias en ruta";
        String pregunta35 = "El Protocolo indica que debe hacer el Personal de Planta en caso de emergencias en ruta.";
        String pregunta36 = "El Plan indica cómo y cuándo se deben activar los Protocolosde seguridad y asistencia al turista.";
        String pregunta37 = "Se dispone de un Protocolo para el Mantenimiento de los autos";
        String pregunta38 = "La empresa dispone de una bitácora de Mantenimiento para cada auto";
        String pregunta39 = "La hoja de Mantenimiento menciona las condiciones mecanicas y las eléctricas";
        String pregunta40 = "Se dispone de un inventario de repuestos básicos ( de emergencia)";
        String pregunta41 = "Existe equipo para extinguir incendios en los autos";
        String pregunta42 = "Se cuenta con chalecos reflectivos en los autos";
        String pregunta43 = "Se dispone de Triángulos de Seguridad en cada auto";
        String pregunta44 = "Existentes procedimientos para los procesos de llenado de combustible cuando se da en las oficinas de la agencia";

        String pregunta45 = "La empresa cuenta con una política medio ambiental";
        String pregunta46 = "Se da conocimiento al turista de la política ambiental de la empresa (folleto informativo u otro medio audio visual)";
        String pregunta47 = "Se establecen recomendaciones para el Turista sobre su comportamiento para con el medio natural.";
        String pregunta48 = "La empresa demuestra que dispone de políticas y procedimientos para el manejo de la basura generada durante el desarrollo de la actividad y la generada en el sitio.";
        String pregunta49 = "La empresa demuestra que cuenta con procedimientos para controlar los ruidos, olores, vibración, impacto visual, energía térmica sobre el ambiente";
        String pregunta50 = " La empresa demuestra que esta interesada en implementar medidas para reducir su impacto con el medio ambiente (uso de productos biodegradables, etc).";
        String pregunta51 = "La empresa desarrolla programas ambientales con la comunidad inmediata";

        String pregunta52 = "La declaración de Misión de la Organización menciona “el servicio al cliente“ como parte de su carácter especial.";
        String pregunta53 = "La empresa demuestra que tiene una política escrita de servicio al cliente";
        String pregunta54 = "El servicio al cliente esta incuido en el Plan de Mercadeo";
        String pregunta55 = "La empresa dispone de un sistema de medición de la satisfacción del cliente.";
        String pregunta56 = "La Junta Directiva o el más alto nivel de la empresa utiliza la información del servicio al cliente como base para tomar decisiones.";
        String pregunta57 = "La Junta Directiva consigna recursos suficientes para dar mantenimiento o seguimiento al tema de “Servicio al Cliente“.";
        String pregunta58 = "Las boletas o formularios relacionados con el servicio al cliente se llevan en un archivo debidamente foliado.";
        String pregunta59 = "Al personal se le dan instrucciones claras respecto a la naturaleza de su esperada contribución al servicio al cliente. ";
        String pregunta60 = "El servicio al cliente se evalúa periódicamente en busca de la mejora continúa.";
        String pregunta61 = "La empresa tiene un procedimiento legal para tratar las quejas de los turistas consumidores y que esta reflejado en su documento de contrato- standard Conditions of Offer and Contract for Research and Consultancy.";
        String pregunta62 = "Sigue y contesta las quejas que surgen de sus Representantes o Comercializadores (Otros prestadores de Servicios como las Oficinas de Reservaciones, Agencias de Viajes, Hoteles, etc.";
        String pregunta63 = "La empresa proporciona entrenamiento periódico para reforzar la importancia del servicio al cliente. ";

        ArrayList<QuestionDefBinary> questions1 = new ArrayList<>(); // [0-11]
        questions1.add(new QuestionDefBinary("1",pregunta0));
        questions1.add(new QuestionDefBinary("2",pregunta1));
        questions1.add(new QuestionDefBinary("3",pregunta2));
        questions1.add(new QuestionDefBinary("4",pregunta3));
        questions1.add(new QuestionDefBinary("5",pregunta4));
        questions1.add(new QuestionDefBinary("6",pregunta5));
        questions1.add(new QuestionDefBinary("7",pregunta6));
        questions1.add(new QuestionDefBinary("8",pregunta7));
        questions1.add(new QuestionDefBinary("9",pregunta8));
        questions1.add(new QuestionDefBinary("10",pregunta9));
        questions1.add(new QuestionDefBinary("11",pregunta10));
        questions1.add(new QuestionDefBinary("12",pregunta11));

        ArrayList<QuestionDefBinary> questions2 = new ArrayList<>(); // [12-30]
        questions2.add(new QuestionDefBinary("1",pregunta12));
        questions2.add(new QuestionDefBinary("2",pregunta13));
        questions2.add(new QuestionDefBinary("3",pregunta14));
        questions2.add(new QuestionDefBinary("4",pregunta15));
        questions2.add(new QuestionDefBinary("5",pregunta16));
        questions2.add(new QuestionDefBinary("6",pregunta17));
        questions2.add(new QuestionDefBinary("7",pregunta18));
        questions2.add(new QuestionDefBinary("8",pregunta19));
        questions2.add(new QuestionDefBinary("9",pregunta20));
        questions2.add(new QuestionDefBinary("10",pregunta21));
        questions2.add(new QuestionDefBinary("11",pregunta22));
        questions2.add(new QuestionDefBinary("12",pregunta23));
        questions2.add(new QuestionDefBinary("13",pregunta24));
        questions2.add(new QuestionDefBinary("14",pregunta25));
        questions2.add(new QuestionDefBinary("15",pregunta26));
        questions2.add(new QuestionDefBinary("16",pregunta27));
        questions2.add(new QuestionDefBinary("17",pregunta28));
        questions2.add(new QuestionDefBinary("18",pregunta29));
        questions2.add(new QuestionDefBinary("19",pregunta30));

        ArrayList<QuestionDefBinary> questions3 = new ArrayList<>(); // [31-44]
        questions3.add(new QuestionDefBinary("1",pregunta31));
        questions3.add(new QuestionDefBinary("2",pregunta32));
        questions3.add(new QuestionDefBinary("3",pregunta33));
        questions3.add(new QuestionDefBinary("4",pregunta34));
        questions3.add(new QuestionDefBinary("5",pregunta35));
        questions3.add(new QuestionDefBinary("6",pregunta36));
        questions3.add(new QuestionDefBinary("7",pregunta37));
        questions3.add(new QuestionDefBinary("8",pregunta38));
        questions3.add(new QuestionDefBinary("9",pregunta39));
        questions3.add(new QuestionDefBinary("10",pregunta40));
        questions3.add(new QuestionDefBinary("11",pregunta41));
        questions3.add(new QuestionDefBinary("12",pregunta42));
        questions3.add(new QuestionDefBinary("13",pregunta43));
        questions3.add(new QuestionDefBinary("14",pregunta44));

        ArrayList<QuestionDefBinary> questions4 = new ArrayList<>(); // [45-51]
        questions4.add(new QuestionDefBinary("1",pregunta45));
        questions4.add(new QuestionDefBinary("2",pregunta46));
        questions4.add(new QuestionDefBinary("3",pregunta47));
        questions4.add(new QuestionDefBinary("4",pregunta48));
        questions4.add(new QuestionDefBinary("5",pregunta49));
        questions4.add(new QuestionDefBinary("6",pregunta50));
        questions4.add(new QuestionDefBinary("7",pregunta51));

        ArrayList<QuestionDefBinary> questions5 = new ArrayList<>(); // [52-63]
        questions5.add(new QuestionDefBinary("1",pregunta52));
        questions5.add(new QuestionDefBinary("2",pregunta53));
        questions5.add(new QuestionDefBinary("3",pregunta54));
        questions5.add(new QuestionDefBinary("4",pregunta55));
        questions5.add(new QuestionDefBinary("5",pregunta56));
        questions5.add(new QuestionDefBinary("6",pregunta57));
        questions5.add(new QuestionDefBinary("7",pregunta58));
        questions5.add(new QuestionDefBinary("8",pregunta59));
        questions5.add(new QuestionDefBinary("9",pregunta60));
        questions5.add(new QuestionDefBinary("10",pregunta61));
        questions5.add(new QuestionDefBinary("11",pregunta62));
        questions5.add(new QuestionDefBinary("12",pregunta63));

        ArrayList<ChapterDefBinary> chapters = new ArrayList<>();
        chapters.add(new ChapterDefBinary("De la Organizacion","1",19,questions1));
        chapters.add(new ChapterDefBinary("De la Operacion de la Actividad","2",30,questions2));
        chapters.add(new ChapterDefBinary("Seguridad","3",22,questions3));
        chapters.add(new ChapterDefBinary("Variables ambientales","4",11,questions4));
        chapters.add(new ChapterDefBinary("Servicio al Cliente","5",19,questions5));

        return new FormDefBinary("Calificación para Empresas de Alquiler de Automóviles,Cuadraciclos y Motocicletas",4,chapters);
    } //READY 4

    public static FormDefBinary getFormAirLinesDef() {
        String pregunta0 = "Tiene el Permiso de Funcionamiento vigente.";
        String pregunta1 = "La Patente Municipal se encuentra vigente. ";
        String pregunta2 = "Tiene Seguro de Responsabilidad Civil y gastos médicos.";
        String pregunta3 = "Se dispone de los Permisos correspondientes de Aviación Civil, para el desarrollo de sus actividades.";
        String pregunta4 = "Se dispone de un Protocolo para la recepción, atención y partida de los turistas.";
        String pregunta5 = "Se dispone de información y protocolos para contactar servicios de emergencia y médicos.";
        String pregunta6 = "La empresa usa folletos u otro material promocional ya sea impreso o digital.";
        String pregunta7 = "El material promocional indica los servicios a los cuales el turista tiene acceso.";
        String pregunta8 = "Se dispone de medios audio visuales para ofrecer sus diferentes programas de viajes.";
        String pregunta9 = "Tiene la empresa Reglamento Interno de Operación para el desarrollo de sus actividades.";

        String pregunta10 = "Cuenta con oficina de atención al público.";
        String pregunta11 = "En la oficina se exhibe el material promocional impreso de los programas de la Línera Aérea.";
        String pregunta12 = "El personal de oficinas se encuentra uniformado.";
        String pregunta13 = "El personal de servicio se encuentra identificado con gafete o carnet visible, que incluye el logo de la empresa.";
        String pregunta14 = "Se cuenta con instructivos de información sobre Seguridad al Turista.";
        String pregunta15 = "La oficina se encuentra rotulada con el nombre comercial de la Línea Aérea.";
        String pregunta16 = "Se identifican las diferentes áreas de servicio al cliente";
        String pregunta17 = "La oficina tiene como uso exclusivo la actividad turística";
        String pregunta18 = "Se dispone de sanitarios para uso de los clientes";
        String pregunta19 = "Los sanitarios se encuentran en buen estado de mantenimiento y limpieza.";
        String pregunta20 = "La decoración y ambientación es acorde a los destinos que promueve la Línea Aérea.";
        String pregunta21 = "El equipo y las instalaciones funcionan correctamente.";
        String pregunta22 = "La instalaciones se encuentran en buen estado de mantenimiento y limpieza.";
        String pregunta23 = "Los vehículos utilizados se encuentran debidamente rotulados con el nombre comercial de la Línea Aérea";

        String pregunta24 = "Se identifican los principales destinos con el nombre, tarifas y vigencia de los mismos.";
        String pregunta25 = "Se identifica la duración e itinerarios de los diferentes ofrecidos.";
        String pregunta26 = "Se identifican los servicios que están incluídos en la compra de boletos de viajes.";
        String pregunta27 = "Se identifican los servicios opcionales por programas o paquetes especiales para viajeros.";
        String pregunta28 = "Se identifican los medios y periodicidad para la revisión de los diferentes programas de viajes.";
        String pregunta29 = "Se dan a conocer las responsabilidades en que incurre la Línea Aérea en cada uno de los destinos ofrecidos.";
        String pregunta30 = "Se indica el tipo de seguros incluídos de parte de la Línea Aérea.";
        String pregunta31 = "Cuando los programas de viajes sean ofrecidos por otros prestadores se incluye la información sobre sus responsabilidades legales y de seguros vigentes.";

        String pregunta32 = "Se dispone de un procedimiento documentado para las reservas y ventas";
        String pregunta33 = "Cuenta con mecanismos para las reservas con distintos proveedores de servicios.";
        String pregunta34 = "Cuenta con un procedimiento para la cancelación de las reservaciones de parte de los turistas (No Show).";
        String pregunta35 = "Cuenta con información sobre los sistemas de pagos que puede aplicar el cliente ( Pre pago, anticipos).";
        String pregunta36 = "Se cuenta con un procedimiento escrito que indique plazos, condiciones de cancelación modificación o postergación de los servicios contratados.";
        String pregunta37 = "Se establecen los procedimientos para multas, penalidades y cargos por conceptos de servicios.";
        String pregunta38 = "Se cuenta con información sobre paquetes o programas por temporada, con tarifas diferenciadas.";
        String pregunta39 = "Se cuenta con un procedimiento que regule las ofertas y promociones.";

        String pregunta40 = "La empresa cuenta con una política ambiental, escrita.";
        String pregunta41 = "Se da conocimiento al turista de la política ambiental de la empresa (folleto informativo)";
        String pregunta42 = "Se establecen recomendaciones para el Turista sobre su comportamiento para con el medio natural.";
        String pregunta43 = "La empresa demuestra que dispone de políticas y procedimientos para el manejo de desechos en sus oficinas centrales. ";
        String pregunta44 = "La empresa demuetra tener politicas y procedimientos para el manejo de desechos generados durante el desarrollo de la actividad.";
        String pregunta45 = "La Línea Aérea desarrolla campañas de mercadeo sobre Costa Rica como un destino amigable con el medio ambiente.";
        String pregunta46 = "La empresa demuestra que esta interesada en implementar medidas para reducir su impacto con el medio ambiente (uso de productos biodegradables, etc).";
        String pregunta47 = "La empresa desarrolla programas ambientales con las comunidades inmediatas a nivel nacional.";

        String pregunta48 = "La declaración de Misión de la Organización contempla “el servicio al cliente“.";
        String pregunta49 = "La empresa tiene una política escrita de servicio al cliente";
        String pregunta50 = "La Junta Directiva consigna recursos financieros suficientes para dar mantenimiento o seguimiento al tema de “Servicio al Cliente“.";
        String pregunta51 = "El servicio al cliente esta incuido en el programa de inducción.";
        String pregunta52 = "La empresa dispone de un sistema de medición de la satisfacción del cliente.";
        String pregunta53 = "Las boletas o formularios relacionados con el servicio al cliente se llevan en un archivo debidamente foliado.";
        String pregunta54 = "La empresa demuestra cambios a partir de la medición del servicio al cliente.";
        String pregunta55 = "Se han establecido mecanismos de seguimiento y responsables de la medición de las encuestas al cliente.";
        String pregunta56 = "La empresa tiene un procedimiento escrito para tratar las quejas de los turistas.";
        String pregunta57 = "La empresa proporciona entrenamiento periódico para reforzar la importancia del servicio al cliente. ";

        ArrayList<QuestionDefBinary> questions1 = new ArrayList<>(); // [0-9]
        questions1.add(new QuestionDefBinary("1",pregunta0));
        questions1.add(new QuestionDefBinary("2",pregunta1));
        questions1.add(new QuestionDefBinary("3",pregunta2));
        questions1.add(new QuestionDefBinary("4",pregunta3));
        questions1.add(new QuestionDefBinary("5",pregunta4));
        questions1.add(new QuestionDefBinary("6",pregunta5));
        questions1.add(new QuestionDefBinary("7",pregunta6));
        questions1.add(new QuestionDefBinary("8",pregunta7));
        questions1.add(new QuestionDefBinary("9",pregunta8));
        questions1.add(new QuestionDefBinary("10",pregunta9));

        ArrayList<QuestionDefBinary> questions2 = new ArrayList<>(); // [10-23]
        questions2.add(new QuestionDefBinary("1",pregunta10));
        questions2.add(new QuestionDefBinary("2",pregunta11));
        questions2.add(new QuestionDefBinary("3",pregunta12));
        questions2.add(new QuestionDefBinary("4",pregunta13));
        questions2.add(new QuestionDefBinary("5",pregunta14));
        questions2.add(new QuestionDefBinary("6",pregunta15));
        questions2.add(new QuestionDefBinary("7",pregunta16));
        questions2.add(new QuestionDefBinary("8",pregunta17));
        questions2.add(new QuestionDefBinary("9",pregunta18));
        questions2.add(new QuestionDefBinary("10",pregunta19));
        questions2.add(new QuestionDefBinary("11",pregunta20));
        questions2.add(new QuestionDefBinary("12",pregunta21));
        questions2.add(new QuestionDefBinary("13",pregunta22));
        questions2.add(new QuestionDefBinary("14",pregunta23));

        ArrayList<QuestionDefBinary> questions3 = new ArrayList<>(); // [24-31]
        questions3.add(new QuestionDefBinary("1",pregunta24));
        questions3.add(new QuestionDefBinary("2",pregunta25));
        questions3.add(new QuestionDefBinary("3",pregunta26));
        questions3.add(new QuestionDefBinary("4",pregunta27));
        questions3.add(new QuestionDefBinary("5",pregunta28));
        questions3.add(new QuestionDefBinary("6",pregunta29));
        questions3.add(new QuestionDefBinary("7",pregunta30));
        questions3.add(new QuestionDefBinary("8",pregunta31));

        ArrayList<QuestionDefBinary> questions4 = new ArrayList<>(); // [32-39]
        questions4.add(new QuestionDefBinary("1",pregunta32));
        questions4.add(new QuestionDefBinary("2",pregunta33));
        questions4.add(new QuestionDefBinary("3",pregunta34));
        questions4.add(new QuestionDefBinary("4",pregunta35));
        questions4.add(new QuestionDefBinary("5",pregunta36));
        questions4.add(new QuestionDefBinary("6",pregunta37));
        questions4.add(new QuestionDefBinary("7",pregunta38));
        questions4.add(new QuestionDefBinary("8",pregunta39));

        ArrayList<QuestionDefBinary> questions5 = new ArrayList<>(); // [40-47]
        questions5.add(new QuestionDefBinary("1",pregunta40));
        questions5.add(new QuestionDefBinary("2",pregunta41));
        questions5.add(new QuestionDefBinary("3",pregunta42));
        questions5.add(new QuestionDefBinary("4",pregunta43));
        questions5.add(new QuestionDefBinary("5",pregunta44));
        questions5.add(new QuestionDefBinary("6",pregunta45));
        questions5.add(new QuestionDefBinary("7",pregunta46));
        questions5.add(new QuestionDefBinary("8",pregunta47));

        ArrayList<QuestionDefBinary> questions6 = new ArrayList<>(); // [48-57]
        questions6.add(new QuestionDefBinary("1",pregunta48));
        questions6.add(new QuestionDefBinary("2",pregunta49));
        questions6.add(new QuestionDefBinary("3",pregunta50));
        questions6.add(new QuestionDefBinary("4",pregunta51));
        questions6.add(new QuestionDefBinary("5",pregunta52));
        questions6.add(new QuestionDefBinary("6",pregunta53));
        questions6.add(new QuestionDefBinary("7",pregunta54));
        questions6.add(new QuestionDefBinary("8",pregunta55));
        questions6.add(new QuestionDefBinary("9",pregunta56));
        questions6.add(new QuestionDefBinary("10",pregunta57));

        ArrayList<ChapterDefBinary> chapters = new ArrayList<>();
        chapters.add(new ChapterDefBinary("De la Organizacion","1",17,questions1));
        chapters.add(new ChapterDefBinary("De la Operacion y Planta Fisica","2",24,questions2));
        chapters.add(new ChapterDefBinary("Diseño de los paquetes","3",14,questions3));
        chapters.add(new ChapterDefBinary("Reservas y Ventas","4",14,questions4));
        chapters.add(new ChapterDefBinary("Variables Ambientales","5",14,questions5));
        chapters.add(new ChapterDefBinary("Servicio al Cliente","6",17,questions6));

        return new FormDefBinary("Calificación para Lineas Aéreas",5,chapters);
    }//READY 5

    public static FormDefBinary getFormWaterTransportDef(){
        String pregunta0 = "Tiene el Permiso de Funcionamiento vigente.";
        String pregunta1 = "La Patente Municipal se encuentra vigente. ";
        String pregunta2 = "Las embarcaciones están registradas ante el Registro de la Propiedad.";
        String pregunta3 = "Usa terminales aprobadas por la Comisión Interinstitucional de Marinas y Atracaderos Turísticos (CIMAT)";
        String pregunta4 = "Tiene Seguro de Responsabilidad Civil y gastos médicos.";
        String pregunta5 = "La empresa dispone de una Póliza de Seguros para el Casco";
        String pregunta6 = "El Certificado de Navegabilidad está vigente";
        String pregunta7 = "La empresa lleva un registro de zarpes emitidos por la Capitanía de Puerto. ";
        String pregunta8 = "Los Guías tienen el certificado de Primeros Auxilios y RCP";
        String pregunta9 = "Se dispone de Guías para atender a los turistas tanto en forma individual o grupal";
        String pregunta10 = "La empresa usa folletos u otro material promocional.";
        String pregunta11 = "El material promocional indica los servicios a los cuales el turista tiene acceso.";
        String pregunta12 = "Tiene la empresa Reglamento Interno de Operación para el desarrollo de sus actividades.";

        String pregunta13 = "Cuenta con oficina de atención de público, debidamente acondicionada.";
        String pregunta14 = "En la oficina se exhibe el material promocional en donde se indican los servicios que se brindan. ";
        String pregunta15 = "El personal Administrativo se encuentra uniformado.";
        String pregunta16 = "El personal de servicio se encuentra uniformado.";
        String pregunta17 = "El personal que atiende a los turistas lleva su correspondiente gafete.";
        String pregunta18 = "El Capitán cuenta con licencia o título que lo acredite para navegar.";
        String pregunta19 = "El Capitán ha recibido capacitaciones recientes afines a sus funciones. ";
        String pregunta20 = "Tiene certificados que acrediten sus estudios en mecánica naval.";
        String pregunta21 = "Tienen los Cursos de MOPT a nivel de zafarrancho y primeros auxilios.";
        String pregunta22 = "Se cuenta con instructivos de información sobre Seguridad al Turista.";
        String pregunta23 = "Todos los servicios y accesos a las actividades se encuentran señalados. ";
        String pregunta24 = "Se solicita a los clientes la Licencia para la práctica de las actividades de pesca o buceo.";
        String pregunta25 = "Se le informa al cliente sobre el equipo necesario y si la empresa lo aporta.";
        String pregunta26 = "En cada actividad se cuenta con equipo de primeros auxilios.";
        String pregunta27 = "Los puentes, barandas, escaleras u otro tipo de acceso peatonal se observa en buen estado de funcionamiento, mantenimiento y limpieza.";
        String pregunta28 = "Los servicios sanitarios públicos están equipados con los accesorios básicos: Porta-papel, porta-toallas, secador de manos, espejos, jabonera líquida, y basureros. ";
        String pregunta29 = "La loza sanitaria de las áreas públicas (inodoros, lavabos), se encuentra en buen estado de mantenimiento y limpieza.";
        String pregunta30 = "Los servicios sanitarios públicos a nivel general se encuentran en buen estado de mantenimiento y limpieza.";
        String pregunta31 = "El muelle o atracadero está equipado con servicios sanitarios y duchas para los clientes.";
        String pregunta32 = "El muelle o atracadero dispone de vestidores para los turistas.";
        String pregunta33 = "Las instalaciones en el muelle o atracadero se encuentran en buen estado de mantenimiento y limpieza.";
        String pregunta34 = "Se dispone de una área comercial para uso de los turistas";
        String pregunta35 = "Los pisos de las naves son antideslizantes";
        String pregunta36 = "Los baños de las naves se encuentran en buen estado de mantenimiento";
        String pregunta37 = "Los baños de las naves se encuentran en buen estado de limpieza";
        String pregunta38 = "Los baños de las naves estan dotados de inodoro, lavamanos, espejo, iluminación, jaboneras, entre otros";
        String pregunta39 = "La loza sanitaria a nivel de inodoros, lavabos, y otros, en las naves se encuentra en buen estado de mantenimiento y limpieza.";
        String pregunta40 = "Los asientos de las naves son acolchados y con respaldar";
        String pregunta41 = "Los asientos de las naves estan forrados con material impermeable";
        String pregunta42 = "Se dispone de carretes en varios tamaños, peso y longitud";
        String pregunta43 = "Se dispone de cañas para varios carretes (resistencia)";
        String pregunta44 = "Se dispone de carnada muerta (engañadores) / carnada viva.";
        String pregunta45 = "Sujetadores para los tanques de los buzos (mantenerlos de pie) ";
        String pregunta46 = "Sistema de rescate de buzos: gradas o escalinatas";
        String pregunta47 = "Bandera de Buceo en el punto de sumerción ";
        String pregunta48 = "Equipo básico como: snorkel, aletas, botellas, regulador, traje de buceo, cinturón de lastre, chaleco hidrostático, reloj, manómetro, y tablas de buceo.";
        String pregunta49 = "Boya en el punto de sumerción";
        String pregunta50 = "El Personal de la empresa esta Certificado por ejemplo por Padi";
        String pregunta51 = "La empresa demuestra que el personal recibe curso periódicos de capacitación.";

        String pregunta52 = "Se cuenta con un Plan de Evacuación";
        String pregunta53 = "El Plan de evacuación está colocado en un área visible de la embarcación";
        String pregunta54 = "Se dispone de los Manuales con las características de las embarcaciones o equipo";
        String pregunta55 = "Se encuentran señaladas las zonas de peligro de la nave ( escaleras, cercanías al motor, etc)";
        String pregunta56 = "El Plan indica que hacer en caso de caer una persona al agua";
        String pregunta57 = "El Plan indica que hacer en caso de emergencias ( mal tiempo, encallar, etc)";
        String pregunta58 = "El Plan indica como usar los equipos de seguridad(botes salvavidas, radio, etc)";
        String pregunta59 = "Se deja una copia del Plan de navegación en las oficinas de la empresa";
        String pregunta60 = "Se cuenta con una lista de los equipos de seguridad";
        String pregunta61 = "Se dispone de luces de navegación en buen estado ( tope, costados, remolque, alcance, fondeo)";
        String pregunta62 = "Existe equipo para extinguir incendios";
        String pregunta63 = "Existe equipo para combatir el fuego ( traje, botas, etc)";
        String pregunta64 = "Existentes procedimientos para los procesos de llenado de combustible";
        String pregunta65 = "Se cuenta con botes salvavidas";
        String pregunta66 = "Se cuenta con chalecos según el N° de Turistas y para la tripulación";
        String pregunta67 = "Se cuenta con chalecos especiales para niños";
        String pregunta68 = "Se dispone de señales diurnas (banderas, espejo, guía de señales manuales, otros)";
        String pregunta69 = "Se dispone de boya con autoencendido";
        String pregunta70 = "Se dispone de señales pirotécnicas( pistola de bengala, luces, otros)";
        String pregunta71 = "El equipo médico se encuentra en una caja metálica con cierre hermético";
        String pregunta72 = "La empresa dispone de una bitácora de Mantenimiento";
        String pregunta73 = "La hoja de Mantenimiento indica las condiciones del equipo (Ejemplo: Para las embarcaciones, el Casco)";
        String pregunta74 = "La hoja de Mantenimiento indica el funcionamiento del equipo de radio";
        String pregunta75 = "La hoja de Mantenimiento menciona las condiciones del motor y las eléctricas";
        String pregunta76 = "Se dispone de un inventario de repuestos básicos ( de emergencia)";
        String pregunta77 = "El equipo médico se encuentra protegido contra las condiciones climáticas y del medio ambiente.";

        String pregunta78 = "La empresa cuenta con una política medio ambiental";
        String pregunta79 = "Se da conocimiento al turista de la política ambiental de la empresa (folleto informativo)";
        String pregunta80 = "Se establecen recomendaciones para el Turista sobre su comportamiento para con el medio natural.";
        String pregunta81 = "Se dispone de la comida y sobrantes de forma responsable para evitar que las especies marinas se habitúen a los alimentos cocidos y otros.";
        String pregunta82 = "La empresa demuestra que dispone de políticas y procedimientos para el manejo de la basura generada durante el desarrollo de la actividad y la generada en el sitio.";
        String pregunta83 = "Cuando las actividades se desarrollan en un área Natural Protegida, la empresa demuestra que se rigen por lo que establece el Plan de Manejo respectivo o por lineamientos establecidos por la autoridad competente. ";
        String pregunta84 = "Procedimientos para controlar los ruidos, olores, vibración, impacto visual, energía térmica sobre el ambiente";
        String pregunta85 = " La empresa demuestra que esta interesada en implementar medidas para reducir su impacto con el medio ambiente (uso de productos biodegradables, etc).";
        String pregunta86 = "La empresa desarrolla programas ambientales con la comunidad inmediata";

        String pregunta87 = "La declaración de Misión de la Organización menciona “el servicio al cliente“ como parte de su carácter especial.";
        String pregunta88 = "La empresa demuestra que tiene una política escrita de servicio al cliente";
        String pregunta89 = "El servicio al cliente esta incuido en el Plan de Mercadeo";
        String pregunta90 = "La empresa dispone de un sistema de medición de la satisfacción del cliente.";
        String pregunta91 = "La Junta Directiva o el más alto nivel de la empresa utiliza la información del servicio al cliente como base para tomar decisiones.";
        String pregunta92 = "La Junta Directiva o el más alto nivel consigna recursos suficientes para dar mantenimiento o seguimiento al tema de “servicio al cliente“. ";
        String pregunta93 = "Las boletas o formularios relacionados con el servicio al cliente se llevan en un archivo debidamente foliado.";
        String pregunta94 = "Al personal se le dan instrucciones claras respecto a la naturaleza de su esperada contribución al servicio al cliente. ";
        String pregunta95 = "El servicio al cliente se evalúa periódicamente en busca de la mejora continúa.";
        String pregunta96 = "La empresa tiene un procedimiento legal para tratar las quejas de los turistas consumidores y que esta reflejado en su documento de contrato- standard Conditions of Offer and Contract for Research and Consultancy.";
        String pregunta97 = "Sigue y contesta las quejas que surgen de sus Representantes o Comercializadores (Otros prestadores de Servicios como las Oficinas de Reservaciones, Agencias de Viajes, Hoteles, etc.";
        String pregunta98 = "La empresa proporciona entrenamiento periódico para reforzar la importancia del servicio al cliente. ";

        ArrayList<QuestionDefBinary> questions1 = new ArrayList<>(); // [0-12]
        questions1.add(new QuestionDefBinary("1",pregunta0));
        questions1.add(new QuestionDefBinary("2",pregunta1));
        questions1.add(new QuestionDefBinary("3",pregunta2));
        questions1.add(new QuestionDefBinary("4",pregunta3));
        questions1.add(new QuestionDefBinary("5",pregunta4));
        questions1.add(new QuestionDefBinary("6",pregunta5));
        questions1.add(new QuestionDefBinary("7",pregunta6));
        questions1.add(new QuestionDefBinary("8",pregunta7));
        questions1.add(new QuestionDefBinary("9",pregunta8));
        questions1.add(new QuestionDefBinary("10",pregunta9));
        questions1.add(new QuestionDefBinary("11",pregunta10));
        questions1.add(new QuestionDefBinary("12",pregunta11));
        questions1.add(new QuestionDefBinary("13",pregunta12));

        ArrayList<QuestionDefBinary> questions2 = new ArrayList<>(); // [13-51]
        questions2.add(new QuestionDefBinary("1",pregunta13));
        questions2.add(new QuestionDefBinary("2",pregunta14));
        questions2.add(new QuestionDefBinary("3",pregunta15));
        questions2.add(new QuestionDefBinary("4",pregunta16));
        questions2.add(new QuestionDefBinary("5",pregunta17));
        questions2.add(new QuestionDefBinary("6",pregunta18));
        questions2.add(new QuestionDefBinary("7",pregunta19));
        questions2.add(new QuestionDefBinary("8",pregunta20));
        questions2.add(new QuestionDefBinary("9",pregunta21));
        questions2.add(new QuestionDefBinary("10",pregunta22));
        questions2.add(new QuestionDefBinary("11",pregunta23));
        questions2.add(new QuestionDefBinary("12",pregunta24));
        questions2.add(new QuestionDefBinary("13",pregunta25));
        questions2.add(new QuestionDefBinary("14",pregunta26));
        questions2.add(new QuestionDefBinary("15",pregunta27));
        questions2.add(new QuestionDefBinary("16",pregunta28));
        questions2.add(new QuestionDefBinary("17",pregunta29));
        questions2.add(new QuestionDefBinary("18",pregunta30));
        questions2.add(new QuestionDefBinary("19",pregunta31));
        questions2.add(new QuestionDefBinary("20",pregunta32));
        questions2.add(new QuestionDefBinary("21",pregunta33));
        questions2.add(new QuestionDefBinary("22",pregunta34));
        questions2.add(new QuestionDefBinary("23",pregunta35));
        questions2.add(new QuestionDefBinary("24",pregunta36));
        questions2.add(new QuestionDefBinary("25",pregunta37));
        questions2.add(new QuestionDefBinary("26",pregunta38));
        questions2.add(new QuestionDefBinary("27",pregunta39));
        questions2.add(new QuestionDefBinary("28",pregunta40));
        questions2.add(new QuestionDefBinary("29",pregunta41));
        questions2.add(new QuestionDefBinary("30",pregunta42));
        questions2.add(new QuestionDefBinary("31",pregunta43));
        questions2.add(new QuestionDefBinary("32",pregunta44));
        questions2.add(new QuestionDefBinary("33",pregunta45));
        questions2.add(new QuestionDefBinary("34",pregunta46));
        questions2.add(new QuestionDefBinary("35",pregunta47));
        questions2.add(new QuestionDefBinary("36",pregunta48));
        questions2.add(new QuestionDefBinary("37",pregunta49));
        questions2.add(new QuestionDefBinary("38",pregunta50));
        questions2.add(new QuestionDefBinary("39",pregunta51));

        ArrayList<QuestionDefBinary> questions3 = new ArrayList<>(); // [52-77]
        questions3.add(new QuestionDefBinary("1",pregunta52));
        questions3.add(new QuestionDefBinary("2",pregunta53));
        questions3.add(new QuestionDefBinary("3",pregunta54));
        questions3.add(new QuestionDefBinary("4",pregunta55));
        questions3.add(new QuestionDefBinary("5",pregunta56));
        questions3.add(new QuestionDefBinary("6",pregunta57));
        questions3.add(new QuestionDefBinary("7",pregunta58));
        questions3.add(new QuestionDefBinary("8",pregunta59));
        questions3.add(new QuestionDefBinary("9",pregunta60));
        questions3.add(new QuestionDefBinary("10",pregunta61));
        questions3.add(new QuestionDefBinary("11",pregunta62));
        questions3.add(new QuestionDefBinary("12",pregunta63));
        questions3.add(new QuestionDefBinary("13",pregunta64));
        questions3.add(new QuestionDefBinary("14",pregunta65));
        questions3.add(new QuestionDefBinary("15",pregunta66));
        questions3.add(new QuestionDefBinary("16",pregunta67));
        questions3.add(new QuestionDefBinary("17",pregunta68));
        questions3.add(new QuestionDefBinary("18",pregunta69));
        questions3.add(new QuestionDefBinary("19",pregunta70));
        questions3.add(new QuestionDefBinary("20",pregunta71));
        questions3.add(new QuestionDefBinary("21",pregunta72));
        questions3.add(new QuestionDefBinary("22",pregunta73));
        questions3.add(new QuestionDefBinary("23",pregunta74));
        questions3.add(new QuestionDefBinary("24",pregunta75));
        questions3.add(new QuestionDefBinary("25",pregunta76));
        questions3.add(new QuestionDefBinary("26",pregunta77));

        ArrayList<QuestionDefBinary> questions4 = new ArrayList<>(); // [78-86]
        questions4.add(new QuestionDefBinary("1",pregunta78));
        questions4.add(new QuestionDefBinary("2",pregunta79));
        questions4.add(new QuestionDefBinary("3",pregunta80));
        questions4.add(new QuestionDefBinary("4",pregunta81));
        questions4.add(new QuestionDefBinary("5",pregunta82));
        questions4.add(new QuestionDefBinary("6",pregunta83));
        questions4.add(new QuestionDefBinary("7",pregunta84));
        questions4.add(new QuestionDefBinary("8",pregunta85));
        questions4.add(new QuestionDefBinary("9",pregunta86));

        ArrayList<QuestionDefBinary> questions5 = new ArrayList<>(); // [87-98]
        questions5.add(new QuestionDefBinary("1",pregunta87));
        questions5.add(new QuestionDefBinary("2",pregunta88));
        questions5.add(new QuestionDefBinary("3",pregunta89));
        questions5.add(new QuestionDefBinary("4",pregunta90));
        questions5.add(new QuestionDefBinary("5",pregunta91));
        questions5.add(new QuestionDefBinary("6",pregunta92));
        questions5.add(new QuestionDefBinary("7",pregunta93));
        questions5.add(new QuestionDefBinary("8",pregunta94));
        questions5.add(new QuestionDefBinary("9",pregunta95));
        questions5.add(new QuestionDefBinary("10",pregunta96));
        questions5.add(new QuestionDefBinary("11",pregunta97));
        questions5.add(new QuestionDefBinary("12",pregunta98));

        ArrayList<ChapterDefBinary> chapters = new ArrayList<>();
        chapters.add(new ChapterDefBinary("De la Organizacion","1",13,questions1));
        chapters.add(new ChapterDefBinary("De la Operacion de la actividad","2",39,questions2));
        chapters.add(new ChapterDefBinary("Seguridad","3",26,questions3));
        chapters.add(new ChapterDefBinary("Variables Ambientales","4",9,questions4));
        chapters.add(new ChapterDefBinary("Servicio al Cliente","5",12,questions5));

        return new FormDefBinary("Calificación para Transporte Acuático y Tours",6,chapters);

    } //READY 6

    public static FormDefConCenters getFormConCentersDef(){

        String pregunta0 = "El establecimiento cuenta con estacionamiento propio / arrendado ";
        String pregunta1 = "La capacidad mínima del estacionamiento es 1 espacio por cada 15 personas ";
        String pregunta2 = "Se dispone de varios espacios para los colaboradores";
        String pregunta3 = "Se cuenta con espacios de estacionamiento para buses";
        String pregunta4 = "El área de estacionamiento cuenta con vigilancia durante su horario de operación";
        String pregunta5 = "El estacionamiento cuenta con demarcación vial";
        String pregunta6 = "Dispone de capa asfáltica";
        String pregunta7 = "Los espacios de estacionamiento no bloquearán la entrada principal ";
        String pregunta8 = "La entrada principal se encuentra libre de obstáculos";
        String pregunta9 = "El estacionamiento cuenta con iluminación";
        String pregunta10 = "Se cuenta con espacios bajo techo para personas con discapacidad u ocasiones especiales ";
        String pregunta11 = "Se dispone de áreas verdes a nivel interno como externo";
        String pregunta12 = "Las áreas verdes se encuentran en buen estado de mantenimiento";
        String pregunta13 = "Las plantas se observan saludables y libres de plagas";



        String pregunta14 = "La fachada esta acorde con la modalidad de la empresa ";
        String pregunta15 = "La empresa tiene entrada independiente para el personal ";
        String pregunta16 = "La entrada principal tiene buena iluminación";
        String pregunta17 = "La fachada se encuentra en buen estado de mantenimiento";
        String pregunta18 = "La fachada se encuentra en buen estado de limpieza";
        String pregunta19 = "El rótulo de identificación se encuentra en buen estado de mantenimiento";
        String pregunta20 = "El rótulo no lleva marcas comerciales ajenas al establecimiento";
        String pregunta21 = "El rótulo se observa en buen estado de limpieza";
        String pregunta22 = "El rótulo dispone de efectos especiales";



        String pregunta23 = "Existe un espacio libre hacia las puertas de salida";
        String pregunta24 = "La iluminación del salón es acorde para la actividad";
        String pregunta25 = "La puerta principal del salón se observa en buenas condiciones";
        String pregunta26 = "Las paredes del salón presentan buenas condiciones de mantenimiento";
        String pregunta27 = "Las paredes del salón presentan buenas condiciones de limpieza";
        String pregunta28 = "Las paredes divisorias del Salón principal son insonoras";
        String pregunta29 = "Dichas paredes son a base de productos que retardan el fuego";
        String pregunta30 = "La superficie de los pisos presentan buenas condiciones de mantenimiento";
        String pregunta31 = "La superficie de los pisos presentan buenas condiciones de limpieza";
        String pregunta32 = "El cielo raso presenta buenas condiciones de mantenimiento ";
        String pregunta33 = "El cielo raso presenta buenas condiciones de limpieza";
        String pregunta34 = "El salón esta libre de olores desagradables";
        String pregunta35 = "La decoración es acorde con la actividad y especialidad";
        String pregunta36 = " Los elementos decorativos se observan en buen estado de mantenimiento";
        String pregunta37 = " Los elementos decorativos se observan en buen estado de limpieza";
        String pregunta38 = "Tiene sistema de ventilación mecánica en buen estado de mantenimiento";
        String pregunta39 = "Cuenta con sistema de sonido ambiental";
        String pregunta40 = "Cuenta con equipo audio visual para uso exclusivo en dicho salón";
        String pregunta41 = "Cuenta con equipo de computo para uso exclusivo del Salón Principal";
        String pregunta42 = "Las mesas del salón se encuentran en buen estado de mantenimiento ";
        String pregunta43 = "Las mesas del salón se encuentran en buen estado de limpieza";
        String pregunta44 = "Las sillas del salón se encuentran en buen estado de mantenimiento";
        String pregunta45 = "Las sillas del salón se encuentran en buen estado de limpieza";
        String pregunta46 = "El salón se encuentra decorado con motivos alusivos a su modalidad ";
        String pregunta47 = "El lugar permitir desarrollar varios tipos de eventos y actividades simultaneamente";
        String pregunta48 = "Hay suficiente espacio de tránsito en todas las áreas.";



        String pregunta49 = "Se cuenta con un Estacionamiento para PCCFR";
        String pregunta50 = "Se facilita mediante rampas el acceso a las instalaciones del CCC";
        String pregunta51 = "Todos los accesos a las instalaciones deben tener un ancho mínimo de 1.20 m";
        String pregunta52 = "Se dispone de Servicios Sanitarios para PCCFR";
        String pregunta53 = "Se dispone de Duchas para PCCFR";
        String pregunta54 = "Se dispone de Casilleros para PCCFR";
        String pregunta55 = "Se da la adecuación de espacios físicos y atenciones para PCCFR.";
        String pregunta56 = "Los espacios en Platea, Balcones y Palco son de 0.90 m x 1.20 m para personas con limitación y/o movilidad reducida.";
        String pregunta57 = "Al menos el 2% de localidades en relación al total de sillas se deben considerar espacios reservados para PCCFR";
        String pregunta58 = "La Carta de Menú debe estar en lenguaje Braile";



        String pregunta59 = "Se cuenta con mobiliario para estos salones en buen estado de mantenimiento y limpieza";
        String pregunta60 = "Estos salones se integran con el Salón Principal ";
        String pregunta61 = "Estos salones cuentan con buena insonorización";
        String pregunta62 = "Estos salones disponen del equipo audio visual necesario para el debido servicio y atención";
        String pregunta63 = "La estación para saloneros se observa en buen estado de mantenimiento";
        String pregunta64 = "La estación para saloneros se observa en buen estado de limpieza";
        String pregunta65 = "La estación de saloneros está acorde con la capacidad del establecimiento";



        String pregunta66 = "El área de exposiciones cuenta con alfombra modular desmontable";
        String pregunta67 = "Se cuenta con cajas de piso a cada 9 metros con previstas eléctricas";
        String pregunta68 = "Se cuenta con cajas de piso a cada 9 metros con previstas de internet";
        String pregunta69 = "Se cuenta con cajas de piso a cada 9 metros con previstas de agua potable";
        String pregunta70 = "Se cuenta con cajas de piso a cada 9 metros con previstas para aguas residuales";
        String pregunta71 = "Se dispone de aire comprimido en dicha área";
        String pregunta72 = "El área de exposiciones se subdivide en un mínimo de tres espacios para personas en plenaria";



        String pregunta73 = "Se dispone de una Sala de Espera VIP";
        String pregunta74 = "Se dispone de una Sala de Prensa";
        String pregunta75 = "Se dispone de Salas de Exposiciones Temporales";
        String pregunta76 = "Se cuenta con un mínimo de 3 Salas de Reuniones Individuales";
        String pregunta77 = "Se cuenta con un área de Admisión y Registro";
        String pregunta78 = "Se cuenta con una Boletería";
        String pregunta79 = "Se cuenta con una Sala de Espera ";
        String pregunta80 = "Se cuenta con un área de Enfermería";
        String pregunta81 = "Se cuenta con Oficina para Organizadores de Eventos";
        String pregunta82 = "Se cuenta con área para la Administración (Oficinas)";
        String pregunta83 = "Se cuenta con un Área para el Director";
        String pregunta84 = "Se cuenta con Estaciones de Trabajo ";



        String pregunta85 = "Dispone de Oficinas para la atención de Contratistas";
        String pregunta86 = "Se cuenta con Salas de Audiovisuales y Control de Sonido";
        String pregunta87 = "Se cuenta con un Taller Eléctrico";
        String pregunta88 = "Se cuenta con Taller de Mantenimiento para Eventos";
        String pregunta89 = "Se dispone de Cuartos de Servicio Técnico";
        String pregunta90 = "Se dispone de Cuartos de Equipamiento Eléctrico";
        String pregunta91 = "Se dispone de Cuartos Eléctricos";
        String pregunta92 = "Se dispone de otros Talleres de servicio para los Expositores";
        String pregunta93 = "Se dispone de una Ruta de Servicio a las áreas posteriores ";



        String pregunta94 = "Las mesas se encuentran en buen estado de mantenimiento";
        String pregunta95 = "Las mesas se encuentran en buen estado de limpieza";
        String pregunta96 = "Las sillas se encuentran en buen estado de mantenimiento";
        String pregunta97 = "Las sillas se encuentran en buen estado de limpieza";
        String pregunta98 = "Se identifica un área para la preparación de bebidas";
        String pregunta99 = "El área de preparación esta de frente al cliente";
        String pregunta100 = "Se identifica un área de enfriamiento";
        String pregunta101 = " El área dispone de ambientación y decoración en buen estado de mantenimiento y limpieza";
        String pregunta102 = "La iluminación del lugar es graduable";
        String pregunta103 = "Se dispone de carta de Menú";
        String pregunta104 = "Se dispone de carta de bebidas";
        String pregunta105 = "Las carta de A&B cuentan con buena presentación";
        String pregunta106 = "Las cartas incluyen los precios con los impuestos de ley";
        String pregunta107 = "El equipo del área de A&B se encuentran en buen estado de mantenimiento y limpieza";
        String pregunta108 = "La vajilla, cubertería y cristalería están libres de impurezas ";
        String pregunta109 = "El área de A&B se encuentra libre de olores desagradables";
        String pregunta110 = "El área de A&B dispone de cristalería acorde para los diferentes tipos de bebidas";
        String pregunta111 = "Se dispone de un exhibidor de vinos al natural o frio";



        String pregunta112 = "Tarjetas de Crédito";
        String pregunta113 = "Servicio Telefónico";
        String pregunta114 = "Sistema de Reservaciones ";
        String pregunta115 = "Oficinas Administrativas";
        String pregunta116 = "Guardarropía";
        String pregunta117 = "Servicio de Valet Parking";
        String pregunta118 = "El CCC cuenta con Salas Vip";



        String pregunta119 = "Se dispone de una entrada independiente para VIP";
        String pregunta120 = "Existe un espacio libre hacia las puertas de salida";
        String pregunta121 = "La iluminación del área es acorde para la actividad";
        String pregunta122 = "La superficie de los pisos presenta buenas condiciones de mantenimiento";
        String pregunta123 = "La superficie de los pisos presenta buenas condiciones de limpieza";
        String pregunta124 = "El cielo raso presenta buenas condiciones de mantenimiento ";
        String pregunta125 = "El cielo raso presenta buenas condiciones de limpieza";
        String pregunta126 = "Tiene sistema de ventilación mecánica en buen estado de mantenimiento";
        String pregunta127 = "Los espejos se encuentran debidamente iluminados";
        String pregunta128 = "Se dispone de espacios para el vestuario";
        String pregunta129 = "Se dispone de sanitarios independientes";
        String pregunta130 = "Los sanitarios se encuentran en buen estado de limpieza";
        String pregunta131 = "Los sanitarios se encuentran en buen estado de mantenimiento";
        String pregunta132 = "Los sanitarios disponen de los accesorios fundamentales ( papel, jabón, entre otros)";
        String pregunta133 = "En el área de vestidores existen facilidades para el proceso de maquillaje si fuera necesario. ";



        String pregunta134 = "Los baños públicos son amplios";
        String pregunta135 = "Los baños públicos cuentan con extractor de aire";
        String pregunta136 = "Los baños públicos tienen secador de manos automático/ toallas desechables";
        String pregunta137 = "Los baños públicos tienen espejos";
        String pregunta138 = "Los baños públicos tienen basureros";
        String pregunta139 = "Todas las unidades de baños públicos están dotadas de papel higiénico suficiente";
        String pregunta140 = "Los baños cuentan con porta papel";
        String pregunta141 = "Los baños cuentan con jabonera líquida";
        String pregunta142 = "Ausencia de malos olores en los baños públicos";
        String pregunta143 = "La iluminación de los baños públicos es excelente y funcionan todas las bombillas";
        String pregunta144 = "Los pisos de los baños públicos se encuentran en buen estado de limpieza";
        String pregunta145 = "Los pisos de los baños públicos presentan buen estado de mantenimiento";
        String pregunta146 = "Las paredes de los baños públicos se observan libres de manchas o suciedad";
        String pregunta147 = "Las paredes de los baños públicos se observan en buen estado de mantenimiento";
        String pregunta148 = "El baño de damas cuenta con mueble o superficie para colocar objetos";
        String pregunta149 = "La loza sanitaria presenta buen estado de mantenimiento";
        String pregunta150 = "La loza sanitaria presenta buen estado de limpieza";
        String pregunta151 = "Los servicios sanitarios para caballeros cuentan con mingitorios";
        String pregunta152 = "Los mingitorios presentan buen estado de mantenimiento";
        String pregunta153 = "Los mingitorios presentan buen estado de limpieza";
        String pregunta154 = "La grifería de los baños se encuentra en buen estado de mantenimiento";
        String pregunta155 = "La grifería de los baños se encuentra en buen estado de limpieza";
        String pregunta156 = "Las puertas de los baños presentan buen estado de mantenimiento";
        String pregunta157 = "Las puertas de los baños presentan buen estado de limpieza";
        String pregunta158 = "Música ambiental";
        String pregunta159 = "Las paredes de los baños cuentan con recubrimientos de fácil limpieza ";



        String pregunta160 = "La cocina cuenta con sistema para la renovación del aire (Sistema de inyección de aire y extracción de gases y humo)";
        String pregunta161 = "Se localizan extractores de humos y grasas en la cocina principal";
        String pregunta162 = "Se utilizan colores claros en el área de cocina ";
        String pregunta163 = "El material de revestimiento de las paredes es incombustible";
        String pregunta164 = "El material de revestimiento de las paredes es fácil de limpiar";
        String pregunta165 = "El material de revestimiento del cielo raso es incombustible";
        String pregunta166 = "El material de revestimiento del cielo raso es fácil de limpiar";
        String pregunta167 = "Las lámparas se encuentran en lugares lejos de los alimentos en caso de una rotura";
        String pregunta168 = "Se dispone de buena iluminación dentro del área de cocina";
        String pregunta169 = "Dotación de agua caliente y fría.";
        String pregunta170 = "Es posible identificar las diferentes áreas de lavado, según su uso.";
        String pregunta171 = "El área de preparación de alimentos se encuentra en buen estado de mantenimiento";
        String pregunta172 = "El área de preparación de alimentos se encuentra en buen estado de limpieza";
        String pregunta173 = "Es posible identificar un área de preparación de alimentos";
        String pregunta174 = "Cuenta con salida de emergencia al exterior";
        String pregunta175 = "Se cuenta con superficie antiderrapante a nivel de pisos";
        String pregunta176 = "Cuenta con salida y entrada de platos bien identificada";
        String pregunta177 = "Se cuenta con un área de higiene y limpieza que asegure la manipulación de alimentos a la entrada de la cocina.";
        String pregunta178 = "Se dispone de un lavabo de pie (de pedal/ sensor)";
        String pregunta179 = "Los alimentos se tienen por separado según su uso";



        String pregunta180 = "La empresa cuenta con bodega de líquidos y licores";
        String pregunta181 = "Se cuenta con bodega de alimentos";
        String pregunta182 = "Se cuenta con bodega para cajas y envases vacíos";
        String pregunta183 = "Se cuenta con uno o varios cuartos fríos";
        String pregunta184 = "Se cuenta con cámara fría para carnes ";
        String pregunta185 = "Se cuenta con cámara fría para mariscos";
        String pregunta186 = "La bodega y el almacén general cuentan con acceso para proveedores";
        String pregunta187 = " La bodega (s) se encuentran en buen estado de mantenimiento ";
        String pregunta188 = "La Bodega (s) se encuentran en buen estado de limpieza ";
        String pregunta189 = "Los alimentos y bebidas se encuentran ordenados siguiendo el principio PEPS";
        String pregunta190 = "Ausencia de olores desagradables en el área de bodegas";
        String pregunta191 = "Se identifica claramente una zona para la recepción de productos";
        String pregunta192 = "La estantería de las bodegas es en acero inoxidable/ o similares";
        String pregunta193 = "La estantería de las bodegas facilita el almacenaje (PEPS)";
        String pregunta194 = "Las bodegas están protegidas contra el ingreso de roedores";
        String pregunta195 = "La bodega y el almacén general cuenta con buena iluminación";
        String pregunta196 = "La bodega y el almacén general cuenta con buena ventilación";
        String pregunta197 = "La bodega con acceso independiente para el ingreso de productos";
        String pregunta198 = "Se dispone de área para carga y descarga mínimo para 3 camiones simultáneamente ";



        String pregunta199 = "Se dispone de una Bodega para el Aseo";
        String pregunta200 = "Los productos de limpieza se encuentran ordenados y rotulados";
        String pregunta201 = "La Bodega para el Aseo se encuentra en buen estado de limpieza";
        String pregunta202 = "La bodega de aseo esta equipada con una pileta ";
        String pregunta203 = "La bodega de aseo esta equipada con estantería acorde para los diferentes tipos de productos.";
        String pregunta204 = "El revestimiento de las paredes es incombustible";
        String pregunta205 = "Es un área independiente ";



        String pregunta206 = "Existe un depósito general de basura";
        String pregunta207 = "Las basuras están en recipientes tapados";
        String pregunta208 = "Los recipientes de basura están dotados de bolsas plásticas";
        String pregunta209 = "Los recipientes de basura son lavados diariamente ";
        String pregunta210 = "Las bolsas de basura se retiran continuamente y son llevadas a una zona aislada";
        String pregunta211 = "El cuarto de basura dispone de ventilación que no permita la concentración de olores";
        String pregunta212 = "En el movimiento o traslado de basuras y desperdicios, estas no se cruzarán con la zona de preparación de alimentos";
        String pregunta213 = "La ubicación de las basuras y desperdicios será en áreas no públicas";



        String pregunta214 = "Se localizan extinguidores tipo ABC o equivalentes según las áreas del local";
        String pregunta215 = "Los extintores se encuentran vigentes";
        String pregunta216 = "Los extintores se encuentran debidamente instalados según las áreas del local";
        String pregunta217 = "Se localizan hidrantes de acceso inmediato al CCC. ";
        String pregunta218 = "Los hidrantes o siamesas se encuentran en buen estado de mantenimiento ";
        String pregunta219 = "La empresa tiene detectores de humo y alarmas en todas las áreas públicas cerradas";
        String pregunta220 = "Las salidas de emergencia se encuentran visibles y están rotuladas (rótulos luminosos)";
        String pregunta221 = "Se localizan luces de emergencia / planta eléctrica en las diferentes áreas de la empresa ";
        String pregunta222 = "En caso de estar en pisos superiores se cuenta con escaleras externas de emergencia";
        String pregunta223 = "Se tiene personal de seguridad permanentemente ";
        String pregunta224 = "Sistemas de iluminación de toda el área exterior del edificio";
        String pregunta225 = "Cabinas de Vigilancia ubicadas en el predio";
        String pregunta226 = "Se cuenta con vigilancia durante las horas de servicio ";
        String pregunta227 = "Se dispone de Circuito Cerrado de TV / Cámaras perimetrales de vigilancia";
        String pregunta228 = "Se dispone de Cuarto de Monitores";
        String pregunta229 = "El establecimiento tiene tanque de almacenamiento de agua propio para 24 horas";
        String pregunta230 = "Se cuenta con planta propia de energía eléctrica para 24 horas de servicio";
        String pregunta231 = "Se aplica fumigación periódicamente";
        String pregunta232 = "Se dispone de botiquín y equipo para primeros auxilios";
        String pregunta233 = " La empresa cuenta con iluminación convencional para el local, en caso de emergencia 24 horas";



        String pregunta234 = "La Zona de Eventos representa el 50% del espacio total del local";
        String pregunta235 = "La Sala Principal representa el 60% con respecto a la Zona de Eventos";
        String pregunta236 = "El Auditorio representa el 30% con respecto a la Zona de Eventos";
        String pregunta237 = "La Sala de Exposiciones representa el 2.5% con respecto a la Zona de Eventos";
        String pregunta238 = "La Sala de Entrevistas representa el 3% con respecto a la Zona de Eventos";
        String pregunta239 = "Los Camerinos representan el 2.5% con respecto a la Zona de Eventos";
        String pregunta240 = "El área del Vestíbulo representa el 2% con respecto a la Zona de Eventos";
        String pregunta241 = "La Zona de Servicios representa el 20% del espacio total del local";
        String pregunta242 = "La Zona Administrativa representa el 2% del espacio total del local";
        String pregunta243 = "La Zona Exterior representa el 28% del espacio total del local";



        String pregunta244 = "Cuenta con un certificado de calidad del agua potable";
        String pregunta245 = "Cuenta con un certificado de calidad del hielo que utiliza";
        String pregunta246 = "Tiene aviso en los baños para el ahorro y conservación del agua ";
        String pregunta247 = "Tiene aviso en los baños para el ahorro de la electricidad";
        String pregunta248 = "Se promueve la separación de desperdicios, colocando recipientes identificados en áreas públicas";
        String pregunta249 = "Se utiliza jabón / champú, biodegradable en los baños";
        String pregunta250 = "Se tiene un registro sobre la composición y calidad de sus aguas residuales";
        String pregunta251 = "Los desechos del área de cocina son clasificados y separados según su composición ";
        String pregunta252 = "Se analizan los proveedores para determinar que las carnes de animales exóticos, que se consumen son de criaderos ";
        String pregunta253 = "Los desechos o sobrantes de alimentos no se dejan al alcance de animales silvestres";
        String pregunta254 = "Los alimentos para llevar son empacados en recipientes confeccionados con materiales amigables con el medio ambiente ";
        String pregunta255 = "Se utilizan luces de bajo consumo eléctrico";
        String pregunta256 = "La mantelería y toallas son reutilizables";
        String pregunta257 = "Las cámaras de congelación y enfriamiento son de bajo consumo ";
        String pregunta258 = "Se cuenta con un contrato de separación y reciclaje de desechos aparte del servicio de recolección de basura municipal";
        String pregunta259 = "En diferentes áreas de la propiedad (exteriores, se han instalado basureros , para mitigar la contaminación)";
        String pregunta260 = "Los servicios sanitarios públicos cuentan con sensores para ahorro de energía eléctrica";
        String pregunta261 = "Se dispone de sistemas de recolección, evacuación y disposición de aguas pluviales.";
        String pregunta262 = "Se dispone de Planta de Tratamiento para aguas residuales ";



        String pregunta263 = "El menú de bocadillos contempla al menos 2 platos regionales ";
        String pregunta264 = "Se cumple con la ley con respecto a la prohibición o venta de bebidas alcohólicas a menores";
        String pregunta265 = "Las instalaciones del Centro de Congresos y Convenciones son facilitadas sin fines de lucro , para reuniones de grupos o asociaciones con algún enfoque social";
        String pregunta266 = "Se permite la exhibición de obras de arte de autores regionales, en alguna época del año ";
        String pregunta267 = "Se cuenta con un protocolo de atención al adulto mayor o persona con alguna discapacidad";



        String pregunta268 = "Gerente General ";
        String pregunta269 = "Gerente Administración";
        String pregunta270 = "Gerente Comercial";
        String pregunta271 = "Asistente de Gerencia";
        String pregunta272 = "Gerente de Mercadeo";
        String pregunta273 = "Gerente de Operaciones y Mantenimiento";
        String pregunta274 = "Gerente de Alimentos y Bebidas";
        String pregunta275 = "Auxliar de Administración";
        String pregunta276 = "Secretaría";
        String pregunta277 = "Secretaría Comercial";
        String pregunta278 = "Asistente de Operaciones";
        String pregunta279 = "Ejecutivo de Ventas";
        String pregunta280 = "Edecanes ";
        String pregunta281 = "Traductores";
        String pregunta282 = "Anfitrión";
        String pregunta283 = "Jefe de Cocina";
        String pregunta284 = "Cocineros";
        String pregunta285 = "Saloneros";
        String pregunta286 = "Personal de Mantenimiento General";
        String pregunta287 = "Personal de Mantenimiento Electrico ";
        String pregunta288 = "Personal de Limpieza";
        String pregunta289 = "Personal de Seguridad ";
        String pregunta290 = "Valet parking";



        String pregunta291 = "El establecimiento cuenta con duchas para personal";
        String pregunta292 = "Las duchas para el personal se encuentran en buen estado de mantenimiento";
        String pregunta293 = "Las duchas para el personal se encuentran en buen estado de limpieza";
        String pregunta294 = "Los inodoros para el personal se encuentran en buen estado de mantenimiento";
        String pregunta295 = "Los inodoros para el personal se encuentran en buen estado de limpieza";
        String pregunta296 = "Se cuenta con casilleros para el personal/ Se encuentran en buen estado de mantenimiento y limpieza";
        String pregunta297 = "Todo el personal se encuentra uniformado";
        String pregunta298 = "Las áreas para el Personal se encuentran en buen estado de mantenimiento ";
        String pregunta299 = "Las áreas para el Personal se encuentran en buen estado de limpieza";
        String pregunta300 = "El local cuenta con una oficina para trámites administrativos";



        String pregunta301 = "No portar alhajas de ninguna clase (solo reloj de pulsera)";
        String pregunta302 = "El Personal a nivel de hombres refleja un Rostro limpio y bien afeitado";
        String pregunta303 = "El Personal a nivel de Damas reflejan un Rostro limpio con maquillaje discreto";
        String pregunta304 = "Cabello limpio, bien recortado y peinado (Damas bien recogido)";
        String pregunta305 = "Personal uniformado ";
        String pregunta306 = "Personal debidamente identificado";


        ArrayList<QuestionDefBinary> questions1 = new ArrayList<>(); // [0-13]
        questions1.add(new QuestionDefBinary("1",pregunta0));
        questions1.add(new QuestionDefBinary("2",pregunta1));
        questions1.add(new QuestionDefBinary("3",pregunta2));
        questions1.add(new QuestionDefBinary("4",pregunta3));
        questions1.add(new QuestionDefBinary("5",pregunta4));
        questions1.add(new QuestionDefBinary("6",pregunta5));
        questions1.add(new QuestionDefBinary("7",pregunta6));
        questions1.add(new QuestionDefBinary("8",pregunta7));
        questions1.add(new QuestionDefBinary("9",pregunta8));
        questions1.add(new QuestionDefBinary("10",pregunta9));
        questions1.add(new QuestionDefBinary("11",pregunta10));
        questions1.add(new QuestionDefBinary("12",pregunta11));
        questions1.add(new QuestionDefBinary("13",pregunta12));
        questions1.add(new QuestionDefBinary("14",pregunta13));

        ArrayList<QuestionDefBinary> questions2 = new ArrayList<>(); // [14-22]
        questions2.add(new QuestionDefBinary("1",pregunta14));
        questions2.add(new QuestionDefBinary("2",pregunta15));
        questions2.add(new QuestionDefBinary("3",pregunta16));
        questions2.add(new QuestionDefBinary("4",pregunta17));
        questions2.add(new QuestionDefBinary("5",pregunta18));
        questions2.add(new QuestionDefBinary("6",pregunta19));
        questions2.add(new QuestionDefBinary("7",pregunta20));
        questions2.add(new QuestionDefBinary("8",pregunta21));
        questions2.add(new QuestionDefBinary("9",pregunta22));

        ArrayList<QuestionDefBinary> questions3 = new ArrayList<>(); // [23-48]
        questions3.add(new QuestionDefBinary("1",pregunta23));
        questions3.add(new QuestionDefBinary("2",pregunta24));
        questions3.add(new QuestionDefBinary("3",pregunta25));
        questions3.add(new QuestionDefBinary("4",pregunta26));
        questions3.add(new QuestionDefBinary("5",pregunta27));
        questions3.add(new QuestionDefBinary("6",pregunta28));
        questions3.add(new QuestionDefBinary("7",pregunta29));
        questions3.add(new QuestionDefBinary("8",pregunta30));
        questions3.add(new QuestionDefBinary("9",pregunta31));
        questions3.add(new QuestionDefBinary("10",pregunta32));
        questions3.add(new QuestionDefBinary("11",pregunta33));
        questions3.add(new QuestionDefBinary("12",pregunta34));
        questions3.add(new QuestionDefBinary("13",pregunta35));
        questions3.add(new QuestionDefBinary("14",pregunta36));
        questions3.add(new QuestionDefBinary("15",pregunta37));
        questions3.add(new QuestionDefBinary("16",pregunta38));
        questions3.add(new QuestionDefBinary("17",pregunta39));
        questions3.add(new QuestionDefBinary("18",pregunta40));
        questions3.add(new QuestionDefBinary("19",pregunta41));
        questions3.add(new QuestionDefBinary("20",pregunta42));
        questions3.add(new QuestionDefBinary("21",pregunta43));
        questions3.add(new QuestionDefBinary("22",pregunta44));
        questions3.add(new QuestionDefBinary("23",pregunta45));
        questions3.add(new QuestionDefBinary("24",pregunta46));
        questions3.add(new QuestionDefBinary("25",pregunta47));
        questions3.add(new QuestionDefBinary("26",pregunta48));

        ArrayList<QuestionDefBinary> questions4 = new ArrayList<>(); // [49-58]
        questions4.add(new QuestionDefBinary("1",pregunta49));
        questions4.add(new QuestionDefBinary("2",pregunta50));
        questions4.add(new QuestionDefBinary("3",pregunta51));
        questions4.add(new QuestionDefBinary("4",pregunta52));
        questions4.add(new QuestionDefBinary("5",pregunta53));
        questions4.add(new QuestionDefBinary("6",pregunta54));
        questions4.add(new QuestionDefBinary("7",pregunta55));
        questions4.add(new QuestionDefBinary("8",pregunta56));
        questions4.add(new QuestionDefBinary("9",pregunta57));
        questions4.add(new QuestionDefBinary("10",pregunta58));

        ArrayList<QuestionDefBinary> questions5 = new ArrayList<>(); // [59-65]
        questions5.add(new QuestionDefBinary("1",pregunta59));
        questions5.add(new QuestionDefBinary("2",pregunta60));
        questions5.add(new QuestionDefBinary("3",pregunta61));
        questions5.add(new QuestionDefBinary("4",pregunta62));
        questions5.add(new QuestionDefBinary("5",pregunta63));
        questions5.add(new QuestionDefBinary("6",pregunta64));
        questions5.add(new QuestionDefBinary("7",pregunta65));

        ArrayList<QuestionDefBinary> questions6 = new ArrayList<>(); // [66-72]
        questions6.add(new QuestionDefBinary("1",pregunta66));
        questions6.add(new QuestionDefBinary("2",pregunta67));
        questions6.add(new QuestionDefBinary("3",pregunta68));
        questions6.add(new QuestionDefBinary("4",pregunta69));
        questions6.add(new QuestionDefBinary("5",pregunta70));
        questions6.add(new QuestionDefBinary("6",pregunta71));
        questions6.add(new QuestionDefBinary("7",pregunta72));

        ArrayList<QuestionDefBinary> questions7 = new ArrayList<>(); // [73-84]
        questions7.add(new QuestionDefBinary("1",pregunta73));
        questions7.add(new QuestionDefBinary("2",pregunta74));
        questions7.add(new QuestionDefBinary("3",pregunta75));
        questions7.add(new QuestionDefBinary("4",pregunta76));
        questions7.add(new QuestionDefBinary("5",pregunta77));
        questions7.add(new QuestionDefBinary("6",pregunta78));
        questions7.add(new QuestionDefBinary("7",pregunta79));
        questions7.add(new QuestionDefBinary("8",pregunta80));
        questions7.add(new QuestionDefBinary("9",pregunta81));
        questions7.add(new QuestionDefBinary("10",pregunta82));
        questions7.add(new QuestionDefBinary("11",pregunta83));
        questions7.add(new QuestionDefBinary("12",pregunta84));

        ArrayList<QuestionDefBinary> questions8 = new ArrayList<>(); // [85-93]
        questions8.add(new QuestionDefBinary("1",pregunta85));
        questions8.add(new QuestionDefBinary("2",pregunta86));
        questions8.add(new QuestionDefBinary("3",pregunta87));
        questions8.add(new QuestionDefBinary("4",pregunta88));
        questions8.add(new QuestionDefBinary("5",pregunta89));
        questions8.add(new QuestionDefBinary("6",pregunta90));
        questions8.add(new QuestionDefBinary("7",pregunta91));
        questions8.add(new QuestionDefBinary("8",pregunta92));
        questions8.add(new QuestionDefBinary("9",pregunta93));

        ArrayList<QuestionDefBinary> questions9 = new ArrayList<>(); // [94-111]
        questions9.add(new QuestionDefBinary("1",pregunta94));
        questions9.add(new QuestionDefBinary("2",pregunta95));
        questions9.add(new QuestionDefBinary("3",pregunta96));
        questions9.add(new QuestionDefBinary("4",pregunta97));
        questions9.add(new QuestionDefBinary("5",pregunta98));
        questions9.add(new QuestionDefBinary("6",pregunta99));
        questions9.add(new QuestionDefBinary("7",pregunta100));
        questions9.add(new QuestionDefBinary("8",pregunta101));
        questions9.add(new QuestionDefBinary("9",pregunta102));
        questions9.add(new QuestionDefBinary("10",pregunta103));
        questions9.add(new QuestionDefBinary("11",pregunta104));
        questions9.add(new QuestionDefBinary("12",pregunta105));
        questions9.add(new QuestionDefBinary("13",pregunta106));
        questions9.add(new QuestionDefBinary("14",pregunta107));
        questions9.add(new QuestionDefBinary("15",pregunta108));
        questions9.add(new QuestionDefBinary("16",pregunta109));
        questions9.add(new QuestionDefBinary("17",pregunta110));
        questions9.add(new QuestionDefBinary("18",pregunta111));

        ArrayList<QuestionDefBinary> questions10 = new ArrayList<>(); // [112-118]
        questions10.add(new QuestionDefBinary("1",pregunta112));
        questions10.add(new QuestionDefBinary("2",pregunta113));
        questions10.add(new QuestionDefBinary("3",pregunta114));
        questions10.add(new QuestionDefBinary("4",pregunta115));
        questions10.add(new QuestionDefBinary("5",pregunta116));
        questions10.add(new QuestionDefBinary("6",pregunta117));
        questions10.add(new QuestionDefBinary("7",pregunta118));

        ArrayList<QuestionDefBinary> questions11 = new ArrayList<>(); // [119-133]
        questions11.add(new QuestionDefBinary("1",pregunta119));
        questions11.add(new QuestionDefBinary("2",pregunta120));
        questions11.add(new QuestionDefBinary("3",pregunta121));
        questions11.add(new QuestionDefBinary("4",pregunta122));
        questions11.add(new QuestionDefBinary("5",pregunta123));
        questions11.add(new QuestionDefBinary("6",pregunta124));
        questions11.add(new QuestionDefBinary("7",pregunta125));
        questions11.add(new QuestionDefBinary("8",pregunta126));
        questions11.add(new QuestionDefBinary("9",pregunta127));
        questions11.add(new QuestionDefBinary("10",pregunta128));
        questions11.add(new QuestionDefBinary("11",pregunta129));
        questions11.add(new QuestionDefBinary("12",pregunta130));
        questions11.add(new QuestionDefBinary("13",pregunta131));
        questions11.add(new QuestionDefBinary("14",pregunta132));
        questions11.add(new QuestionDefBinary("15",pregunta133));

        ArrayList<QuestionDefBinary> questions12 = new ArrayList<>(); // [134-159]
        questions12.add(new QuestionDefBinary("1",pregunta134));
        questions12.add(new QuestionDefBinary("2",pregunta135));
        questions12.add(new QuestionDefBinary("3",pregunta136));
        questions12.add(new QuestionDefBinary("4",pregunta137));
        questions12.add(new QuestionDefBinary("5",pregunta138));
        questions12.add(new QuestionDefBinary("6",pregunta139));
        questions12.add(new QuestionDefBinary("7",pregunta140));
        questions12.add(new QuestionDefBinary("8",pregunta141));
        questions12.add(new QuestionDefBinary("9",pregunta142));
        questions12.add(new QuestionDefBinary("10",pregunta143));
        questions12.add(new QuestionDefBinary("11",pregunta144));
        questions12.add(new QuestionDefBinary("12",pregunta145));
        questions12.add(new QuestionDefBinary("13",pregunta146));
        questions12.add(new QuestionDefBinary("14",pregunta147));
        questions12.add(new QuestionDefBinary("15",pregunta148));
        questions12.add(new QuestionDefBinary("16",pregunta149));
        questions12.add(new QuestionDefBinary("17",pregunta150));
        questions12.add(new QuestionDefBinary("18",pregunta151));
        questions12.add(new QuestionDefBinary("19",pregunta152));
        questions12.add(new QuestionDefBinary("20",pregunta153));
        questions12.add(new QuestionDefBinary("21",pregunta154));
        questions12.add(new QuestionDefBinary("22",pregunta155));
        questions12.add(new QuestionDefBinary("23",pregunta156));
        questions12.add(new QuestionDefBinary("24",pregunta157));
        questions12.add(new QuestionDefBinary("25",pregunta158));
        questions12.add(new QuestionDefBinary("26",pregunta159));

        ArrayList<QuestionDefBinary> questions13 = new ArrayList<>(); // [160-179]
        questions13.add(new QuestionDefBinary("1",pregunta160));
        questions13.add(new QuestionDefBinary("2",pregunta161));
        questions13.add(new QuestionDefBinary("3",pregunta162));
        questions13.add(new QuestionDefBinary("4",pregunta163));
        questions13.add(new QuestionDefBinary("5",pregunta164));
        questions13.add(new QuestionDefBinary("6",pregunta165));
        questions13.add(new QuestionDefBinary("7",pregunta166));
        questions13.add(new QuestionDefBinary("8",pregunta167));
        questions13.add(new QuestionDefBinary("9",pregunta168));
        questions13.add(new QuestionDefBinary("10",pregunta169));
        questions13.add(new QuestionDefBinary("11",pregunta170));
        questions13.add(new QuestionDefBinary("12",pregunta171));
        questions13.add(new QuestionDefBinary("13",pregunta172));
        questions13.add(new QuestionDefBinary("14",pregunta173));
        questions13.add(new QuestionDefBinary("15",pregunta174));
        questions13.add(new QuestionDefBinary("16",pregunta175));
        questions13.add(new QuestionDefBinary("17",pregunta176));
        questions13.add(new QuestionDefBinary("18",pregunta177));
        questions13.add(new QuestionDefBinary("19",pregunta178));
        questions13.add(new QuestionDefBinary("20",pregunta179));


        ArrayList<QuestionDefBinary> questions14 = new ArrayList<>(); // [180-198]
        questions14.add(new QuestionDefBinary("1",pregunta180));
        questions14.add(new QuestionDefBinary("2",pregunta181));
        questions14.add(new QuestionDefBinary("3",pregunta182));
        questions14.add(new QuestionDefBinary("4",pregunta183));
        questions14.add(new QuestionDefBinary("5",pregunta184));
        questions14.add(new QuestionDefBinary("6",pregunta185));
        questions14.add(new QuestionDefBinary("7",pregunta186));
        questions14.add(new QuestionDefBinary("8",pregunta187));
        questions14.add(new QuestionDefBinary("9",pregunta188));
        questions14.add(new QuestionDefBinary("10",pregunta189));
        questions14.add(new QuestionDefBinary("11",pregunta190));
        questions14.add(new QuestionDefBinary("12",pregunta191));
        questions14.add(new QuestionDefBinary("13",pregunta192));
        questions14.add(new QuestionDefBinary("14",pregunta193));
        questions14.add(new QuestionDefBinary("15",pregunta194));
        questions14.add(new QuestionDefBinary("16",pregunta195));
        questions14.add(new QuestionDefBinary("17",pregunta196));
        questions14.add(new QuestionDefBinary("18",pregunta197));
        questions14.add(new QuestionDefBinary("19",pregunta198));

        ArrayList<QuestionDefBinary> questions15 = new ArrayList<>(); // [199-205]
        questions15.add(new QuestionDefBinary("1",pregunta199));
        questions15.add(new QuestionDefBinary("2",pregunta200));
        questions15.add(new QuestionDefBinary("3",pregunta201));
        questions15.add(new QuestionDefBinary("4",pregunta202));
        questions15.add(new QuestionDefBinary("5",pregunta203));
        questions15.add(new QuestionDefBinary("6",pregunta204));
        questions15.add(new QuestionDefBinary("7",pregunta205));

        ArrayList<QuestionDefBinary> questions16 = new ArrayList<>(); // [206-213]
        questions16.add(new QuestionDefBinary("1",pregunta206));
        questions16.add(new QuestionDefBinary("2",pregunta207));
        questions16.add(new QuestionDefBinary("3",pregunta208));
        questions16.add(new QuestionDefBinary("4",pregunta209));
        questions16.add(new QuestionDefBinary("5",pregunta210));
        questions16.add(new QuestionDefBinary("6",pregunta211));
        questions16.add(new QuestionDefBinary("7",pregunta212));
        questions16.add(new QuestionDefBinary("8",pregunta213));

        ArrayList<QuestionDefBinary> questions17 = new ArrayList<>(); // [214-233]
        questions17.add(new QuestionDefBinary("1",pregunta214));
        questions17.add(new QuestionDefBinary("2",pregunta215));
        questions17.add(new QuestionDefBinary("3",pregunta216));
        questions17.add(new QuestionDefBinary("4",pregunta217));
        questions17.add(new QuestionDefBinary("5",pregunta218));
        questions17.add(new QuestionDefBinary("6",pregunta219));
        questions17.add(new QuestionDefBinary("7",pregunta220));
        questions17.add(new QuestionDefBinary("8",pregunta221));
        questions17.add(new QuestionDefBinary("10",pregunta222));
        questions17.add(new QuestionDefBinary("11",pregunta223));
        questions17.add(new QuestionDefBinary("12",pregunta224));
        questions17.add(new QuestionDefBinary("13",pregunta225));
        questions17.add(new QuestionDefBinary("14",pregunta226));
        questions17.add(new QuestionDefBinary("15",pregunta227));
        questions17.add(new QuestionDefBinary("16",pregunta228));
        questions17.add(new QuestionDefBinary("17",pregunta229));
        questions17.add(new QuestionDefBinary("18",pregunta230));
        questions17.add(new QuestionDefBinary("19",pregunta231));
        questions17.add(new QuestionDefBinary("20",pregunta232));
        questions17.add(new QuestionDefBinary("21",pregunta233));

        ArrayList<QuestionDefBinary> questions18 = new ArrayList<>(); // [234-243]
        questions18.add(new QuestionDefBinary("1",pregunta234));
        questions18.add(new QuestionDefBinary("2",pregunta235));
        questions18.add(new QuestionDefBinary("3",pregunta236));
        questions18.add(new QuestionDefBinary("4",pregunta237));
        questions18.add(new QuestionDefBinary("5",pregunta238));
        questions18.add(new QuestionDefBinary("6",pregunta239));
        questions18.add(new QuestionDefBinary("7",pregunta240));
        questions18.add(new QuestionDefBinary("8",pregunta241));
        questions18.add(new QuestionDefBinary("9",pregunta242));
        questions18.add(new QuestionDefBinary("10",pregunta243));

        ArrayList<QuestionDefBinary> questions19 = new ArrayList<>(); // [244-262]
        questions19.add(new QuestionDefBinary("1",pregunta244));
        questions19.add(new QuestionDefBinary("2",pregunta245));
        questions19.add(new QuestionDefBinary("3",pregunta246));
        questions19.add(new QuestionDefBinary("4",pregunta247));
        questions19.add(new QuestionDefBinary("5",pregunta248));
        questions19.add(new QuestionDefBinary("6",pregunta249));
        questions19.add(new QuestionDefBinary("7",pregunta250));
        questions19.add(new QuestionDefBinary("8",pregunta251));
        questions19.add(new QuestionDefBinary("9",pregunta252));
        questions19.add(new QuestionDefBinary("10",pregunta253));
        questions19.add(new QuestionDefBinary("11",pregunta254));
        questions19.add(new QuestionDefBinary("12",pregunta255));
        questions19.add(new QuestionDefBinary("13",pregunta256));
        questions19.add(new QuestionDefBinary("14",pregunta257));
        questions19.add(new QuestionDefBinary("15",pregunta258));
        questions19.add(new QuestionDefBinary("16",pregunta259));
        questions19.add(new QuestionDefBinary("17",pregunta260));
        questions19.add(new QuestionDefBinary("18",pregunta261));
        questions19.add(new QuestionDefBinary("19",pregunta262));

        ArrayList<QuestionDefBinary> questions20 = new ArrayList<>(); // [263-267]
        questions20.add(new QuestionDefBinary("1",pregunta263));
        questions20.add(new QuestionDefBinary("2",pregunta264));
        questions20.add(new QuestionDefBinary("3",pregunta265));
        questions20.add(new QuestionDefBinary("4",pregunta266));
        questions20.add(new QuestionDefBinary("5",pregunta267));

        ArrayList<QuestionDefBinary> questions21 = new ArrayList<>(); // [268-290]
        questions21.add(new QuestionDefBinary("1",pregunta268));
        questions21.add(new QuestionDefBinary("2",pregunta269));
        questions21.add(new QuestionDefBinary("3",pregunta270));
        questions21.add(new QuestionDefBinary("4",pregunta271));
        questions21.add(new QuestionDefBinary("5",pregunta272));
        questions21.add(new QuestionDefBinary("6",pregunta273));
        questions21.add(new QuestionDefBinary("7",pregunta274));
        questions21.add(new QuestionDefBinary("8",pregunta275));
        questions21.add(new QuestionDefBinary("9",pregunta276));
        questions21.add(new QuestionDefBinary("10",pregunta277));
        questions21.add(new QuestionDefBinary("11",pregunta278));
        questions21.add(new QuestionDefBinary("12",pregunta279));
        questions21.add(new QuestionDefBinary("13",pregunta280));
        questions21.add(new QuestionDefBinary("14",pregunta281));
        questions21.add(new QuestionDefBinary("15",pregunta282));
        questions21.add(new QuestionDefBinary("16",pregunta283));
        questions21.add(new QuestionDefBinary("17",pregunta284));
        questions21.add(new QuestionDefBinary("18",pregunta285));
        questions21.add(new QuestionDefBinary("19",pregunta286));
        questions21.add(new QuestionDefBinary("20",pregunta287));
        questions21.add(new QuestionDefBinary("21",pregunta288));
        questions21.add(new QuestionDefBinary("22",pregunta289));
        questions21.add(new QuestionDefBinary("23",pregunta290));


        ArrayList<QuestionDefBinary> questions22 = new ArrayList<>(); // [291-300]
        questions22.add(new QuestionDefBinary("1",pregunta291));
        questions22.add(new QuestionDefBinary("2",pregunta292));
        questions22.add(new QuestionDefBinary("3",pregunta293));
        questions22.add(new QuestionDefBinary("4",pregunta294));
        questions22.add(new QuestionDefBinary("5",pregunta295));
        questions22.add(new QuestionDefBinary("6",pregunta296));
        questions22.add(new QuestionDefBinary("7",pregunta297));
        questions22.add(new QuestionDefBinary("8",pregunta298));
        questions22.add(new QuestionDefBinary("9",pregunta299));
        questions22.add(new QuestionDefBinary("10",pregunta300));

        ArrayList<QuestionDefBinary> questions23 = new ArrayList<>(); // [301-306]
        questions23.add(new QuestionDefBinary("1",pregunta301));
        questions23.add(new QuestionDefBinary("2",pregunta302));
        questions23.add(new QuestionDefBinary("3",pregunta303));
        questions23.add(new QuestionDefBinary("4",pregunta304));
        questions23.add(new QuestionDefBinary("5",pregunta305));
        questions23.add(new QuestionDefBinary("6",pregunta306));


        ArrayList<String> chapterNames = new ArrayList<>();
        chapterNames.add("Areas Frontales");//1
        chapterNames.add("Areas Internas");//2
        chapterNames.add("Areas Posteriores");//3
        chapterNames.add("Relacion Porcentual por Espacios Fisicos");//4
        chapterNames.add("Calidad Ambiental/Social");//5
        chapterNames.add("Del Personal Administrativo y de Servicio");//6

        ArrayList<ChapterDefBinary> chapters = new ArrayList<>();
        chapters.add(new ChapterDefBinary("Estacionamiento y areas verdes","1.1",1,questions1));//14
        chapters.add(new ChapterDefBinary("Fachada e Identificación del Centro","1.2",1,questions2));//9
        chapters.add(new ChapterDefBinary("Salón Principal","2.1",1,questions3));//26
        chapters.add(new ChapterDefBinary("Facilidades para Personas con Capacidad Física Restringida(PCCFR)","2.2",1,questions4));//10
        chapters.add(new ChapterDefBinary("Salones Complementarios","2.3",1,questions5));//7
        chapters.add(new ChapterDefBinary("Area de Exposiciones","2.4",1,questions6));//7
        chapters.add(new ChapterDefBinary("Salas de Atención y Otros espacios básicos","2.5",1,questions7));//12
        chapters.add(new ChapterDefBinary("Area de Servicios de Soporte","2.6",1,questions8));//9
        chapters.add(new ChapterDefBinary("Area de Alimentos y Bebidas(A&B)","2.7",1,questions9));//18
        chapters.add(new ChapterDefBinary("Otros Servicios","2.8",1,questions10));//
        chapters.add(new ChapterDefBinary("Vestidores para VIP","2.8.1",1,questions11));//
        chapters.add(new ChapterDefBinary("Sanitarios Públicos","2.9",1,questions12));//
        chapters.add(new ChapterDefBinary("Área de Cocina","3.1",1,questions13));//
        chapters.add(new ChapterDefBinary("Bodegas y Almacén General","3.2",1,questions14));//
        chapters.add(new ChapterDefBinary("Bodega de Aseo","3.3",1,questions15));//
        chapters.add(new ChapterDefBinary("Desechos Sólidos y Líquidos","3.4",1,questions16));//
        chapters.add(new ChapterDefBinary("Seguridad","3.5",1,questions17));//
        chapters.add(new ChapterDefBinary("Zona de Eventos","4.1",1,questions18));//
        chapters.add(new ChapterDefBinary("Variables Ambientales","5.1",1,questions19));//
        chapters.add(new ChapterDefBinary("Gestión Social y Cultural","5.2",1,questions20));//
        chapters.add(new ChapterDefBinary("Personal Administrativo y de Servicio","6.1",1,questions21));//
        chapters.add(new ChapterDefBinary("Facilidades para el Personal","6.2",1,questions22));//
        chapters.add(new ChapterDefBinary("Presentación Personal","6.3",1,questions23));//

        return new FormDefConCenters("Calificación Para Centros de Congresos y Convenciones",7,chapters,chapterNames);
    }//READY 7

    public static FormDefBinary getFormEnterpriseDef() {
        String pregunta0 = "Tiene el Permiso de Funcionamiento vigente.";
        String pregunta1 = "La Patente Municipal se encuentra vigente. ";
        String pregunta2 = "Tiene Seguro de Responsabilidad Civil y gastos médicos.";
        String pregunta3 = "Se dispone de un Protocolo para la recepción,participación, atención y partida de los turistas.";
        String pregunta4 = "Se dispone de información y protocolos para contactar servicios de emergencia y médicos.";
        String pregunta5 = "Los Guías tienen el carnet de acreditacion del ICT.";
        String pregunta6 = "La empresa usa folletos u otro material promocional ya sea impreso o digital.";
        String pregunta7 = "El material promocional indica los servicios y eventos a los cuales el turista tiene acceso.";
        String pregunta8 = "Se dispone de medios audio visuales para ofrecer los eventos.";
        String pregunta9 = "Tiene la empresa Reglamento Interno de Operación para el desarrollo de sus Eventos.";

        String pregunta10 = "Cuenta con oficina de atención al público.";
        String pregunta11 = "En la oficina se exhibe el material promocional impreso de los programas que ofrece la empresa";
        String pregunta12 = "El personal de oficinas se encuentra uniformado.";
        String pregunta13 = "El personal de servicio se encuentra identificado con gafete o carnet visible, que incluye el logo de la empresa.";
        String pregunta14 = "La oficina se encuentra rotulada con el nombre comercial de la Organizadora de Eventos";
        String pregunta15 = "Se identifican las diferentes áreas de servicio al cliente";
        String pregunta16 = "La oficina tiene como uso exclusivo la organización de eventos";
        String pregunta17 = "Se dispone de sanitarios para uso de los clientes";
        String pregunta18 = "Los sanitarios se encuentran en buen estado de mantenimiento y limpieza.";
        String pregunta19 = "La decoración y ambientación es acorde a la actividad turística que se desarrolla.";
        String pregunta20 = "El equipo y las instalaciones funcionan correctamente.";
        String pregunta21 = "La instalaciones se encuentran en buen estado de mantenimiento y limpieza";

        String pregunta22 = "Se identifica el evento con el nombre, tarifas y vigencia del mismo.";
        String pregunta23 = "Se identifica la duración de cada evento";
        String pregunta24 = "Se identifican los servicios que están incluídos en cada evento";
        String pregunta25 = "Se identifican los servicios opcionales para cada evento.";
        String pregunta26 = "Se dan a conocer las responsabilidades en que incurre la Organización en cada uno de los eventos.";
        String pregunta27 = "Se indican el tipo de seguros incluídos en cada evento.";
        String pregunta28 = "Cuando los eventos sean ofrecidos por terceros se incluye la información sobre sus responsabilidades legales y de seguros vigentes.";

        String pregunta29 = "Se dispone de un procedimiento documentado para las reservas y ventas por evento";
        String pregunta30 = "Cuenta con mecanismos para las reservas con distintos proveedores de servicios.";
        String pregunta31 = "Cuenta con un procedimiento para la cancelación de las reservaciones de parte de los turistas (No Show).";
        String pregunta32 = "Cuenta con información sobre los sistemas de pagos que puede aplicar el cliente ( Pre pago, anticipos).";
        String pregunta33 = "Se cuenta con un procedimiento escrito que indique plazos, condiciones de cancelación modificación o postergación de los servicios contratados.";
        String pregunta34 = "Se establecen los procedimientos para multas, penalidades y cargos por conceptos de servicios.";
        String pregunta35 = "Se cuenta con información sobre eventos o programas por temporada, con tarifas diferenciadas.";
        String pregunta36 = "Se cuenta con un procedimiento que regule las ofertas y promociones.";

        String pregunta37 = "La empresa cuenta con una política ambiental, escrita.";
        String pregunta38 = "Se da conocimiento al turista de la política ambiental de la empresa (folleto informativo)";
        String pregunta39 = "Se establecen recomendaciones para el Turista sobre su comportamiento para con el medio natural.";
        String pregunta40 = "La empresa demuestra que dispone de políticas y procedimientos para el manejo de desechos en sus oficinas centrales. ";
        String pregunta41 = "La empresa demuestra que tiene politicas y procedimientos para el manejo de desechos generados durante el desarrollo de la actividad.";
        String pregunta42 = "Cuando las actividades se desarrollan en un Area Natural Protegida, la Organizadora cuenta con material informativo sobre las políticas de manejo dentro del sitio.";
        String pregunta43 = " La empresa demuestra que esta interesada en implementar medidas para reducir su impacto con el medio ambiente (uso de productos biodegradables, etc).";
        String pregunta44 = "La empresa desarrolla programas ambientales con la comunidad inmediata.";

        String pregunta45 = "La declaración de Misión de la Organización contempla “el servicio al cliente“.";
        String pregunta46 = "La empresa tiene una política escrita de servicio al cliente";
        String pregunta47 = "La Junta Directiva consigna recursos suficientes para dar mantenimiento o seguimiento al tema e “Servicio al Cliente“. ";
        String pregunta48 = "El servicio al cliente esta incuido en el programa de inducción.";
        String pregunta49 = "La empresa dispone de un sistema de medición de la satisfacción del cliente.";
        String pregunta50 = "Las boletas o formularios relacionados con el servicio al cliente se llevan en un archivo debidamente foliado.";
        String pregunta51 = "La empresa demuestra cambios a partir de la medición del servicio al cliente.";
        String pregunta52 = "Se han establecido mecanismos de seguimiento y responsables de la medición de las encuestas al cliente.";
        String pregunta53 = "La empresa tiene un procedimiento escrito para tratar las quejas de los turistas.";
        String pregunta54 = "La empresa proporciona entrenamiento periódico para reforzar la importancia del servicio al cliente. ";

        ArrayList<QuestionDefBinary> questions1 = new ArrayList<>(); // [0-9]
        questions1.add(new QuestionDefBinary("1",pregunta0));
        questions1.add(new QuestionDefBinary("2",pregunta1));
        questions1.add(new QuestionDefBinary("3",pregunta2));
        questions1.add(new QuestionDefBinary("4",pregunta3));
        questions1.add(new QuestionDefBinary("5",pregunta4));
        questions1.add(new QuestionDefBinary("6",pregunta5));
        questions1.add(new QuestionDefBinary("7",pregunta6));
        questions1.add(new QuestionDefBinary("8",pregunta7));
        questions1.add(new QuestionDefBinary("9",pregunta8));

        ArrayList<QuestionDefBinary> questions2 = new ArrayList<>(); // [10-21]
        questions2.add(new QuestionDefBinary("1",pregunta10));
        questions2.add(new QuestionDefBinary("2",pregunta11));
        questions2.add(new QuestionDefBinary("3",pregunta12));
        questions2.add(new QuestionDefBinary("4",pregunta13));
        questions2.add(new QuestionDefBinary("5",pregunta14));
        questions2.add(new QuestionDefBinary("6",pregunta15));
        questions2.add(new QuestionDefBinary("7",pregunta16));
        questions2.add(new QuestionDefBinary("8",pregunta17));
        questions2.add(new QuestionDefBinary("9",pregunta18));
        questions2.add(new QuestionDefBinary("10",pregunta19));
        questions2.add(new QuestionDefBinary("11",pregunta20));
        questions2.add(new QuestionDefBinary("12",pregunta21));

        ArrayList<QuestionDefBinary> questions3 = new ArrayList<>(); // [22-28]
        questions3.add(new QuestionDefBinary("1",pregunta22));
        questions3.add(new QuestionDefBinary("2",pregunta23));
        questions3.add(new QuestionDefBinary("3",pregunta24));
        questions3.add(new QuestionDefBinary("4",pregunta25));
        questions3.add(new QuestionDefBinary("5",pregunta26));
        questions3.add(new QuestionDefBinary("6",pregunta27));
        questions3.add(new QuestionDefBinary("7",pregunta28));

        ArrayList<QuestionDefBinary> questions4 = new ArrayList<>(); // [29-36]
        questions4.add(new QuestionDefBinary("1",pregunta29));
        questions4.add(new QuestionDefBinary("2",pregunta30));
        questions4.add(new QuestionDefBinary("3",pregunta31));
        questions4.add(new QuestionDefBinary("4",pregunta32));
        questions4.add(new QuestionDefBinary("5",pregunta33));
        questions4.add(new QuestionDefBinary("6",pregunta34));
        questions4.add(new QuestionDefBinary("7",pregunta35));
        questions4.add(new QuestionDefBinary("8",pregunta36));

        ArrayList<QuestionDefBinary> questions5 = new ArrayList<>(); // [37-44]
        questions5.add(new QuestionDefBinary("1",pregunta37));
        questions5.add(new QuestionDefBinary("2",pregunta38));
        questions5.add(new QuestionDefBinary("3",pregunta39));
        questions5.add(new QuestionDefBinary("4",pregunta40));
        questions5.add(new QuestionDefBinary("5",pregunta41));
        questions5.add(new QuestionDefBinary("6",pregunta42));
        questions5.add(new QuestionDefBinary("7",pregunta43));
        questions5.add(new QuestionDefBinary("8",pregunta44));

        ArrayList<QuestionDefBinary> questions6 = new ArrayList<>(); // [45-54]
        questions6.add(new QuestionDefBinary("1",pregunta45));
        questions6.add(new QuestionDefBinary("2",pregunta46));
        questions6.add(new QuestionDefBinary("3",pregunta47));
        questions6.add(new QuestionDefBinary("4",pregunta48));
        questions6.add(new QuestionDefBinary("5",pregunta49));
        questions6.add(new QuestionDefBinary("6",pregunta50));
        questions6.add(new QuestionDefBinary("7",pregunta51));
        questions6.add(new QuestionDefBinary("8",pregunta52));
        questions6.add(new QuestionDefBinary("9",pregunta53));
        questions6.add(new QuestionDefBinary("10",pregunta54));

        ArrayList<ChapterDefBinary> chapters = new ArrayList<>();
        chapters.add(new ChapterDefBinary("De la Organizacion","1",18,questions1));
        chapters.add(new ChapterDefBinary("De la Operacion y Planta Física","2",24,questions2));
        chapters.add(new ChapterDefBinary("Diseño de los Paquetes","3",13,questions3));
        chapters.add(new ChapterDefBinary("Reservas y Ventas","4",15,questions4));
        chapters.add(new ChapterDefBinary("Variables Ambientales","5",15,questions5));
        chapters.add(new ChapterDefBinary("Servicio al Cliente","6",18,questions6));

        return new FormDefBinary("Calificación para Empresas dedicadas a Congresos y Convenciones",8,chapters);
    } //READY 8

    public static FormDefRestaurant getFormRestaurantDef(){
        String pregunta0 = "Cuenta la empresa con Patente Comercial vigente";
        String pregunta1 = "Cuenta la empresa con Permiso del Ministerio de Salud vigente";
        String pregunta2 = "Cuenta la empresa con Seguros contra Incendios";
        String pregunta3 = "Cuenta la empresa con  Seguros de Responsabilidad Civil";



        String pregunta4 = "La fachada tiene una connotación temática";
        String pregunta5 = "La fachada es sencilla";
        String pregunta6 = "La empresa  tiene entrada  independiente para el personal ";
        String pregunta7 = "La entrada principal del restaurante tiene buena iluminación";
        String pregunta8 = "La  fachada se encuentra en buen estado de mantenimiento ";
        String pregunta9 = "La fachada se encuentra en buen estado de limpieza";
        String pregunta10 = "Dispone de un rótulo de identificación";
        String pregunta11 = "El rótulo de identificación  se encuentra en buen estado de mantenimiento";
        String pregunta12 = "El rótulo de identificación  se encuentra en buen estado de limpieza";
        String pregunta13 = "El rótulo no lleva marcas comerciales ajenas al establecimiento";
        String pregunta14 = "El rótulo dispone de efectos especiales";
        String pregunta15 = "El rótulo puede ser localizable desde cualquier punto cercano";



        String pregunta16 = "El Restaurante cuenta con estacionamiento propio / arrendado / convenio";
        String pregunta17 = "La capacidad mínima del estacionamiento es 1 espacio por cada 15 clientes";
        String pregunta18 = "Se dispone de varios espacios de estacionamientos  para los colaboradores";
        String pregunta19 = "El área de estacionamiento cuenta con vigilancia durante su horario de operación";
        String pregunta20 = "Dispone de una superficie lisa  que le permita una mejor demarcación";
        String pregunta21 = "El estacionamiento  cuenta con demarcación vial ";
        String pregunta22 = "Los espacios de estacionamiento no bloquearán la entrada principal";
        String pregunta23 = "Se dispone de un estacionamiento para proveedores.";
        String pregunta24 = "El estacionamiento dispone de la cubierta  para protección a los vehículos ";
        String pregunta25 = "El estacionamiento se localiza dentro de la propiedad.";
        String pregunta26 = "El estacionamiento se localiza  a un máximo de 100 metros del establecimiento en caso de convenio";
        String pregunta27 = "El estacionamiento se encuentra anexo al establecimiento y es de fácil acceso";



        String pregunta28 = "Existe un espacio libre hacia las puertas de salida";
        String pregunta29 = "La iluminación del salón comedor es adecuada para la actividad";
        String pregunta30 = "La puerta principal del salón comedor se observa en buenas condiciones";
        String pregunta31 = "Las paredes del salón comedor presentan buenas condiciones de mantenimiento";
        String pregunta32 = "Las paredes del salón comedor presentan buenas condiciones de limpieza";
        String pregunta33 = "Las paredes del salón comedor son insonorizadas";
        String pregunta34 = "Las paredes interiores presentan condiciones constructivas adecuadas";
        String pregunta35 = "La superficie de los pisos presenta  buenas condiciones de mantenimiento";
        String pregunta36 = "La superficie del piso presenta condiciones anti deslizantes";
        String pregunta37 = "La superficie de los pisos presentan buenas condiciones de limpieza";
        String pregunta38 = "El cielo raso presenta buenas condiciones de mantenimiento ";
        String pregunta39 = "El cielo raso presenta buenas condiciones de limpieza";
        String pregunta40 = "La decoración es acorde con la actividad y especialidad";
        String pregunta41 = "El estado de mantenimiento  de los elementos decorativos es adecuado";
        String pregunta42 = "El estado de  limpieza de los elementos decorativos es adecuado";
        String pregunta43 = "Cuenta con suficiente ventilación natural";
        String pregunta44 = "Cuenta con suficiente  iluminación natural";
        String pregunta45 = "La iluminación artificial es adecuada";
        String pregunta46 = "Tiene sistema de ventilación mecánica";
        String pregunta47 = "Cuenta con sistema de sonido ambiental";
        String pregunta48 = "El restaurante tiene un menú a la entrada visible para el cliente";
        String pregunta49 = "La altura de las mesas es de 0.75 metros ";
        String pregunta50 = "El ancho mínimo de paso entre las mesas es de 80 centímetros.";
        String pregunta51 = "Las mesas del salón se encuentran en buen estado de mantenimiento ";
        String pregunta52 = "Las mesas del salón se encuentran en buen estado de limpieza";
        String pregunta53 = "Las mesas disponen de centros de mesa";
        String pregunta54 = "Las sillas del salón se encuentran en buen estado de mantenimiento";
        String pregunta55 = "Las sillas del salón se encuentran en buen estado de limpieza";
        String pregunta56 = "Las sillas van acorde con el mobiliario del resto del salón comedor";
        String pregunta57 = "Se dispone de una distancia mínima de 0.60 entre los implementos de cada comenzal ";
        String pregunta58 = "El salón principal del restaurante se adorna con plantas naturales";
        String pregunta59 = "La decoración del salón incluye obras de arte ";
        String pregunta60 = "Otros motivos decorativos que favorecen su ambientación";
        String pregunta61 = "El salón comedor del restaurante se encuentra libre de olores desagradables";
        String pregunta62 = "Las mesas tendrán una dimensión mínima de 70 cm. X 70 cm. Para dos personas";
        String pregunta63 = "Las mesas tendrán una dimensión mínima de 1.00 m. X 1.00 m. para tres o más personas";
        String pregunta64 = "Si la mesa es redonda con una dimensión de  0.80 metros para cuatro personas";
        String pregunta65 = "El mantel de las mesas es de tela, lino o lineta";
        String pregunta66 = "La mantelería debe estar bien colocada, limpia, sin arrugas";
        String pregunta67 = "La mantelería tiene un mínimo de 30 cm de caída";
        String pregunta68 = "Las servilletas son de tela como mínimo de papel";
        String pregunta69 = "Las servilletas de tela tendrán como tamaño mínimo para el almuerzo y cena 40 cm x 40 cm";
        String pregunta70 = "La vajilla del restaurante es de porcelana o cristal";
        String pregunta71 = "La cubertería utilizada será acorde con su especialidad y de buena calidad";
        String pregunta72 = "La dotación de las mesas será acorde con su especialidad ";
        String pregunta73 = "El área de cajas se encuentra debidamente identificada";
        String pregunta74 = "Se dispone de mobiliario para bebés";
        String pregunta75 = "La cocina cuenta con exhibidora de refrescos";



        String pregunta76 = "Se cuenta con  una estación para servicio de  los saloneros";
        String pregunta77 = "La estación está ubicada en un sitio estratégico";
        String pregunta78 = "Desde la estación para saloneros se observa la totalidad del salón";
        String pregunta79 = "La estación para saloneros dispone del menaje necesario para el debido servicio y atención";
        String pregunta80 = "La estación para saloneros se observa en buen estado de mantenimiento";
        String pregunta81 = "La estación para saloneros se observa en buen estado de limpieza";
        String pregunta82 = "La estación para el servicio de los saloneros dispone de buena iluminación ";
        String pregunta83 = "Los implementos que se localizan en la estación para saloneros se encuentran siempre limpios";



        String pregunta84 = "El restaurante posee la carta de menú en varios idiomas";
        String pregunta85 = "La carta de menú tiene buena presentación";
        String pregunta86 = "Estado de limpieza de la carta de menú";
        String pregunta87 = "Estado de mantenimento de la carta de menú ";
        String pregunta88 = "No cuenta en su diseño con marcas comerciales ajenas a la del establecimiento";
        String pregunta89 = "Cuenta con el nombre comercial y logotipo del establecimiento ";
        String pregunta90 = "Cuenta con platos para niños ";
        String pregunta91 = "Las cartas del menú incluyen los precios con los impuestos de ley";
        String pregunta92 = "Las cartas del menú detallan el contenido (composición) de los platos";



        String pregunta93 = "Grupo de entremeses con 10 variantes ( 4 Sopas o cremas)";
        String pregunta94 = "Grupo de entremeses con 8 variantes ( 3 Sopas o cremas)";
        String pregunta95 = "Grupo de entremeses con 5 variantes ( 2 Sopas o cremas) ";
        String pregunta96 = "Grupo de entremeses con 4 variantes ( 2 sopas o cremas)";
        String pregunta97 = "Un grupo de entremeses y sopas";
        String pregunta98 = "Ofrece 1 ó 2  tipos de ensaladas";
        String pregunta99 = "Ofrece 2 ó 4  tipos de ensaladas";
        String pregunta100 = "Ofrece  5 ó más tipos de ensaladas";



        String pregunta101 = "Ofrece 5 tipos de especialidades a base de: pastas/ mariscos /carnes / aves ";
        String pregunta102 = "Ofrece 4 tipos de especialidades a base de:  pastas/ mariscos/carnes / aves";
        String pregunta103 = "Ofrece 3 tipos de especialidades a base de: pastas/ mariscos / carnes/ aves";
        String pregunta104 = "Ofrece 2 tipos de especialidades a base de: pastas/ mariscos/ carnes/ aves";
        String pregunta105 = "Ofrece salsas y/o  aderezos para la degustación de las comidas";



        String pregunta106 = "Ofrece 5 tipos de café";
        String pregunta107 = "Ofrece de 3 a 4 tipos de café";
        String pregunta108 = "Ofrece de 1 a 2 tipos de café";
        String pregunta109 = "Ofrece solo helados";
        String pregunta110 = "Ofrece solo frutas";
        String pregunta111 = "Ofrece Postres Calientes";
        String pregunta112 = "Ofrece Repostería";



        String pregunta113 = "El restaurante  posee carta de vinos y licores ";
        String pregunta114 = "Las mesas del bar se encuentran en buen estado de mantenimiento";
        String pregunta115 = "Las mesas del bar se encuentran en buen estado de limpieza";
        String pregunta116 = "Las sillas y taburetes del bar se encuentran en buen estado de mantenimiento";
        String pregunta117 = "Las sillas y taburetes del bar se encuentran en buen estado de limpieza";
        String pregunta118 = "Se identifica en el bar un área  para la preparación de bebidas";
        String pregunta119 = "Se identifica en el bar un área de enfriamiento";
        String pregunta120 = "El área de preparación esta al frente del cliente";
        String pregunta121 = "El área del bar presenta  agradable ambientación y decoración ";
        String pregunta122 = "La iluminación del bar es graduable";
        String pregunta123 = "La vajilla, cubertería y cristalería son de buena calidad";
        String pregunta124 = "La vajilla, cubertería y cristalería están libres de impurezas ";
        String pregunta125 = "El área del bar se encuentra libre de olores desagradables";
        String pregunta126 = "El bar dispone de cristalería variada para los diferentes tipos de bebidas";
        String pregunta127 = "Se dispone de una cava para vinos";
        String pregunta128 = "Estado de limpieza de la barra";
        String pregunta129 = "Estado de mantenimiento de la barra";
        String pregunta130 = "El equipo del bar se encuentra limpio y ordenado";



        String pregunta131 = "Se dispone de una cartilla de Bebidas y Licores";
        String pregunta132 = "La carta de bebidas cuenta con buena presentación";
        String pregunta133 = "La carta de bebidas incluye los precios con los impuestos de ley";
        String pregunta134 = "La carta de bebidas contempla bebidas sin y con licor ";



        String pregunta135 = "Tarjetas de Crédito";
        String pregunta136 = "Sistema de Reservaciones";
        String pregunta137 = "Oficinas Administrativas";
        String pregunta138 = "Guardarropa";
        String pregunta139 = "Servicio de Valet Parking";
        String pregunta140 = "Barra de ensaladas frías";
        String pregunta141 = "Barra de postres";
        String pregunta142 = "Servicio de Bufette";



        String pregunta143 = "Los baños públicos son amplios";
        String pregunta144 = "Los baños públicos cuentan con extractor de aire";
        String pregunta145 = "Los baños públicos cuenta con inyectores de aire";
        String pregunta146 = "Los baños públicos tienen secador de manos automático/ toallas desechables";
        String pregunta147 = "El secador de manos se encuentra en buen estado de mantenimiento y limpieza";
        String pregunta148 = "Los baños públicos tienen espejos";
        String pregunta149 = "Los baños públicos tienen basureros";
        String pregunta150 = "Todas las unidades de baños públicos están dotadas de papel higiénico suficiente";
        String pregunta151 = "Los baños cuentan con portapapel";
        String pregunta152 = "Los baños cuentan con jabonera líquida";
        String pregunta153 = "Ausencia de malos olores en los baños públicos";
        String pregunta154 = "La iluminación de los baños públicos es excelente y funcionan todas las bombillas";
        String pregunta155 = "Dispone de un sistema de iluminación natural ";
        String pregunta156 = "Dispone de un sistema de ventilación natural   ";
        String pregunta157 = "Los pisos de los baños públicos se encuentran limpios y secos";
        String pregunta158 = "Los pisos de los baños públicos se encuentran en buen estado de mantenimiento";
        String pregunta159 = "Las paredes  y  pisos de los baños públicos se observan libres de manchas o suciedad";
        String pregunta160 = "Las paredes de los baños públicos se observan en buen estado de mantenimiento";
        String pregunta161 = "El baño de los caballeros dispone de perchas o colgantes ";
        String pregunta162 = "El baño de las damas dispone de perchas o colgantes";
        String pregunta163 = "El baño de damas cuenta con mueble o superficie para colocar objetos";
        String pregunta164 = "El baño cuenta con estación  para el cambio de pañales ";
        String pregunta165 = "La estación para cambio de pañales cuenta con cinturón de seguridad ";
        String pregunta166 = "La estación para cambio de pañales cuenta con instrucciones para su uso /capacidades ";
        String pregunta167 = "La estación para cambio de pañales cuenta con cabecera";
        String pregunta168 = "La loza sanitaria presenta buen estado de mantenimiento";
        String pregunta169 = "La loza sanitaria presenta buen estado de limpieza";
        String pregunta170 = "Los servicios sanitarios para caballeros cuentan con mingitorios";
        String pregunta171 = "Los mingitorios presentan buen estado de mantenimiento";
        String pregunta172 = "Los mingitorios presentan buen estado de limpieza";
        String pregunta173 = "La grifería de los baños se encuentra en buen estado de mantenimiento";
        String pregunta174 = "La grifería de los baños se encuentra en buen estado de limpieza";
        String pregunta175 = "Esta área está dotada de desodorante ambiental";



        String pregunta176 = "Para la ventilación de la cocina hay equipo para la renovación del aire";
        String pregunta177 = "Se localizan extractores de humos y grasas en la cocina principal";
        String pregunta178 = "Los colores de esta área son claros.";
        String pregunta179 = "El material de revestimiento de las paredes es de materiales que retarda el fuego";
        String pregunta180 = "El material de revestimiento de las paredes es fácil de limpiar";
        String pregunta181 = "El material de revestimiento del techo es incombustible";
        String pregunta182 = "El material de revestimiento del techo es fácil de limpiar";
        String pregunta183 = "Contará con superficie antiderrapante a nivel de pisos";
        String pregunta184 = "Se dispone de buena iluminación dentro del área de cocina";
        String pregunta185 = "Es posible identificar un área de cocción";
        String pregunta186 = "Es posible identificar las diferentes áreas de lavado";
        String pregunta187 = "Es posible identificar un área de preparación de alimentos";
        String pregunta188 = "Se puede notar buen  mantenimiento del área de preparación de alimentos";
        String pregunta189 = "Se puede notar la limpieza del área de preparación de alimentos";
        String pregunta190 = "Se puede notar una implementación adecuada para la preparación de los alimentos";
        String pregunta191 = "Cuenta con salida de emergencia al exterior";
        String pregunta192 = "Se puede diferenciar la cocina fría con la cocina caliente";
        String pregunta193 = "La cocina cuenta con estufa eléctrica o de gas / leña/ solar";
        String pregunta194 = "La cocina cuenta con horno";
        String pregunta195 = "La cocina cuenta con filtro para extractores de grasas en buen estado de mantenimiento";
        String pregunta196 = "La cocina cuenta con filtro para extractores de grasas en buen estado de limpieza";
        String pregunta197 = "La cocina cuenta con parrilla";
        String pregunta198 = "La cocina cuenta con plancha";
        String pregunta199 = "La cocina cuenta con freidores";
        String pregunta200 = "La cocina cuenta con baño María";
        String pregunta201 = "La cocina cuenta con wafflera";
        String pregunta202 = "La cocina cuenta con tostadora";
        String pregunta203 = "La cocina cuenta con máquina de hacer hielo";
        String pregunta204 = "La cocina cuenta con batidora";
        String pregunta205 = "La cocina cuenta con licuadora";
        String pregunta206 = "La cocina cuenta con máquina moledora";
        String pregunta207 = "La cocina cuenta con máquina peladora";
        String pregunta208 = "La cocina cuenta con máquina de picar";
        String pregunta209 = "La cocina cuenta con escurridor";
        String pregunta210 = "La cocina cuenta con máquina para preparar café";
        String pregunta211 = "La cocina dispone de percoladores";
        String pregunta212 = "La cocina cuenta con rebanadora circular";
        String pregunta213 = "La cocina cuenta con lavadora de platos";
        String pregunta214 = "La cocina cuenta con estantería de acero inoxidable /  azulejos / cerámica /porcelanato";
        String pregunta215 = "La cocina cuenta con mesas de trabajo (en acero inoxidable / granito/ cerámica y porcelanato) ";
        String pregunta216 = "La cocina cuenta con fregadero industrial";
        String pregunta217 = "El fregadero dispone de agua caliente";
        String pregunta218 = "El equipo y utensilios de cocina se encuentran en buen estado";
        String pregunta219 = "El lavado del menaje de cocina se realiza en zonas separadas a la elaboración y preparación de los alimentos";
        String pregunta220 = "Los productos utilizados para la limpieza y lavado del equipo se almacenan en sitios estratégicos";
        String pregunta221 = "Los productos utilizados para la limpieza y lavado del equipo de cocina y restaurante están identificados";
        String pregunta222 = "En el interior del cuarto frío no podrán depositarse alimentos en el suelo";
        String pregunta223 = "Los equipos de enfriamento y congelación se encuentran en buen estado de mantenimiento";
        String pregunta224 = "Los equipos de enfriamento y congelación se encuentran en buen estado de limpieza";
        String pregunta225 = "No se mezclan carnes con otros alimentos y se mantienen por separado";
        String pregunta226 = "Las zonas de preparación de alimentos estarán separadas físicamente ";
        String pregunta227 = "La cocina cuenta con entrada y salida de platos";
        String pregunta228 = "El extinguidor tiene boleta de verificación de carga reciente y que no se encuentre vencida";
        String pregunta229 = "El personal de la cocina trabaja con gorro o redecillas";
        String pregunta230 = "Se cuenta con equipo aseptico para visitas ( guantes, gorros para cabello, gel para manos, tapa bocas)";
        String pregunta231 = "Cuenta con ( depositos para los decechos sólidos )  basureros con tapa";
        String pregunta232 = "Cuenta con trampas para grasas ";



        String pregunta233 = "La empresa cuenta con bodega de líquidos y licores";
        String pregunta234 = "Se cuenta con bodega de alimentos";
        String pregunta235 = "Se cuenta con cámara fría para carnes";
        String pregunta236 = "Se cuenta con cámara fría para mariscos";
        String pregunta237 = "La empresa cuenta con cuarto frío";
        String pregunta238 = "La bodega y el almacén general cuenta con acceso para proveedores";
        String pregunta239 = "En la bodega se localizan extinguidores tipo AB o equivalente";
        String pregunta240 = "El extinguidor tiene boleta de verficación de carga reciente y no se encuentra vencida";
        String pregunta241 = "El estado de mantenimiento de la bodega es adecuado";
        String pregunta242 = "El estado de limpieza de la bodega es adecuado";
        String pregunta243 = "Los alimentos y líquidos se encuentran ordenados";
        String pregunta244 = "Ausencia de olores desagradables en el área de bodegas";
        String pregunta245 = "Se identifica claramente una zona para la recepción de productos ";
        String pregunta246 = "La estantería de las bodegas es en acero inoxidable o similares";
        String pregunta247 = "La estantería de las bodegas facilita el almacenaje (PEPS: lo que Primero Entra, Primero Sale)";
        String pregunta248 = "No existe contacto de los productos  con el piso";
        String pregunta249 = "Las bodegas están protegidas contra el ingreso de roedores";
        String pregunta250 = "La bodega y el almacén general cuenta con buena iluminación";
        String pregunta251 = "La bodega y el almacén general cuenta con buena ventilación";
        String pregunta252 = "Bodega exclusiva para eventos especiales si cuenta con salas para dicho fin ";



        String pregunta253 = "Se dispone de una Bodega para el Aseo";
        String pregunta254 = "Es un área independiente";
        String pregunta255 = "La  Bodega para el Aseo se encuentra ordenada ";
        String pregunta256 = "La Bodega para el Aseo se encuentra limpia";
        String pregunta257 = "La bodega de aseo estará equipada con una pileta ";
        String pregunta258 = "La bodega de aseo estará equipada con estantería  adecuada  para productos.";
        String pregunta259 = "El revestimiento de las paredes es de materiales que retardan el fuego";



        String pregunta260 = "Existe un depósito general para desechos";
        String pregunta261 = "Los desechos  están en recipientes tapados";
        String pregunta262 = "Los recipientes para desechos  están dotados de bolsas plásticas";
        String pregunta263 = "Los recipientes para desechos  son lavados diariamente según Bitácora de Mantenimiento y Limpieza";
        String pregunta264 = "Las bolsas para desechos se retiran continuamente y son llevadas a una zona aislada";
        String pregunta265 = "El cuarto de desechos  dispone de aereación adecuada, que no permita la concentración de olores";
        String pregunta266 = "El movimiento de desechos no se cruzarán con la zona de preparación de alimentos";
        String pregunta267 = "La ubicación de los desechos será en áreas no públicas";



        String pregunta268 = "Los pasillos internos de la empresa tienen como mínimo 1.80 metros de ancho";
        String pregunta269 = "Se localizan extinguidores tipo ABC o equivalentes";
        String pregunta270 = "Los extintores se encuentran debidamente instalados según las áreas del local";
        String pregunta271 = "La empresa  tiene detectores de humo y alarmas en todas las áreas públicas cerradas";
        String pregunta272 = "Las salidas de emergencia se encuentran visibles y están rotuladas (rótulos luminosos)";
        String pregunta273 = "Se localizan luces de emergencia / planta eléctrica en las diferentes áreas de la empresa ";
        String pregunta274 = "En caso de estar en pisos superiores se  cuenta con escaleras externas de emergencia";
        String pregunta275 = "Se tiene personal capacitado para atender emergencias ";
        String pregunta276 = "El restaurante tiene tanque de almacenamiento de agua propio";
        String pregunta277 = "Se cuenta con vigilancia durante las  horas de servicio ";
        String pregunta278 = "Circuito cerrado de televisión";
        String pregunta279 = "Se aplica fumigación periódicamente";
        String pregunta280 = "Se dispone de botiquín y equipo para primeros auxilios";
        String pregunta281 = "En caso de emergencia la empresa contará con iluminación convencional para el local";
        String pregunta282 = "Los tanques de gas deben estar perimetriados y bien señalizados. ";
        String pregunta283 = "Se dispone de un sistema que puede prevenir un acto delictivo contra clientes y personal (sensores, alarma y similares)";



        String pregunta284 = "Tiene aviso en los baños para el ahorro y conservación del agua  ";
        String pregunta285 = "Tiene aviso en los baños  para el ahorro de la electricidad";
        String pregunta286 = "Se promueve la separación de desechos, colocando recipientes identificados en áreas públicas";
        String pregunta287 = "Se utiliza papel reciclado en algunas áreas de la empresa";
        String pregunta288 = "Se utiliza jabón / champú, biodegradable en los baños";
        String pregunta289 = "Se clasifican de alguna manera y se separan los desechos del área de cocina";
        String pregunta290 = "La Misión de la empresa enuncia  la variable  medio ambiental y contempla objetivos de protección";
        String pregunta291 = "La Visión de la empresa enuncia  la variable  medio ambiental y contempla sus objetivos de protección";
        String pregunta292 = "La Política de la empresa contempla su compromiso con el medio ambiente y define sus objetivos de protección";
        String pregunta293 = "Los desechos o sobrantes de alimentos no se dejan al alcance de animales silvestres";
        String pregunta294 = "Los alimentos que se venden para llevar son empacados en recipientes confeccionados con materiales amigables con el medio ambiente ";
        String pregunta295 = "Se utilizan luces de bajo consumo eléctrico";
        String pregunta296 = "Cuando el establecimiento está  próximo a áreas de conservación utilizan luces con colores de bajo impacto";
        String pregunta297 = "La mantelería y toallas son reutilizables";
        String pregunta298 = "Se cuenta con un contrato de separación y reciclaje de desechos aparte del servicio de recolección de basura municipal";
        String pregunta299 = "En diferentes áreas de la propiedad (exteriores) se han instalado basureros";
        String pregunta300 = "Los servicios sanitarios públicos cuentan con sensores para ahorro de energía eléctrica";
        String pregunta301 = "Se fomenta el consumo de vegetales/frutas de temporada en el menú";
        String pregunta302 = "Se fomenta el consumo de vegetales/frutas cuya producción tiene certificado orgánico";
        String pregunta303 = "Se fomenta el consumo de vegetales/frutas propios de la región";



        String pregunta304 = "Se contrata personal de la zona donde se ubica el establecimiento";
        String pregunta305 = "Se advierte de alguna forma la prohibición o venta de bebidas alcohólicas a  menores";
        String pregunta306 = "Participa el establecimiento en eventos con fines de beneficiencia ( ver registro , actas, agendas, entre otros) ";
        String pregunta307 = "Las instalaciones del restaurante son facilitadas  sin fines de lucro, para reuniones de grupos o asociaciones con algún enfoque social ambiental ";
        String pregunta308 = "Se permite la exhibición de obras de arte de autores regionales, en alguna época  del año ";
        String pregunta309 = "Se cuenta con un protocolo de atención al adulto mayor o persona con alguna discapacidad";



        String pregunta310 = "Gerente General / Administrador";
        String pregunta311 = "Gerente de turno ";
        String pregunta312 = "Jefe o capitán de saloneros";
        String pregunta313 = "Cajeros y auxiliares de caja";
        String pregunta314 = "Chef o gerente de cocina";
        String pregunta315 = "Jefe de Cocina o de las diferentes áreas";
        String pregunta316 = "Cocineros";
        String pregunta317 = "Repostero y panadero";
        String pregunta318 = "Especialista en cortes de carnes ( carnicero)";
        String pregunta319 = "Ayudantes de cocina";
        String pregunta320 = "Personal de pilas o lavado";
        String pregunta321 = "Bartenders";
        String pregunta322 = "Auxiliar en el bar";
        String pregunta323 = "Somelier o especialista en vinos";
        String pregunta324 = "Hoster o Anfitrión";
        String pregunta325 = "Ayudante de saloneros";
        String pregunta326 = "Saloneros";
        String pregunta327 = "Personal de Mantenimiento";
        String pregunta328 = "Personal de apoyo en montaje de mesas";
        String pregunta329 = "Personal de Limpieza (Misceláneos)";
        String pregunta330 = "Personal de Seguridad";
        String pregunta331 = "Valet Parking";



        String pregunta332 = "Hay un lavamanos para el personal ,( según el área de trabajo)";
        String pregunta333 = "Hay duchas para el personal ";
        String pregunta334 = "Hay inodoros para el personal ";
        String pregunta335 = "Se cuentan con casilleros para el personal";
        String pregunta336 = "Todo el personal se encuentra uniformado";
        String pregunta337 = "Se observan en buen estado de Mantenimiento las áreas de personal";
        String pregunta338 = "Se observan en buen estado de Limpieza las áreas de personal";



        String pregunta339 = "Mantener una presentación e imagen pulcra";
        String pregunta340 = "No portar alhajas de ninguna clase (solo reloj de pulsera)";
        String pregunta341 = "Utilizar perfumes, lociones y desodorantes de suave aroma";
        String pregunta342 = "Rostro limpio y bien afeitado (hombres)";
        String pregunta343 = "Rostro limpio y maquillaje discreto (damas)";
        String pregunta344 = "Cabello limpio, bien recortado y peinado (damas bien recogido)";
        String pregunta345 = "Personal uniformado ";
        String pregunta346 = "Personal con gafete ";



        String pregunta347 = "Se dispone de un protocolo para servir y retirar los platos y cristalería de la mesa";
        String pregunta348 = "Dominio de la carta (Conocimiento de la composición de los platillos)";
        String pregunta349 = "Presentación del menú al cliente";
        String pregunta350 = "Montaje de la mesa ajustado al número correcto de comensales de acuerdo al menú ";
        String pregunta351 = "Bebida servida en la cristalería apropiada de acuerdo al menú de bebidas";
        String pregunta352 = "Los centros de mesa no iterfieren con la  interelación de los comensales";

        ArrayList<QuestionDefBinary> questions1 = new ArrayList<>(); // [0-3]
        questions1.add(new QuestionDefBinary("1",pregunta0));
        questions1.add(new QuestionDefBinary("2",pregunta1));
        questions1.add(new QuestionDefBinary("3",pregunta2));
        questions1.add(new QuestionDefBinary("4",pregunta3));

        ArrayList<QuestionDefBinary> questions2 = new ArrayList<>(); // [4-15]
        questions2.add(new QuestionDefBinary("1",pregunta4));
        questions2.add(new QuestionDefBinary("2",pregunta5));
        questions2.add(new QuestionDefBinary("3",pregunta6));
        questions2.add(new QuestionDefBinary("4",pregunta7));
        questions2.add(new QuestionDefBinary("5",pregunta8));
        questions2.add(new QuestionDefBinary("6",pregunta9));
        questions2.add(new QuestionDefBinary("7",pregunta10));
        questions2.add(new QuestionDefBinary("8",pregunta11));
        questions2.add(new QuestionDefBinary("9",pregunta12));
        questions2.add(new QuestionDefBinary("10",pregunta13));
        questions2.add(new QuestionDefBinary("11",pregunta14));
        questions2.add(new QuestionDefBinary("12",pregunta15));

        ArrayList<QuestionDefBinary> questions3 = new ArrayList<>(); // [16-27]
        questions3.add(new QuestionDefBinary("1",pregunta16));
        questions3.add(new QuestionDefBinary("2",pregunta17));
        questions3.add(new QuestionDefBinary("3",pregunta18));
        questions3.add(new QuestionDefBinary("4",pregunta19));
        questions3.add(new QuestionDefBinary("5",pregunta20));
        questions3.add(new QuestionDefBinary("6",pregunta21));
        questions3.add(new QuestionDefBinary("7",pregunta22));
        questions3.add(new QuestionDefBinary("8",pregunta23));
        questions3.add(new QuestionDefBinary("9",pregunta24));
        questions3.add(new QuestionDefBinary("10",pregunta25));
        questions3.add(new QuestionDefBinary("11",pregunta26));
        questions3.add(new QuestionDefBinary("12",pregunta27));

        ArrayList<QuestionDefBinary> questions4 = new ArrayList<>(); // [28-75]
        questions4.add(new QuestionDefBinary("1",pregunta28));
        questions4.add(new QuestionDefBinary("2",pregunta29));
        questions4.add(new QuestionDefBinary("3",pregunta30));
        questions4.add(new QuestionDefBinary("4",pregunta31));
        questions4.add(new QuestionDefBinary("5",pregunta32));
        questions4.add(new QuestionDefBinary("6",pregunta33));
        questions4.add(new QuestionDefBinary("7",pregunta34));
        questions4.add(new QuestionDefBinary("8",pregunta35));
        questions4.add(new QuestionDefBinary("9",pregunta36));
        questions4.add(new QuestionDefBinary("10",pregunta37));
        questions4.add(new QuestionDefBinary("11",pregunta38));
        questions4.add(new QuestionDefBinary("12",pregunta39));
        questions4.add(new QuestionDefBinary("13",pregunta40));
        questions4.add(new QuestionDefBinary("14",pregunta41));
        questions4.add(new QuestionDefBinary("15",pregunta42));
        questions4.add(new QuestionDefBinary("16",pregunta43));
        questions4.add(new QuestionDefBinary("17",pregunta44));
        questions4.add(new QuestionDefBinary("18",pregunta45));
        questions4.add(new QuestionDefBinary("19",pregunta46));
        questions4.add(new QuestionDefBinary("20",pregunta47));
        questions4.add(new QuestionDefBinary("21",pregunta48));
        questions4.add(new QuestionDefBinary("22",pregunta49));
        questions4.add(new QuestionDefBinary("23",pregunta50));
        questions4.add(new QuestionDefBinary("24",pregunta51));
        questions4.add(new QuestionDefBinary("25",pregunta52));
        questions4.add(new QuestionDefBinary("26",pregunta53));
        questions4.add(new QuestionDefBinary("27",pregunta54));
        questions4.add(new QuestionDefBinary("28",pregunta55));
        questions4.add(new QuestionDefBinary("29",pregunta56));
        questions4.add(new QuestionDefBinary("30",pregunta57));
        questions4.add(new QuestionDefBinary("31",pregunta58));
        questions4.add(new QuestionDefBinary("32",pregunta59));
        questions4.add(new QuestionDefBinary("33",pregunta60));
        questions4.add(new QuestionDefBinary("34",pregunta61));
        questions4.add(new QuestionDefBinary("35",pregunta62));
        questions4.add(new QuestionDefBinary("36",pregunta63));
        questions4.add(new QuestionDefBinary("37",pregunta64));
        questions4.add(new QuestionDefBinary("38",pregunta65));
        questions4.add(new QuestionDefBinary("39",pregunta66));
        questions4.add(new QuestionDefBinary("40",pregunta67));
        questions4.add(new QuestionDefBinary("41",pregunta68));
        questions4.add(new QuestionDefBinary("42",pregunta69));
        questions4.add(new QuestionDefBinary("43",pregunta70));
        questions4.add(new QuestionDefBinary("44",pregunta71));
        questions4.add(new QuestionDefBinary("45",pregunta72));
        questions4.add(new QuestionDefBinary("46",pregunta73));
        questions4.add(new QuestionDefBinary("47",pregunta74));
        questions4.add(new QuestionDefBinary("48",pregunta75));

        ArrayList<QuestionDefBinary> questions5 = new ArrayList<>(); // [76-83]
        questions5.add(new QuestionDefBinary("1",pregunta76));
        questions5.add(new QuestionDefBinary("2",pregunta77));
        questions5.add(new QuestionDefBinary("3",pregunta78));
        questions5.add(new QuestionDefBinary("4",pregunta79));
        questions5.add(new QuestionDefBinary("5",pregunta80));
        questions5.add(new QuestionDefBinary("6",pregunta81));
        questions5.add(new QuestionDefBinary("7",pregunta82));
        questions5.add(new QuestionDefBinary("8",pregunta83));

        ArrayList<QuestionDefBinary> questions6 = new ArrayList<>(); // [84-92]
        questions6.add(new QuestionDefBinary("1",pregunta84));
        questions6.add(new QuestionDefBinary("2",pregunta85));
        questions6.add(new QuestionDefBinary("3",pregunta86));
        questions6.add(new QuestionDefBinary("4",pregunta87));
        questions6.add(new QuestionDefBinary("5",pregunta88));
        questions6.add(new QuestionDefBinary("6",pregunta89));
        questions6.add(new QuestionDefBinary("7",pregunta90));
        questions6.add(new QuestionDefBinary("8",pregunta91));
        questions6.add(new QuestionDefBinary("9",pregunta92));

        ArrayList<QuestionDefBinary> questions7 = new ArrayList<>(); // [93-100]
        questions7.add(new QuestionDefBinary("1",pregunta93));
        questions7.add(new QuestionDefBinary("2",pregunta94));
        questions7.add(new QuestionDefBinary("3",pregunta95));
        questions7.add(new QuestionDefBinary("4",pregunta96));
        questions7.add(new QuestionDefBinary("5",pregunta97));
        questions7.add(new QuestionDefBinary("6",pregunta98));
        questions7.add(new QuestionDefBinary("7",pregunta99));
        questions7.add(new QuestionDefBinary("8",pregunta100));

        ArrayList<QuestionDefBinary> questions8 = new ArrayList<>(); // [101-105]
        questions8.add(new QuestionDefBinary("1",pregunta101));
        questions8.add(new QuestionDefBinary("2",pregunta102));
        questions8.add(new QuestionDefBinary("3",pregunta103));
        questions8.add(new QuestionDefBinary("4",pregunta104));
        questions8.add(new QuestionDefBinary("5",pregunta105));

        ArrayList<QuestionDefBinary> questions9 = new ArrayList<>(); // [106-112]
        questions9.add(new QuestionDefBinary("1",pregunta106));
        questions9.add(new QuestionDefBinary("2",pregunta107));
        questions9.add(new QuestionDefBinary("3",pregunta108));
        questions9.add(new QuestionDefBinary("4",pregunta109));
        questions9.add(new QuestionDefBinary("5",pregunta110));
        questions9.add(new QuestionDefBinary("6",pregunta111));
        questions9.add(new QuestionDefBinary("7",pregunta112));

        ArrayList<QuestionDefBinary> questions10 = new ArrayList<>(); // [113-130]
        questions10.add(new QuestionDefBinary("1",pregunta113));
        questions10.add(new QuestionDefBinary("2",pregunta114));
        questions10.add(new QuestionDefBinary("3",pregunta115));
        questions10.add(new QuestionDefBinary("4",pregunta116));
        questions10.add(new QuestionDefBinary("5",pregunta117));
        questions10.add(new QuestionDefBinary("6",pregunta118));
        questions10.add(new QuestionDefBinary("7",pregunta119));
        questions10.add(new QuestionDefBinary("8",pregunta120));
        questions10.add(new QuestionDefBinary("9",pregunta121));
        questions10.add(new QuestionDefBinary("10",pregunta122));
        questions10.add(new QuestionDefBinary("11",pregunta123));
        questions10.add(new QuestionDefBinary("12",pregunta124));
        questions10.add(new QuestionDefBinary("13",pregunta125));
        questions10.add(new QuestionDefBinary("14",pregunta126));
        questions10.add(new QuestionDefBinary("15",pregunta127));
        questions10.add(new QuestionDefBinary("16",pregunta128));
        questions10.add(new QuestionDefBinary("17",pregunta129));
        questions10.add(new QuestionDefBinary("18",pregunta130));

        ArrayList<QuestionDefBinary> questions11 = new ArrayList<>(); // [131-134]
        questions11.add(new QuestionDefBinary("1",pregunta131));
        questions11.add(new QuestionDefBinary("2",pregunta132));
        questions11.add(new QuestionDefBinary("3",pregunta133));
        questions11.add(new QuestionDefBinary("4",pregunta134));

        ArrayList<QuestionDefBinary> questions12 = new ArrayList<>(); // [135-142]
        questions12.add(new QuestionDefBinary("1",pregunta135));
        questions12.add(new QuestionDefBinary("2",pregunta136));
        questions12.add(new QuestionDefBinary("3",pregunta137));
        questions12.add(new QuestionDefBinary("4",pregunta138));
        questions12.add(new QuestionDefBinary("5",pregunta139));
        questions12.add(new QuestionDefBinary("6",pregunta140));
        questions12.add(new QuestionDefBinary("7",pregunta141));
        questions12.add(new QuestionDefBinary("8",pregunta142));

        ArrayList<QuestionDefBinary> questions13 = new ArrayList<>(); // [143-175]
        questions13.add(new QuestionDefBinary("1",pregunta143));
        questions13.add(new QuestionDefBinary("2",pregunta144));
        questions13.add(new QuestionDefBinary("3",pregunta145));
        questions13.add(new QuestionDefBinary("4",pregunta146));
        questions13.add(new QuestionDefBinary("5",pregunta147));
        questions13.add(new QuestionDefBinary("6",pregunta148));
        questions13.add(new QuestionDefBinary("7",pregunta149));
        questions13.add(new QuestionDefBinary("8",pregunta150));
        questions13.add(new QuestionDefBinary("9",pregunta151));
        questions13.add(new QuestionDefBinary("10",pregunta152));
        questions13.add(new QuestionDefBinary("11",pregunta153));
        questions13.add(new QuestionDefBinary("12",pregunta154));
        questions13.add(new QuestionDefBinary("13",pregunta155));
        questions13.add(new QuestionDefBinary("14",pregunta156));
        questions13.add(new QuestionDefBinary("15",pregunta157));
        questions13.add(new QuestionDefBinary("16",pregunta158));
        questions13.add(new QuestionDefBinary("17",pregunta159));
        questions13.add(new QuestionDefBinary("18",pregunta160));
        questions13.add(new QuestionDefBinary("19",pregunta161));
        questions13.add(new QuestionDefBinary("20",pregunta162));
        questions13.add(new QuestionDefBinary("21",pregunta163));
        questions13.add(new QuestionDefBinary("22",pregunta164));
        questions13.add(new QuestionDefBinary("23",pregunta165));
        questions13.add(new QuestionDefBinary("24",pregunta166));
        questions13.add(new QuestionDefBinary("25",pregunta167));
        questions13.add(new QuestionDefBinary("26",pregunta168));
        questions13.add(new QuestionDefBinary("27",pregunta169));
        questions13.add(new QuestionDefBinary("28",pregunta170));
        questions13.add(new QuestionDefBinary("29",pregunta171));
        questions13.add(new QuestionDefBinary("30",pregunta172));
        questions13.add(new QuestionDefBinary("31",pregunta173));
        questions13.add(new QuestionDefBinary("32",pregunta174));
        questions13.add(new QuestionDefBinary("33",pregunta175));

        ArrayList<QuestionDefBinary> questions14 = new ArrayList<>(); // [176-232]
        questions14.add(new QuestionDefBinary("1",pregunta176));
        questions14.add(new QuestionDefBinary("2",pregunta177));
        questions14.add(new QuestionDefBinary("3",pregunta178));
        questions14.add(new QuestionDefBinary("4",pregunta179));
        questions14.add(new QuestionDefBinary("5",pregunta180));
        questions14.add(new QuestionDefBinary("6",pregunta181));
        questions14.add(new QuestionDefBinary("7",pregunta182));
        questions14.add(new QuestionDefBinary("8",pregunta183));
        questions14.add(new QuestionDefBinary("9",pregunta184));
        questions14.add(new QuestionDefBinary("10",pregunta185));
        questions14.add(new QuestionDefBinary("11",pregunta186));
        questions14.add(new QuestionDefBinary("12",pregunta187));
        questions14.add(new QuestionDefBinary("13",pregunta188));
        questions14.add(new QuestionDefBinary("14",pregunta189));
        questions14.add(new QuestionDefBinary("15",pregunta190));
        questions14.add(new QuestionDefBinary("16",pregunta191));
        questions14.add(new QuestionDefBinary("17",pregunta192));
        questions14.add(new QuestionDefBinary("18",pregunta193));
        questions14.add(new QuestionDefBinary("19",pregunta194));
        questions14.add(new QuestionDefBinary("20",pregunta195));
        questions14.add(new QuestionDefBinary("21",pregunta196));
        questions14.add(new QuestionDefBinary("22",pregunta197));
        questions14.add(new QuestionDefBinary("23",pregunta198));
        questions14.add(new QuestionDefBinary("24",pregunta199));
        questions14.add(new QuestionDefBinary("25",pregunta200));
        questions14.add(new QuestionDefBinary("26",pregunta201));
        questions14.add(new QuestionDefBinary("27",pregunta202));
        questions14.add(new QuestionDefBinary("28",pregunta203));
        questions14.add(new QuestionDefBinary("29",pregunta204));
        questions14.add(new QuestionDefBinary("30",pregunta205));
        questions14.add(new QuestionDefBinary("31",pregunta206));
        questions14.add(new QuestionDefBinary("32",pregunta207));
        questions14.add(new QuestionDefBinary("33",pregunta208));
        questions14.add(new QuestionDefBinary("34",pregunta209));
        questions14.add(new QuestionDefBinary("35",pregunta210));
        questions14.add(new QuestionDefBinary("36",pregunta211));
        questions14.add(new QuestionDefBinary("37",pregunta212));
        questions14.add(new QuestionDefBinary("38",pregunta213));
        questions14.add(new QuestionDefBinary("39",pregunta214));
        questions14.add(new QuestionDefBinary("40",pregunta215));
        questions14.add(new QuestionDefBinary("41",pregunta216));
        questions14.add(new QuestionDefBinary("42",pregunta217));
        questions14.add(new QuestionDefBinary("43",pregunta218));
        questions14.add(new QuestionDefBinary("44",pregunta219));
        questions14.add(new QuestionDefBinary("45",pregunta220));
        questions14.add(new QuestionDefBinary("46",pregunta221));
        questions14.add(new QuestionDefBinary("47",pregunta222));
        questions14.add(new QuestionDefBinary("48",pregunta223));
        questions14.add(new QuestionDefBinary("49",pregunta224));
        questions14.add(new QuestionDefBinary("50",pregunta225));
        questions14.add(new QuestionDefBinary("51",pregunta226));
        questions14.add(new QuestionDefBinary("52",pregunta227));
        questions14.add(new QuestionDefBinary("53",pregunta228));
        questions14.add(new QuestionDefBinary("54",pregunta229));
        questions14.add(new QuestionDefBinary("55",pregunta230));
        questions14.add(new QuestionDefBinary("56",pregunta231));
        questions14.add(new QuestionDefBinary("57",pregunta232));

        ArrayList<QuestionDefBinary> questions15 = new ArrayList<>(); // [233-252]
        questions15.add(new QuestionDefBinary("1",pregunta233));
        questions15.add(new QuestionDefBinary("2",pregunta234));
        questions15.add(new QuestionDefBinary("3",pregunta235));
        questions15.add(new QuestionDefBinary("4",pregunta236));
        questions15.add(new QuestionDefBinary("5",pregunta237));
        questions15.add(new QuestionDefBinary("6",pregunta238));
        questions15.add(new QuestionDefBinary("7",pregunta239));
        questions15.add(new QuestionDefBinary("8",pregunta240));
        questions15.add(new QuestionDefBinary("9",pregunta241));
        questions15.add(new QuestionDefBinary("10",pregunta242));
        questions15.add(new QuestionDefBinary("11",pregunta243));
        questions15.add(new QuestionDefBinary("12",pregunta244));
        questions15.add(new QuestionDefBinary("13",pregunta245));
        questions15.add(new QuestionDefBinary("14",pregunta246));
        questions15.add(new QuestionDefBinary("15",pregunta247));
        questions15.add(new QuestionDefBinary("16",pregunta248));
        questions15.add(new QuestionDefBinary("17",pregunta249));
        questions15.add(new QuestionDefBinary("18",pregunta250));
        questions15.add(new QuestionDefBinary("19",pregunta251));
        questions15.add(new QuestionDefBinary("20",pregunta252));

        ArrayList<QuestionDefBinary> questions16 = new ArrayList<>(); // [253-259]
        questions16.add(new QuestionDefBinary("1",pregunta253));
        questions16.add(new QuestionDefBinary("2",pregunta254));
        questions16.add(new QuestionDefBinary("3",pregunta255));
        questions16.add(new QuestionDefBinary("4",pregunta256));
        questions16.add(new QuestionDefBinary("5",pregunta257));
        questions16.add(new QuestionDefBinary("6",pregunta258));
        questions16.add(new QuestionDefBinary("7",pregunta259));

        ArrayList<QuestionDefBinary> questions17 = new ArrayList<>(); // [260-267]
        questions17.add(new QuestionDefBinary("1",pregunta260));
        questions17.add(new QuestionDefBinary("2",pregunta261));
        questions17.add(new QuestionDefBinary("3",pregunta262));
        questions17.add(new QuestionDefBinary("4",pregunta263));
        questions17.add(new QuestionDefBinary("5",pregunta264));
        questions17.add(new QuestionDefBinary("6",pregunta265));
        questions17.add(new QuestionDefBinary("7",pregunta266));
        questions17.add(new QuestionDefBinary("8",pregunta267));

        ArrayList<QuestionDefBinary> questions18 = new ArrayList<>(); // [268-283]
        questions18.add(new QuestionDefBinary("1",pregunta268));
        questions18.add(new QuestionDefBinary("2",pregunta269));
        questions18.add(new QuestionDefBinary("3",pregunta270));
        questions18.add(new QuestionDefBinary("4",pregunta271));
        questions18.add(new QuestionDefBinary("5",pregunta272));
        questions18.add(new QuestionDefBinary("6",pregunta273));
        questions18.add(new QuestionDefBinary("7",pregunta274));
        questions18.add(new QuestionDefBinary("8",pregunta275));
        questions18.add(new QuestionDefBinary("9",pregunta276));
        questions18.add(new QuestionDefBinary("10",pregunta277));
        questions18.add(new QuestionDefBinary("11",pregunta278));
        questions18.add(new QuestionDefBinary("12",pregunta279));
        questions18.add(new QuestionDefBinary("13",pregunta280));
        questions18.add(new QuestionDefBinary("14",pregunta281));
        questions18.add(new QuestionDefBinary("15",pregunta282));
        questions18.add(new QuestionDefBinary("16",pregunta283));

        ArrayList<QuestionDefBinary> questions19 = new ArrayList<>(); // [284-303]
        questions19.add(new QuestionDefBinary("1",pregunta284));
        questions19.add(new QuestionDefBinary("2",pregunta285));
        questions19.add(new QuestionDefBinary("3",pregunta286));
        questions19.add(new QuestionDefBinary("4",pregunta287));
        questions19.add(new QuestionDefBinary("5",pregunta288));
        questions19.add(new QuestionDefBinary("6",pregunta289));
        questions19.add(new QuestionDefBinary("7",pregunta290));
        questions19.add(new QuestionDefBinary("8",pregunta291));
        questions19.add(new QuestionDefBinary("9",pregunta292));
        questions19.add(new QuestionDefBinary("10",pregunta293));
        questions19.add(new QuestionDefBinary("11",pregunta294));
        questions19.add(new QuestionDefBinary("12",pregunta295));
        questions19.add(new QuestionDefBinary("13",pregunta296));
        questions19.add(new QuestionDefBinary("14",pregunta297));
        questions19.add(new QuestionDefBinary("15",pregunta298));
        questions19.add(new QuestionDefBinary("16",pregunta299));
        questions19.add(new QuestionDefBinary("17",pregunta300));
        questions19.add(new QuestionDefBinary("18",pregunta301));
        questions19.add(new QuestionDefBinary("19",pregunta302));
        questions19.add(new QuestionDefBinary("20",pregunta303));

        ArrayList<QuestionDefBinary> questions20 = new ArrayList<>(); // [304-309]
        questions20.add(new QuestionDefBinary("1",pregunta304));
        questions20.add(new QuestionDefBinary("2",pregunta305));
        questions20.add(new QuestionDefBinary("3",pregunta306));
        questions20.add(new QuestionDefBinary("4",pregunta307));
        questions20.add(new QuestionDefBinary("5",pregunta308));
        questions20.add(new QuestionDefBinary("6",pregunta309));

        ArrayList<QuestionDefBinary> questions21 = new ArrayList<>(); // [310-331]
        questions21.add(new QuestionDefBinary("1",pregunta310));
        questions21.add(new QuestionDefBinary("2",pregunta311));
        questions21.add(new QuestionDefBinary("3",pregunta312));
        questions21.add(new QuestionDefBinary("4",pregunta313));
        questions21.add(new QuestionDefBinary("5",pregunta314));
        questions21.add(new QuestionDefBinary("6",pregunta315));
        questions21.add(new QuestionDefBinary("7",pregunta316));
        questions21.add(new QuestionDefBinary("8",pregunta317));
        questions21.add(new QuestionDefBinary("9",pregunta318));
        questions21.add(new QuestionDefBinary("10",pregunta319));
        questions21.add(new QuestionDefBinary("11",pregunta320));
        questions21.add(new QuestionDefBinary("12",pregunta321));
        questions21.add(new QuestionDefBinary("13",pregunta322));
        questions21.add(new QuestionDefBinary("14",pregunta323));
        questions21.add(new QuestionDefBinary("15",pregunta324));
        questions21.add(new QuestionDefBinary("16",pregunta325));
        questions21.add(new QuestionDefBinary("17",pregunta326));
        questions21.add(new QuestionDefBinary("18",pregunta327));
        questions21.add(new QuestionDefBinary("19",pregunta328));
        questions21.add(new QuestionDefBinary("20",pregunta329));
        questions21.add(new QuestionDefBinary("21",pregunta330));
        questions21.add(new QuestionDefBinary("22",pregunta331));

        ArrayList<QuestionDefBinary> questions22 = new ArrayList<>(); // [332-338]
        questions22.add(new QuestionDefBinary("1",pregunta332));
        questions22.add(new QuestionDefBinary("2",pregunta333));
        questions22.add(new QuestionDefBinary("3",pregunta334));
        questions22.add(new QuestionDefBinary("4",pregunta335));
        questions22.add(new QuestionDefBinary("5",pregunta336));
        questions22.add(new QuestionDefBinary("6",pregunta337));
        questions22.add(new QuestionDefBinary("7",pregunta338));

        ArrayList<QuestionDefBinary> questions23 = new ArrayList<>(); // [339-346]
        questions23.add(new QuestionDefBinary("1",pregunta339));
        questions23.add(new QuestionDefBinary("2",pregunta340));
        questions23.add(new QuestionDefBinary("3",pregunta341));
        questions23.add(new QuestionDefBinary("4",pregunta342));
        questions23.add(new QuestionDefBinary("5",pregunta343));
        questions23.add(new QuestionDefBinary("6",pregunta344));
        questions23.add(new QuestionDefBinary("7",pregunta345));
        questions23.add(new QuestionDefBinary("8",pregunta346));

        ArrayList<QuestionDefBinary> questions24 = new ArrayList<>(); // [347-352]
        questions24.add(new QuestionDefBinary("1",pregunta347));
        questions24.add(new QuestionDefBinary("2",pregunta348));
        questions24.add(new QuestionDefBinary("3",pregunta349));
        questions24.add(new QuestionDefBinary("4",pregunta350));
        questions24.add(new QuestionDefBinary("5",pregunta351));
        questions24.add(new QuestionDefBinary("6",pregunta352));

        ArrayList<String> chapterNames = new ArrayList<>();
        chapterNames.add("Condiciones para la Operacion");//1
        chapterNames.add("Areas Frontales");//2
        chapterNames.add("Areas Internas");//3
        chapterNames.add("Areas Posteriores");//4
        chapterNames.add("Calidad Ambiental");//5
        chapterNames.add("Personal Administrativo y de Servicio");//6

        ArrayList<ChapterDefBinary> chapters = new ArrayList<>();
        chapters.add(new ChapterDefBinary("Permisos y Otros","1.1",1,questions1));//14
        chapters.add(new ChapterDefBinary("Fachada e Identificación de la empresa","2.1",1,questions2));//9
        chapters.add(new ChapterDefBinary("Estacionamiento","2.2",1,questions3));//26
        chapters.add(new ChapterDefBinary("Area de Salon Comedor","3.1",1,questions4));//10
        chapters.add(new ChapterDefBinary("Estacion de saloneros","3.2",1,questions5));//7
        chapters.add(new ChapterDefBinary("Carta de Menu","3.3",1,questions6));//7
        chapters.add(new ChapterDefBinary("Composicion de la carta de menu/Entradas","3.3.1",1,questions7));//12
        chapters.add(new ChapterDefBinary("Composicion de la carta de menu/Plato Fuerte","3.3.2",1,questions8));//9
        chapters.add(new ChapterDefBinary("Composicion de la carta de menu/Postres y Bebidas Digestivas","3.3.3",1,questions9));//9
        chapters.add(new ChapterDefBinary("Area de Bar","3.4",1,questions10));//9
        chapters.add(new ChapterDefBinary("Carta de Bebidas y Licores","3.5",1,questions11));//9
        chapters.add(new ChapterDefBinary("Otros Servicios","3.6",1,questions12));//9
        chapters.add(new ChapterDefBinary("Sanitarios Publicos","3.7",1,questions13));//9
        chapters.add(new ChapterDefBinary("Area de Cocina","4.1",1,questions14));//9
        chapters.add(new ChapterDefBinary("Bodegas y Almacen General","4.2",1,questions15));//9
        chapters.add(new ChapterDefBinary("Bodega de Aseo","4.3",1,questions16));//9
        chapters.add(new ChapterDefBinary("Desechos Solidos","4.4",1,questions17));//9
        chapters.add(new ChapterDefBinary("Seguridad","4.5",1,questions18));//9
        chapters.add(new ChapterDefBinary("Variables Ambientales","5.1",1,questions19));//9
        chapters.add(new ChapterDefBinary("Gestion Social y Cultural","5.2",1,questions20));//9
        chapters.add(new ChapterDefBinary("Del Personal Administrativo y de Servicio","6.1",1,questions21));//9
        chapters.add(new ChapterDefBinary("Facilidades para el Personal","6.2",1,questions22));//9
        chapters.add(new ChapterDefBinary("Presentacion Personal","6.3",1,questions23));//9
        chapters.add(new ChapterDefBinary("Servicio a la mesa","6.4",1,questions24));//9

        return new FormDefRestaurant("Requerimientos Básicos para Restaurantes",9,chapters,chapterNames);
    }//READY 9

    public static FormDefCafeteriaFondaSoda getFormFondaSodaDef(){

        String pregunta0 = "UBICACIÓN DEL INMUEBLE";
        String pregunta1 = "ESTADO DE MANTENIMIENTO";
        String pregunta2 = "ESTADO DE LIMPIEZA";
        String pregunta3 = "CARACTERÍSTICAS CONSTRUCTIVAS DE LA FACHADA";
        String pregunta4 = "IDENTIFICACIÓN DE LA EMPRESA";
        String pregunta5 = "CARACTERÍSTICAS CONSTRUCTIVAS Y CAPACIDAD ESTACIONAMIENTO";



        String pregunta6 = "CARACTERÍSTICAS CONSTRUCTIVAS DEL SALÓN COMEDOR";
        String pregunta7 = "MANTENIMIENTO Y LIMPIEZA";
        String pregunta8 = "ACABADO O RECUBRIMIENTO DEL CIELO RASO";
        String pregunta9 = "ACABADO O RECUBRIMIENTO DEL PISO";
        String pregunta10 = "ACABADO O RECUBRIMIENTO DE PAREDES";



        String pregunta11 = "MOBILIARIO";
        String pregunta12 = "MANTELERÍA";
        String pregunta13 = "VAJILLA";
        String pregunta14 = "CUBERTERIA";
        String pregunta15 = "ELEMENTOS DECORATIVOS";
        String pregunta16 = "ILUMINACIÓN Y VENTILACIÓN NATURAL";



        String pregunta17 = "CARACTERÍSTICAS CONSTRUCTIVAS DEL BAR";
        String pregunta18 = "MOBILIARIO DEL BAR";
        String pregunta19 = "EQUIPO Y ACCESORIOS DEL BAR";



        String pregunta20 = "CARTA DE MENÚ";
        String pregunta21 = "CALIDAD Y PRESENTACIÓN DE PLATOS";
        String pregunta22 = "SERVICIO A LA MESA";
        String pregunta23 = "ENTRADAS";
        String pregunta24 = "PLATOS FUERTES";
        String pregunta25 = "POSTRES/BEBIDAS DIGESTIVAS";



        String pregunta26 = "ACABADO O RECUBRIMIENTO DE PISOS Y PAREDES";
        String pregunta27 = "ACABADO O RECUBRIMIENTO DEL CIELO RASO";
        String pregunta28 = "ILUMINACIÓN Y VENTILACIÓN NATURAL";
        String pregunta29 = "SALIDA DE EMERGENCIA PARA EL PERSONAL DE COCINA";
        String pregunta30 = "EQUIPO Y MOBILIARIO DEL AREA DE PREPARACIÓN DE ALIMENTOS";
        String pregunta31 = "EQUIPO Y MOBILIARIO DEL AREA DE COCION DE ALIMENTOS";



        String pregunta32 = "ILUMINACIÓN Y VENTILACIÓN NATURAL";
        String pregunta33 = "ILUMINACIÓN Y VENTILACIÓN ARTIFICIAL";
        String pregunta34 = "ACABADO O RECUBRIMIENTO DE PISOS, PAREDES Y CIELORAZOS";
        String pregunta35 = "EQUIPO Y MOBILIARIO PARA EL ALMACENAJE DE LOS PRODUCTOS";



        String pregunta36 = "FACILIDADES PARA LA EVACUACIÓN";
        String pregunta37 = "ROTULACIÓN DE SEGURIDAD (LUMINOSA)";
        String pregunta38 = "ALARMA Y SISTEMAS DE EXTINCIÓN CONTRA INCENDIOS";
        String pregunta39 = "DEPOSITO DE AGUA";
        String pregunta40 = "LUCES DE EMERGENCIA";
        String pregunta41 = "FUMIGACIÓN";
        String pregunta42 = "TRATAMIENTO Y ELIMINACIÓN DE BASURA";
        String pregunta43 = "TRATAMIENTO Y ELIMINACIÓN DE AGUAS RESIDUALES";
        String pregunta44 = "AREA DE ASEO";
        String pregunta45 = "VIGILANCIA";
        String pregunta46 = "PERSONAL CAPACITADO PARA ATENDER EMERGENCIAS";
        String pregunta47 = "BOTIQUÍN Y EQUIPO PARA PRIMEROS AUXILIOS";



        String pregunta48 = "CARACTERÍSTICAS CONSTRUCTIVAS";
        String pregunta49 = "REVESTIMIENTO IMPERMEABLE DE PISOS Y PAREDES";
        String pregunta50 = "ACABADO O RECUBRIMIENTO DEL CIELO RASO";
        String pregunta51 = "DIMENSIONES";
        String pregunta52 = "LOZA SANITARIA";
        String pregunta53 = "EQUIPO Y ACCESORIOS DE LOS SANITARIOS";



        String pregunta54 = "CASILLEROS PARA EL PERSONAL";
        String pregunta55 = "PROGRAMA DE CAPACITACION PARA EL PERSONAL";



        String pregunta56 = "GERENTE GENERAL (ADMINISTRADOR)";
        String pregunta57 = "COCINEROS";
        String pregunta58 = "CAMAREROS";
        String pregunta59 = "PORCENTAJE DE CAMAREROS POR NÚMEROS DE MESAS";
        String pregunta60 = "PERSONAL DE SEGURIDAD Y VIGILANCIA";


        ArrayList<QuestionDefScore> questions1 = new ArrayList<>(); //[0-5]
        questions1.add(new QuestionDefScore("1",pregunta0,0,10));
        questions1.add(new QuestionDefScore("2",pregunta1,0,10));
        questions1.add(new QuestionDefScore("3",pregunta2,0,10));
        questions1.add(new QuestionDefScore("4",pregunta3,0,10));
        questions1.add(new QuestionDefScore("5",pregunta4,0,10));
        questions1.add(new QuestionDefScore("6",pregunta5,0,10));

        ArrayList<QuestionDefScore> questions2 = new ArrayList<>();//[6-10]
        questions2.add(new QuestionDefScore("1",pregunta6,0,10));
        questions2.add(new QuestionDefScore("2",pregunta7,0,10));
        questions2.add(new QuestionDefScore("3",pregunta8,0,5));
        questions2.add(new QuestionDefScore("4",pregunta9,0,10));
        questions2.add(new QuestionDefScore("5",pregunta10,0,10));

        ArrayList<QuestionDefScore> questions3 = new ArrayList<>();//[11-16]
        questions3.add(new QuestionDefScore("1",pregunta11,0,10));
        questions3.add(new QuestionDefScore("2",pregunta12,0,10));
        questions3.add(new QuestionDefScore("3",pregunta13,0,10));
        questions3.add(new QuestionDefScore("4",pregunta14,0,10));
        questions3.add(new QuestionDefScore("5",pregunta15,0,10));
        questions3.add(new QuestionDefScore("6",pregunta16,0,5));

        ArrayList<QuestionDefScore> questions4 = new ArrayList<>();//[17-19]
        questions4.add(new QuestionDefScore("1",pregunta17,0,10));
        questions4.add(new QuestionDefScore("2",pregunta18,0,10));
        questions4.add(new QuestionDefScore("3",pregunta19,0,10));

        ArrayList<QuestionDefScore> questions5 = new ArrayList<>();//[20-25]
        questions5.add(new QuestionDefScore("1",pregunta20,0,15));
        questions5.add(new QuestionDefScore("2",pregunta21,0,10));
        questions5.add(new QuestionDefScore("3",pregunta22,0,10));
        questions5.add(new QuestionDefScore("4",pregunta23,0,5));
        questions5.add(new QuestionDefScore("5",pregunta24,0,5));
        questions5.add(new QuestionDefScore("6",pregunta25,0,5));

        ArrayList<QuestionDefScore> questions6 = new ArrayList<>();//[26-31]
        questions6.add(new QuestionDefScore("1",pregunta26,0,10));
        questions6.add(new QuestionDefScore("2",pregunta27,0,5));
        questions6.add(new QuestionDefScore("3",pregunta28,0,5));
        questions6.add(new QuestionDefScore("4",pregunta29,0,10));
        questions6.add(new QuestionDefScore("5",pregunta30,0,10));
        questions6.add(new QuestionDefScore("6",pregunta31,0,10));

        ArrayList<QuestionDefScore> questions7 = new ArrayList<>();//[32-35]
        questions7.add(new QuestionDefScore("1",pregunta32,0,5));
        questions7.add(new QuestionDefScore("2",pregunta33,0,5));
        questions7.add(new QuestionDefScore("3",pregunta34,0,5));
        questions7.add(new QuestionDefScore("4",pregunta35,0,10));

        ArrayList<QuestionDefScore> questions8 = new ArrayList<>();//[36-47]
        questions8.add(new QuestionDefScore("1",pregunta36,0,5));
        questions8.add(new QuestionDefScore("2",pregunta37,0,5));
        questions8.add(new QuestionDefScore("3",pregunta38,0,5));
        questions8.add(new QuestionDefScore("4",pregunta39,0,5));
        questions8.add(new QuestionDefScore("5",pregunta40,0,5));
        questions8.add(new QuestionDefScore("6",pregunta41,0,5));
        questions8.add(new QuestionDefScore("7",pregunta42,0,5));
        questions8.add(new QuestionDefScore("8",pregunta43,0,5));
        questions8.add(new QuestionDefScore("9",pregunta44,0,10));
        questions8.add(new QuestionDefScore("10",pregunta45,0,5));
        questions8.add(new QuestionDefScore("11",pregunta46,0,5));
        questions8.add(new QuestionDefScore("12",pregunta47,0,5));

        ArrayList<QuestionDefScore> questions9 = new ArrayList<>();//[48-53]
        questions9.add(new QuestionDefScore("1",pregunta48,0,5));
        questions9.add(new QuestionDefScore("2",pregunta49,0,10));
        questions9.add(new QuestionDefScore("3",pregunta50,0,5));
        questions9.add(new QuestionDefScore("4",pregunta51,0,5));
        questions9.add(new QuestionDefScore("5",pregunta52,0,5));
        questions9.add(new QuestionDefScore("6",pregunta53,0,15));

        ArrayList<QuestionDefScore> questions10 = new ArrayList<>();//[54-55]
        questions10.add(new QuestionDefScore("1",pregunta54,0,5));
        questions10.add(new QuestionDefScore("2",pregunta55,0,5));

        ArrayList<QuestionDefScore> questions11 = new ArrayList<>();//[56-60]
        questions11.add(new QuestionDefScore("1",pregunta56,0,10));
        questions11.add(new QuestionDefScore("2",pregunta57,0,5));
        questions11.add(new QuestionDefScore("3",pregunta58,0,6));
        questions11.add(new QuestionDefScore("4",pregunta59,0,4));
        questions11.add(new QuestionDefScore("5",pregunta60,0,5));

        ArrayList<ChapterDefScore> chapters = new ArrayList<>();
        chapters.add(new ChapterDefScore("Caracteristicas del inmueble","1",12.9f,questions1));
        chapters.add(new ChapterDefScore("De la presentacion interna","2",9.67f,questions2));
        chapters.add(new ChapterDefScore("Del Equipamiento y Acondicionamiento del Salon Comedor","3",11.82f,questions3));
        chapters.add(new ChapterDefScore("Area de Servicio de Bebidas","4",6.46f,questions4));
        chapters.add(new ChapterDefScore("Composicion de la carta del menu","5",10.75f,questions5));
        chapters.add(new ChapterDefScore("Caracteristicas del Area de Cocina","6",10.75f,questions6));
        chapters.add(new ChapterDefScore("Otros Departamentos(Bodegas)","7",5.38f,questions7));
        chapters.add(new ChapterDefScore("Normas de Seguridad para Clientes y Personal","8",13.97f,questions8));
        chapters.add(new ChapterDefScore("Area de Servicios Sanitarios Publicos","9",9.67f,questions9));
        chapters.add(new ChapterDefScore("Facilidad para el Personal","10",2.17f,questions10));
        chapters.add(new ChapterDefScore("Personal Administrativo y De Servicio","11",6.46f,questions11));


        return new FormDefCafeteriaFondaSoda("Calificacion para Fondas y Sodas",10,chapters);
    }//READY 10

    public static FormDefCafeteriaFondaSoda getFormCafeteriaDef(){
        String pregunta0 = "UBICACIÓN DEL INMUEBLE";
        String pregunta1 = "ESTADO DE MANTENIMIENTO";
        String pregunta2 = "ESTADO DE LIMPIEZA";
        String pregunta3 = "CARACTERÍSTICAS CONSTRUCTIVAS DE LA FACHADA";
        String pregunta4 = "IDENTIFICACIÓN DE LA EMPRESA";
        String pregunta5 = "CARACTERÍSTICAS CONSTRUCTIVAS Y CAPACIDAD ESTACIONAMIENTO";



        String pregunta6 = "CARACTERÍSTICAS CONSTRUCTIVAS DEL SALÓN COMEDOR";
        String pregunta7 = "MANTENIMIENTO Y LIMPIEZA";
        String pregunta8 = "ÁREAS MÍNIMAS";
        String pregunta9 = "RELACIÓN ESPACIO CAPACIDAD";
        String pregunta10 = "ENTRADA PARA CLIENTES INDEPENDIENTE AL PERSONAL";
        String pregunta11 = "ACABADO O RECUBRIMIENTO DEL CIELO RASO";
        String pregunta12 = "ACABADO O RECUBRIMIENTO DEL PISO";
        String pregunta13 = "ACABADO O RECUBRIMIENTO DE PAREDES";



        String pregunta14 = "MOBILIARIO";
        String pregunta15 = "VAJILLA";
        String pregunta16 = "CUBERTERIA";
        String pregunta17 = "ELEMENTOS DECORATIVOS";
        String pregunta18 = "ILUMINACIÓN Y VENTILACIÓN NATURAL";
        String pregunta19 = "ACONDICIONAMIENTO ARTIFICIAL DE AIRE";
        String pregunta20 = "LAMPARAS CANDILES Y OTROS ELEMENTOS DE ILUMINACIÓN";
        String pregunta21 = "SISTEMA DE SONIDO INTEGRAL AMBIENTAL";
        String pregunta22 = "SISTEMA DE IMAGEN INTEGRAL AMBIENTAL";
        String pregunta23 = "DESODORANTE AMBIENTAL";
        String pregunta24 = "MUEBLE PARA SALONEROS";



        String pregunta25 = "CARTA DE MENÚ";
        String pregunta26 = "PLATO FUERTE/ESPECIALIDADES";
        String pregunta27 = "POSTRES ";
        String pregunta28 = "CALIDAD Y PRESENTACIÓN DE PLATOS";
        String pregunta29 = "SERVICIO A LA MESA";



        String pregunta30 = "VESTÍBULO O SALA DE ESPERA";
        String pregunta31 = " PARA LLEVAR";
        String pregunta32 = "TARJETAS DE CRÉDITO";
        String pregunta33 = "SERVICIO TELEFÓNICO";



        String pregunta34 = "PROMOCIÓN Y PUBLICIDAD";
        String pregunta35 = "ESTRUCTURA CUANTITATIVA DE LA DEMANDA";



        String pregunta36 = "CARACTERÍSTICAS CONSTRUCTIVAS";
        String pregunta37 = "RELACIÓN ESPACIO-AREA DE TRANSITO Y LABORAL";
        String pregunta38 = "ACABADO O RECUBRIMIENTO DE PISOS Y PAREDES";
        String pregunta39 = "ACABADO O RECUBRIMIENTO DEL CIELO RASO";
        String pregunta40 = "ILUMINACIÓN Y VENTILACIÓN NATURAL";
        String pregunta41 = "ILUMINACIÓN Y VENTILACIÓN ARTIFICIAL";
        String pregunta42 = "SALIDA DE EMERGENCIA PARA EL PERSONAL DE COCINA";
        String pregunta43 = "EQUIPO Y MOBILIARIO DEL AREA DE PREPARACIÓN DE ALIMENTOS";
        String pregunta44 = "EQUIPO Y MOBILIARIO DEL AREA DE LAVADO";
        String pregunta45 = "EQUIPO Y MOBILIARIO FRIGORÍFICO";



        String pregunta46 = "CARACTERÍSTICAS CONSTRUCTIVAS";
        String pregunta47 = "ÁREAS MÍNIMAS";
        String pregunta48 = "EQUIPO Y MOBILIARIO PARA EL ALMACENAJE DE LOS PRODUCTOS";



        String pregunta49 = "FACILIDADES PARA LA EVACUACIÓN";
        String pregunta50 = "ROTULACIÓN DE SEGURIDAD (LUMINOSA)";
        String pregunta51 = "ALARMA Y SISTEMAS DE EXTINCIÓN CONTRA INCENDIOS";
        String pregunta52 = "DEPOSITO DE AGUA";
        String pregunta53 = "LUCES DE EMERGENCIA";
        String pregunta54 = "FUMIGACIÓN";
        String pregunta55 = "TRATAMIENTO Y ELIMINACIÓN DE BASURA";
        String pregunta56 = "TRATAMIENTO Y ELIMINACIÓN DE AGUAS RESIDUALES";
        String pregunta57 = "AREA DE ASEO";
        String pregunta58 = "VIGILANCIA";
        String pregunta59 = "PERSONAL CAPACITADO PARA ATENDER EMERGENCIAS";
        String pregunta60 = "BOTIQUÍN Y EQUIPO PARA PRIMEROS AUXILIOS";



        String pregunta61 = "CARACTERÍSTICAS CONSTRUCTIVAS";
        String pregunta62 = "REVESTIMIENTO IMPERMEABLE DE PISOS Y PAREDES";
        String pregunta63 = "ACABADO O RECUBRIMIENTO DEL CIELO RASO";
        String pregunta64 = "DIMENSIONES";
        String pregunta65 = "LOZA SANITARIA";
        String pregunta66 = "EQUIPO Y ACCESORIOS DE LOS SANITARIOS";



        String pregunta67 = "CASILLEROS PARA EL PERSONAL";
        String pregunta68 = "SERVICIOS SANITARIOS PARA EL PERSONAL";
        String pregunta69 = "OFICINA ADMINISTRATIVA";



        String pregunta70 = "(ADMINISTRADOR)";
        String pregunta71 = "CAJERO";
        String pregunta72 = "JEFE DE PERSONAL";
        String pregunta73 = "JEFE DE COMEDOR ";
        String pregunta74 = "COCINEROS";
        String pregunta75 = "CAMAREROS";
        String pregunta76 = "PORCENTAJE DE CAMAREROS POR NÚMEROS DE MESAS";
        String pregunta77 = "PERSONAL DE SEGURIDAD Y VIGILANCIA";

        ArrayList<QuestionDefScore> questions1 = new ArrayList<>();//[0-5]
        questions1.add(new QuestionDefScore("1",pregunta0,0,10));
        questions1.add(new QuestionDefScore("2",pregunta1,0,10));
        questions1.add(new QuestionDefScore("3",pregunta2,0,10));
        questions1.add(new QuestionDefScore("4",pregunta3,0,10));
        questions1.add(new QuestionDefScore("5",pregunta4,0,10));
        questions1.add(new QuestionDefScore("6",pregunta5,0,10));

        ArrayList<QuestionDefScore> questions2 = new ArrayList<>();//[6-13]
        questions2.add(new QuestionDefScore("1",pregunta6,0,10));
        questions2.add(new QuestionDefScore("2",pregunta7,0,10));
        questions2.add(new QuestionDefScore("3",pregunta8,0,10));
        questions2.add(new QuestionDefScore("4",pregunta9,0,5));
        questions2.add(new QuestionDefScore("5",pregunta10,0,5));
        questions2.add(new QuestionDefScore("6",pregunta11,0,5));
        questions2.add(new QuestionDefScore("7",pregunta12,0,10));
        questions2.add(new QuestionDefScore("8",pregunta13,0,10));

        ArrayList<QuestionDefScore> questions3 = new ArrayList<>();//[14-24]
        questions3.add(new QuestionDefScore("1",pregunta14,0,10));
        questions3.add(new QuestionDefScore("2",pregunta15,0,10));
        questions3.add(new QuestionDefScore("3",pregunta16,0,10));
        questions3.add(new QuestionDefScore("4",pregunta17,0,10));
        questions3.add(new QuestionDefScore("5",pregunta18,0,5));
        questions3.add(new QuestionDefScore("6",pregunta19,0,10));
        questions3.add(new QuestionDefScore("7",pregunta20,0,5));
        questions3.add(new QuestionDefScore("8",pregunta21,0,5));
        questions3.add(new QuestionDefScore("9",pregunta22,0,5));
        questions3.add(new QuestionDefScore("10",pregunta23,0,3));
        questions3.add(new QuestionDefScore("11",pregunta24,0,6));

        ArrayList<QuestionDefScore> questions5 = new ArrayList<>();//[25-29]
        questions5.add(new QuestionDefScore("1",pregunta25,0,15));
        questions5.add(new QuestionDefScore("2",pregunta26,0,5));
        questions5.add(new QuestionDefScore("3",pregunta27,0,4));
        questions5.add(new QuestionDefScore("4",pregunta28,0,10));
        questions5.add(new QuestionDefScore("5",pregunta29,0,10));

        ArrayList<QuestionDefScore> questions7 = new ArrayList<>();//[30-33]
        questions7.add(new QuestionDefScore("1",pregunta30,0,5));
        questions7.add(new QuestionDefScore("2",pregunta31,0,5));
        questions7.add(new QuestionDefScore("3",pregunta32,0,5));
        questions7.add(new QuestionDefScore("4",pregunta33,0,5));

        ArrayList<QuestionDefScore> questions8 = new ArrayList<>();//[34-35]
        questions8.add(new QuestionDefScore("1",pregunta34,0,5));
        questions8.add(new QuestionDefScore("2",pregunta35,0,5));

        ArrayList<QuestionDefScore> questions9 = new ArrayList<>();//[36-45]
        questions9.add(new QuestionDefScore("1",pregunta36,0,10));
        questions9.add(new QuestionDefScore("2",pregunta37,0,10));
        questions9.add(new QuestionDefScore("3",pregunta38,0,10));
        questions9.add(new QuestionDefScore("4",pregunta39,0,5));
        questions9.add(new QuestionDefScore("5",pregunta40,0,5));
        questions9.add(new QuestionDefScore("6",pregunta41,0,5));
        questions9.add(new QuestionDefScore("7",pregunta42,0,10));
        questions9.add(new QuestionDefScore("8",pregunta43,0,10));
        questions9.add(new QuestionDefScore("9",pregunta44,0,10));
        questions9.add(new QuestionDefScore("10",pregunta45,0,10));

        ArrayList<QuestionDefScore> questions10 = new ArrayList<>();//[46-48]
        questions10.add(new QuestionDefScore("1",pregunta46,0,10));
        questions10.add(new QuestionDefScore("2",pregunta47,0,10));
        questions10.add(new QuestionDefScore("3",pregunta48,0,10));

        ArrayList<QuestionDefScore> questions11 = new ArrayList<>();//[49-60]
        questions11.add(new QuestionDefScore("1",pregunta49,0,5));
        questions11.add(new QuestionDefScore("2",pregunta50,0,5));
        questions11.add(new QuestionDefScore("3",pregunta51,0,5));
        questions11.add(new QuestionDefScore("4",pregunta52,0,5));
        questions11.add(new QuestionDefScore("5",pregunta53,0,5));
        questions11.add(new QuestionDefScore("6",pregunta54,0,5));
        questions11.add(new QuestionDefScore("7",pregunta55,0,5));
        questions11.add(new QuestionDefScore("8",pregunta56,0,5));
        questions11.add(new QuestionDefScore("9",pregunta57,0,10));
        questions11.add(new QuestionDefScore("10",pregunta58,0,5));
        questions11.add(new QuestionDefScore("11",pregunta59,0,5));
        questions11.add(new QuestionDefScore("12",pregunta60,0,5));

        ArrayList<QuestionDefScore> questions12 = new ArrayList<>();//[61-66]
        questions12.add(new QuestionDefScore("1",pregunta61,0,5));
        questions12.add(new QuestionDefScore("2",pregunta62,0,10));
        questions12.add(new QuestionDefScore("3",pregunta63,0,5));
        questions12.add(new QuestionDefScore("4",pregunta64,0,5));
        questions12.add(new QuestionDefScore("5",pregunta65,0,5));
        questions12.add(new QuestionDefScore("6",pregunta66,0,15));

        ArrayList<QuestionDefScore> questions13 = new ArrayList<>();//[67-69]
        questions13.add(new QuestionDefScore("1",pregunta67,0,5));
        questions13.add(new QuestionDefScore("2",pregunta68,0,5));
        questions13.add(new QuestionDefScore("3",pregunta69,0,5));

        ArrayList<QuestionDefScore> questions14 = new ArrayList<>();//[70-77]
        questions14.add(new QuestionDefScore("1",pregunta70,0,10));
        questions14.add(new QuestionDefScore("2",pregunta71,0,5));
        questions14.add(new QuestionDefScore("3",pregunta72,0,5));
        questions14.add(new QuestionDefScore("4",pregunta73,0,7));
        questions14.add(new QuestionDefScore("5",pregunta74,0,5));
        questions14.add(new QuestionDefScore("6",pregunta75,0,6));
        questions14.add(new QuestionDefScore("7",pregunta76,0,4));
        questions14.add(new QuestionDefScore("8",pregunta77,0,5));

        ArrayList<ChapterDefScore> chapters = new ArrayList<>();
        chapters.add(new ChapterDefScore("Caracteristicas del inmueble","1",7.57f,questions1));
        chapters.add(new ChapterDefScore("De la presentacion interna","2",8.2f,questions2));
        chapters.add(new ChapterDefScore("Del Equipamiento y Acondicionamiento del Salon Comedor","3",11.22f,questions3));

        chapters.add(new ChapterDefScore("Composicion de la carta del menu","5",7.94f,questions5));

        chapters.add(new ChapterDefScore("Servicios Complementarios","7",3.15f,questions7));
        chapters.add(new ChapterDefScore("Mercadotecnia","8",1.26f,questions8));
        chapters.add(new ChapterDefScore("Caracteristicas del Area de Cocina","9",13.24f,questions9));
        chapters.add(new ChapterDefScore("Otras Areas(Despensa)","10",6.31f,questions10));
        chapters.add(new ChapterDefScore("Normas de Seguridad para Clientes y Personal","11",8.2f,questions11));
        chapters.add(new ChapterDefScore("Area de Servicios Sanitarios Publicos","12",5.67f,questions12));
        chapters.add(new ChapterDefScore("Facilidad para el Personal","13",2.52f,questions13));
        chapters.add(new ChapterDefScore("Personal Administrarivo y de Servicio","14",9.08f,questions14));


        return new FormDefCafeteriaFondaSoda("Calificacion para Cafeterias",11,chapters);
    } //READY 11

    public static FormDefBinary getFormWaterActivitiesDef() {
        String pregunta0 = "Tiene el Permiso de Funcionamiento vigente.";
        String pregunta1 = "La Patente Municipal se encuentra vigente.";
        String pregunta2 = "Tiene Seguro de Responsabilidad Civil y gastos médicos.";
        String pregunta3 = "Cuando se ofertan las actividades Recreativas Acuáticas ,las mismas se dan en apego a la normativa vigente. (Aplica en algunos casos el permiso delMOPT)";
        String pregunta4 = "La empresa cuenta con el Permiso de Uso del Suelo emitido por el Consejo Municipal que le permite a los empresarios colocar el equipo recreativo acuático en la playa. ";
        String pregunta5 = "Se dispone de un Protocolo para la recepción, atención y partida de los turistas.";
        String pregunta6 = "Se dispone de información y protocolospara contactar servicios de emergencia y médicos.";
        String pregunta7 = "Los Guías tienen el carnet de acreditacion del ICT.";
        String pregunta8 = "En el caso de los Guías de Turismo Freelancetienen al díael curso de Primeros Auxilios y RCP.";
        String pregunta9 = "La empresa usa folletos u otro material promocional ya sea impreso o digital.";
        String pregunta10 = "El material promocional indica los servicios a los cuales el turista tiene derecho.";
        String pregunta11 = "Tiene la empresa un Reglamento Interno de Operación para el desarrollo de sus actividades.";

        String pregunta12 = "Cuenta con oficina de atención al público.";
        String pregunta13 = "En la oficina se exhibe el material promocional impreso de los programas que ofrece la empresa. ";
        String pregunta14 = "El personal Administrativose encuentra uniformado.";
        String pregunta15 = "El personal de servicio se encuentra identificado con gafete o uncarnet visible.";
        String pregunta16 = "Se cuenta con instructivos de información sobre Seguridad al Turista.";
        String pregunta17 = "La oficina se encuentra rotulada con el nombre comercial de la empresa.";
        String pregunta18 = "Se identifican las diferentes áreas de servicio al cliente";
        String pregunta19 = "La oficina tiene como uso exclusivo la actividad turística";
        String pregunta20 = "Se dispone de sanitarios para uso de los clientes";
        String pregunta21 = "Los sanitarios se encuentran enbuen estado de mantenimiento y limpieza.";
        String pregunta22 = "La decoración y ambientación es acorde a la actividad turística que se desarrolla.";
        String pregunta23 = "El equipo y las instalaciones funcionan correctamente.";
        String pregunta24 = "La instalaciones se encuentran en buen estado de mantenimiento y limpieza.";
        String pregunta25 = "Los vehículos utilizados se encuentran debidamente rotulados con el nombre comercial de la empresa.";

        String pregunta26 = "Se identifican las diferentes actividades con el nombre, tarifas y vigencia del mismo.";
        String pregunta27 = "Se identifica la duración e itinerarios de las actividadesde interés turístico";
        String pregunta28 = "Se identifican los servicios que están incluídos en las actividadesde interés turístico";
        String pregunta29 = "Se identifican los servicios opcionales para cada programa o paquete de actividades.";
        String pregunta30 = "Se identifican los medios y periodicidad para la revisión de los paquetes o programas de actividades.";
        String pregunta31 = "Se dan a conocer las responsabilidades en que incurre la empresa en cada uno de las paquetes o servicios ofrecidos.";
        String pregunta32 = "Se indican el tipo de seguros incluídos en cada paquete o programa de actividades.";
        String pregunta33 = "Cuando los paqueteso programas sean ofrecidos por otros prestadores se incluye la información sobre sus responsabilidades legales y de seguros vigentes.";
        String pregunta34 = "Se dispone de un procedimiento documentado para las reservas y ventas";
        String pregunta35 = "Cuenta conun procedimiento para la cancelación de las reservaciones de parte de los turistas (No Show).";
        String pregunta36 = "Se cuenta coninformación sobre paquetes o programas por temporada, con tarifas diferenciadas.";
        String pregunta37 = "Se cuenta con un procedimiento que regule las ofertas y promociones.";

        String pregunta38 = "Se dispone de un Manual de Mantenimiento en el que se han identificado los equipos y el tipo de mantenimiento a realizar y la frecuencia del mismo.";
        String pregunta39 = "Todas las actividades de Mantenimiento del Equipo son registradas en la bitacora respectiva.";
        String pregunta40 = "El Manual de Mantenimiento incluirá una revisión mínima semanal del correcto estado del equipo y accesorios para el desarrollo de la actividad.";
        String pregunta41 = "Los equipos y accesorios han sido aprobados y certificados por compañias internacionales";
        String pregunta42 = "Los equipos y accesorios a utilizar por el turista son revisados y almacenados diariamente según tallas.";
        String pregunta43 = "La empresa demuestraque todo su equipo y accesorios son almacenados en un sitio seguro y protegido de las inclemencias del tiempo.";
        String pregunta44 = "La empresa dispone de un almacén/taller con una dotación de repuestos para uso inmediato y que no afecten la suspensión de la actividad.";
        String pregunta45 = "Se dispone de un Manual de Seguridad en el que para cada actividad se han identificado las acciones a realizar en materia de seguridad para el turista y el personal de planta.";
        String pregunta46 = "El Manual de Seguridad establece las inspecciones y revisiones de las instalaciones y del equipo que permita mantener los estándares de seguridad.";
        String pregunta47 = "El Manual de Seguridad demuestra que la empresa cuenta con un Programa de Capacitación para su personal sobre este tema (Seguridad).";
        String pregunta48 = "La empresa demuestraque los equipos de seguridad y protección para el cliente son revisados periódicamente ";
        String pregunta49 = "Se cuenta con el equipo técnicamente requerido según la actividad desarrollada por la empresa para actuar en caso de emergencias.";
        String pregunta50 = "La empresa demuestraque el Equipo de Seguridad utilizado tiene certificación y garantía para cumplir con su propósito.";
        String pregunta51 = "La empresa demuestraque cuenta con un Plan de Emergencias donde se han establecido las instrucciones precisas para actuar según la modalidad de actividad.";
        String pregunta52 = "La empresa demuestraque cuenta con un Plan de Contingencias, mediante el cual se han identificadolas acciones a realizar según la modalidad de servicios. ";
        String pregunta53 = "La empresa demuestrala comprobacion de resultados durante los simulacros de incidentes; asimismo que estos se llevan a cabo en la forma establecida. Para ello la empresa deberá realizar a cabo como mínimo un simulacro anual.";
        String pregunta54 = "Mediante la Charla para el Turista,se le indican al cliente los grados de riesgos al desarrollar la actividad.";
        String pregunta55 = "Se le mencionan al turista las medidas de seguridad que debe cumplir durante la actividad y los riesgos previsibles.";
        String pregunta56 = "Se le menciona al turista el comportamiento que debe guardar durante el desarrollo de la actividad.";
        String pregunta57 = "La empresa dispone de un Centro de Operaciones dotado de un sistema de comunicación entrelazado con el sitio donde se desarrolla la actividad.";
        String pregunta58 = "La empresa tiene un área para la demostración ante los turistas sobre el tipo de actividad que van a experimentar.";
        String pregunta59 = "La empresa ofrece los servicios de Acompañante (Tándem) cuando se requiera para algunasde sus actividades.";
        String pregunta60 = "La empresa pone en práctica la revisión del equipo de los clientes al inició de la actividad.";
        String pregunta61 = "Todos los equipos y accesorios para uso del cliente dispondrán de las instrucciones necesarias de forma clara y esquematizada para uso de parte del turista.";

        String pregunta62 = "La empresa cuenta con una política ambiental, escrita.";
        String pregunta63 = "Se da conocimiento al turista de la política ambiental de la empresa (folleto informativo o audio visual)";
        String pregunta64 = "Se establecen recomendaciones para el Turista sobre su comportamiento para con el medio natural.";
        String pregunta65 = "La empresa demuestraquedispone de políticas y procedimientos para el manejo de desechos en sus oficinas centrales y donde práctica la actividad.";
        String pregunta66 = "La empresa dispone de politicas yprocedimientos acordes para el manejo de desechos generados durante el desarrollo de la actividad.";
        String pregunta67 = "Cuando las actividadesse desarrollan en un Area Natural Protegida,la empresacuenta con material informativo sobre las políticas de manejo dentro del sitio.";
        String pregunta68 = " La empresa demuestraque esta interesada en implementar medidas para reducir su impactocon el medio ambiente (uso de productos biodegradables, etc).";
        String pregunta69 = "La empresa desarrolla programas ambientales proyectados con la comunidad inmediata.";

        String pregunta70 = "La declaración de Misión de la Organización contempla “el servicio al cliente“.";
        String pregunta71 = "La empresatiene una política escrita de servicio al cliente";
        String pregunta72 = "La Junta Directiva consigna recursos para dar mantenimiento o seguimiento al tema de “Servicio al Cliente“.";
        String pregunta73 = "El servicio al cliente esta incluido en elprograma de inducción.";
        String pregunta74 = "La empresa dispone de un sistema de medición de la satisfacción del cliente.";
        String pregunta75 = "Las boletas o formularios relacionados con el servicio al clientese llevan en un archivodebidamente foliado.";
        String pregunta76 = "La empresa demuestracambios a partir de la medición del servicio al cliente.";
        String pregunta77 = "Se han establecido mecanismos de seguimiento y responsables de la medición de las encuestas al cliente.";
        String pregunta78 = "La empresa tiene un procedimiento escritopara tratar las quejas de los turistas.";
        String pregunta79 = "La empresa proporciona entrenamiento periódico y capacitación para reforzar la importancia del servicio al cliente.";

        ArrayList<QuestionDefBinary> questions1 = new ArrayList<>(); // [0-11]
        questions1.add(new QuestionDefBinary("1",pregunta0));
        questions1.add(new QuestionDefBinary("2",pregunta1));
        questions1.add(new QuestionDefBinary("3",pregunta2));
        questions1.add(new QuestionDefBinary("4",pregunta3));
        questions1.add(new QuestionDefBinary("5",pregunta4));
        questions1.add(new QuestionDefBinary("6",pregunta5));
        questions1.add(new QuestionDefBinary("7",pregunta6));
        questions1.add(new QuestionDefBinary("8",pregunta7));
        questions1.add(new QuestionDefBinary("9",pregunta8));
        questions1.add(new QuestionDefBinary("10",pregunta9));
        questions1.add(new QuestionDefBinary("11",pregunta10));
        questions1.add(new QuestionDefBinary("12",pregunta11));

        ArrayList<QuestionDefBinary> questions2 = new ArrayList<>(); // [12-25]
        questions2.add(new QuestionDefBinary("1",pregunta12));
        questions2.add(new QuestionDefBinary("2",pregunta13));
        questions2.add(new QuestionDefBinary("3",pregunta14));
        questions2.add(new QuestionDefBinary("4",pregunta15));
        questions2.add(new QuestionDefBinary("5",pregunta16));
        questions2.add(new QuestionDefBinary("6",pregunta17));
        questions2.add(new QuestionDefBinary("7",pregunta18));
        questions2.add(new QuestionDefBinary("8",pregunta19));
        questions2.add(new QuestionDefBinary("9",pregunta20));
        questions2.add(new QuestionDefBinary("10",pregunta21));
        questions2.add(new QuestionDefBinary("11",pregunta22));
        questions2.add(new QuestionDefBinary("12",pregunta23));
        questions2.add(new QuestionDefBinary("13",pregunta24));
        questions2.add(new QuestionDefBinary("14",pregunta25));

        ArrayList<QuestionDefBinary> questions3 = new ArrayList<>(); // [26-37]
        questions3.add(new QuestionDefBinary("1",pregunta26));
        questions3.add(new QuestionDefBinary("2",pregunta27));
        questions3.add(new QuestionDefBinary("3",pregunta28));
        questions3.add(new QuestionDefBinary("4",pregunta29));
        questions3.add(new QuestionDefBinary("5",pregunta30));
        questions3.add(new QuestionDefBinary("6",pregunta31));
        questions3.add(new QuestionDefBinary("7",pregunta32));
        questions3.add(new QuestionDefBinary("8",pregunta33));
        questions3.add(new QuestionDefBinary("9",pregunta34));
        questions3.add(new QuestionDefBinary("10",pregunta35));
        questions3.add(new QuestionDefBinary("11",pregunta36));
        questions3.add(new QuestionDefBinary("12",pregunta37));

        ArrayList<QuestionDefBinary> questions4 = new ArrayList<>(); // [38-61]
        questions4.add(new QuestionDefBinary("1",pregunta38));
        questions4.add(new QuestionDefBinary("2",pregunta39));
        questions4.add(new QuestionDefBinary("3",pregunta40));
        questions4.add(new QuestionDefBinary("4",pregunta41));
        questions4.add(new QuestionDefBinary("5",pregunta42));
        questions4.add(new QuestionDefBinary("6",pregunta43));
        questions4.add(new QuestionDefBinary("7",pregunta44));
        questions4.add(new QuestionDefBinary("8",pregunta45));
        questions4.add(new QuestionDefBinary("9",pregunta46));
        questions4.add(new QuestionDefBinary("10",pregunta47));
        questions4.add(new QuestionDefBinary("11",pregunta48));
        questions4.add(new QuestionDefBinary("12",pregunta49));
        questions4.add(new QuestionDefBinary("13",pregunta50));
        questions4.add(new QuestionDefBinary("14",pregunta51));
        questions4.add(new QuestionDefBinary("15",pregunta52));
        questions4.add(new QuestionDefBinary("16",pregunta53));
        questions4.add(new QuestionDefBinary("17",pregunta54));
        questions4.add(new QuestionDefBinary("18",pregunta55));
        questions4.add(new QuestionDefBinary("19",pregunta56));
        questions4.add(new QuestionDefBinary("20",pregunta57));
        questions4.add(new QuestionDefBinary("21",pregunta58));
        questions4.add(new QuestionDefBinary("22",pregunta59));
        questions4.add(new QuestionDefBinary("23",pregunta60));
        questions4.add(new QuestionDefBinary("24",pregunta61));

        ArrayList<QuestionDefBinary> questions5 = new ArrayList<>(); // [62-69]
        questions5.add(new QuestionDefBinary("1",pregunta62));
        questions5.add(new QuestionDefBinary("2",pregunta63));
        questions5.add(new QuestionDefBinary("3",pregunta64));
        questions5.add(new QuestionDefBinary("4",pregunta65));
        questions5.add(new QuestionDefBinary("5",pregunta66));
        questions5.add(new QuestionDefBinary("6",pregunta67));
        questions5.add(new QuestionDefBinary("7",pregunta68));
        questions5.add(new QuestionDefBinary("8",pregunta69));

        ArrayList<QuestionDefBinary> questions6 = new ArrayList<>(); // [70-79]
        questions6.add(new QuestionDefBinary("1",pregunta70));
        questions6.add(new QuestionDefBinary("2",pregunta71));
        questions6.add(new QuestionDefBinary("3",pregunta72));
        questions6.add(new QuestionDefBinary("4",pregunta73));
        questions6.add(new QuestionDefBinary("5",pregunta74));
        questions6.add(new QuestionDefBinary("6",pregunta75));
        questions6.add(new QuestionDefBinary("7",pregunta76));
        questions6.add(new QuestionDefBinary("8",pregunta77));
        questions6.add(new QuestionDefBinary("9",pregunta78));
        questions6.add(new QuestionDefBinary("10",pregunta79));

        ArrayList<ChapterDefBinary> chapters = new ArrayList<>();
        chapters.add(new ChapterDefBinary("De la Organizacion","1",15,questions1));
        chapters.add(new ChapterDefBinary("De la Planta Física","2",18,questions2));
        chapters.add(new ChapterDefBinary("Diseño de los Programas de Actividades Acuáticas","3",15,questions3));
        chapters.add(new ChapterDefBinary("Operación de la Actividad","4",30,questions4));
        chapters.add(new ChapterDefBinary("Variables Ambientales","5",10,questions5));
        chapters.add(new ChapterDefBinary("Servicio al Cliente","6",13,questions6));

        return new FormDefBinary("Calificación para las Actividades Recreativas Acuáticas",12,chapters);
    } //READY 12

    public static FormDefBinary getFormAirActivitiesDef(){
        String pregunta0 = "Tiene el Permiso de Funcionamiento vigente.";
        String pregunta1 = "La Patente Municipal se encuentra vigente. ";
        String pregunta2 = "Tiene Seguro de Responsabilidad Civil y gastos médicos.";
        String pregunta3 = "Cuando se ofertan las actividades Recreativas Aéreas , las mismas se dan en apego a la normativa vigente. (Aplica en algunos casos la Aprobación de Aviación Civil)";
        String pregunta4 = "Se dispone de un Protocolo para la recepción, atención y partida de los turistas.";
        String pregunta5 = "Se dispone de información y protocolos para contactar servicios de emergencia y médicos.";
        String pregunta6 = "Los Guías tienen el carnet de acreditacion del ICT.";
        String pregunta7 = "En el caso de los Guías de Turismo Freelance tienen al día el curso de Primeros Auxilios y RCP.";
        String pregunta8 = "La empresa usa folletos u otro material promocional ya sea impreso o digital.";
        String pregunta9 = "El material promocional indica los servicios a los cuales el turista tiene derecho.";
        String pregunta10 = "Se dispone de medios audio visuales para ofrecer los paquetes.";
        String pregunta11 = "Tiene la empresa un Reglamento Interno de Operación para el desarrollo de sus actividades.";

        String pregunta12 = "Cuenta con oficina de atención al público.";
        String pregunta13 = "En la oficina se exhibe el material promocional impreso de los programas que ofrece la empresa. ";
        String pregunta14 = "El personal Administrativo se encuentra uniformado.";
        String pregunta15 = "El personal de servicio se encuentra identificado con gafete o un carnet visible.";
        String pregunta16 = "Se cuenta con instructivos de información sobre Seguridad al Turista.";
        String pregunta17 = "La oficina se encuentra rotulada con el nombre comercial de la empresa.";
        String pregunta18 = "Se identifican las diferentes áreas de servicio al cliente";
        String pregunta19 = "La oficina tiene como uso exclusivo la actividad turística";
        String pregunta20 = "Se dispone de sanitarios para uso de los clientes";
        String pregunta21 = "Los sanitarios se encuentran en buen estado de mantenimiento y limpieza.";
        String pregunta22 = "La decoración y ambientación es acorde a la actividad turística que se desarrolla.";
        String pregunta23 = "El equipo y las instalaciones funcionan correctamente.";
        String pregunta24 = "La instalaciones se encuentran en buen estado de mantenimiento y limpieza.";
        String pregunta25 = "Los vehículos utilizados se encuentran debidamente rotulados con el nombre comercial de la empresa.";

        String pregunta26 = "Se identifican las diferentes actividades con el nombre, tarifas y vigencia del mismo.";
        String pregunta27 = "Se identifica la duración e itinerarios de las actividades de interés turístico";
        String pregunta28 = "Se identifican los servicios que están incluídos en las actividades de interés turístico";
        String pregunta29 = "Se identifican los servicios opcionales para cada programa o paquete de actividades.";
        String pregunta30 = "Se identifican los medios y periodicidad para la revisión de los paquetes o programas de actividades.";
        String pregunta31 = "Se dan a conocer las responsabilidades en que incurre la empresa en cada uno de las paquetes o servicios ofrecidos.";
        String pregunta32 = "Se indican el tipo de seguros incluídos en cada paquete o programa de actividades.";
        String pregunta33 = "Cuando los paquetes o programas sean ofrecidos por otros prestadores se incluye la información sobre sus responsabilidades legales y de seguros vigentes.";
        String pregunta34 = "Se dispone de un procedimiento documentado para las reservas y ventas";
        String pregunta35 = "Cuenta con un procedimiento para la cancelación de las reservaciones de parte de los turistas (No Show).";
        String pregunta36 = "Se cuenta con información sobre paquetes o programas por temporada, con tarifas diferenciadas.";
        String pregunta37 = "Se cuenta con un procedimiento que regule las ofertas y promociones.";

        String pregunta38 = "Se dispone de un Manual de Mantenimiento en el que se han identificado los equipos y el tipo de mantenimiento a realizar y la frecuencia del mismo.";
        String pregunta39 = "Todas las actividades de Mantenimiento del Equipo son registradas en la bitacora respectiva.";
        String pregunta40 = "El Manual de Mantenimiento incluirá una revisión mínima semanal del correcto estado del equipo y accesorios para el desarrollo de la actividad.";
        String pregunta41 = "Los equipos y accesorios han sido aprobados y certificados por compañias internacionales";
        String pregunta42 = "Los equipos y accesorios a utilizar por el turista son revisados y almacenados diariamente según tallas.";
        String pregunta43 = "La empresa demuestra que todo su equipo y accesorios son almacenados en un sitio seguro y protegido de las inclemencias del tiempo.";
        String pregunta44 = "La empresa dispone de un almacén/taller con una dotación de repuestos para uso inmediato y que no afecten la suspensión de la actividad.";
        String pregunta45 = "Se dispone de un Manual de Seguridad en el que para cada actividad se han identificado las acciones a realizar en materia de seguridad para el turista y el personal de planta.";
        String pregunta46 = "El Manual de Seguridad establece las inspecciones y revisiones de las instalaciones y del equipo que permita mantener los estándares de seguridad.";
        String pregunta47 = "El Manual de Seguridad demuestra que la empresa cuenta con un Programa de Capacitación para su personal sobre este tema (Seguridad).";
        String pregunta48 = "La empresa demuestra que los equipos de seguridad y protección para el cliente son revisados periódicamente ";
        String pregunta49 = "Se cuenta con el equipo técnicamente requerido según la actividad desarrollada por la empresa para actuar en caso de emergencias.";
        String pregunta50 = "La empresa demuestra que el Equipo de Seguridad utilizado tiene certificación y garantía para cumplir con su propósito.";
        String pregunta51 = "La empresa demuestra que cuenta con un Plan de Emergencias donde se han establecido las instrucciones precisas para actuar según la modalidad de actividad.";
        String pregunta52 = "La empresa demuestra que cuenta con un Plan de Contingencias, mediante el cual se han identificado las acciones a realizar según la modalidad de servicios. ";
        String pregunta53 = "La empresa demuestra la comprobacion de resultados durante los simulacros de incidentes; asimismo que estos se llevan a cabo en la forma establecida. Para ello la empresa deberá realizar a cabo como mínimo un simulacro anual.";
        String pregunta54 = "Mediante la Charla para el Turista, se le indican al cliente los grados de riesgos al desarrollar la actividad.";
        String pregunta55 = "Se le mencionan al turista las medidas de seguridad que debe cumplir durante la actividad y los riesgos previsibles.";
        String pregunta56 = "Se le menciona al turista el comportamiento que debe guardar durante el desarrollo de la actividad.";
        String pregunta57 = "La empresa dispone de un Centro de Operaciones dotado de un sistema de comunicación entrelazado con el sitio donde se desarrolla la actividad.";
        String pregunta58 = "La empresa tiene un área para la demostración ante los turistas sobre el tipo de actividad que van a experimentar.";
        String pregunta59 = "La empresa ofrece los servicios de un Acompañante (Tandem) cuando se requiera para algunas de sus actividades.";
        String pregunta60 = "La empresa pone en práctica la revisión del equipo de los clientes al inició de la actividad.";
        String pregunta61 = "Todos los equipos y accesorios para uso del cliente cuyo funcionamiento no sea obvio dispondrá de las instrucciones necesarias de forma clara y esquematizada para uso de parte del turista.";

        String pregunta62 = "La empresa cuenta con una política ambiental, escrita.";
        String pregunta63 = "Se da conocimiento al turista de la política ambiental de la empresa (folleto informativo o audio visual)";
        String pregunta64 = "Se establecen recomendaciones para el Turista sobre su comportamiento para con el medio natural.";
        String pregunta65 = "La empresa demuestra que dispone de políticas y procedimientos para el manejo de desechos en sus oficinas centrales y donde práctica la actividad.";
        String pregunta66 = "La empresa dispone de politicas y procedimientos acordes para el manejo de desechos generados durante el desarrollo de la actividad.";
        String pregunta67 = "Cuando las actividades se desarrollan en un Area Natural Protegida, la empresa cuenta con material informativo sobre las políticas de manejo dentro del sitio.";
        String pregunta68 = " La empresa demuestra que esta interesada en implementar medidas para reducir su impacto con el medio ambiente (uso de productos biodegradables, etc).";
        String pregunta69 = "La empresa desarrolla programas ambientales proyectados con la comunidad inmediata.";

        String pregunta70 = "La declaración de Misión de la Organización contempla “el servicio al cliente“.";
        String pregunta71 = "La empresa tiene una política escrita de servicio al cliente";
        String pregunta72 = "La Junta Directiva consigna recursos suficientes para dar mantenimiento o seguimiento al tema de “Servicio al Cliente“.";
        String pregunta73 = "El servicio al cliente esta incuido en el programa de inducción.";
        String pregunta74 = "La empresa demuestra que tiene un sistema de medición de la satisfacción del cliente.";
        String pregunta75 = "Las boletas o formularios relacionados con el servicio al cliente se llevan en un archivo debidamente foliado.";
        String pregunta76 = "La empresa demuestra cambios a partir de la medición del servicio al cliente.";
        String pregunta77 = "Se han establecido mecanismos de seguimiento y responsables de la medición de las encuestas al cliente.";
        String pregunta78 = "La empresa tiene un procedimiento escrito para tratar las quejas de los turistas.";
        String pregunta79 = "La empresa proporciona entrenamiento periódico y capacitación para reforzar la importancia del servicio al cliente. ";

        ArrayList<QuestionDefBinary> questions1 = new ArrayList<>(); // [0-11]
        questions1.add(new QuestionDefBinary("1",pregunta0));
        questions1.add(new QuestionDefBinary("2",pregunta1));
        questions1.add(new QuestionDefBinary("3",pregunta2));
        questions1.add(new QuestionDefBinary("4",pregunta3));
        questions1.add(new QuestionDefBinary("5",pregunta4));
        questions1.add(new QuestionDefBinary("6",pregunta5));
        questions1.add(new QuestionDefBinary("7",pregunta6));
        questions1.add(new QuestionDefBinary("8",pregunta7));
        questions1.add(new QuestionDefBinary("9",pregunta8));
        questions1.add(new QuestionDefBinary("10",pregunta9));
        questions1.add(new QuestionDefBinary("11",pregunta10));
        questions1.add(new QuestionDefBinary("12",pregunta11));

        ArrayList<QuestionDefBinary> questions2 = new ArrayList<>(); // [12-25]
        questions2.add(new QuestionDefBinary("1",pregunta12));
        questions2.add(new QuestionDefBinary("2",pregunta13));
        questions2.add(new QuestionDefBinary("3",pregunta14));
        questions2.add(new QuestionDefBinary("4",pregunta15));
        questions2.add(new QuestionDefBinary("5",pregunta16));
        questions2.add(new QuestionDefBinary("6",pregunta17));
        questions2.add(new QuestionDefBinary("7",pregunta18));
        questions2.add(new QuestionDefBinary("8",pregunta19));
        questions2.add(new QuestionDefBinary("9",pregunta20));
        questions2.add(new QuestionDefBinary("10",pregunta21));
        questions2.add(new QuestionDefBinary("11",pregunta22));
        questions2.add(new QuestionDefBinary("12",pregunta23));
        questions2.add(new QuestionDefBinary("13",pregunta24));
        questions2.add(new QuestionDefBinary("14",pregunta25));

        ArrayList<QuestionDefBinary> questions3 = new ArrayList<>(); // [26-37]
        questions3.add(new QuestionDefBinary("1",pregunta26));
        questions3.add(new QuestionDefBinary("2",pregunta27));
        questions3.add(new QuestionDefBinary("3",pregunta28));
        questions3.add(new QuestionDefBinary("4",pregunta29));
        questions3.add(new QuestionDefBinary("5",pregunta30));
        questions3.add(new QuestionDefBinary("6",pregunta31));
        questions3.add(new QuestionDefBinary("7",pregunta32));
        questions3.add(new QuestionDefBinary("8",pregunta33));
        questions3.add(new QuestionDefBinary("9",pregunta34));
        questions3.add(new QuestionDefBinary("10",pregunta35));
        questions3.add(new QuestionDefBinary("11",pregunta36));
        questions3.add(new QuestionDefBinary("12",pregunta37));

        ArrayList<QuestionDefBinary> questions4 = new ArrayList<>(); // [38-61]
        questions4.add(new QuestionDefBinary("1",pregunta38));
        questions4.add(new QuestionDefBinary("2",pregunta39));
        questions4.add(new QuestionDefBinary("3",pregunta40));
        questions4.add(new QuestionDefBinary("4",pregunta41));
        questions4.add(new QuestionDefBinary("5",pregunta42));
        questions4.add(new QuestionDefBinary("6",pregunta43));
        questions4.add(new QuestionDefBinary("7",pregunta44));
        questions4.add(new QuestionDefBinary("8",pregunta45));
        questions4.add(new QuestionDefBinary("9",pregunta46));
        questions4.add(new QuestionDefBinary("10",pregunta47));
        questions4.add(new QuestionDefBinary("11",pregunta48));
        questions4.add(new QuestionDefBinary("12",pregunta49));
        questions4.add(new QuestionDefBinary("13",pregunta50));
        questions4.add(new QuestionDefBinary("14",pregunta51));
        questions4.add(new QuestionDefBinary("15",pregunta52));
        questions4.add(new QuestionDefBinary("16",pregunta53));
        questions4.add(new QuestionDefBinary("17",pregunta54));
        questions4.add(new QuestionDefBinary("18",pregunta55));
        questions4.add(new QuestionDefBinary("19",pregunta56));
        questions4.add(new QuestionDefBinary("20",pregunta57));
        questions4.add(new QuestionDefBinary("21",pregunta58));
        questions4.add(new QuestionDefBinary("22",pregunta59));
        questions4.add(new QuestionDefBinary("23",pregunta60));
        questions4.add(new QuestionDefBinary("24",pregunta61));

        ArrayList<QuestionDefBinary> questions5 = new ArrayList<>(); // [62-69]
        questions5.add(new QuestionDefBinary("1",pregunta62));
        questions5.add(new QuestionDefBinary("2",pregunta63));
        questions5.add(new QuestionDefBinary("3",pregunta64));
        questions5.add(new QuestionDefBinary("4",pregunta65));
        questions5.add(new QuestionDefBinary("5",pregunta66));
        questions5.add(new QuestionDefBinary("6",pregunta67));
        questions5.add(new QuestionDefBinary("7",pregunta68));
        questions5.add(new QuestionDefBinary("8",pregunta69));

        ArrayList<QuestionDefBinary> questions6 = new ArrayList<>(); // [70-79]
        questions6.add(new QuestionDefBinary("1",pregunta70));
        questions6.add(new QuestionDefBinary("2",pregunta71));
        questions6.add(new QuestionDefBinary("3",pregunta72));
        questions6.add(new QuestionDefBinary("4",pregunta73));
        questions6.add(new QuestionDefBinary("5",pregunta74));
        questions6.add(new QuestionDefBinary("6",pregunta75));
        questions6.add(new QuestionDefBinary("7",pregunta76));
        questions6.add(new QuestionDefBinary("8",pregunta77));
        questions6.add(new QuestionDefBinary("9",pregunta78));
        questions6.add(new QuestionDefBinary("10",pregunta79));

        ArrayList<ChapterDefBinary> chapters = new ArrayList<>();
        chapters.add(new ChapterDefBinary("De la Organizacion","1",15,questions1));
        chapters.add(new ChapterDefBinary("De la Planta Física","2",18,questions2));
        chapters.add(new ChapterDefBinary("Diseño de los Programas de Actividades Aéreas","3",15,questions3));
        chapters.add(new ChapterDefBinary("Operación de la Actividad","4",30,questions4));
        chapters.add(new ChapterDefBinary("Variables Ambientales","5",10,questions5));
        chapters.add(new ChapterDefBinary("Servicio al Cliente","6",13,questions6));

        return new FormDefBinary("Calificación para las Actividades Recreativas Aéreas",13,chapters);
    } //READY 13

    public static FormDefSpa getFormSpaDef(){

        String capitulo1 = "De la operación";
        String capitulo2 = "Recurso Humano";
        String capitulo3 = "Servicios";
        String capitulo4 = "Responsabilidad ambiental y social";
        String capitulo5 = "Arquitectura";
        String capitulo6 = "Etiqueta";
        String capitulo7 = "Tratamientos";
        String capitulo8 = "Salas";
        String capitulo9 = "Espacios complementarios";
        String capitulo10 = "Amenidades";
        String capitulo11 = "Servicios complementarios";



//Capítulo I: De la operación

        String pregunta0 = "Cumple con las regulaciones para su operación establecidas por el Ministerio de Salud";
        String pregunta1 = "Cumple con las regulaciones para su operación establecidas por la Municipalidad local";
        String pregunta2 = "Existe código para el comportamiento del cliente";
        String pregunta3 = "Existe código del servicio al cliente para cada puesto";
        String pregunta4 = "Dispone de un reglamento interno de operación ";


//Capítulo II: Recurso Humano

        String pregunta5 = "Director/ Gerente ";
        String pregunta6 = "Fisioterapeutas";
        String pregunta7 = "Supervisor";
        String pregunta8 = "Anfitriones";
        String pregunta9 = "Recepcionistas";
        String pregunta10 = "Masajistas/ Terapeutas";
        String pregunta11 = "Estilistas";
        String pregunta12 = "Esteticistas";
        String pregunta13 = "Manicuristas / pedicuristas";
        String pregunta14 = "Instructores (yoga, pilates, gimnasio, entre otros)";
        String pregunta15 = "Personal capacitado para primeros auxilios";
        String pregunta16 = "Guardas de seguridad";
        String pregunta17 = "Personal de mantenimiento";
        String pregunta18 = "Misceláneos";
        String pregunta19 = "Jardineros";


//Capítulo III: Servicios

        String pregunta20 = "Se dispone de Protocolo escrito de Bienvenida al Cliente";
        String pregunta21 = "Se ofrece un sistema de reservaciones para el cliente y la confirmación del servicio elegido.";
        String pregunta22 = "Se informa al cliente sobre el código de comportamiento";
        String pregunta23 = "Se valora el nivel de satisfacción del cliente ";
        String pregunta24 = "Se aceptan diferentes formas de pago: transferencias, cargo a la habitación, efectivo, tarjetas de crédito o débito";
        String pregunta25 = "Se ofrece caja de seguridad para uso de los clientes";
        String pregunta26 = "El horario de atención es al menos de 8 horas diarias";
        String pregunta27 = "Se ofrecen promociones";
        String pregunta28 = "Se ofrece bebidas para el autoservicio de los clientes: bidones de agua, agua saborizada, té, entre otros";
        String pregunta29 = "Se entrega ficha de perfil del cliente ";
        String pregunta30 = "Se ofrece un Directorio (Menú de Servicios) ";
        String pregunta31 = "Se ofrece internet inalámbrico";
        String pregunta32 = "Se ofrece para la venta los productos utilizados en los tratamientos";
        String pregunta33 = "Se ofrece traslados al establecimiento";


//Capítulo IV: Responsabilidad Ambiental y Social

//De las Prácticas Ambientales

        String pregunta34 = "Se le da a conocer a los clientes del Spa las políticas del mismo, considerando los aspectos ambientales, sociales, económicos , a través de algún medio audio visual.";
        String pregunta35 = "Se cuenta con un certificado de calidad del agua potable";
        String pregunta36 = "Se cuenta con un certificado de calidad del hielo";
        String pregunta37 = "Se utilizan dispositivos como Paneles Solares para la producción de Energías Limpias.";
        String pregunta38 = "Se utilizan dispositivos para el ahorro de energía: apagado automático, interruptores de presencia, sensores, foto celdas u otros medios mecánicos.";
        String pregunta39 = "Se utilizan dispositivos para el ahorro de agua en grifos, duchas y sanitarios: mediante válvulas de presión, temporizadores, sensores u otros medios mecánicos.";
        String pregunta40 = "Se tiene en funcionamiento un sistema de tratamiento de aguas residuales: tanque séptico, planta de tratamiento u otros para minimizar el impacto sobre el medio ambiente";
        String pregunta41 = "Se monitorea la producción de desechos (orgánicos, inorgánicos, reciclables y no reciclables) y su manejo mediante un registro, cuadro, bitácora u otro control.";
        String pregunta42 = "Se usan sistemas informáticos o reutilización de papel para reducir el consumo";
        String pregunta43 = "Se utilizan productos que no tengan contraindicaciones ambientales: biodegradables o en alta proporción";
        String pregunta44 = "En los productos biodegradables que utiliza el Spa; el empaque y el contenido del mismo son biodegradables.";
        String pregunta45 = "Se usan sistemas informáticos o se da la reutilización de papel para reducir el consumo del mismo.";

//De la Responsabilidad Social

        String pregunta46 = "Es política de la empresa promover y apoyar la participación de los Colaboradores en Cursos de Actualización";
        String pregunta47 = "La empresa apoya que el 60% de los Colaboradores sean Costarricenses.";
        String pregunta48 = "En los cursos que promueve la empresa a nivel del Servicio de Spa, involucra a personas de la comunidad donde presta sus servicios.";
        String pregunta49 = "Dentro de las instalaciones del Spa, la empresa utiliza productos diseñados o desarrollados por Microempresarios Locales.";
        String pregunta50 = "Se utilizan y comercializan productos cosméticos biodegradables";
        String pregunta51 = "Se utilizan productos cosméticos de elaboración propia o de proveedores nacionales.";


//Capítulo V: Arquitectura

//Rotulación

        String pregunta52 = "Se dispone de rotulación clara y visible que identifique el establecimiento";

//Estacionamiento

        String pregunta53 = "Se cuenta con estacionamiento para el uso de los clientes ";
        String pregunta54 = "Los espacios se encuentran debidamente demarcados";
        String pregunta55 = "Se cuenta con rotulación de las políticas de uso visible al cliente ";
        String pregunta56 = "Hay presencia de agua: fuentes, espejos, cascadas u otros";

//Vestíbulo

        String pregunta57 = "Se dispone de un espacio vestibular para el recibimiento de los clientes";
        String pregunta58 = "Se dispone de iluminación apropiada de acuerdo a la funcionalidad del espacio";

//Recepción

        String pregunta59 = "Se dispone de un área de recepción para la atención y registro de los clientes ";
        String pregunta60 = "Se dispone de mobiliario para la atención de los clientes";
        String pregunta61 = "Se dispone de iluminación apropiada de acuerdo a la funcionalidad del espacio";
        String pregunta62 = "Se dispone de ventilación natural apropiada de acuerdo a la finalidad de cada espacio.";
        String pregunta63 = "Se dispone de decoración armoniosa";
        String pregunta64 = "Se percibe aromas agradables: naturales y/o artificiales.";
        String pregunta65 = "Se percibe sonidos agradables: naturales y/o artificiales.";
        String pregunta66 = "Se dispone de equipo audiovisual para la presentación de los tratamientos, paquetes, promociones u otros";

//Otros espacios

        String pregunta67 = "Se dispone de oficina administrativa";
        String pregunta68 = "Se dispone de un área de lavandería ";
        String pregunta69 = "Se dispone de un área para uso exclusivo de los colaboradores";
        String pregunta70 = "Se dispone de una bodega para cosméticos";
        String pregunta71 = "Se dispone de un área de esterilización de equipo ( utensilios para la depilación similares y afines)";
        String pregunta72 = "Se dispone de un área de bodega para el almacenamiento de los productos y equipo de limpieza";

//Seguridad Preventiva

        String pregunta73 = "Existen extintores tipo ABC o equivalentes";
        String pregunta74 = "Existen dispositivos de alarma: detectores de humo, detectores de gas, rotura de vidrios, botón de pánico, sensor de movimiento, sensor magnético de puertas y ventanas u otros";
        String pregunta75 = "Las salidas de emergencias se encuentran visibles y rotuladas ";
        String pregunta76 = "Existen luces de emergencia y/o planta eléctrica";
        String pregunta77 = "Se cuenta con un reservorio de agua potable";
        String pregunta78 = "Se cuenta con dispositivos de monitoreo: circuito cerrado de televisión u otro";

//Facilidades para Personas con Capacidad Física Restringida (PCCFR)

        String pregunta79 = "Se cuenta con un Estacionamiento para PCCFR";
        String pregunta80 = "Se facilita mediante rampas el acceso a las instalaciones del SPA.";
        String pregunta81 = "Se dispone de Servicios Sanitarios para PCCFR";
        String pregunta82 = "Se dispone de Duchas para PCCFR";
        String pregunta83 = "Se dispone de Casilleros para PCCFR";
        String pregunta84 = "Se da la adecuación de tratamientos y atenciones para PCCFR.";

//Capítulo VI: Etiqueta

        String pregunta85 = "Se dispone de Protocolo escrito con normas de Etiqueta del Spa.(Uniforme, presentación y vocabulario del personal, atención al cliente y resolución de conflictos).";
        String pregunta86 = "Se le indica al cliente el tiempo requerido para realizar el check-in.";
        String pregunta87 = "Se le indica al cliente el horario de funcionamiento del Spa.";
        String pregunta88 = "Atuendo del cliente";
        String pregunta89 = "Uso de vestido de baño en areas requeridas (sauna, baño de vapor, jacuzzi)";
        String pregunta90 = "Se le indica al cliente que no debe portar lentes de contacto durante los tratamiento que incluyan faciales.";
        String pregunta91 = "Se dispone de cajas de seguridad";
        String pregunta92 = "Se le indica al cliente que puede comunicar sus preferencia a la terapeuta, ya sea sobre la temperatura de la sala, cantidad de presion y fuerza del masaje, o incluso, el volumen de la música";
        String pregunta93 = "Se dispone de una política de cancelación";

//Capítulo VII: Tratamientos

        String pregunta94 = "Masajes";
        String pregunta95 = "Corporales ";
        String pregunta96 = "Faciales";
        String pregunta97 = "Manicure/Pedicure";
        String pregunta98 = "Depilación";
        String pregunta99 = "Peluquería";
        String pregunta100 = "Otros";

//Capítulo VIII: Salas

//Salas de espera

        String pregunta101 = "Se dispone en la  sala de espera de dispensadores de agua y otras bebidas hidratantes";
        String pregunta102 = "Se dispone de mobiliario para la estancia de los clientes ";
        String pregunta103 = "Se dispone de iluminación apropiada de acuerdo a la funcionalidad del espacio";
        String pregunta104 = "Se dispone de decoración armoniosa de acuerdo a la funcionalidad del espacio";
        String pregunta105 = "Se percibe aromas agradables: naturales y/o artificiales";
        String pregunta106 = "Se percibe sonidos agradables: naturales y/o artificiales";
        String pregunta107 = "Se dispone de material de lectura accesible al cliente: revistas, libros, periódicos, tabletas digitales, entre otros";

//Salas de relajación

        String pregunta108 = "Se dispone de salas de relajación para los clientes";
        String pregunta109 = "Se dispone de mobiliario para la estancia de los clientes ";
        String pregunta110 = "Se dispone de iluminación apropiada de acuerdo a la funcionalidad del espacio ";
        String pregunta111 = "Se dispone de decoración armoniosa ";
        String pregunta112 = "Se percibe aromas agradables: naturales y/o artificiales";
        String pregunta113 = "Se percibe sonidos agradables: naturales y/o artificiales";
        String pregunta114 = "Se dispone de material de lectura accesible al cliente: revistas, libros, periódicos, tabletas digitales, entre otros";
        String pregunta115 = "Se dispone de salas de atención para la aplicación de los tratamientos";
        String pregunta116 = "Se dispone de equipo y aparatología electroestética  para la aplicación de los tratamientos ";
        String pregunta117 = "Se dispone de área para la higiene, desinfección y esterilización de materiales y equipos.";
        String pregunta118 = "Se dispone de área para la higiene, desinfección y esterilización de materiales y equipos.";
        String pregunta119 = "Se dispone de manejo de técnicas asépticas que incluyan el uso de guantes y cubrebocas";
        String pregunta120 = "Se dispone de iluminación indirecta o regulable";
        String pregunta121 = "Se dispone  de decoración armoniosa ";
        String pregunta122 = "Se percibe aromas agradables: naturales y/o artificiales";
        String pregunta123 = "Se percibe sonidos agradables: naturales y/o artificiales ";
        String pregunta124 = "La cama de masajes dispone de ropa de cama en buen estado de mantenimiento y limpieza.";
        String pregunta125 = "Se dispone de dispositivos para la ventilación: ventanas, aire acondicionado, extractor de aire, abanico u otros";

//Salas  de Tratamiento

        String pregunta126 = "Se dispone de lavamanos para la higienización antes, durante y post tratamiento";
        String pregunta127 = "Se dispone de duchas para uso exclusivo de los clientes";
        String pregunta128 = "La ducha cuenta con  superficie antideslizante, paredes lisas, impermeables y de fácil limpieza";
        String pregunta129 = "Fuera de la ducha se cuenta con un tapete para pies";
        String pregunta130 = "La ducha cuenta con regadera de extensión";
        String pregunta131 = "Se dispone de reloj para la administración del tiempo";

//Hidroterapia

        String pregunta132 = "Baño de Burbujas";
        String pregunta133 = "Baño de Hidromasaje";
        String pregunta134 = "Baño con Chorro Manual Subacuático";
        String pregunta135 = "Baños parciales o locales pediluvios";
        String pregunta136 = "Baños parciales o locales maniluvios";
        String pregunta137 = "Ducha circular";
        String pregunta138 = "Masaje  bajo ducha";
        String pregunta139 = "Chorro general";
        String pregunta140 = "Chorros por inmersión en piscina";
        String pregunta141 = "Piscina de movilización colectiva";
        String pregunta142 = "Piscina de movilización individual";

//Servicios sanitarios para uso exclusivo de los clientes

        String pregunta143 = "Se dispone de servicios sanitarios en unidades separadas  por sexo";
        String pregunta144 = "Se dispone de mobiliario: inodoro, lavamanos, mingitorios, grifería, muebles, entre otros";
        String pregunta145 = "Existe un sistema para el secado de manos: toallas de papel, paños de tela, secador automático u otros";
        String pregunta146 = "Se dispone de iluminación apropiada de acuerdo a la funcionalidad del espacio";
        String pregunta147 = "Se dispone de decoración armoniosa";
        String pregunta148 = "Se percibe aromas agradables: naturales y/o artificiales";
        String pregunta149 = "Se percibe sonidos agradables: naturales y/o artificiales.";
        String pregunta150 = "La ducha cuenta con superficie de piso antideslizante";
        String pregunta151 = "La ducha cuenta con paredes lisas, impermeables y de fácil limpieza";
        String pregunta152 = "Fuera de la ducha se cuenta con un tapete para pies";
        String pregunta153 = "Se dispone de un área de vestidores";
        String pregunta154 = "Se dispone de un área de casilleros";
        String pregunta155 = "Se dispone de decoración armoniosa ";

//Capítulo IX: Espacios complementarios

//Área de alimentación

        String pregunta156 = "Se dispone de un área exclusivo para el consumo de alimentos ";
        String pregunta157 = "Se dispone de mobiliario para el consumo";
        String pregunta158 = "El mobiliario dispone de mantelería o individuales";
        String pregunta159 = "Se dispone de iluminación apropiada para la funcionalidad del espacio";
        String pregunta160 = "Se dispone de decoración armoniosa ";
        String pregunta161 = "Se percibe aromas agradables: naturales y/o artificiales";
        String pregunta162 = "Se dispone de equipo audiovisual ";
        String pregunta163 = "La vajilla es de material duradero, resistente y permanente";
        String pregunta164 = "La carta del menú se presenta en varios idiomas";
        String pregunta165 = "Se cuenta con un huerta orgánica para consumo del establecimiento ";

//Piscina

        String pregunta166 = "Se dispone de piscina con camas de hidromasaje, sillones individuales de hidromasaje, cascadas y seta cervical, circuito de contracorriente, inyectores subacuáticos para masajes de piernas y plantas de los pies.";
        String pregunta167 = "Se dispone de piscinas con agua temperada y de contraste como poza fría.";
        String pregunta168 = "Se cuenta con rotulación visible al cliente de las políticas de uso";
        String pregunta169 = "Se dispone de mobiliario para uso de los clientes";

//Sauna

        String pregunta170 = "Se dispone de   Protocolo escrito del uso del sauna e higiene.";
        String pregunta171 = "Se cuenta con rotulación visible al cliente de las políticas de uso";
        String pregunta172 = "En el sauna se dispone de mobiliario ";
        String pregunta173 = "Se dispone de iluminación apropiada para la funcionalidad del espacio";
        String pregunta174 = "Se dispone un reloj mural visible";

//Baño de vapor

        String pregunta175 = "Se dispone de Protocolo escrito del uso del  baño de vapor e higiene. ";
        String pregunta176 = "Se cuenta con rotulación visible al cliente de las politicas de uso";
        String pregunta177 = "Se dispone de mobiliario ";
        String pregunta178 = "Se dispone de iluminación apropiada para la funcionalidad del espacio";
        String pregunta179 = "Se dispone de un reloj mural visible";

//Gimnasio

        String pregunta180 = "Se dispone de gimnasio";
        String pregunta181 = "Se cuenta con rotulación visible al cliente de las políticas de uso";
        String pregunta182 = "Se dispone de equipo: bicicleta estacionaria, caminadoras, pesas, entre otros";
        String pregunta183 = "Se dispone de equipo audiovisual ";

//Plataforma para terapias alternativas

        String pregunta184 = "Se dispone de plataforma para Yoga, Thai, Pilates";
        String pregunta185 = "Se cuenta con rotulación visible al cliente de las políticas de uso";
        String pregunta186 = "Se dispone de equipo y/o accesorios: mat, bloques, correas, almohadas, mantas, sacos de arena, bolas terapéuticas u otro";
        String pregunta187 = "Se percibe sonidos agradables: naturales y/o artificiales.";

//Aguas Turbulentas

        String pregunta188 = "Se dispone de aguas turbulentas para uso exclusivo de los clientes";
        String pregunta189 = "Se dispone de iluminación apropiada para la funcionalidad del espacio";
        String pregunta190 = "Se dispone de decoración armoniosa";

//Capítulo X: Amenidades y Facilidades

//Amenidades

        String pregunta191 = "Champú";
        String pregunta192 = "Acondicionador";
        String pregunta193 = "Jabón y/o gel de baño";
        String pregunta194 = "Peine";
        String pregunta195 = "Gorra de baño";
        String pregunta196 = "Crema corporal";
        String pregunta197 = "Enjuague bucal";
        String pregunta198 = "Paños faciales";
        String pregunta199 = "Rasuradora desechable.";
        String pregunta200 = "Loción refrescante para cuerpo";
        String pregunta201 = "Esponja de baño";
        String pregunta202 = "Estuche de aseo";

//Facilidades

        String pregunta203 = "Batas de baño";
        String pregunta204 = "Sombrilla ";
        String pregunta205 = "Vincha";
        String pregunta206 = "Pantuflas / Sandalias";
        String pregunta207 = "Antifaz de tela";
        String pregunta208 = "Toallas calientes ";
        String pregunta209 = "Toallas ";
        String pregunta210 = "Espejo de aumento";
        String pregunta211 = "Secadora de cabello";
        String pregunta212 = "Báscula";
        String pregunta213 = "Se cuenta con ropa interior desechable para mayor comodidad del cliente";

//Capítulo XI: Técnicas y Servicios Complementarios

        String pregunta214 = "Tratamientos del aire libre";
        String pregunta215 = "Aromaterapia";
        String pregunta216 = "Micromasaje con peces Garra Rufa";
        String pregunta217 = "Asesoría nutricional";
        String pregunta218 = "Atención médica";
        String pregunta219 = "Alimentación saludable";
        String pregunta220 = "Descripción de los ingredientes en la carta del menú";
        String pregunta221 = "Detalle del balance nutricional en la carta del menú";
        String pregunta222 = "Servicio de niñera";
        String pregunta223 = "Servicio de atención mascotas";
        String pregunta224 = "Valet Parking";
        String pregunta225 = "Otras Técnicas Complementarias";


        ArrayList<QuestionDefScoreObs> questions1 = new ArrayList<>(); //[0-4]
        questions1.add(new QuestionDefScoreObs("1.1",pregunta0));
        questions1.add(new QuestionDefScoreObs("1.2",pregunta1));
        questions1.add(new QuestionDefScoreObs("1.3",pregunta2));
        questions1.add(new QuestionDefScoreObs("1.4",pregunta3));
        questions1.add(new QuestionDefScoreObs("1.5",pregunta4));

        ArrayList<QuestionDefScoreObs> questions2 = new ArrayList<>(); //[5-19]
        questions2.add(new QuestionDefScoreObs("2.1",pregunta5));
        questions2.add(new QuestionDefScoreObs("2.2",pregunta6));
        questions2.add(new QuestionDefScoreObs("2.3",pregunta7));
        questions2.add(new QuestionDefScoreObs("2.4",pregunta8));
        questions2.add(new QuestionDefScoreObs("2.5",pregunta9));
        questions2.add(new QuestionDefScoreObs("2.6",pregunta10));
        questions2.add(new QuestionDefScoreObs("2.7",pregunta11));
        questions2.add(new QuestionDefScoreObs("2.8",pregunta12));
        questions2.add(new QuestionDefScoreObs("2.9",pregunta13));
        questions2.add(new QuestionDefScoreObs("2.10",pregunta14));
        questions2.add(new QuestionDefScoreObs("2.12",pregunta15));
        questions2.add(new QuestionDefScoreObs("2.13",pregunta16));
        questions2.add(new QuestionDefScoreObs("2.14",pregunta17));
        questions2.add(new QuestionDefScoreObs("2.15",pregunta18));
        questions2.add(new QuestionDefScoreObs("2.16",pregunta19));

        ArrayList<QuestionDefScoreObs> questions3 = new ArrayList<>(); //[20-33]
        questions3.add(new QuestionDefScoreObs("3.1",pregunta20));
        questions3.add(new QuestionDefScoreObs("3.2",pregunta21));
        questions3.add(new QuestionDefScoreObs("3.3",pregunta22));
        questions3.add(new QuestionDefScoreObs("3.4",pregunta23));
        questions3.add(new QuestionDefScoreObs("3.5",pregunta24));
        questions3.add(new QuestionDefScoreObs("3.6",pregunta25));
        questions3.add(new QuestionDefScoreObs("3.7",pregunta26));
        questions3.add(new QuestionDefScoreObs("3.8",pregunta27));
        questions3.add(new QuestionDefScoreObs("3.9",pregunta28));
        questions3.add(new QuestionDefScoreObs("3.10",pregunta29));
        questions3.add(new QuestionDefScoreObs("3.11",pregunta30));
        questions3.add(new QuestionDefScoreObs("3.12",pregunta31));
        questions3.add(new QuestionDefScoreObs("3.13",pregunta32));
        questions3.add(new QuestionDefScoreObs("3.14",pregunta33));

        ArrayList<QuestionDefScoreObs> questions4 = new ArrayList<>(); //[34-51]
        questions4.add(new QuestionDefScoreObs("4.1",pregunta34));
        questions4.add(new QuestionDefScoreObs("4.2",pregunta35));
        questions4.add(new QuestionDefScoreObs("4.3",pregunta36));
        questions4.add(new QuestionDefScoreObs("4.4",pregunta37));
        questions4.add(new QuestionDefScoreObs("4.5",pregunta38));
        questions4.add(new QuestionDefScoreObs("4.6",pregunta39));
        questions4.add(new QuestionDefScoreObs("4.7",pregunta40));
        questions4.add(new QuestionDefScoreObs("4.8",pregunta41));
        questions4.add(new QuestionDefScoreObs("4.9",pregunta42));
        questions4.add(new QuestionDefScoreObs("4.10",pregunta43));
        questions4.add(new QuestionDefScoreObs("4.11",pregunta44));
        questions4.add(new QuestionDefScoreObs("4.12",pregunta45));
        questions4.add(new QuestionDefScoreObs("4.13",pregunta46));
        questions4.add(new QuestionDefScoreObs("4.14",pregunta47));
        questions4.add(new QuestionDefScoreObs("4.15",pregunta48));
        questions4.add(new QuestionDefScoreObs("4.16",pregunta49));
        questions4.add(new QuestionDefScoreObs("4.17",pregunta50));
        questions4.add(new QuestionDefScoreObs("4.18",pregunta51));

        ArrayList<QuestionDefScoreObs> questions5 = new ArrayList<>(); //[52-84]
        questions5.add(new QuestionDefScoreObs("5.1",pregunta52));
        questions5.add(new QuestionDefScoreObs("5.2",pregunta53));
        questions5.add(new QuestionDefScoreObs("5.3",pregunta54));
        questions5.add(new QuestionDefScoreObs("5.4",pregunta55));
        questions5.add(new QuestionDefScoreObs("5.5",pregunta56));
        questions5.add(new QuestionDefScoreObs("5.6",pregunta57));
        questions5.add(new QuestionDefScoreObs("5.7",pregunta58));
        questions5.add(new QuestionDefScoreObs("5.8",pregunta59));
        questions5.add(new QuestionDefScoreObs("5.9",pregunta60));
        questions5.add(new QuestionDefScoreObs("5.10",pregunta61));
        questions5.add(new QuestionDefScoreObs("5.11",pregunta62));
        questions5.add(new QuestionDefScoreObs("5.12",pregunta63));
        questions5.add(new QuestionDefScoreObs("5.13",pregunta64));
        questions5.add(new QuestionDefScoreObs("5.14",pregunta65));
        questions5.add(new QuestionDefScoreObs("5.15",pregunta66));
        questions5.add(new QuestionDefScoreObs("5.16",pregunta67));
        questions5.add(new QuestionDefScoreObs("5.17",pregunta68));
        questions5.add(new QuestionDefScoreObs("5.18",pregunta69));
        questions5.add(new QuestionDefScoreObs("5.19",pregunta70));
        questions5.add(new QuestionDefScoreObs("5.20",pregunta71));
        questions5.add(new QuestionDefScoreObs("5.21",pregunta72));
        questions5.add(new QuestionDefScoreObs("5.22",pregunta73));
        questions5.add(new QuestionDefScoreObs("5.23",pregunta74));
        questions5.add(new QuestionDefScoreObs("5.24",pregunta75));
        questions5.add(new QuestionDefScoreObs("5.25",pregunta76));
        questions5.add(new QuestionDefScoreObs("5.26",pregunta77));
        questions5.add(new QuestionDefScoreObs("5.27",pregunta78));
        questions5.add(new QuestionDefScoreObs("5.28",pregunta79));
        questions5.add(new QuestionDefScoreObs("5.29",pregunta80));
        questions5.add(new QuestionDefScoreObs("5.30",pregunta81));
        questions5.add(new QuestionDefScoreObs("5.31",pregunta82));
        questions5.add(new QuestionDefScoreObs("5.32",pregunta83));
        questions5.add(new QuestionDefScoreObs("5.33",pregunta84));

        ArrayList<QuestionDefScoreObs> questions6 = new ArrayList<>();
        questions6.add(new QuestionDefScoreObs("6.1",pregunta85));//[85-93]
        questions6.add(new QuestionDefScoreObs("6.2",pregunta86));//[85-93]
        questions6.add(new QuestionDefScoreObs("6.3",pregunta87));//[85-93]
        questions6.add(new QuestionDefScoreObs("6.4",pregunta88));//[85-93]
        questions6.add(new QuestionDefScoreObs("6.5",pregunta89));//[85-93]
        questions6.add(new QuestionDefScoreObs("6.6",pregunta90));//[85-93]
        questions6.add(new QuestionDefScoreObs("6.7",pregunta91));//[85-93]
        questions6.add(new QuestionDefScoreObs("6.8",pregunta92));//[85-93]
        questions6.add(new QuestionDefScoreObs("6.9",pregunta93));//[85-93]

        ArrayList<QuestionDefScoreObs> questions7 = new ArrayList<>();
        questions7.add(new QuestionDefScoreObs("7.1",pregunta94));//[94-100]
        questions7.add(new QuestionDefScoreObs("7.2",pregunta95));//[94-100]
        questions7.add(new QuestionDefScoreObs("7.3",pregunta96));//[94-100]
        questions7.add(new QuestionDefScoreObs("7.4",pregunta97));//[94-100]
        questions7.add(new QuestionDefScoreObs("7.5",pregunta98));//[94-100]
        questions7.add(new QuestionDefScoreObs("7.6",pregunta99));//[94-100]
        questions7.add(new QuestionDefScoreObs("7.7",pregunta100));//[94-100]

        ArrayList<QuestionDefScoreObs> questions8 = new ArrayList<>();//[101-155]
        questions8.add(new QuestionDefScoreObs("8.1",pregunta101));
        questions8.add(new QuestionDefScoreObs("8.2",pregunta102));
        questions8.add(new QuestionDefScoreObs("8.3",pregunta103));
        questions8.add(new QuestionDefScoreObs("8.4",pregunta104));
        questions8.add(new QuestionDefScoreObs("8.5",pregunta105));
        questions8.add(new QuestionDefScoreObs("8.6",pregunta106));
        questions8.add(new QuestionDefScoreObs("8.7",pregunta107));
        questions8.add(new QuestionDefScoreObs("8.8",pregunta108));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.9",pregunta109));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.10",pregunta110));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.11",pregunta111));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.12",pregunta112));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.13",pregunta113));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.14",pregunta114));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.15",pregunta115));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.16",pregunta116));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.17",pregunta117));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.18",pregunta118));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.19",pregunta119));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.20",pregunta120));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.21",pregunta121));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.22",pregunta122));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.23",pregunta123));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.24",pregunta124));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.25",pregunta125));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.26",pregunta126));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.27",pregunta127));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.28",pregunta128));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.29",pregunta129));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.30",pregunta130));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.31",pregunta131));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.32",pregunta132));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.33",pregunta133));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.34",pregunta134));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.35",pregunta135));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.36",pregunta136));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.37",pregunta137));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.38",pregunta138));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.39",pregunta139));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.40",pregunta140));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.41",pregunta141));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.42",pregunta142));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.43",pregunta143));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.44",pregunta144));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.45",pregunta145));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.46",pregunta146));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.47",pregunta147));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.48",pregunta148));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.49",pregunta149));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.50",pregunta150));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.51",pregunta151));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.52",pregunta152));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.53",pregunta153));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.54",pregunta154));//[101-155]
        questions8.add(new QuestionDefScoreObs("8.55",pregunta155));//[101-155]


        ArrayList<QuestionDefScoreObs> questions9 = new ArrayList<>(); //[156-190]
        questions9.add(new QuestionDefScoreObs("9.1",pregunta156));
        questions9.add(new QuestionDefScoreObs("9.2",pregunta157));
        questions9.add(new QuestionDefScoreObs("9.3",pregunta158));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.4",pregunta159));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.5",pregunta160));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.6",pregunta161));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.7",pregunta162));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.8",pregunta163));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.9",pregunta164));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.10",pregunta165));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.11",pregunta166));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.12",pregunta167));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.13",pregunta168));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.14",pregunta169));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.15",pregunta170));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.16",pregunta171));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.17",pregunta172));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.18",pregunta173));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.19",pregunta174));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.20",pregunta175));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.21",pregunta176));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.22",pregunta177));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.23",pregunta178));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.24",pregunta179));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.25",pregunta180));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.26",pregunta181));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.27",pregunta182));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.28",pregunta183));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.29",pregunta184));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.30",pregunta185));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.31",pregunta186));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.32",pregunta187));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.33",pregunta188));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.34",pregunta189));//[156-190]
        questions9.add(new QuestionDefScoreObs("9.35",pregunta190));//[156-190]

        ArrayList<QuestionDefScoreObs> questions10 = new ArrayList<>(); //[191-213]
        questions10.add(new QuestionDefScoreObs("10.1",pregunta191));
        questions10.add(new QuestionDefScoreObs("10.2",pregunta192));
        questions10.add(new QuestionDefScoreObs("10.3",pregunta193));
        questions10.add(new QuestionDefScoreObs("10.4",pregunta194));
        questions10.add(new QuestionDefScoreObs("10.5",pregunta195));
        questions10.add(new QuestionDefScoreObs("10.6",pregunta196));
        questions10.add(new QuestionDefScoreObs("10.7",pregunta197));
        questions10.add(new QuestionDefScoreObs("10.8",pregunta198));
        questions10.add(new QuestionDefScoreObs("10.9",pregunta199));
        questions10.add(new QuestionDefScoreObs("10.10",pregunta200));
        questions10.add(new QuestionDefScoreObs("10.11",pregunta201));
        questions10.add(new QuestionDefScoreObs("10.12",pregunta202));
        questions10.add(new QuestionDefScoreObs("10.13",pregunta203));
        questions10.add(new QuestionDefScoreObs("10.14",pregunta204));
        questions10.add(new QuestionDefScoreObs("10.15",pregunta205));
        questions10.add(new QuestionDefScoreObs("10.16",pregunta206));
        questions10.add(new QuestionDefScoreObs("10.17",pregunta207));
        questions10.add(new QuestionDefScoreObs("10.18",pregunta208));
        questions10.add(new QuestionDefScoreObs("10.19",pregunta209));
        questions10.add(new QuestionDefScoreObs("10.20",pregunta210));
        questions10.add(new QuestionDefScoreObs("10.21",pregunta211));
        questions10.add(new QuestionDefScoreObs("10.22",pregunta212));
        questions10.add(new QuestionDefScoreObs("10.23",pregunta213));

        ArrayList<QuestionDefScoreObs> questions11 = new ArrayList<>();  //[214-225]
        questions11.add(new QuestionDefScoreObs("11.1",pregunta214));
        questions11.add(new QuestionDefScoreObs("11.2",pregunta215));
        questions11.add(new QuestionDefScoreObs("11.3",pregunta216));
        questions11.add(new QuestionDefScoreObs("11.4",pregunta217));
        questions11.add(new QuestionDefScoreObs("11.5",pregunta218));
        questions11.add(new QuestionDefScoreObs("11.6",pregunta219));
        questions11.add(new QuestionDefScoreObs("11.7",pregunta220));
        questions11.add(new QuestionDefScoreObs("11.8",pregunta221));
        questions11.add(new QuestionDefScoreObs("11.9",pregunta222));
        questions11.add(new QuestionDefScoreObs("11.10",pregunta223));
        questions11.add(new QuestionDefScoreObs("11.11",pregunta224));
        questions11.add(new QuestionDefScoreObs("11.12",pregunta225));


        ArrayList<ChapterDefSpa> chapters = new ArrayList<>();
        chapters.add(new ChapterDefSpa(capitulo1,"I",2.2f,questions1));
        chapters.add(new ChapterDefSpa(capitulo2,"II",6.6f,questions2));
        chapters.add(new ChapterDefSpa(capitulo3,"III",6.2f,questions3));
        chapters.add(new ChapterDefSpa(capitulo4,"IV",8.0f,questions4));
        chapters.add(new ChapterDefSpa(capitulo5,"V",14.6f,questions5));
        chapters.add(new ChapterDefSpa(capitulo6,"VI",4.0f,questions6));
        chapters.add(new ChapterDefSpa(capitulo7,"VII",3.1f,questions7));
        chapters.add(new ChapterDefSpa(capitulo8,"VIII",24.3f,questions8));
        chapters.add(new ChapterDefSpa(capitulo9,"IX",15.5f,questions9));
        chapters.add(new ChapterDefSpa(capitulo10,"X",10.2f,questions10));
        chapters.add(new ChapterDefSpa(capitulo11,"XI",5.3f,questions11));

        return new FormDefSpa("Calificación de Spa",14,chapters);

    } //READY 14













}
