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
import com.example.gestur.DB.definitionFormClasses.FormDefScore;
import com.example.gestur.DB.definitionFormClasses.FormDefSpa;
import com.example.gestur.DB.definitionFormClasses.QuestionDefBinary;
import com.example.gestur.DB.definitionFormClasses.QuestionDefHotel;
import com.example.gestur.DB.definitionFormClasses.QuestionDefScoreObs;

import java.util.ArrayList;

public abstract class FormDefFactory {

    public static FormDefBinary getFormTematicsDef(){ //Calificación para Actividades Turísticas Temáticas:
        String pregunta1 = "Cumple con las regulaciones para su operación establecidas por el Ministerio de Salud.";
        String pregunta2 = "Cumple con las Regulaciones para su operación establecidas por la Municipalidad local.                                                 \n";
        String pregunta3 = "En caso de ofrecer los servicios de hospedaje se encuentra debidamente inscrito ante las autoridades locales.";
        String pregunta4 = "La empresa dispone de un Seguro de Responsabilidad Civil y gastos médicos.";
        String pregunta5 = "Cuando se involucran actividades de Turismo de Aventura las mismas se apegan a lo establecido por el Ministerio de Salud.";
        String pregunta6 = "La empresa dispone de una bitácora de Mantenimiento";
        String pregunta7 = "La empresa dispone de un Manual de Seguridad";
        String pregunta8 = "Los Guías tienen el certificado de Primeros Auxilios y RCP";
        String pregunta9 = "Se dispone de Guías para atender a los turistas tanto en forma individual o grupal";
        String pregunta10 = "La empresa dispone de un Reglamento Interno de Operación para el desarrollo de sus visitas.";

        String pregunta11 = "Considera un aspecto temático  como eje principal  de su Actividad Turística. \n";
        String pregunta12 = "En lo que respecta a su ubicación el proyecto se encuentra rodeado de atractivos turísticos tanto naturales como culturales de importancia.\n";
        String pregunta13 = "Se cuenta con  Disposiciones Generales de Información y Seguridad al Turista.\n";
        String pregunta14 = "\"Se cuenta con una sala  para la recepción del turista individual o en grupo, \n" +
                "donde se le proporcionan servicios varios y de información general.                                   \"\n";
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
        chapters.add(new ChapterDefBinary("Capitulo I: De la Organizacion",1,17,questions1));
        chapters.add(new ChapterDefBinary("Capitulo II: De la Operacion",2,39,questions2));
        chapters.add(new ChapterDefBinary("Capitulo III: De la Variables Ambientales y Culturales",3,20,questions3));
        chapters.add(new ChapterDefBinary("Capitulo IV: De la Organizacion",4,14,questions4));

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
        return null;
    }
    public static FormDefBinary getFormRentVehiculesDef(){
        return null;
    }
    public static FormDefBinary getFormAirLinesDef(){
        return null;
    }
    public static FormDefBinary getFormWaterTransportDef(){
        return null;
    }
    public static FormDefConCenters getFormConCentersDef(){
        return null;
    }
    public static FormDefBinary getFormEnterpriseDef(){
        return null;
    }
    public static FormDefRestaurant getFormRestaurantDef(){
        return null;
    }
    public static FormDefBinary getFormWaterActivitiesDef(){
        return null;
    }
    public static FormDefBinary getFormAirActivitiessDef(){
        return null;
    }
    public static FormDefCafeteriaFondaSoda getFormCafeteriaDef(){
        return null;
    }
    public static FormDefCafeteriaFondaSoda getFormFondaSodaDef(){
        return null;
    }
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


        String pregunta1_1 = "Cumple con las regulaciones para su operación establecidas por el Ministerio de Salud";
        String pregunta1_2 = "Cumple con las regulaciones para su operación establecidas por la Municipalidad local\n";
        String pregunta1_3 = "Existe código para el comportamiento del cliente\n";
        String pregunta1_4 = "Existe código del servicio al cliente para cada puesto\n";
        String pregunta1_5 = "Dispone de un reglamento interno de operación \n";

        String pregunta2_1 = "Director/ Gerente \n";
        String pregunta2_2 = "Fisioterapeutas\n";
        String pregunta2_3 = "Supervisor\n";
        String pregunta2_4 = "Anfitriones\n";
        String pregunta2_5 = "Recepcionistas\n";
        String pregunta2_6 = "Masajistas/ Terapeutas\n";
        String pregunta2_7 = "Estilistas\n";
        String pregunta2_8 = "Esteticistas\n";
        String pregunta2_9 = "Manicuristas / pedicuristas\n";
        String pregunta2_10 = "Instructores (yoga, pilates, gimnasio, entre otros)\n";
        String pregunta2_11 = "Personal capacitado para primeros auxilios\n";
        String pregunta2_12 = "Guardas de seguridad\n";
        String pregunta2_13 = "Personal de mantenimiento\n";
        String pregunta2_14 = "Misceláneos\n";
        String pregunta2_15 = "Jardineros\n";

