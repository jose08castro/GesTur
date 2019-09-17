package com.example.gestur.view.main;

import java.util.ArrayList;

public class LocationManager {
    private static final String[][] DATA = {
            {"Alajuela","Alajuela","Alajuela"},
            {"Alajuela","Alajuela","San José"},
            {"Alajuela","Alajuela","Carrizal"},
            {"Alajuela","Alajuela","San Antonio"},
            {"Alajuela","Alajuela","Guácima"},
            {"Alajuela","Alajuela","San Isidro"},
            {"Alajuela","Alajuela","Sabanilla"},
            {"Alajuela","Alajuela","San Rafael"},
            {"Alajuela","Alajuela","Río Segundo"},
            {"Alajuela","Alajuela","Desamparados"},
            {"Alajuela","Alajuela","Turrúcares"},
            {"Alajuela","Alajuela","Tambor"},
            {"Alajuela","Alajuela","Garita"},
            {"Alajuela","Alajuela","Sarapiquí"},
            {"Alajuela","San Ramón","San Ramón"},
            {"Alajuela","San Ramón","Santiago"},
            {"Alajuela","San Ramón","San Juan"},
            {"Alajuela","San Ramón","Piedades Norte"},
            {"Alajuela","San Ramón","Piedades Sur"},
            {"Alajuela","San Ramón","San Rafael"},
            {"Alajuela","San Ramón","San Isidro"},
            {"Alajuela","San Ramón","Los Ángeles"},
            {"Alajuela","San Ramón","Alfaro"},
            {"Alajuela","San Ramón","Volio"},
            {"Alajuela","San Ramón","Concepción"},
            {"Alajuela","San Ramón","Zapotal"},
            {"Alajuela","San Ramón","Peñas Blancas"},
            {"Alajuela","San Ramón","San Lorenzo"},
            {"Alajuela","Grecia","Grecia"},
            {"Alajuela","Grecia","San Isidro"},
            {"Alajuela","Grecia","San José"},
            {"Alajuela","Grecia","San Roque"},
            {"Alajuela","Grecia","Tacares"},
            {"Alajuela","Grecia","Río Cuarto"},
            {"Alajuela","Grecia","Puente de Piedra"},
            {"Alajuela","Grecia","Bolívar"},
            {"Alajuela","San Mateo","San Mateo"},
            {"Alajuela","San Mateo","Desmonte"},
            {"Alajuela","San Mateo","Jesús María"},
            {"Alajuela","San Mateo","Labrador"},
            {"Alajuela","Atenas","Atenas"},
            {"Alajuela","Atenas","Jesús"},
            {"Alajuela","Atenas","Mercedes"},
            {"Alajuela","Atenas","San Isidro"},
            {"Alajuela","Atenas","Concepción"},
            {"Alajuela","Atenas","San José"},
            {"Alajuela","Atenas","Santa Eulalia"},
            {"Alajuela","Atenas","Escobal"},
            {"Alajuela","Naranjo","Naranjo"},
            {"Alajuela","Naranjo","San Miguel"},
            {"Alajuela","Naranjo","San José"},
            {"Alajuela","Naranjo","Cirrí Sur"},
            {"Alajuela","Naranjo","San Jerónimo"},
            {"Alajuela","Naranjo","San Juan"},
            {"Alajuela","Naranjo","El Rosario"},
            {"Alajuela","Naranjo","Palmitos"},
            {"Alajuela","Palmares","Palmares"},
            {"Alajuela","Palmares","Zaragoza"},
            {"Alajuela","Palmares","Buenos Aires"},
            {"Alajuela","Palmares","Santiago"},
            {"Alajuela","Palmares","Candelaria"},
            {"Alajuela","Palmares","Esquipulas"},
            {"Alajuela","Palmares","La Granja"},
            {"Alajuela","Poás","San Pedro"},
            {"Alajuela","Poás","San Juan"},
            {"Alajuela","Poás","San Rafael"},
            {"Alajuela","Poás","Carrillos"},
            {"Alajuela","Poás","Sabana Redonda"},
            {"Alajuela","Orotina","Orotina"},
            {"Alajuela","Orotina","El Mastate"},
            {"Alajuela","Orotina","Hacienda Vieja"},
            {"Alajuela","Orotina","Coyolar"},
            {"Alajuela","Orotina","La Ceiba"},
            {"Alajuela","San Carlos","Quesada"},
            {"Alajuela","San Carlos","Florencia"},
            {"Alajuela","San Carlos","Buenavista"},
            {"Alajuela","San Carlos","Aguas Zarcas"},
            {"Alajuela","San Carlos","Venecia"},
            {"Alajuela","San Carlos","Pital"},
            {"Alajuela","San Carlos","La Fortuna"},
            {"Alajuela","San Carlos","La Tigra"},
            {"Alajuela","San Carlos","La Palmera"},
            {"Alajuela","San Carlos","Venado"},
            {"Alajuela","San Carlos","Cutris"},
            {"Alajuela","San Carlos","Monterrey"},
            {"Alajuela","San Carlos","Pocosol"},
            {"Alajuela","Zarcero","Zarcero"},
            {"Alajuela","Zarcero","Laguna"},
            {"Alajuela","Zarcero","Tapezco"},
            {"Alajuela","Zarcero","Guadalupe"},
            {"Alajuela","Zarcero","Palmira"},
            {"Alajuela","Zarcero","Zapote"},
            {"Alajuela","Zarcero","Brisas"},
            {"Alajuela","Valverde Vega","Sarchí Norte"},
            {"Alajuela","Valverde Vega","Sarchí Sur"},
            {"Alajuela","Valverde Vega","Toro Amarillo"},
            {"Alajuela","Valverde Vega","San Pedro"},
            {"Alajuela","Valverde Vega","Rodríguez"},
            {"Alajuela","Upala","Upala"},
            {"Alajuela","Upala","Aguas Claras"},
            {"Alajuela","Upala","San José o Pizote"},
            {"Alajuela","Upala","Bijagua"},
            {"Alajuela","Upala","Delicias"},
            {"Alajuela","Upala","Dos Ríos"},
            {"Alajuela","Upala","Yolillal"},
            {"Alajuela","Upala","Canalete"},
            {"Alajuela","Los Chiles","Los Chiles"},
            {"Alajuela","Los Chiles","Caño Negro"},
            {"Alajuela","Los Chiles","El Amparo"},
            {"Alajuela","Los Chiles","San Jorge"},
            {"Alajuela","Guatuso","San Rafael"},
            {"Alajuela","Guatuso","Buenavista"},
            {"Alajuela","Guatuso","Cote"},
            {"Alajuela","Guatuso","Katira"},
            {"Alajuela","Río Cuarto","Río Cuarto"},
            {"Cartago","Cartago","Oriental"},
            {"Cartago","Cartago","Occidental"},
            {"Cartago","Cartago","Carmen"},
            {"Cartago","Cartago","San Nicolás"},
            {"Cartago","Cartago","Aguacaliente o San Francisco"},
            {"Cartago","Cartago","Guadalupe o Arenilla"},
            {"Cartago","Cartago","Corralillo"},
            {"Cartago","Cartago","Tierra Blanca"},
            {"Cartago","Cartago","Dulce Nombre"},
            {"Cartago","Cartago","Llano Grande"},
            {"Cartago","Cartago","Quebradilla"},
            {"Cartago","Paraíso","Paraíso"},
            {"Cartago","Paraíso","Santiago"},
            {"Cartago","Paraíso","Orosi"},
            {"Cartago","Paraíso","Cachí"},
            {"Cartago","Paraíso","Llanos de Santa Lucía"},
            {"Cartago","La Unión","Tres Ríos"},
            {"Cartago","La Unión","San Diego"},
            {"Cartago","La Unión","San Juan"},
            {"Cartago","La Unión","San Rafael"},
            {"Cartago","La Unión","Concepción"},
            {"Cartago","La Unión","Dulce Nombre"},
            {"Cartago","La Unión","San Ramón"},
            {"Cartago","La Unión","Río Azul"},
            {"Cartago","Jiménez","Juan Viñas"},
            {"Cartago","Jiménez","Tucurrique"},
            {"Cartago","Jiménez","Pejibaye"},
            {"Cartago","Turrialba","Turrialba"},
            {"Cartago","Turrialba","La Suiza"},
            {"Cartago","Turrialba","Peralta"},
            {"Cartago","Turrialba","Santa Cruz"},
            {"Cartago","Turrialba","Santa Teresita"},
            {"Cartago","Turrialba","Pavones"},
            {"Cartago","Turrialba","Tuis"},
            {"Cartago","Turrialba","Tayutic"},
            {"Cartago","Turrialba","Santa Rosa"},
            {"Cartago","Turrialba","Tres Equis"},
            {"Cartago","Turrialba","La Isabel"},
            {"Cartago","Turrialba","Chirripó"},
            {"Cartago","Alvarado","Pacayas"},
            {"Cartago","Alvarado","Cervantes"},
            {"Cartago","Alvarado","Capellades"},
            {"Cartago","Oreamuno","San Rafael"},
            {"Cartago","Oreamuno","Cot"},
            {"Cartago","Oreamuno","Potrero Cerrado"},
            {"Cartago","Oreamuno","Cipreses"},
            {"Cartago","Oreamuno","Santa Rosa"},
            {"Cartago","El Guarco","Tejar"},
            {"Cartago","El Guarco","San Isidro"},
            {"Cartago","El Guarco","Tobosi"},
            {"Cartago","El Guarco","Patio de Agua"},
            {"Guanacaste","Liberia","Liberia"},
            {"Guanacaste","Liberia","Cañas Dulces"},
            {"Guanacaste","Liberia","Mayorga"},
            {"Guanacaste","Liberia","Nacascolo"},
            {"Guanacaste","Liberia","Curubandé"},
            {"Guanacaste","Nicoya","Nicoya"},
            {"Guanacaste","Nicoya","Mansion"},
            {"Guanacaste","Nicoya","San Antonio"},
            {"Guanacaste","Nicoya","Quebrada Honda"},
            {"Guanacaste","Nicoya","Samara"},
            {"Guanacaste","Nicoya","Nosara"},
            {"Guanacaste","Nicoya","Belén de Nosarita"},
            {"Guanacaste","Santa Cruz","Santa Cruz"},
            {"Guanacaste","Santa Cruz","Bolsón"},
            {"Guanacaste","Santa Cruz","Veintisiete de Abril"},
            {"Guanacaste","Santa Cruz","Tempate"},
            {"Guanacaste","Santa Cruz","Cartagena"},
            {"Guanacaste","Santa Cruz","Cuajiniquil"},
            {"Guanacaste","Santa Cruz","Diria"},
            {"Guanacaste","Santa Cruz","Cabo Velas"},
            {"Guanacaste","Santa Cruz","Tamarindo"},
            {"Guanacaste","Bagaces","Bagaces"},
            {"Guanacaste","Bagaces","Fortuna"},
            {"Guanacaste","Bagaces","Mogote"},
            {"Guanacaste","Bagaces","Río Naranjo"},
            {"Guanacaste","Carrillo","Filadelfia"},
            {"Guanacaste","Carrillo","Palmira"},
            {"Guanacaste","Carrillo","Sardinal"},
            {"Guanacaste","Carrillo","Belén"},
            {"Guanacaste","Cañas","Cañas"},
            {"Guanacaste","Cañas","Palmira"},
            {"Guanacaste","Cañas","San Miguel"},
            {"Guanacaste","Cañas","Bebedero"},
            {"Guanacaste","Cañas","Porozal"},
            {"Guanacaste","Abangares","Juntas"},
            {"Guanacaste","Abangares","Sierra"},
            {"Guanacaste","Abangares","San Juan"},
            {"Guanacaste","Abangares","Colorado"},
            {"Guanacaste","Tilarán","Tilarán"},
            {"Guanacaste","Tilarán","Quebrada Grande"},
            {"Guanacaste","Tilarán","Tronadora"},
            {"Guanacaste","Tilarán","Santa Rosa"},
            {"Guanacaste","Tilarán","Líbano"},
            {"Guanacaste","Tilarán","Tierras Morenas"},
            {"Guanacaste","Tilarán","Arenal"},
            {"Guanacaste","Nandayure","Carmona"},
            {"Guanacaste","Nandayure","Santa Rita"},
            {"Guanacaste","Nandayure","Zapotal"},
            {"Guanacaste","Nandayure","San Pablo"},
            {"Guanacaste","Nandayure","Porvenir"},
            {"Guanacaste","Nandayure","Bejuco"},
            {"Guanacaste","La Cruz","La Cruz"},
            {"Guanacaste","La Cruz","Santa Cecilia"},
            {"Guanacaste","La Cruz","Garita"},
            {"Guanacaste","La Cruz","Santa Elena"},
            {"Guanacaste","Hojancha","Hojancha"},
            {"Guanacaste","Hojancha","Monte Romo"},
            {"Guanacaste","Hojancha","Puerto Carrillo"},
            {"Guanacaste","Hojancha","Huacas"},
            {"Heredia","Heredia","Heredia"},
            {"Heredia","Heredia","Mercedes"},
            {"Heredia","Heredia","San Francisco"},
            {"Heredia","Heredia","Ulloa"},
            {"Heredia","Heredia","Varablanca"},
            {"Heredia","Barva","Barva"},
            {"Heredia","Barva","San Pedro"},
            {"Heredia","Barva","San Pablo"},
            {"Heredia","Barva","San Roque"},
            {"Heredia","Barva","Santa Lucía"},
            {"Heredia","Barva","San José de la Montaña"},
            {"Heredia","Santo Domingo","Santo Domingo"},
            {"Heredia","Santo Domingo","San Vicente"},
            {"Heredia","Santo Domingo","San Miguel"},
            {"Heredia","Santo Domingo","Paracito"},
            {"Heredia","Santo Domingo","Santo Tomás"},
            {"Heredia","Santo Domingo","Santa Rosa"},
            {"Heredia","Santo Domingo","Tures"},
            {"Heredia","Santo Domingo","Para"},
            {"Heredia","Santa Bárbara","Santa Bárbara"},
            {"Heredia","Santa Bárbara","San Pedro"},
            {"Heredia","Santa Bárbara","San Juan"},
            {"Heredia","Santa Bárbara","Jesús"},
            {"Heredia","Santa Bárbara","Santo Domingo"},
            {"Heredia","Santa Bárbara","Puraba"},
            {"Heredia","San Rafael","San Rafael"},
            {"Heredia","San Rafael","San Josécito"},
            {"Heredia","San Rafael","Santiago"},
            {"Heredia","San Rafael","Ángeles"},
            {"Heredia","San Rafael","Concepción"},
            {"Heredia","San Isidro","San Isidro"},
            {"Heredia","San Isidro","San José"},
            {"Heredia","San Isidro","Concepción"},
            {"Heredia","San Isidro","San Francisco"},
            {"Heredia","Belén","San Antonio"},
            {"Heredia","Belén","La Ribera"},
            {"Heredia","Belén","La Asunción"},
            {"Heredia","Flores","San Joaquín"},
            {"Heredia","Flores","Barrantes"},
            {"Heredia","Flores","Llorente"},
            {"Heredia","San Pablo","San Pablo"},
            {"Heredia","San Pablo","Rincón de Sabanilla"},
            {"Heredia","Sarapiquí","Puerto Viejo"},
            {"Heredia","Sarapiquí","La Virgen"},
            {"Heredia","Sarapiquí","Horquetas"},
            {"Heredia","Sarapiquí","Llanuras del Gaspar"},
            {"Heredia","Sarapiquí","Cureña"},
            {"Limón","Limón","Limón"},
            {"Limón","Limón","Valle La Estrella"},
            {"Limón","Limón","Río Blanco"},
            {"Limón","Limón","Matama"},
            {"Limón","Pococí","Guapiles"},
            {"Limón","Pococí","Jiménez"},
            {"Limón","Pococí","La Rita"},
            {"Limón","Pococí","Roxana"},
            {"Limón","Pococí","Cariari"},
            {"Limón","Pococí","Colorado"},
            {"Limón","Pococí","La Colonia"},
            {"Limón","Siquirres","Siquirres"},
            {"Limón","Siquirres","Pacuarito"},
            {"Limón","Siquirres","Florida"},
            {"Limón","Siquirres","Germania"},
            {"Limón","Siquirres","Cairo"},
            {"Limón","Siquirres","Alegría"},
            {"Limón","Talamanca","Bratsi"},
            {"Limón","Talamanca","Sixaola"},
            {"Limón","Talamanca","Cahuita"},
            {"Limón","Talamanca","Telire"},
            {"Limón","Matina","Matina"},
            {"Limón","Matina","Batán"},
            {"Limón","Matina","Carrandi"},
            {"Limón","Guácimo","Guácimo"},
            {"Limón","Guácimo","Mercedes"},
            {"Limón","Guácimo","Pocora"},
            {"Limón","Guácimo","Río Jiménez"},
            {"Limón","Guácimo","Duacarí"},
            {"Puntarenas","Puntarenas","Puntarenas"},
            {"Puntarenas","Puntarenas","Pitahaya"},
            {"Puntarenas","Puntarenas","Chomes"},
            {"Puntarenas","Puntarenas","Lepanto"},
            {"Puntarenas","Puntarenas","Paquera"},
            {"Puntarenas","Puntarenas","Manzanillo"},
            {"Puntarenas","Puntarenas","Guacimal"},
            {"Puntarenas","Puntarenas","Barranca"},
            {"Puntarenas","Puntarenas","Monte Verde"},
            {"Puntarenas","Puntarenas","Isla del Coco"},
            {"Puntarenas","Puntarenas","Cobano"},
            {"Puntarenas","Puntarenas","Chacarita"},
            {"Puntarenas","Puntarenas","Chira"},
            {"Puntarenas","Puntarenas","Acapulco"},
            {"Puntarenas","Puntarenas","El Roble"},
            {"Puntarenas","Puntarenas","Arancibia"},
            {"Puntarenas","Esparza","Espiritu Santo"},
            {"Puntarenas","Esparza","San Juan Grande"},
            {"Puntarenas","Esparza","Macacona"},
            {"Puntarenas","Esparza","San Rafael"},
            {"Puntarenas","Esparza","San Jerónimo"},
            {"Puntarenas","Esparza","Caldera"},
            {"Puntarenas","Buenos Aires","Buenos Aires"},
            {"Puntarenas","Buenos Aires","Volcan"},
            {"Puntarenas","Buenos Aires","Potrero Grande"},
            {"Puntarenas","Buenos Aires","Boruca"},
            {"Puntarenas","Buenos Aires","Pilas"},
            {"Puntarenas","Buenos Aires","Colinas"},
            {"Puntarenas","Buenos Aires","Changena"},
            {"Puntarenas","Buenos Aires","Briolley"},
            {"Puntarenas","Buenos Aires","Brunka"},
            {"Puntarenas","Montes de Oro","Miramar"},
            {"Puntarenas","Montes de Oro","La Unión"},
            {"Puntarenas","Montes de Oro","San Isidro"},
            {"Puntarenas","Osa","Puerto Cortés"},
            {"Puntarenas","Osa","Palmar"},
            {"Puntarenas","Osa","Sierpe"},
            {"Puntarenas","Osa","Bahia Ballena"},
            {"Puntarenas","Osa","Piedras Blancas"},
            {"Puntarenas","Osa","Bahía Drake"},
            {"Puntarenas","Quepos","Quepos"},
            {"Puntarenas","Quepos","Savegre"},
            {"Puntarenas","Quepos","Naranjito"},
            {"Puntarenas","Golfito","Golfito"},
            {"Puntarenas","Golfito","Puerto Jiménez"},
            {"Puntarenas","Golfito","Guaycará"},
            {"Puntarenas","Golfito","Pavón"},
            {"Puntarenas","Coto Brus","San Vito"},
            {"Puntarenas","Coto Brus","Sabalito"},
            {"Puntarenas","Coto Brus","Aguabuena"},
            {"Puntarenas","Coto Brus","Limóncito"},
            {"Puntarenas","Coto Brus","Pittier"},
            {"Puntarenas","Coto Brus","Gutiérrez Braun"},
            {"Puntarenas","Parrita","Parrita"},
            {"Puntarenas","Corredores","Corredor"},
            {"Puntarenas","Corredores","La Cuesta"},
            {"Puntarenas","Corredores","Canoas"},
            {"Puntarenas","Corredores","Laurel"},
            {"Puntarenas","Garabito","Jacó"},
            {"Puntarenas","Garabito","Tarcoles"},
            {"San José","San José","Carmen"},
            {"San José","San José","Merced"},
            {"San José","San José","Hospital"},
            {"San José","San José","Catedral"},
            {"San José","San José","Zapote"},
            {"San José","San José","San Francisco de Dos Ríos"},
            {"San José","San José","Uruca"},
            {"San José","San José","Mata Redonda"},
            {"San José","San José","Pavas"},
            {"San José","San José","Hatillo"},
            {"San José","San José","San Sebastián"},
            {"San José","Escazú","Escazú"},
            {"San José","Escazú","San Antonio"},
            {"San José","Escazú","San Rafael"},
            {"San José","Desamparados","Desamparados"},
            {"San José","Desamparados","San Miguel"},
            {"San José","Desamparados","San Juan de Dios"},
            {"San José","Desamparados","San Rafael Arriba"},
            {"San José","Desamparados","San Antonio"},
            {"San José","Desamparados","Frailes"},
            {"San José","Desamparados","Patarrá"},
            {"San José","Desamparados","San Cristóbal"},
            {"San José","Desamparados","Rosario"},
            {"San José","Desamparados","Damas"},
            {"San José","Desamparados","San Rafael Abajo"},
            {"San José","Desamparados","Gravilias"},
            {"San José","Desamparados","Los Guido"},
            {"San José","Puriscal","Santiago"},
            {"San José","Puriscal","Mercedes Sur"},
            {"San José","Puriscal","Barbacoas"},
            {"San José","Puriscal","Grifo Alto"},
            {"San José","Puriscal","San Rafael"},
            {"San José","Puriscal","Candelarita"},
            {"San José","Puriscal","Desamparaditos"},
            {"San José","Puriscal","San Antonio"},
            {"San José","Puriscal","Chires"},
            {"San José","Tarrazú","San Marcos"},
            {"San José","Tarrazú","San Lorenzo"},
            {"San José","Tarrazú","San Carlos"},
            {"San José","Aserrí","Aserrí"},
            {"San José","Aserrí","Tarbaca"},
            {"San José","Aserrí","Vuelta de Jorco"},
            {"San José","Aserrí","San Gabriel"},
            {"San José","Aserrí","Legua"},
            {"San José","Aserrí","Monterrey"},
            {"San José","Aserrí","Salitrillos"},
            {"San José","Mora","Colón"},
            {"San José","Mora","Guayabo"},
            {"San José","Mora","Tabarcia"},
            {"San José","Mora","Piedras Negras"},
            {"San José","Mora","Picagres"},
            {"San José","Mora","Jaris"},
            {"San José","Mora","Quitirrisí"},
            {"San José","Goicoechea","Guadalupe"},
            {"San José","Goicoechea","San Francisco"},
            {"San José","Goicoechea","Calle Blancos"},
            {"San José","Goicoechea","Mata de Plátano"},
            {"San José","Goicoechea","Ipís"},
            {"San José","Goicoechea","Rancho Redondo"},
            {"San José","Goicoechea","Purral"},
            {"San José","Santa Ana","Santa Ana"},
            {"San José","Santa Ana","Salitral"},
            {"San José","Santa Ana","Pozos"},
            {"San José","Santa Ana","Uruca"},
            {"San José","Santa Ana","Piedades"},
            {"San José","Santa Ana","Brasil"},
            {"San José","Alajuelita","Alajuelita"},
            {"San José","Alajuelita","San Josecito"},
            {"San José","Alajuelita","San Antonio"},
            {"San José","Alajuelita","Concepción"},
            {"San José","Alajuelita","San Felipe"},
            {"San José","Vásquez de Coronado","San Isidro"},
            {"San José","Vásquez de Coronado","San Rafael"},
            {"San José","Vásquez de Coronado","Dulce Nombre de Jesús"},
            {"San José","Vásquez de Coronado","Patalillo"},
            {"San José","Vásquez de Coronado","Cascajal"},
            {"San José","Acosta","San Ignacio"},
            {"San José","Acosta","Guaitil"},
            {"San José","Acosta","Palmichal"},
            {"San José","Acosta","Cangrejal"},
            {"San José","Acosta","Sabanillas"},
            {"San José","Tibás","San Juan"},
            {"San José","Tibás","Cinco Esquinas"},
            {"San José","Tibás","Anselmo Llorente"},
            {"San José","Tibás","León XIII"},
            {"San José","Tibás","Colima"},
            {"San José","Moravia","San Vicente"},
            {"San José","Moravia","San Jerónimo"},
            {"San José","Moravia","La Trinidad"},
            {"San José","Montes de Oca","San Pedro"},
            {"San José","Montes de Oca","Sabanilla"},
            {"San José","Montes de Oca","Mercedes"},
            {"San José","Montes de Oca","San Rafael"},
            {"San José","Turrubares","San Pablo"},
            {"San José","Turrubares","San Pedro"},
            {"San José","Turrubares","San Juan de Mata"},
            {"San José","Turrubares","San Luis"},
            {"San José","Turrubares","Carara"},
            {"San José","Dota","Santa María"},
            {"San José","Dota","Jardín"},
            {"San José","Dota","Copey"},
            {"San José","Curridabat","Curridabat"},
            {"San José","Curridabat","Granadilla"},
            {"San José","Curridabat","Sánchez"},
            {"San José","Curridabat","Tirrases"},
            {"San José","Pérez Zeledón","San Isidro de El General"},
            {"San José","Pérez Zeledón","El General"},
            {"San José","Pérez Zeledón","Daniel Flores"},
            {"San José","Pérez Zeledón","Rivas"},
            {"San José","Pérez Zeledón","San Pedro"},
            {"San José","Pérez Zeledón","Platanares"},
            {"San José","Pérez Zeledón","Pejibaye"},
            {"San José","Pérez Zeledón","Cajón"},
            {"San José","Pérez Zeledón","Barú"},
            {"San José","Pérez Zeledón","Río Nuevo"},
            {"San José","Pérez Zeledón","Páramo"},
            {"San José","Pérez Zeledón","La Amistad"},
            {"San José","León Cortés Castro","San Pablo"},
            {"San José","León Cortés Castro","San Andrés"},
            {"San José","León Cortés Castro","Llano Bonito"},
            {"San José","León Cortés Castro","San Isidro"},
            {"San José","León Cortés Castro","Santa Cruz"},
            {"San José","León Cortés Castro","San Antonio"}
    };

    public static ArrayList<String> getProvinces(){
        ArrayList<String> provinces = new ArrayList<>();

        for(int i = 0; i < DATA.length;i++){
            if(!provinces.contains(DATA[i][0])){
                provinces.add(DATA[i][0]);
            }
        }

        return provinces;
    }

    public static ArrayList<String> getCantons(String province){
        ArrayList<String> cantons = new ArrayList<>();

        for(int i = 0; i < DATA.length;i++){
            if(!DATA[i][0].equals(province))
                continue;
            if(!cantons.contains(DATA[i][1])){
                cantons.add(DATA[i][1]);
            }
        }

        return cantons;
    }

    public static ArrayList<String> getDistricts(String province, String canton){
        ArrayList<String> districs = new ArrayList<>();

        for(int i = 0; i < DATA.length;i++){
            if(!DATA[i][0].equals(province) || !DATA[i][1].equals(canton))
                continue;
            districs.add(DATA[i][2]);
        }

        return districs;
    }
}