        String pregunta3_1 = "Se dispone de Protocolo escrito de Bienvenida al Cliente\n";

        String pregunta4_1 = "Se le da a conocer a los clientes del Spa las políticas del mismo, " +
                "considerando los aspectos ambientales, sociales, económicos , a través de algún medio audio visual.\n";

        String pregunta5_1 = "Se dispone de rotulación clara y visible que identifique el establecimiento\n";

        String pregunta6_1 = "Se dispone de Protocolo escrito con normas de Etiqueta del Spa.(Uniforme, " +
                "presentación y vocabulario del personal, atención al cliente y resolución de conflictos).\n";

        String pregunta7_1 = "Masajes\n";

        String pregunta8_1 = "Se dispone en la  sala de espera de dispensadores de agua y otras bebidas hidratantes\n";

        String pregunta9_1 = "Se dispone de un área exclusivo para el consumo de alimentos \n";

        String pregunta10_1 = "Champú\n";

        String pregunta11_1 = "Tratamientos del aire libre\n";

        ArrayList<QuestionDefScoreObs> questions1 = new ArrayList<>();
        questions1.add(new QuestionDefScoreObs("1.1",pregunta1_1));
        questions1.add(new QuestionDefScoreObs("1.2",pregunta1_2));
        questions1.add(new QuestionDefScoreObs("1.3",pregunta1_3));
        questions1.add(new QuestionDefScoreObs("1.4",pregunta1_4));
        questions1.add(new QuestionDefScoreObs("1.5",pregunta1_5));

        ArrayList<QuestionDefScoreObs> questions2 = new ArrayList<>();
        questions1.add(new QuestionDefScoreObs("2.1",pregunta2_1));
        questions1.add(new QuestionDefScoreObs("2.2",pregunta2_2));
        questions1.add(new QuestionDefScoreObs("2.3",pregunta2_3));
        questions1.add(new QuestionDefScoreObs("2.4",pregunta2_4));
        questions1.add(new QuestionDefScoreObs("2.5",pregunta2_5));
        questions1.add(new QuestionDefScoreObs("2.6",pregunta2_6));
        questions1.add(new QuestionDefScoreObs("2.7",pregunta2_7));
        questions1.add(new QuestionDefScoreObs("2.8",pregunta2_8));
        questions1.add(new QuestionDefScoreObs("2.9",pregunta2_9));
        questions1.add(new QuestionDefScoreObs("2.10",pregunta2_10));
        questions1.add(new QuestionDefScoreObs("2.11",pregunta2_11));
        questions1.add(new QuestionDefScoreObs("2.12",pregunta2_12));
        questions1.add(new QuestionDefScoreObs("2.13",pregunta2_13));
        questions1.add(new QuestionDefScoreObs("2.14",pregunta2_14));
        questions1.add(new QuestionDefScoreObs("2.15",pregunta2_15));


        ArrayList<QuestionDefScoreObs> questions3 = new ArrayList<>();
        questions3.add(new QuestionDefScoreObs("3.1",pregunta3_1));

        ArrayList<QuestionDefScoreObs> questions4 = new ArrayList<>();
        questions4.add(new QuestionDefScoreObs("4.1",pregunta4_1));

        ArrayList<QuestionDefScoreObs> questions5 = new ArrayList<>();
        questions5.add(new QuestionDefScoreObs("5.1",pregunta5_1));

        ArrayList<QuestionDefScoreObs> questions6 = new ArrayList<>();
        questions6.add(new QuestionDefScoreObs("6.1",pregunta6_1));

        ArrayList<QuestionDefScoreObs> questions7 = new ArrayList<>();
        questions7.add(new QuestionDefScoreObs("7.1",pregunta7_1));

        ArrayList<QuestionDefScoreObs> questions8 = new ArrayList<>();
        questions8.add(new QuestionDefScoreObs("8.1",pregunta8_1));

        ArrayList<QuestionDefScoreObs> questions9 = new ArrayList<>();
        questions9.add(new QuestionDefScoreObs("9.1",pregunta9_1));

        ArrayList<QuestionDefScoreObs> questions10 = new ArrayList<>();
        questions10.add(new QuestionDefScoreObs("10.1",pregunta10_1));

        ArrayList<QuestionDefScoreObs> questions11 = new ArrayList<>();
        questions11.add(new QuestionDefScoreObs("11.1",pregunta11_1));


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

        FormDefSpa formDefSpa = new FormDefSpa("Calificación de Spa",14,chapters);

        return formDefSpa;
    } //FALTA 14
}
