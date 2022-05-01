import java.awt.EventQueue;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import java.awt.Checkbox;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;



import net.bican.wordpress.*;
import net.bican.wordpress.exceptions.InsufficientRightsException;
import net.bican.wordpress.exceptions.InvalidArgumentsException;
import net.bican.wordpress.exceptions.ObjectNotFoundException;
import redstone.xmlrpc.XmlRpcException;
import redstone.xmlrpc.XmlRpcFault;

import java.awt.Font;
import java.awt.TextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Label;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Legal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	String privacy = null;
	String privacyn= null;
	String gurl =null;
	String terms = null;
	String termsn=null;
	String DCMA = null;
	String disc=null;
	String Cookie=null;
	String DCMAn=null;
	String About=null;
	String C=null;
	String Aboutn=null;
	String disn=null;
	private JTextField textField_3;
	private JPasswordField passwordField;
	protected String cookien;
	Boolean tc=false; 
	Boolean cp=false;
	Boolean di=false;
	Boolean dm=false;
	Boolean cc=false;
	Boolean ab=false;
	Boolean pp=false;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Legal window = new Legal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Legal() {
		initialize();
		this.frame.setVisible(true);}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("AR");
		rdbtnNewRadioButton_4.setBounds(34, 208, 56, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("ENG");
		rdbtnNewRadioButton.setBounds(34, 74, 70, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("FR");
		rdbtnNewRadioButton_1.setBounds(34, 116, 70, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		final JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("ESP");
		rdbtnNewRadioButton_2.setBounds(34, 172, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		final JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("JP");
		rdbtnNewRadioButton_3.setBounds(34, 146, 66, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		ButtonGroup g=new ButtonGroup(); 
		g.add(rdbtnNewRadioButton);
		g.add(rdbtnNewRadioButton_1);
		g.add(rdbtnNewRadioButton_2);
		g.add(rdbtnNewRadioButton_3);
		g.add(rdbtnNewRadioButton_4);
		
		
		JButton btnNewButton = new JButton("Privacy");
		btnNewButton.addActionListener(new ActionListener() {
			private String privacyENG;
			private String privacyFR;
			private String privacyESP;
			private String privacyJP;
			private String privacyAR;
			
			private String url;
			private String name;
			private String email;

			public void actionPerformed(ActionEvent e) {
				url=textField_2.getText();
				gurl = url;
				name=textField.getText();
				email=textField_1.getText();
				
				privacyESP="<!-- wp:heading {\"level\":1} -->\r\n"
						+ "<h1>Política de privacidad para "+name+"</h1>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>En "+name+", accesible desde "+url+", una de nuestras principales prioridades es la privacidad de nuestros visitantes.&nbsp;Este documento de Política de privacidad contiene tipos de información recopilada y registrada por "+name+" y cómo la usamos.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Si tienes preguntas adicionales o requieres más información sobre nuestra Política de Privacidad, no dudes en contactarnos.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Esta Política de privacidad se aplica solo a nuestras actividades en línea y es válida para los visitantes de nuestro sitio web con respecto a la información que compartieron y/o recopilaron en "+name+".&nbsp;Esta política no se aplica a ninguna información recopilada fuera de línea o a través de canales que no sean este sitio web.&nbsp;Nuestra Política de privacidad se creó con la ayuda del&nbsp;<a href=\"https://www-privacypolicygenerator-info.translate.goog/live.php?_x_tr_sl=en&amp;_x_tr_tl=es&amp;_x_tr_hl=fr&amp;_x_tr_pto=wapp\">Generador gratuito de políticas de privacidad</a>&nbsp;.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Consentimiento</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Al utilizar nuestro sitio web, usted acepta nuestra Política de privacidad y acepta sus términos.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Información que recopilamos</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>La información personal que se le solicita que proporcione, y las razones por las que se le solicita que la proporcione, se le aclararán en el momento en que le solicitemos que proporcione su información personal.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Si se comunica con nosotros directamente, podemos recibir información adicional sobre usted, como su nombre, dirección de correo electrónico, número de teléfono, el contenido del mensaje y/o los archivos adjuntos que nos envíe, y cualquier otra información que elija proporcionar.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Cuando se registra para una Cuenta, podemos solicitar su información de contacto, incluidos elementos como el nombre, el nombre de la empresa, la dirección, la dirección de correo electrónico y el número de teléfono.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Cómo usamos su información</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Usamos la información que recopilamos de varias maneras, incluso para:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>Proporcionar, operar y mantener nuestro sitio web</li><li>Mejorar, personalizar y expandir nuestro sitio web</li><li>Comprender y analizar cómo utiliza nuestro sitio web</li><li>Desarrollar nuevos productos, servicios, características y funcionalidades.</li><li>Comunicarnos con usted, ya sea directamente o a través de uno de nuestros socios, incluido el servicio de atención al cliente, para brindarle actualizaciones y otra información relacionada con el sitio web, y con fines promocionales y de marketing.</li><li>Enviarle correos electrónicos</li><li>Encuentre y prevenga el fraude</li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Archivos de registro</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>"+name+" sigue un procedimiento estándar de uso de archivos de registro.&nbsp;Estos archivos registran a los visitantes cuando visitan sitios web.&nbsp;Todas las empresas de alojamiento hacen esto y forman parte del análisis de los servicios de alojamiento.&nbsp;La información recopilada por los archivos de registro incluye direcciones de protocolo de Internet (IP), tipo de navegador, proveedor de servicios de Internet (ISP), marca de fecha y hora, páginas de referencia/salida y posiblemente la cantidad de clics.&nbsp;Estos no están vinculados a ninguna información que sea personalmente identificable.&nbsp;El propósito de la información es analizar tendencias, administrar el sitio, rastrear el movimiento de los usuarios en el sitio web y recopilar información demográfica.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Cookies y balizas web</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Como cualquier otro sitio web, "+name+" utiliza 'cookies'.&nbsp;Estas cookies se utilizan para almacenar información, incluidas las preferencias de los visitantes y las páginas del sitio web a las que accedió o visitó el visitante.&nbsp;La información se utiliza para optimizar la experiencia de los usuarios al personalizar el contenido de nuestra página web según el tipo de navegador de los visitantes y/u otra información.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Para obtener más información general sobre las cookies, lea&nbsp;<a href=\"https://translate.google.com/website?sl=en&amp;tl=es&amp;hl=fr&amp;client=webapp&amp;u=https://www.generateprivacypolicy.com/%23cookies\">el artículo Cookies en el sitio web Generar política de privacidad</a>&nbsp;.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Cookie de DART de Google DoubleClick</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Google es uno de los proveedores externos de nuestro sitio.&nbsp;También utiliza cookies, conocidas como cookies de DART, para mostrar anuncios a los visitantes de nuestro sitio en función de su visita a www.website.com y otros sitios en Internet.&nbsp;Sin embargo, los visitantes pueden optar por rechazar el uso de cookies de DART visitando la Política de privacidad de la red de contenido y anuncios de Google en la siguiente URL:&nbsp;<a href=\"https://translate.google.com/website?sl=en&amp;tl=es&amp;hl=fr&amp;client=webapp&amp;u=https://policies.google.com/technologies/ads\">https://policies.google.com/technologies/ads</a></p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Políticas de privacidad de socios publicitarios</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Puede consultar esta lista para encontrar la Política de privacidad de cada uno de los socios publicitarios de "+name+".</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Los servidores de anuncios o redes publicitarias de terceros utilizan tecnologías como cookies, JavaScript o balizas web que se utilizan en sus respectivos anuncios y enlaces que aparecen en "+name+", que se envían directamente al navegador de los usuarios.&nbsp;Reciben automáticamente su dirección IP cuando esto ocurre.&nbsp;Estas tecnologías se utilizan para medir la efectividad de sus campañas publicitarias y/o para personalizar el contenido publicitario que ve en los sitios web que visita.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Tenga en cuenta que "+name+" no tiene acceso ni control sobre estas cookies que utilizan los anunciantes de terceros.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Políticas de privacidad de terceros</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>La Política de privacidad de "+name+" no se aplica a otros anunciantes o sitios web.&nbsp;Por lo tanto, le recomendamos que consulte las Políticas de privacidad respectivas de estos servidores de anuncios de terceros para obtener información más detallada.&nbsp;Puede incluir sus prácticas e instrucciones sobre cómo excluirse de ciertas opciones.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Puede optar por deshabilitar las cookies a través de las opciones de su navegador individual.&nbsp;Para conocer información más detallada sobre la gestión de cookies con navegadores web específicos, se puede encontrar en los sitios web respectivos de los navegadores.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Derechos de privacidad de CCPA (No vender mi información personal)</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Según la CCPA, entre otros derechos, los consumidores de California tienen derecho a:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Solicitar que una empresa que recopila datos personales de un consumidor divulgue las categorías y partes específicas de datos personales que una empresa ha recopilado sobre los consumidores.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Solicitar que una empresa elimine cualquier dato personal sobre el consumidor que haya recopilado una empresa.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Solicitar que una empresa que vende los datos personales de un consumidor, no venda los datos personales del consumidor.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Si realiza una solicitud, tenemos un mes para responderle.&nbsp;Si desea ejercer alguno de estos derechos, póngase en contacto con nosotros.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Derechos de protección de datos RGPD</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Nos gustaría asegurarnos de que conoce todos sus derechos de protección de datos.&nbsp;Todo usuario tiene derecho a lo siguiente:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>El derecho de acceso: tiene derecho a solicitar copias de sus datos personales.&nbsp;Es posible que le cobremos una pequeña tarifa por este servicio.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>El derecho a la rectificación: tiene derecho a solicitar que corrijamos cualquier información que crea que es inexacta.&nbsp;También tiene derecho a solicitar que completemos la información que cree que está incompleta.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>El derecho a borrar: tiene derecho a solicitar que eliminemos sus datos personales, bajo ciertas condiciones.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>El derecho a restringir el procesamiento: tiene derecho a solicitar que restrinjamos el procesamiento de sus datos personales, bajo ciertas condiciones.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>El derecho a oponerse al procesamiento: tiene derecho a oponerse a que procesemos sus datos personales, bajo ciertas condiciones.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>El derecho a la portabilidad de datos: tiene derecho a solicitar que transfiramos los datos que hemos recopilado a otra organización, o directamente a usted, bajo ciertas condiciones.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Si realiza una solicitud, tenemos un mes para responderle.&nbsp;Si desea ejercer alguno de estos derechos, póngase en contacto con nosotros.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Información para niños</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Otra parte de nuestra prioridad es agregar protección para los niños mientras usan Internet.&nbsp;Alentamos a los padres y tutores a observar, participar y/o monitorear y guiar su actividad en línea.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>"+name+" no recopila a sabiendas ninguna información de identificación personal de niños menores de 13 años. Si cree que su hijo proporcionó este tipo de información en nuestro sitio web, le recomendamos encarecidamente que se comunique con nosotros de inmediato y haremos todo lo posible para eliminarlo de inmediato. dicha información de nuestros registros.</p>\r\n"
						+ "<!-- /wp:paragraph -->";
				privacyFR="<!-- wp:heading -->\r\n"
						+ "<h2>Politique de confidentialité pour "+name+"</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>À "+name+", accessible à partir "+url+", l'une de nos principales priorités est la vie privée de nos visiteurs. Ce document de politique de confidentialité contient des types d'informations qui sont collectées et enregistrées par "+name+" et comment nous les utilisons.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Si vous avez d'autres questions ou avez besoin de plus d'informations sur notre politique de confidentialité, ne hésitez pas à nous contacter.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Cette politique de confidentialité ne concerne que nos activités en ligne et est valable pour les visiteurs de notre site en ce qui concerne les informations qu'ils ont partagé et / ou Collect dans "+name+". Cette politique ne concerne pas toutes les informations recueillies hors ligne ou via des canaux autres que ce site. Notre politique de confidentialité a été créé avec l'aide du générateur Politique de confidentialité gratuite.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Consentement</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>En utilisant notre site, vous consentez à notre Politique de confidentialité et acceptez les conditions.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Les informations que nous recueillons</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Les renseignements personnels que vous êtes invité à fournir, et les raisons pour lesquelles vous êtes invité à le fournir, sera clair pour vous au point où nous vous demandons de fournir vos renseignements personnels.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Si vous nous contactez directement, nous pouvons recevoir des informations supplémentaires sur vous, comme votre nom, votre adresse e-mail, numéro de téléphone, le contenu du message et / ou pièces jointes que vous pouvez nous envoyer, et toute autre information que vous pouvez choisir de fournir.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Lorsque vous vous inscrivez pour un compte, nous pouvons vous demander vos coordonnées, y compris des éléments tels que le nom, le nom de la société, adresse, adresse e-mail et numéro de téléphone.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Comment utilisons-nous vos informations</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Nous utilisons les informations que nous recueillons de diverses façons, notamment à:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul>\r\n"
						+ "<li>Fournir, exploiter et maintenir notre site Web</li>\r\n"
						+ "<li>Améliorer, personnaliser, et développer notre site Web</li>\r\n"
						+ "<li>Comprendre et analyser la façon dont vous utilisez notre site Web</li>\r\n"
						+ "<li>Développer de nouveaux produits, services, fonctionnalités et fonctionnalité</li>\r\n"
						+ "<li>Communiquer avec vous, que ce soit directement ou par l'un de nos partenaires, y compris pour le service à la clientèle, pour vous fournir des mises à jour et d'autres informations relatives au site, et pour la commercialisation et à des fins promotionnelles</li>\r\n"
						+ "<li>Envoyer des e-mails que vous</li>\r\n"
						+ "<li>Trouvez et prévenir la fraude</li>\r\n"
						+ "</ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2><br />Les fichiers journaux</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>"+name+" suit une procédure standard d'utilisation des fichiers journaux. Ces fichiers journaux visiteurs lorsqu'ils visitent des sites Web. Toutes les sociétés d'hébergement font et une partie de l'hébergement des analyses de services. Les informations recueillies par les fichiers journaux comprennent adresses, type de navigateur, fournisseur de services Internet (ISP), la date et l'horodatage, les pages de référence / sortie protocole Internet (IP), et peut-être le nombre de clics. Ceux-ci ne sont pas liées à des informations personnellement identifiables. Le but de l'information est d'analyser les tendances, administrer le site, le suivi du mouvement des utilisateurs sur le site et la collecte d'informations démographiques.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Cookies et balises Web</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Comme tout autre site Web, cookies de 'utilisations "+name+". Ces cookies sont utilisés pour stocker des informations, y compris les préférences des visiteurs, et les pages du site que le visiteur a accédé ou visitait. L'information est utilisée pour optimiser les d'expérience en personnalisant le contenu de notre page Web basée sur les visiteurs des utilisateurs type de navigateur et / ou d'autres informations.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Pour plus d'informations générales sur les cookies, s'il vous plaît lire l'article Cookies sur Générer site Politique de confidentialité.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Google DoubleClick DART Cookie</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Google est l'un d'un fournisseur tiers sur notre site. Il utilise également des cookies, connu sous le nom des cookies DART, pour diffuser des annonces à nos visiteurs du site en fonction de leur visite à www.website.com et d'autres sites sur Internet. Cependant, les visiteurs peuvent choisir de refuser l'utilisation de cookies DART en visitant les annonces Google et le réseau de contenu Politique de confidentialité à l'adresse suivante de - https://policies.google.com/technologies/ads</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Publicité Partenaires Politique de confidentialité</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Vous pouvez consulter cette liste pour la politique de confidentialité pour chacun des partenaires publicitaires de "+name+".</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>serveurs publicitaires tiers ou réseaux publicitaires utilise des technologies telles que les cookies, JavaScript, ou balises Web qui sont utilisés dans leurs publicités et les liens respectifs qui apparaissent sur "+name+", qui sont envoyés directement au navigateur des utilisateurs. Ils reçoivent automatiquement votre adresse IP lorsque cela se produit. Ces technologies sont utilisées pour mesurer l'efficacité de leurs campagnes de publicité et / ou de personnaliser le contenu publicitaire que vous voyez sur les sites Web que vous visitez.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Notez que "+name+" n'a pas accès ou contrôle sur ces cookies qui sont utilisés par des annonceurs tiers.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Tiers Politiques de confidentialité</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Politique de confidentialité "+name+" ne s'applique pas aux autres annonceurs ou des sites Web. Ainsi, nous vous conseillons de consulter les politiques de confidentialité de ces serveurs publicitaires tiers pour des informations plus détaillées. Il peut comprendre leurs pratiques et des instructions sur la façon de refuser de certaines options.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Vous pouvez choisir de désactiver les cookies à travers vos options de navigation individuelle. Pour en savoir plus d'informations sur la gestion des cookies avec des navigateurs Web, il peut être trouvé sur les sites Web des navigateurs respectifs.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Droits de confidentialité de la CCPA (ne vendez pas mes informations personnelles)</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>En vertu de la CCPA, entre autres droits, les consommateurs de Californie ont le droit de:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul>\r\n"
						+ "<li>Demander une entreprise qui collecte des données personnelles d'un consommateur divulguez les catégories et des pièces spécifiques de données à caractère personnel qu'une entreprise a collectée sur les consommateurs.</li>\r\n"
						+ "<li>Demander qu'une entreprise supprime toutes les données personnelles sur le consommateur qu'une entreprise a collectée.</li>\r\n"
						+ "<li>Demandez à une entreprise qui vend des données personnelles d'un consommateur, ne vend pas les données personnelles du consommateur.</li>\r\n"
						+ "<li>Si vous faites une demande, nous avons un mois pour vous répondre. Si vous souhaitez exercer l'un de ces droits, veuillez nous contacter.</li>\r\n"
						+ "</ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2>Droits de protection des données GDPR</h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Nous aimerions nous assurer que vous êtes pleinement conscient de tous vos droits de protection des données. Chaque utilisateur a droit à ce qui suit:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul>\r\n"
						+ "<li>Le droit d'accéder - vous avez le droit de demander des copies de vos données personnelles. Nous pouvons vous facturer un petit supplément pour ce service.</li>\r\n"
						+ "<li>Le droit à la rectification - vous avez le droit de demander que nous corrigeons toute information que vous croyez est inexacte. Vous avez également le droit de demander que nous complétions les informations que vous croyez sont incomplètes.</li>\r\n"
						+ "<li>Le droit à l'effacement - vous avez le droit de demander que nous effacions vos données personnelles, sous certaines conditions.</li>\r\n"
						+ "<li>Le droit de restreindre le traitement - vous avez le droit de demander que nous limitons le traitement de vos données personnelles, dans certaines conditions.</li>\r\n"
						+ "<li>Le droit d'objecter de traiter - vous avez le droit d'objecter à notre traitement de vos données personnelles, dans certaines conditions.</li>\r\n"
						+ "<li>Le droit à la portabilité des données - vous avez le droit de demander que nous transférons les données que nous avons collectées à une autre organisation ou directement à vous, dans certaines conditions.</li>\r\n"
						+ "<li>Si vous faites une demande, nous avons un mois pour vous répondre. Si vous souhaitez exercer l'un de ces droits, veuillez nous contacter.</li>\r\n"
						+ "</ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading -->\r\n"
						+ "<h2><strong>Information pour enfants</strong></h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Une autre partie de notre priorité est d'ajouter une protection des enfants lors de l'utilisation d'Internet. Nous encourageons les parents et les tuteurs à observer, participer, et / ou surveiller et guider leur activité en ligne.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>"+name+" ne collecte pas sciemment aucune information personnelle identifiable d'enfants de moins de 13 ans. Si vous pensez que votre enfant a fourni ce type d'informations sur notre site Web, nous vous encourageons vivement à nous contacter immédiatement et nous ferons de nos meilleurs efforts pour supprimer rapidement ces informations de nos archives.</p>\r\n"
						+ "<!-- /wp:paragraph -->";
				privacyAR= "<h2 style=\"text-align: right;\">"+name+" سياسة الخصوصية ل</h2>\r\n"
						+ "<p style=\"text-align: right;\">في الموقع الإلكتروني، يمكن الوصول إليه من "+url+"، إحدى أولوياتنا الرئيسية هي خصوصية زوارنا. تحتوي وثيقة سياسة الخصوصية هذه على أنواع من المعلومات التي يتم جمعها وتسجيلها بواسطة موقع الويب وكيف نستخدمها.</p>\r\n"
						+ "<p style=\"text-align: right;\">إذا كانت لديك أسئلة إضافية أو تتطلب مزيدا من المعلومات حول سياسة الخصوصية الخاصة بنا، فلا تتردد في الاتصال بنا.</p>\r\n"
						+ "<p style=\"text-align: right;\">تنطبق سياسة الخصوصية هذه فقط على أنشطتنا عبر الإنترنت وهي صالحة للزوار لموقعنا على الإنترنت فيما يتعلق بالمعلومات التي شاركتها و / أو جمعها في موقع الويب. لا تنطبق هذه السياسة على أي معلومات تم جمعها دون اتصال بالإنترنت أو عبر قنوات أخرى غير هذا الموقع. تم إنشاء سياسة الخصوصية الخاصة بنا بمساعدة مولد سياسة الخصوصية المجانية.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">موافقة</h3>\r\n"
						+ "<p style=\"text-align: right;\">باستخدام موقعنا على شبكة الإنترنت، توافق بموجبه على سياسة الخصوصية الخاصة بنا والموافقة على شروطها.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">المعلومات التي نجمعها</h3>\r\n"
						+ "<p style=\"text-align: right;\">ستتضح لك المعلومات الشخصية التي يطلب منك تقديمها، وأسباب لماذا يطلب منك تقديمها، لك عند النقطة التي نطلب منك تقديم معلوماتك الشخصية.</p>\r\n"
						+ "<p style=\"text-align: right;\">إذا اتصلت بنا مباشرة، فقد نتلقى معلومات إضافية عنك مثل اسمك وعنوان بريدك الإلكتروني ورقم الهاتف ومحتويات الرسالة و / أو المرفقات التي قد ترسلها إلينا وأي معلومات أخرى قد تختارها.</p>\r\n"
						+ "<p style=\"text-align: right;\">عند التسجيل للحصول على حساب، قد نطلب معلومات الاتصال الخاصة بك، بما في ذلك العناصر مثل الاسم واسم الشركة والعنوان وعنوان البريد الإلكتروني ورقم الهاتف.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">كيف نستخدم معلوماتك</h3>\r\n"
						+ "<p style=\"text-align: right;\">نحن نستخدم المعلومات التي نجمعها بطرق مختلفة، بما في ذلك:</p>\r\n"
						+ "<p style=\"text-align: right;\">تقديم، تشغيل، والحفاظ على موقعنا\r\n"
						+ "تحسين وتخصيص وتوسيع موقعنا\r\n"
						+ "فهم وتحليل كيفية استخدام موقعنا\r\n"
						+ "تطوير منتجات وخدمات وميزات جديدة ووظائف\r\n"
						+ "التواصل معك، إما مباشرة أو من خلال أحد شركائنا، بما في ذلك خدمة العملاء، لتزويدك بالتحديثات والمعلومات الأخرى المتعلقة بالموقع، والأغراض التسويقية والترويجية\r\n"
						+ "أرسل لك رسائل البريد الإلكتروني</p>\r\n"
						+ "<p style=\"text-align: right;\">العثور على ومنع الاحتيال</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">سجل الملفات</h3>\r\n"
						+ "<p style=\"text-align: right;\">"+name+" يتبع الإجراء القياسي لاستخدام ملفات السجل. سجل الملفات هذه الزوار عندما يزورون مواقع الويب. تقوم جميع شركات الاستضافة بذلك وجزء من تحليلات خدمات الاستضافة. تتضمن المعلومات التي تم جمعها بواسطة ملفات السجل عناوين بروتوكول الإنترنت (IP)، ونوع المتصفح، ومزود خدمة الإنترنت (ISP)، ويقوم تاريخ التاريخ والوقت، وإشارة / صفحات الخروج، وربما عدد النقرات. هذه غير مرتبطة بأي معلومات يمكن التعرف عليها شخصيا. الغرض من المعلومات هو لتحليل الاتجاهات، وإدارته الموقع، وتتبع حركة المستخدمين على الموقع، وجمع المعلومات الديموغرافية.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">ملفات تعريف الارتباط وبكونات الويب</h3>\r\n"
						+ "<p style=\"text-align: right;\">مثل أي موقع ويب آخر، يستخدم الموقع الإلكتروني \"ملفات تعريف الارتباط\". تستخدم ملفات تعريف الارتباط هذه لتخزين المعلومات بما في ذلك تفضيلات الزوار والصفحات على الموقع الإلكتروني الذي يصل فيه الزائر أو زيارة. يتم استخدام المعلومات لتحسين تجربة المستخدمين من خلال تخصيص محتوى صفحة الويب لدينا بناء على نوع متصفح الزوار و / أو معلومات أخرى.</p>\r\n"
						+ "<p style=\"text-align: right;\">للحصول على مزيد من المعلومات العامة حول ملفات تعريف الارتباط، يرجى قراءة مقالة ملفات تعريف الارتباط على إنشاء موقع سياسة الخصوصية.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">جوجل Doubleclick Dart كوكي</h3>\r\n"
						+ "<p style=\"text-align: right;\">Google هي واحدة من بائع طرف ثالث على موقعنا. يستخدم أيضا ملفات تعريف الارتباط، المعروفة باسم ملفات تعريف الارتباط DART، تخدم الإعلانات إلى زوار موقعنا بناء على زيارتهم إلى "+url+" وغيرها من المواقع على الإنترنت. ومع ذلك، قد يختار الزوار رفض استخدام ملفات تعريف الارتباط DART من خلال زيارة سياسة خصوصية شبكة الإعلانات الخاصة ب Google AD Google في عنوان URL التالي - https://policies.google.com/technologies/ads</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">شركاء الإعلان سياسات الخصوصية</h3>\r\n"
						+ "<p style=\"text-align: right;\">يمكنك استشارة هذه القائمة للعثور على سياسة الخصوصية لكل شريك إعلاني للموقع الإلكتروني.</p>\r\n"
						+ "<p style=\"text-align: right;\">تستخدم خوادم الإعلانات أو الشبكات التجارية الثالثة من التكنولوجيات مثل ملفات تعريف الارتباط أو جافا سكريبت أو منارات الويب المستخدمة في إعلاناتهم وروابطهم التي تظهر على موقع الويب الخاص بهم، والتي يتم إرسالها مباشرة إلى متصفح المستخدمين. تلقوا تلقائيا عنوان IP الخاص بك عند حدوث ذلك. تستخدم هذه التقنيات لقياس فعالية حملاتها الإعلانية و / أو لتخصيص محتوى الإعلان الذي تراه على مواقع الويب التي تزورها.</p>\r\n"
						+ "<p style=\"text-align: right;\">لاحظ أن "+name+" ليس لديه إمكانية الوصول إلى ملفات تعريف الارتباط أو السيطرة عليها التي يتم استخدامها من قبل المعلنين من طرف ثالث.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">سياسات الخصوصية الطرف الثالث</h3>\r\n"
						+ "<p style=\"text-align: right;\">لا تنطبق سياسة الخصوصية الخاصة ب "+name+" على المعلنين الآخرين أو المواقع الإلكترونية. وبالتالي، فإننا ننصح لك بالتشاور مع سياسات الخصوصية المعنية لهذه خوادم الإعلانات الخارجية هذه للحصول على معلومات أكثر تفصيلا. قد تشمل ممارساتها وتعليماتها حول كيفية إلغاء الاشتراك في خيارات معينة.</p>\r\n"
						+ "<p style=\"text-align: right;\">يمكنك اختيار تعطيل ملفات تعريف الارتباط من خلال خيارات المتصفح الفردية. لمعرفة المزيد من المعلومات التفصيلية حول إدارة ملفات تعريف الارتباط باستخدام متصفحات الويب المحددة، يمكن العثور عليها في مواقع الويب المعنية للمتصفحات.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">حقوق الخصوصية CCPA (لا تبيع معلوماتي الشخصية)</h3>\r\n"
						+ "<p style=\"text-align: right;\">بموجب CCPA، من بين الحقوق الأخرى، لدى مستهلكي كاليفورنيا الحق في:</p>\r\n"
						+ "<p style=\"text-align: right;\">طلب أن تقوم شركة بجمع بيانات المستهلك الشخصية بالكشف عن الفئات والقطع المحددة من البيانات الشخصية التي جمعت فيها الأعمال التجارية عن المستهلكين.</p>\r\n"
						+ "<p style=\"text-align: right;\">طلب عمل تجاري حذف أي بيانات شخصية حول المستهلك الذي جمعه أعمالا.</p>\r\n"
						+ "<p style=\"text-align: right;\">طلب أن الأعمال التجارية التي تبيع بيانات المستهلك الشخصية، وليس بيع البيانات الشخصية للمستهلك.</p>\r\n"
						+ "<p style=\"text-align: right;\">إذا قمت بطلب طلب، لدينا شهر واحد للرد عليك. إذا كنت ترغب في ممارسة أي من هذه الحقوق، يرجى الاتصال بنا.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">حقوق حماية البيانات GDPR</h3>\r\n"
						+ "<p style=\"text-align: right;\">نود أن نتأكد من أنك تدرك تماما جميع حقوق حماية البيانات الخاصة بك. يحق لكل مستخدم ما يلي:</p>\r\n"
						+ "<p style=\"text-align: right;\">الحق في الوصول - لديك الحق في طلب نسخ من بياناتك الشخصية. قد نفرض عليك رسوما صغيرة لهذه الخدمة.</p>\r\n"
						+ "<p style=\"text-align: right;\">الحق في التصحيح - لديك الحق في طلب أن نقوم بتصحيح أي معلومات تعتقد أنها غير دقيقة. لديك أيضا الحق في طلب أن نكمل المعلومات التي تعتقد أنها غير مكتملة.</p>\r\n"
						+ "<p style=\"text-align: right;\">الحق في المحور - لديك الحق في طلب أن نقوم بمسح بياناتك الشخصية، في ظل ظروف معينة.</p>\r\n"
						+ "<p style=\"text-align: right;\">الحق في تقييد المعالجة - لديك الحق في طلب تقييد معالجة بياناتك الشخصية، في ظل ظروف معينة.</p>\r\n"
						+ "<p style=\"text-align: right;\">الحق في الاعتراض على المعالجة - لديك الحق في الاعتراض على معالجتنا لبياناتنا الشخصية، في ظل ظروف معينة.</p>\r\n"
						+ "<p style=\"text-align: right;\">الحق في قابلية البيانات - لديك الحق في طلب نقل البيانات التي جمعناها إلى مؤسسة أخرى، أو مباشرة إليك، في ظل ظروف معينة.</p>\r\n"
						+ "<p style=\"text-align: right;\">إذا قمت بطلب طلب، لدينا شهر واحد للرد عليك. إذا كنت ترغب في ممارسة أي من هذه الحقوق، يرجى الاتصال بنا.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">معلومات الأطفال</h3>\r\n"
						+ "<p style=\"text-align: right;\">جزء آخر من أولويتنا هو إضافة حماية للأطفال أثناء استخدام الإنترنت. نحن نشجع الآباء والأوصياء على مراقبة المشاركين و / أو رصد وتوجيه نشاطهم عبر الإنترنت.</p>\r\n"
						+ "<p style=\"text-align: right;\">"+name+" لا يجمع أي معلومات شخصية محددة من الأطفال دون سن 13. إذا كنت تعتقد أن طفلك قد قدم هذا النوع من المعلومات على موقعنا، فإننا نشجعك بشدة على الاتصال بنا على الفور وسنبذل قصارى جهدنا لإزالة هذه المعلومات من سجلاتنا</p>";
				privacyENG="<h1>Privacy Policy for "+name+"</h1>\r\n"
						+ "\r\n"
						+ "<p>At "+name+", accessible from "+url+", one of our main priorities is the privacy of our visitors. This Privacy Policy document contains types of information that is collected and recorded by "+name+" and how we use it.</p>\r\n"
						+ "\r\n"
						+ "<p>If you have additional questions or require more information about our Privacy Policy, do not hesitate to contact us.</p>\r\n"
						+ "\r\n"
						+ "<p>This Privacy Policy applies only to our online activities and is valid for visitors to our website with regards to the information that they shared and/or collect in "+name+". This policy is not applicable to any information collected offline or via channels other than this website. Our Privacy Policy was created with the help of the <a href=\"https://www.privacypolicygenerator.info\">Free Privacy Policy Generator</a>.</p>\r\n"
						+ "\r\n"
						+ "<h2>Consent</h2>\r\n"
						+ "\r\n"
						+ "<p>By using our website, you hereby consent to our Privacy Policy and agree to its terms.</p>\r\n"
						+ "\r\n"
						+ "<h2>Information we collect</h2>\r\n"
						+ "\r\n"
						+ "<p>The personal information that you are asked to provide, and the reasons why you are asked to provide it, will be made clear to you at the point we ask you to provide your personal information.</p>\r\n"
						+ "<p>If you contact us directly, we may receive additional information about you such as your name, email address, phone number, the contents of the message and/or attachments you may send us, and any other information you may choose to provide.</p>\r\n"
						+ "<p>When you register for an Account, we may ask for your contact information, including items such as name, company name, address, email address, and telephone number.</p>\r\n"
						+ "\r\n"
						+ "<h2>How we use your information</h2>\r\n"
						+ "\r\n"
						+ "<p>We use the information we collect in various ways, including to:</p>\r\n"
						+ "\r\n"
						+ "<ul>\r\n"
						+ "<li>Provide, operate, and maintain our website</li>\r\n"
						+ "<li>Improve, personalize, and expand our website</li>\r\n"
						+ "<li>Understand and analyze how you use our website</li>\r\n"
						+ "<li>Develop new products, services, features, and functionality</li>\r\n"
						+ "<li>Communicate with you, either directly or through one of our partners, including for customer service, to provide you with updates and other information relating to the website, and for marketing and promotional purposes</li>\r\n"
						+ "<li>Send you emails</li>\r\n"
						+ "<li>Find and prevent fraud</li>\r\n"
						+ "</ul>\r\n"
						+ "\r\n"
						+ "<h2>Log Files</h2>\r\n"
						+ "\r\n"
						+ "<p>"+name+" follows a standard procedure of using log files. These files log visitors when they visit websites. All hosting companies do this and a part of hosting services' analytics. The information collected by log files include internet protocol (IP) addresses, browser type, Internet Service Provider (ISP), date and time stamp, referring/exit pages, and possibly the number of clicks. These are not linked to any information that is personally identifiable. The purpose of the information is for analyzing trends, administering the site, tracking users' movement on the website, and gathering demographic information.</p>\r\n"
						+ "\r\n"
						+ "<h2>Cookies and Web Beacons</h2>\r\n"
						+ "\r\n"
						+ "<p>Like any other website, "+name+" uses 'cookies'. These cookies are used to store information including visitors' preferences, and the pages on the website that the visitor accessed or visited. The information is used to optimize the users' experience by customizing our web page content based on visitors' browser type and/or other information.</p>\r\n"
						+ "\r\n"
						+ "<p>For more general information on cookies, please read <a href=\"https://www.generateprivacypolicy.com/#cookies\">the Cookies article on Generate Privacy Policy website</a>.</p>\r\n"
						+ "\r\n"
						+ "<h2>Google DoubleClick DART Cookie</h2>\r\n"
						+ "\r\n"
						+ "<p>Google is one of a third-party vendor on our site. It also uses cookies, known as DART cookies, to serve ads to our site visitors based upon their visit to www.website.com and other sites on the internet. However, visitors may choose to decline the use of DART cookies by visiting the Google ad and content network Privacy Policy at the following URL – <a href=\"https://policies.google.com/technologies/ads\">https://policies.google.com/technologies/ads</a></p>\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "<h2>Advertising Partners Privacy Policies</h2>\r\n"
						+ "\r\n"
						+ "<P>You may consult this list to find the Privacy Policy for each of the advertising partners of "+name+".</p>\r\n"
						+ "\r\n"
						+ "<p>Third-party ad servers or ad networks uses technologies like cookies, JavaScript, or Web Beacons that are used in their respective advertisements and links that appear on "+name+", which are sent directly to users' browser. They automatically receive your IP address when this occurs. These technologies are used to measure the effectiveness of their advertising campaigns and/or to personalize the advertising content that you see on websites that you visit.</p>\r\n"
						+ "\r\n"
						+ "<p>Note that "+name+" has no access to or control over these cookies that are used by third-party advertisers.</p>\r\n"
						+ "\r\n"
						+ "<h2>Third Party Privacy Policies</h2>\r\n"
						+ "\r\n"
						+ "<p>"+name+"'s Privacy Policy does not apply to other advertisers or websites. Thus, we are advising you to consult the respective Privacy Policies of these third-party ad servers for more detailed information. It may include their practices and instructions about how to opt-out of certain options. </p>\r\n"
						+ "\r\n"
						+ "<p>You can choose to disable cookies through your individual browser options. To know more detailed information about cookie management with specific web browsers, it can be found at the browsers' respective websites.</p>\r\n"
						+ "\r\n"
						+ "<h2>CCPA Privacy Rights (Do Not Sell My Personal Information)</h2>\r\n"
						+ "\r\n"
						+ "<p>Under the CCPA, among other rights, California consumers have the right to:</p>\r\n"
						+ "<p>Request that a business that collects a consumer's personal data disclose the categories and specific pieces of personal data that a business has collected about consumers.</p>\r\n"
						+ "<p>Request that a business delete any personal data about the consumer that a business has collected.</p>\r\n"
						+ "<p>Request that a business that sells a consumer's personal data, not sell the consumer's personal data.</p>\r\n"
						+ "<p>If you make a request, we have one month to respond to you. If you would like to exercise any of these rights, please contact us.</p>\r\n"
						+ "\r\n"
						+ "<h2>GDPR Data Protection Rights</h2>\r\n"
						+ "\r\n"
						+ "<p>We would like to make sure you are fully aware of all of your data protection rights. Every user is entitled to the following:</p>\r\n"
						+ "<p>The right to access – You have the right to request copies of your personal data. We may charge you a small fee for this service.</p>\r\n"
						+ "<p>The right to rectification – You have the right to request that we correct any information you believe is inaccurate. You also have the right to request that we complete the information you believe is incomplete.</p>\r\n"
						+ "<p>The right to erasure – You have the right to request that we erase your personal data, under certain conditions.</p>\r\n"
						+ "<p>The right to restrict processing – You have the right to request that we restrict the processing of your personal data, under certain conditions.</p>\r\n"
						+ "<p>The right to object to processing – You have the right to object to our processing of your personal data, under certain conditions.</p>\r\n"
						+ "<p>The right to data portability – You have the right to request that we transfer the data that we have collected to another organization, or directly to you, under certain conditions.</p>\r\n"
						+ "<p>If you make a request, we have one month to respond to you. If you would like to exercise any of these rights, please contact us.</p>\r\n"
						+ "\r\n"
						+ "<h2>Children's Information</h2>\r\n"
						+ "\r\n"
						+ "<p>Another part of our priority is adding protection for children while using the internet. We encourage parents and guardians to observe, participate in, and/or monitor and guide their online activity.</p>\r\n"
						+ "\r\n"
						+ "<p>"+name+" does not knowingly collect any Personal Identifiable Information from children under the age of 13. If you think that your child provided this kind of information on our website, we strongly encourage you to contact us immediately and we will do our best efforts to promptly remove such information from our records.</p>";
				
				if (rdbtnNewRadioButton.isSelected()) {privacy=privacyENG;
				privacyn="Privacy policy";
				}
				else if (rdbtnNewRadioButton_1.isSelected()) {privacy=privacyFR;
				privacyn="Politique de confidentialité";
				}
				else if( rdbtnNewRadioButton_2.isSelected()) {privacy=privacyESP;
				privacyn="política de privacidad";
				
				}
				else if( rdbtnNewRadioButton_3.isSelected()) {privacy=privacyJP;}
				else if( rdbtnNewRadioButton_4.isSelected()) {privacy=privacyAR;}
				
			}
		});
		btnNewButton.setBounds(34, 316, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Terms");
		btnNewButton_1.addActionListener(new ActionListener() {
			private String termsENG;
			private String termsFR;
			private String termsESP;
			private String termsJP;
			private String termsAR;
			private String url;
			private String name;
			private String email;

			public void actionPerformed(ActionEvent e) {
				url=textField_2.getText();
				name=textField.getText();
				email=textField_1.getText();
				termsESP="<!-- wp:heading -->\r\n"
						+ "<h2><strong>Términos y condiciones</strong></h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>¡Bienvenido a "+name+"!</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Estos términos y condiciones describen las reglas y regulaciones para el uso del sitio web de "+name+", ubicado en "+url+".</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Al acceder a este sitio web asumimos que acepta estos términos y condiciones.&nbsp;No continúe utilizando "+name+" si no está de acuerdo con todos los términos y condiciones establecidos en esta página.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>La siguiente terminología se aplica a estos Términos y condiciones, Declaración de privacidad y Aviso de exención de responsabilidad y todos los Acuerdos: \"Cliente\", \"Usted\" y \"Su\" se refieren a usted, la persona que inicia sesión en este sitio web y cumple con los términos y condiciones de la Compañía.&nbsp;\"La Compañía\", \"Nosotros mismos\", \"Nosotros\", \"Nuestro\" y \"Nosotros\", se refiere a nuestra Compañía.&nbsp;\"Parte\", \"Partes\" o \"Nosotros\", se refiere tanto al Cliente como a nosotros mismos.&nbsp;Todos los términos se refieren a la oferta, aceptación y consideración del pago necesario para llevar a cabo el proceso de nuestra asistencia al Cliente de la manera más adecuada con el propósito expreso de satisfacer las necesidades del Cliente con respecto a la prestación de los servicios indicados por la Compañía, de conformidad con y sujeto a la legislación vigente de los Países Bajos.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading {\"level\":3} -->\r\n"
						+ "<h3><strong>Galletas</strong></h3>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Empleamos el uso de cookies.&nbsp;Al acceder al sitio web_w, usted aceptó usar cookies de acuerdo con la Política de privacidad de "+name+".</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>La mayoría de los sitios web interactivos utilizan cookies para permitirnos recuperar los detalles del usuario para cada visita.&nbsp;Nuestro sitio web utiliza cookies para habilitar la funcionalidad de ciertas áreas para que sea más fácil para las personas que visitan nuestro sitio web.&nbsp;Algunos de nuestros socios afiliados/publicitarios también pueden usar cookies.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading {\"level\":3} -->\r\n"
						+ "<h3><strong>Licencia</strong></h3>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>A menos que se indique lo contrario, "+name+" y/o sus licenciantes poseen los derechos de propiedad intelectual de todo el material del sitio web_w.&nbsp;Todos los derechos de propiedad intelectual están reservados.&nbsp;Puede acceder a esto desde "+name+" para su uso personal sujeto a las restricciones establecidas en estos términos y condiciones.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>No debes:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>Volver a publicar material del sitio web_w</li><li>Vender, alquilar o sublicenciar material de "+name+"</li><li>Reproducir, duplicar o copiar material del sitio web_w</li><li>Redistribuir contenido de "+name+"</li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Este Acuerdo comenzará en la fecha del mismo.&nbsp;Nuestros Términos y Condiciones fueron creados con la ayuda de la&nbsp;<a href=\"https://translate.google.com/website?sl=en&amp;tl=es&amp;hl=fr&amp;client=webapp&amp;u=https://www.privacypolicies.com/blog/sample-terms-conditions-template/\">Plantilla de Términos y Condiciones</a>&nbsp;.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Partes de este sitio web ofrecen una oportunidad para que los usuarios publiquen e intercambien opiniones e información en ciertas áreas del sitio web.&nbsp;"+name+" no filtra, edita, publica ni revisa los Comentarios antes de su presencia en el sitio web.&nbsp;Los comentarios no reflejan los puntos de vista y opiniones de "+name+", sus agentes y/o afiliados.&nbsp;Los comentarios reflejan los puntos de vista y las opiniones de la persona que publica sus puntos de vista y opiniones.&nbsp;En la medida permitida por las leyes aplicables, "+name+" no será responsable de los Comentarios ni de ninguna obligación, daño o gasto causado y/o sufrido como resultado de cualquier uso y/o publicación y/o aparición de los Comentarios en este sitio web.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>"+name+" se reserva el derecho de monitorear todos los Comentarios y eliminar cualquier Comentario que pueda considerarse inapropiado, ofensivo o que cause el incumplimiento de estos Términos y Condiciones.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Usted garantiza y declara que:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>Tiene derecho a publicar los Comentarios en nuestro sitio web y tiene todas las licencias y consentimientos necesarios para hacerlo;</li><li>Los Comentarios no invaden ningún derecho de propiedad intelectual, incluidos, entre otros, derechos de autor, patentes o marcas comerciales de terceros;</li><li>Los Comentarios no contienen ningún material difamatorio, calumnioso, ofensivo, indecente o ilegal que sea una invasión de la privacidad.</li><li>Los Comentarios no se utilizarán para solicitar o promover negocios o costumbres o presentar actividades comerciales o actividades ilegales.</li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Por la presente, otorga a "+name+" una licencia no exclusiva para usar, reproducir, editar y autorizar a otros a usar, reproducir y editar cualquiera de sus Comentarios en cualquiera y todas las formas, formatos o medios.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading {\"level\":3} -->\r\n"
						+ "<h3><strong>Hipervínculos a nuestro contenido</strong></h3>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Las siguientes organizaciones pueden vincular a nuestro sitio web sin aprobación previa por escrito:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>Agencias gubernamentales;</li><li>Los motores de búsqueda;</li><li>Organizaciones de noticias;</li><li>Los distribuidores de directorios en línea pueden vincularse a nuestro sitio web de la misma manera que vinculan a los sitios web de otras empresas enumeradas;&nbsp;y</li><li>Empresas acreditadas en todo el sistema, excepto las organizaciones sin fines de lucro que solicitan, centros comerciales de caridad y grupos de recaudación de fondos de caridad que no pueden tener un hipervínculo a nuestro sitio web.</li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Estas organizaciones pueden vincular a nuestra página de inicio, publicaciones u otra información del sitio web siempre que el enlace: (a) no sea engañoso de ninguna manera;&nbsp;(b) no implica falsamente patrocinio, respaldo o aprobación de la parte vinculada y sus productos y/o servicios;&nbsp;y (c) encaja dentro del contexto del sitio de la parte vinculada.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Podemos considerar y aprobar otras solicitudes de enlace de los siguientes tipos de organizaciones:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>fuentes de información comercial y/o de consumo comúnmente conocidas;</li><li>sitios de la comunidad dot.com;</li><li>asociaciones u otros grupos que representen organizaciones benéficas;</li><li>distribuidores de directorios en línea;</li><li>portales de internet;</li><li>firmas de contabilidad, leyes y consultoría;&nbsp;y</li><li>instituciones educativas y asociaciones comerciales.</li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Aprobaremos las solicitudes de enlace de estas organizaciones si decidimos que: (a) el enlace no nos haría ver desfavorablemente a nosotros mismos oa nuestros negocios acreditados;&nbsp;(b) la organización no tiene registros negativos con nosotros;&nbsp;(c) el beneficio para nosotros de la visibilidad del hipervínculo compensa la ausencia de "+name+";&nbsp;y (d) el enlace está en el contexto de información general de recursos.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Estas organizaciones pueden vincular a nuestra página de inicio siempre que el enlace: (a) no sea engañoso de ninguna manera;&nbsp;(b) no implica falsamente patrocinio, respaldo o aprobación de la parte vinculada y sus productos o servicios;&nbsp;y (c) encaja dentro del contexto del sitio de la parte vinculada.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Si usted es una de las organizaciones enumeradas en el párrafo 2 anterior y está interesado en vincularse a nuestro sitio web, debe informarnos enviando un correo electrónico a "+name+".&nbsp;Incluya su nombre, el nombre de su organización, la información de contacto, así como la URL de su sitio, una lista de las URL desde las que pretende vincular a nuestro sitio web y una lista de las URL de nuestro sitio a las que le gustaría Enlace.&nbsp;Espere 2-3 semanas para una respuesta.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Las organizaciones aprobadas pueden tener hipervínculos a nuestro sitio web de la siguiente manera:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>Mediante el uso de nuestro nombre corporativo;&nbsp;o</li><li>Mediante el uso del localizador uniforme de recursos al que se vincula;&nbsp;o</li><li>Mediante el uso de cualquier otra descripción de nuestro sitio web vinculado que tenga sentido dentro del contexto y el formato del contenido en el sitio de la parte vinculada.</li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>No se permitirá el uso del logotipo de "+name+" u otra obra de arte para vincular en ausencia de un acuerdo de licencia de marca registrada.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading {\"level\":3} -->\r\n"
						+ "<h3><strong>marcos flotantes</strong></h3>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Sin aprobación previa y permiso por escrito, no puede crear marcos alrededor de nuestras páginas web que alteren de ninguna manera la presentación visual o la apariencia de nuestro sitio web.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading {\"level\":3} -->\r\n"
						+ "<h3><strong>Responsabilidad por el contenido</strong></h3>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>No seremos responsables de ningún contenido que aparezca en su sitio web.&nbsp;Usted acepta protegernos y defendernos contra todos los reclamos que surjan en su sitio web.&nbsp;Ningún enlace debe aparecer en ningún sitio web que pueda interpretarse como calumnioso, obsceno o criminal, o que infrinja, de otro modo viole o promueva la infracción u otra violación de los derechos de terceros.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading {\"level\":3} -->\r\n"
						+ "<h3><strong>Tu privacidad</strong></h3>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Por favor, lea la Política de Privacidad</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading {\"level\":3} -->\r\n"
						+ "<h3><strong>Reserva de Derechos</strong></h3>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Nos reservamos el derecho de solicitarle que elimine todos los enlaces o cualquier enlace particular a nuestro sitio web.&nbsp;Usted aprueba eliminar inmediatamente todos los enlaces a nuestro sitio web a pedido.&nbsp;También nos reservamos el derecho de modificar estos términos y condiciones y su política de vinculación en cualquier momento.&nbsp;Al vincularse continuamente a nuestro sitio web, usted acepta estar sujeto y seguir estos términos y condiciones de vinculación.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading {\"level\":3} -->\r\n"
						+ "<h3><strong>Eliminación de enlaces de nuestro sitio web</strong></h3>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Si encuentra algún enlace en nuestro sitio web que sea ofensivo por cualquier motivo, puede contactarnos e informarnos en cualquier momento.&nbsp;Consideraremos solicitudes para eliminar enlaces, pero no estamos obligados a hacerlo ni a responderle directamente.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>No aseguramos que la información en este sitio web sea correcta, no garantizamos su integridad o exactitud;&nbsp;ni prometemos garantizar que el sitio web permanezca disponible o que el material del sitio web se mantenga actualizado.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading {\"level\":3} -->\r\n"
						+ "<h3><strong>Descargo de responsabilidad</strong></h3>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>En la máxima medida permitida por la ley aplicable, excluimos todas las representaciones, garantías y condiciones relacionadas con nuestro sitio web y el uso de este sitio web.&nbsp;Nada en este descargo de responsabilidad:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>limitar o excluir nuestra o su responsabilidad por muerte o lesiones personales;</li><li>limitar o excluir nuestra o su responsabilidad por fraude o tergiversación fraudulenta;</li><li>limitar cualquiera de nuestras responsabilidades o las suyas de cualquier manera que no esté permitida por la ley aplicable;&nbsp;o</li><li>excluir cualquiera de nuestras o sus responsabilidades que no puedan ser excluidas bajo la ley aplicable.</li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Las limitaciones y prohibiciones de responsabilidad establecidas en esta Sección y en otras partes de este descargo de responsabilidad: (a) están sujetas al párrafo anterior;&nbsp;y (b) rigen todas las responsabilidades que surjan en virtud de la exención de responsabilidad, incluidas las responsabilidades que surjan por contrato, agravio y por incumplimiento del deber legal.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>Siempre que el sitio web y la información y los servicios en el sitio web se proporcionen de forma gratuita, no seremos responsables de ninguna pérdida o daño de ningún tipo.</p>\r\n"
						+ "<!-- /wp:paragraph -->";
				termsFR="<h2>Termes et conditions</h2>\r\n"
						+ "Bienvenue à "+name+"!\r\n"
						+ "\r\n"
						+ "Ces termes et conditions décrivent les règles et règlements d'utilisation du site Web "+name+"A, situé à "+url+".\r\n"
						+ "\r\n"
						+ "En accédant à ce site Web, nous supposons que vous acceptez ces termes et conditions. Ne continuez pas à utiliser "+name+" Si vous n'acceptez pas de prendre toutes les termes et conditions énoncées sur cette page.\r\n"
						+ "\r\n"
						+ "La terminologie suivante s'applique à ces termes et conditions, déclaration de confidentialité et avis de responsabilité de non-responsabilité et à tous les accords: \"Client\", \"You\" et \"VOTRE\" se réfèrent à vous, la personne connecte ce site Web et conforme aux conditions générales de la société. \"La société\", \"nous-mêmes\", \"nous\", \"notre\" et \"nous\", fait référence à notre entreprise. «Parti», «Parties», ou «US», fait référence à la fois au client et à nous-mêmes. Tous les termes font référence à l'offre, à l'acceptation et à l'examen du paiement nécessaire pour entreprendre le processus de notre assistance au client de la manière la plus appropriée à l'objectif exprès de répondre aux besoins du client en ce qui concerne la fourniture des services déclarés de la société, conformément à et sous réserve du droit dominant des Pays-Bas. Toute utilisation de la terminologie ci-dessus ou d'autres termes du singulier, du pluriel, de la capitalisation et / ou de lui-même, sont considérées comme interchangeables et par conséquent comme désignées.\r\n"
						+ "<h3><strong>Cookies</strong></h3>\r\n"
						+ "Nous utilisons l'utilisation de cookies. En accédant à "+name+", vous avez accepté d'utiliser des cookies en accord avec la politique de confidentialité de "+name+".\r\n"
						+ "\r\n"
						+ "La plupart des sites Web interactifs utilisent des cookies pour nous permettre de récupérer les détails de l'utilisateur pour chaque visite. Les cookies sont utilisés par notre site Web pour permettre aux fonctionnalités de certaines zones de faciliter la visite des personnes visitant notre site Web. Certains de nos partenaires d'affiliation / publicité peuvent également utiliser des cookies.\r\n"
						+ "<h3><strong>License</strong></h3>\r\n"
						+ "Sauf indication contraire, "+name+" et / ou ses licencieurs possèdent les droits de propriété intellectuelle pour tous les documents sur "+name+". Tous les droits de propriété intellectuelle sont réservés. Vous pouvez y accéder à "+name+" pour votre propre usage personnel soumis à des restrictions définies dans les présentes conditions générales.\r\n"
						+ "\r\n"
						+ "Il ne faut pas:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>Republier du matériel d'"+name+"</li>\r\n"
						+ " 	<li>Vendre, louer ou sous-licence de matériel d'"+name+"</li>\r\n"
						+ " 	<li>Reproduire, dupliquer ou copier le matériel d'"+name+"</li>\r\n"
						+ " 	<li>Redistribuer le contenu de "+name+"</li>\r\n"
						+ "</ul>\r\n"
						+ "Cet accord commence à la date du présent. Nos termes et conditions ont été créés à l'aide du modèle Termes et Conditions.\r\n"
						+ "\r\n"
						+ "Certaines parties de ce site offrent une opportunité pour les utilisateurs de poster et d'échanger des opinions et des informations dans certains domaines du site Web. "+name+" ne filtre pas, modifie, publie ou examine les commentaires avant leur présence sur le site Web. Les commentaires ne reflètent pas les points de vue et opinions d'"+name+", de ses agents et / ou d'affiliés. Les commentaires reflètent les points de vue et les opinions de la personne qui affichent leurs points de vue et leurs opinions. Dans la mesure permise par les lois applicables, "+name+" ne sera pas responsable des commentaires ou de toute responsabilité, dommages-intérêts ou charges causés et / ou subi à la suite d'une utilisation et / ou d'une apparence de commentaires sur cette site Internet.\r\n"
						+ "\r\n"
						+ ""+name+" se réserve le droit de surveiller tous les commentaires et de supprimer tous les commentaires pouvant être considérés comme inappropriés, offensants ou causant une violation de ces termes et conditions.\r\n"
						+ "\r\n"
						+ "Vous garantissez et représentez que:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>Vous avez le droit de poster les commentaires sur notre site Web et que toutes les licences nécessaires et consentent à le faire;</li>\r\n"
						+ " 	<li>Les commentaires n'envahirent aucun droit de propriété intellectuelle, y compris sans limitation du droit d'auteur, du brevet ou de la marque de tiers;</li>\r\n"
						+ " 	<li>Les commentaires ne contiennent aucun matériau diffamatoire, indécent, offensant, indécent ou autrement illégal qui est une invasion de la vie privée</li>\r\n"
						+ " 	<li>Les commentaires ne seront pas utilisés pour solliciter ou promouvoir des activités commerciales ou personnalisées ou présentes ou une activité illégale.\r\n"
						+ "\r\n"
						+ "Vous accordez une licence non exclusive "+name+" à utiliser, reproduire, éditer et autoriser d'autres personnes à utiliser, reproduire et éditer l'un de vos commentaires sur tous les formulaires, formats ou supports.</li>\r\n"
						+ "</ul>\r\n"
						+ "<h3>Hyperlinking à notre contenu</h3>\r\n"
						+ "Les organisations suivantes peuvent créer un lien vers notre site Web sans approbation écrite préalable:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>Organismes gouvernementaux;</li>\r\n"
						+ " 	<li>Moteurs de recherche;</li>\r\n"
						+ " 	<li>Organisations de presse;</li>\r\n"
						+ " 	<li>Les distributeurs de répertoires en ligne peuvent créer un lien vers notre site Web de la même manière que les liens hypertexte vers les sites Web d'autres entreprises cotées; et</li>\r\n"
						+ " 	<li>Système large d'entreprises accréditées, à l'exception de la sollicitation d'organisations à but non lucratif, de centres commerciaux de charité et de groupes de collecte de fonds de charité qui ne peuvent pas lier à notre site Web.</li>\r\n"
						+ "</ul>\r\n"
						+ "Ces organisations peuvent créer un lien vers notre page d'accueil, des publications ou d'autres informations sur le site Web tant que le lien: (a) n'est en aucune manière trompeuse; (b) n'implique pas faussement le parrainage, l'endossement ou l'approbation de la partie de liaison et de ses produits et / ou services; et (c) convient dans le contexte du site de la partie de liaison.\r\n"
						+ "\r\n"
						+ "Nous pouvons envisager et approuver d'autres demandes de liaison des types d'organisations suivantes:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>sources de consommateurs et / ou d'informations commerciales communément connues;</li>\r\n"
						+ " 	<li>Dot.com Sites communautaires;</li>\r\n"
						+ " 	<li>associations ou autres groupes représentant des organismes de bienfaisance;</li>\r\n"
						+ " 	<li>Distributeurs de répertoires en ligne;</li>\r\n"
						+ " 	<li>Portails Internet;</li>\r\n"
						+ " 	<li>Comptabilité, droit et cabinet de conseil; et</li>\r\n"
						+ " 	<li>établissements d'enseignement et associations professionnelles.</li>\r\n"
						+ "</ul>\r\n"
						+ "Nous approuverrons des demandes de liaison de ces organisations si nous décidons que: (a) le lien ne nous ferait pas regarder de manière défavorable à nous-mêmes ou à nos entreprises agréées; (b) l'organisation n'a aucun dossier négatif avec nous; (c) le bénéfice de la visibilité de l'hyperlien compense l'absence d'"+name+"; et (d) le lien est dans le contexte des informations générales des ressources.\r\n"
						+ "\r\n"
						+ "Ces organisations peuvent créer un lien vers notre page d'accueil tant que le lien: (a) n'est en aucune manière trompeuse; (b) n'implique pas faussement le parrainage, l'endossement ou l'approbation de la partie de liaison et de ses produits ou services; et (c) convient dans le contexte du site de la partie de liaison.\r\n"
						+ "\r\n"
						+ "Si vous êtes l'une des organisations énumérées au paragraphe 2 ci-dessus et que vous êtes intéressé à la liaison à notre site Web, vous devez nous informer en envoyant un courrier électronique à "+name+". Veuillez inclure votre nom, votre nom d'organisation, vos coordonnées ainsi que l'URL de votre site, une liste des URL à partir de laquelle vous avez l'intention de créer un lien vers notre site Web et une liste des URL sur notre site auquel vous souhaitez que vous souhaitiez. lien. Attendez 2-3 semaines pour une réponse.\r\n"
						+ "\r\n"
						+ "Les organisations approuvées peuvent hyperliens vers notre site Web comme suit:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>En utilisant notre nom d'entreprise; ou</li>\r\n"
						+ " 	<li>En utilisant le localisateur de ressources uniformes liés à; ou</li>\r\n"
						+ " 	<li>En utilisant toute autre description de notre site Web étant liée à celle qui est logique dans le contexte et le format du contenu sur le site de la partie de liaison.</li>\r\n"
						+ "</ul>\r\n"
						+ "Aucune utilisation du logo d'"+name+" ou d'autres œuvres d'art ne sera autorisée à lier une convention de licence de marque absente.\r\n"
						+ "\r\n"
						+ "<strong>iFrames</strong>\r\n"
						+ "\r\n"
						+ "Sans l'approbation préalable et l'autorisation écrite, vous ne pouvez pas créer de cadres autour de nos pages Web qui modifient de quelque manière que ce soit la présentation visuelle ou l'apparence de notre site Web.\r\n"
						+ "<h3>Responsabilité du contenu</h3>\r\n"
						+ "Nous ne serons pas responsables de tout contenu qui apparaît sur votre site Web. Vous acceptez de vous protéger et de vous défendre contre toutes les revendications qui augmentent sur votre site Web. Aucun lien ne devrait apparaître sur tout site Web pouvant être interprété comme diffamé, obscène ou criminel, ou qui enfreint, sinon viole ou défend la violation ou toute autre violation des droits tiers.\r\n"
						+ "<h3>Votre confidentialité</h3>\r\n"
						+ "Veuillez lire la politique de confidentialité\r\n"
						+ "<h3>Réservation de droits</h3>\r\n"
						+ "Nous nous réservons le droit de demander que vous supprimez tous les liens ou tout lien particulier vers notre site Web. Vous approuvez de supprimer immédiatement tous les liens vers notre site Web sur demande. Nous nous réservons également le droit d'Amener ces termes et conditions et il s'agit de la politique à tout moment. En liant continuellement sur notre site Web, vous acceptez d'être lié et suivez ces conditions de liaison.\r\n"
						+ "<h3>Suppression des liens de notre site web</h3>\r\n"
						+ "Si vous trouvez un lien sur notre site Web offensant pour une raison quelconque, vous êtes libre de contacter et de nous informer à tout moment. Nous examinerons les demandes de supprimer des liens, mais nous ne sommes pas obligés de vous ou de vous répondre directement.\r\n"
						+ "\r\n"
						+ "Nous ne nous assurons pas que les informations sur ce site Web soient correctes, nous ne garantissons pas sa complétude ou sa précision; Nous ne promettons pas non plus de veiller à ce que le site Web reste disponible ou que le matériel sur le site Web soit tenu à jour.\r\n"
						+ "<h3>Avertissement</h3>\r\n"
						+ "Dans la mesure maximale autorisée par la loi applicable, nous excluons toutes les représentations, les garanties et les conditions relatives à notre site Web et à l'utilisation de ce site Web. Rien dans ce disclaimer ne:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>limiter ou exclure notre responsabilité pour la mort ou la blessure corporelle;</li>\r\n"
						+ " 	<li>limiter ou exclure notre obligation de fraude ou de déformation frauduleuse;</li>\r\n"
						+ " 	<li>limiter l'un de nos responsabilités de quelque manière que ce soit de quelque manière que ce soit, qui n'est pas autorisée en vertu de la loi applicable; ou</li>\r\n"
						+ " 	<li>Exclure l'un de nos passifs ou de vos passifs qui pourraient ne pas être exclus en vertu de la loi applicable.</li>\r\n"
						+ "</ul>\r\n"
						+ "Les limitations et interdictions de responsabilité fixées dans la présente section et ailleurs dans la présente dénoncé de non-responsabilité: a) sont soumis au paragraphe précédent; et (b) régir tous les passifs résultant de la responsabilité de non-responsabilité, y compris des passifs découlant du contrat, dans le délit et pour violation des droits légaux.\r\n"
						+ "\r\n"
						+ "Tant que le site Web et les informations et services sur le site Web sont fournis gratuitement, nous ne serons pas responsables de la perte ou des dommages d'une nature.\r\n"
						+ "<div class=\"jfk-bubble gtx-bubble\" style=\"visibility: visible; left: 202px; top: 71px; opacity: 1;\" role=\"alertdialog\" aria-describedby=\"bubble-2\">\r\n"
						+ "<div id=\"bubble-2\" class=\"jfk-bubble-content-id\">\r\n"
						+ "<div id=\"gtx-host\" style=\"min-width: 200px; max-width: 400px;\"></div>\r\n"
						+ "</div>\r\n"
						+ "<div class=\"jfk-bubble-closebtn-id jfk-bubble-closebtn\" tabindex=\"0\" role=\"button\" aria-label=\"Close\"></div>\r\n"
						+ "<div class=\"jfk-bubble-arrow-id jfk-bubble-arrow jfk-bubble-arrowup\" style=\"left: 206.75px;\">\r\n"
						+ "<div class=\"jfk-bubble-arrowimplbefore\"></div>\r\n"
						+ "<div class=\"jfk-bubble-arrowimplafter\"></div>\r\n"
						+ "</div>\r\n"
						+ "</div>\r\n"
						+ "<div class=\"jfk-bubble gtx-bubble\" style=\"visibility: visible; left: 133px; top: 71px; opacity: 1;\" role=\"alertdialog\" aria-describedby=\"bubble-3\">\r\n"
						+ "<div id=\"bubble-3\" class=\"jfk-bubble-content-id\">\r\n"
						+ "<div id=\"gtx-host\" style=\"min-width: 200px; max-width: 400px;\"></div>\r\n"
						+ "</div>\r\n"
						+ "<div class=\"jfk-bubble-closebtn-id jfk-bubble-closebtn\" tabindex=\"0\" role=\"button\" aria-label=\"Close\"></div>\r\n"
						+ "<div class=\"jfk-bubble-arrow-id jfk-bubble-arrow jfk-bubble-arrowup\" style=\"left: 137.5px;\">\r\n"
						+ "<div class=\"jfk-bubble-arrowimplbefore\"></div>\r\n"
						+ "<div class=\"jfk-bubble-arrowimplafter\"></div>\r\n"
						+ "</div>\r\n"
						+ "</div>";
				termsAR= "<h2 style=\"text-align: right;\">الأحكام والشروط</h2>\r\n"
						+ "<p style=\"text-align: right;\"> "+name+" مرحبا في</p>\r\n"
						+ "<p style=\"text-align: right;\"> "+url+"  الموجود في "+url+" توضح هذه الشروط والأحكام القواعد واللوائح لاستخدام موقع الويب</p>\r\n"
						+ "<p style=\"text-align: right;\">من خلال الوصول إلى هذا الموقع، نفترض أنك تقبل هذه الشروط والأحكام.</p>\r\n"
						+ "<p style=\"text-align: right;\">لا تستمر في استخدام الموقع   اذا كنت لا توافق على اتخاذ جميع الشروط والأحكام المذكورة في هذه الصفحة</p>\r\n"
						+ "<p style=\"text-align: right;\">تنطبق المصطلحات التالية على هذه الشروط والأحكام وبيان الخصوصية وإشعار إخلاء المسؤولية وجميع الاتفاقات: \"العميل\" و \"أنت\" و \"أنت\" يشير إليك، والشخص تسجيل الدخول هذا الموقع ومتوافق مع شروط وأحكام الشركة. \"الشركة\"، \"أنفسنا\"، \"نحن\"، \"لدينا\" و \"الولايات المتحدة\"، يشير إلى شركتنا. يشير \"الحزب\" أو \"الأحزاب\" أو \"الولايات المتحدة\" إلى كل من العميل وأنفسنا. تشير جميع المصطلحات إلى عرض القبول والقبول والنظر في الدفعة اللازمة للقيام بعملية مساعدتنا للعميل بأنسب الغرض السريع المتمثل في تلبية احتياجات العميل فيما يتعلق بتقديم الخدمات المعلنة للشركة، وفقا ل ويخضع لقانون هولندا السائد. يتم أخذ أي استخدام للمصطلحات المذكورة أعلاه أو غيرها من الكلمات في المفرد أو الجمع أو القيمة الرسمية و / أو هو / هي، قابلة للتبادل وبالتالي تشير إلى نفسه.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">ملفات تعريف الارتباط</h3>\r\n"
						+ "<p style=\"text-align: right;\">نحن نوظف استخدام ملفات تعريف الارتباط. عن طريق الوصول إلى "+name+"، وافقت على استخدام ملفات تعريف الارتباط بالاتفاق مع سياسة الخصوصية الخاصة ب "+name+".</p>\r\n"
						+ "<p style=\"text-align: right;\">تستخدم معظم المواقع التفاعلية ملفات تعريف الارتباط للسماح لنا استرداد تفاصيل المستخدم لكل زيارة. يتم استخدام ملفات تعريف الارتباط من قبل موقعنا على شبكة الإنترنت لتمكين وظيفة بعض المناطق لتسهيل الأمر للأشخاص الذين يزورون موقعنا على الإنترنت. بعض شركائنا التابعين / الإعلان قد يستخدمون ملفات تعريف الارتباط أيضا.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">رخصة</h3>\r\n"
						+ "<p style=\"text-align: right;\">ما لم ينص على خلاف ذلك، فإن "+name+" و / أو ترخصياتها الخاصة تملك حقوق الملكية الفكرية لجميع المواد على "+name+". جميع حقوق الملكية الفكرية محفوظة. يمكنك الوصول إلى هذا من "+name+" لاستخدامك الشخصي الذي يخضع للقيود المحددة في هذه الشروط والأحكام.</p>\r\n"
						+ "<p style=\"text-align: right;\">لا يجب عليك:</p>\r\n"
						+ "<p style=\"text-align: right;\">"+name+" إعادة نشر المواد من\r\n"
						+ ""+name+" بيع أو إيجار أو مواد ترخيص فرعية من\r\n"
						+ ""+name+" إعادة إنتاج أو مكررة أو نسخ المواد من\r\n"
						+ ""+name+" إعادة توزيع المحتوى من</p>\r\n"
						+ "<p style=\"text-align: right;\">تبدأ هذه الاتفاقية في تاريخ آخر. تم إنشاء الشروط والأحكام لدينا بمساعدة قالب الشروط والأحكام.</p>\r\n"
						+ "<p style=\"text-align: right;\">تقدم أجزاء من هذا الموقع فرصة للمستخدمين لنشر وتبادل الآراء والمعلومات في مناطق معينة من الموقع. لا تصفية "+name+"، تحرير أو نشر أو مراجعة التعليقات قبل وجودها على الموقع الإلكتروني. لا تعكس التعليقات وجهات نظر وآراء "+name+" ووكلائها و / أو الشركات التابعة لها. تعكس التعليقات وجهات نظر وآراء الشخص الذي ينشر آرائهم وآرائهم. إلى الحد الذي تسمح به القوانين المعمول بها، لا يجوز أن يكون "+name+" مسؤولا عن التعليقات أو عن أي مسؤولية أو أضرار أو نفقات تسبب و / أو تعاني منها نتيجة لأي استخدام و / أو نشر و / أو ظهور التعليقات على هذا موقع الكتروني.</p>\r\n"
						+ "<p style=\"text-align: right;\">تحتفظ "+name+" بالحق في مراقبة جميع التعليقات وإزالة أي تعليقات يمكن اعتبارها غير مناسبة أو مسيئة أو تسبب انتهاك لهذه الشروط والأحكام.</p>\r\n"
						+ "<p style=\"text-align: right;\">تبرر ويمثل ذلك:</p>\r\n"
						+ "<p style=\"text-align: right;\">يحق لك نشر التعليقات على موقعنا على موقعنا ولديك جميع التراخيص والموافقات اللازمة للقيام بذلك؛\r\n"
						+ "لا تغز هذه التعليقات أي حق الملكية الفكرية، بما في ذلك دون تقييد حقوق النشر أو براءة الاختراع أو العلامة التجارية لأي طرف ثالث؛\r\n"
						+ "لا تحتوي التعليقات على أي مواد تشهيرية أو انطلاقها أو مسيئة أو غير عقلانية أو غير قانونية غزو الخصوصية\r\n"
						+ "لن يتم استخدام التعليقات في التماس أو الترويج للأعمال التجارية أو العرف أو تقديم أنشطة تجارية أو نشاط غير قانوني.</p>\r\n"
						+ "<p style=\"text-align: right;\">قمت بموجبه بمنح "+name+" ترخيصا غير حصري لاستخدامه وإعادة إنتاجه وتحريره وتفويضه لاستخدامه وإعادة إنتاج وتحرير أي من تعليقاتك وأي شكل من الأشكال أو التنسيقات أو الوسائط.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">الارتباط التشعبي لمحتواني</h3>\r\n"
						+ "<p style=\"text-align: right;\">قد تصل المنظمات التالية إلى موقعنا دون موافقة كتابية مسبقة:</p>\r\n"
						+ "<p style=\"text-align: right;\">وكالات الحكومة؛\r\n"
						+ "محركات البحث\r\n"
						+ "المؤسسات الإخبارية\r\n"
						+ "قد يرتبط موزعي الدليل عبر الإنترنت بموقعنا على شبكة الإنترنت بنفس الطريقة لأنها ارتباط تشعبي على مواقع الشركات المدرجة الأخرى؛ و\r\n"
						+ "الشركات المعتمدة على نطاق النظام باستثناء التماس المنظمات غير الهادفة للربح ومراكز التسوق الخيرية ومجموعات جمع التبرعات الخيرية التي قد لا تشعبا على موقع الويب الخاص بنا.</p>\r\n"
						+ "<p style=\"text-align: right;\">قد تصل هذه المنظمات إلى صفحتنا الرئيسية أو المنشورات أو إلى معلومات أخرى على الويب طالما كانت الرابط: (أ) ليس بأي حال من الأحوال خادعة؛ (ب) لا يعني كذبة رعاية أو تأييد أو موافقة حزب الارتباط ومنتجاتها و / أو خدماتها؛ و (ج) يناسب في سياق موقع حزب الارتباط.</p>\r\n"
						+ "<p style=\"text-align: right;\">قد نفكر في طلبات الارتباط الأخرى والموافقة عليها من الأنواع التالية من المنظمات:</p>\r\n"
						+ "<p style=\"text-align: right;\">مصادر معلومات المستهلك و / أو الأعمال المعروفة؛\r\n"
						+ "مواقع المجتمع Dot.com\r\n"
						+ "الجمعيات أو المجموعات الأخرى التي تمثل الجمعيات الخيرية؛\r\n"
						+ "موزعي الدليل عبر الإنترنت؛\r\n"
						+ "بوابات الإنترنت؛\r\n"
						+ "المحاسبة والقانون والاستشارات الشركات؛ و\r\n"
						+ "المؤسسات التعليمية والجمعيات التجارية.</p>\r\n"
						+ "<p style=\"text-align: right;\">سنقوم الموافقة على طلبات الارتباط من هذه المنظمات إذا قررنا ذلك: (أ) لن يجعلنا الرابط تبدو غير مواتية لأنفسنا أو لشركاتنا المعتمدة؛ (ب) لا تملك المنظمة أي سجلات سلبية معنا؛ (ج) فائدة لنا من وضوح الارتباط التشعبي يعوض عدم وجود "+name+"؛ (د) الرابط في سياق معلومات الموارد العامة.</p>\r\n"
						+ "<p style=\"text-align: right;\">قد تصل هذه المنظمات إلى صفحتنا الرئيسية طالما الرابط: (أ) ليس بأي حال من الأحوال خادعة؛ (ب) لا يعني كذبة رعاية أو تأييد أو موافقة حزب الارتباط ومنتجاته أو خدماته؛ و (ج) يناسب في سياق موقع حزب الارتباط.</p>\r\n"
						+ "<p style=\"text-align: right;\">إذا كنت إحدى المنظمات المدرجة في الفقرة 2 أعلاه وهي مهتمة بالربط بموقعنا على الويب، فيجب أن تبلغنا بإرسال بريد إلكتروني إلى "+name+". يرجى تضمين اسمك واسم مؤسستك ومعلومات الاتصال وكذلك عنوان URL لموقعك، وقائمة بأي عناوين URL تنوي ربط موقعنا على موقعنا، وقائمة من عناوين URL على موقعنا الذي ترغب في ذلك حلقة الوصل. انتظر 2-3 أسابيع للاستجابة.</p>\r\n"
						+ "<p style=\"text-align: right;\">قد تكون المنظمات المعتمدة ارتباط تشعبي على موقعنا على النحو التالي:</p>\r\n"
						+ "<p style=\"text-align: right;\">عن طريق استخدام اسم الشركة لدينا؛ أو\r\n"
						+ "عن طريق استخدام محدد موقع الموارد الموحد قيد؛ أو\r\n"
						+ "عن طريق استخدام أي وصف آخر لموقعنا المرتبط بهذا المنطقي ضمن سياق ومحتوى المحتوى على موقع حزب الارتباط.</p>\r\n"
						+ "<p style=\"text-align: right;\">لن يسمح بأي استخدام لشعار "+name+" أو غيرها من الأعمال الفنية الرابطية للتغيب عن اتفاق ترخيص علامة تجارية.</p>\r\n"
						+ "<p style=\"text-align: right;\"><strong style=\"font-size: 1.5em;\">iFrames</strong></p>\r\n"
						+ "<p style=\"text-align: right;\">بدون موافقة مسبقة وإذن كتابي، قد لا تقوم بإنشاء إطارات حول صفحات الويب الخاصة بنا والتي تتغير بأي طريقة عرض أو مظهر بصريا لموقعنا.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">مسؤولية المحتوى</h3>\r\n"
						+ "<p style=\"text-align: right;\">لن نحتفظ بالمسؤولية عن أي محتوى يظهر على موقع الويب الخاص بك. أنت توافق على حماية الولايات المتحدة والدفاع عنها ضد جميع المطالبات التي ترتفع على موقع الويب الخاص بك. لا ينبغي أن يظهر أي رابط (رابط) على أي موقع ويب يمكن تفسيره على أنه ينفهر أو الفاحش أو المجرم، أو الذي ينتهك أو ينتهك أو يدعو إلى الانتهاك أو الانتهاك الآخر لأي حقوق طرف ثالث.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">خصوصيتك</h3>\r\n"
						+ "<p style=\"text-align: right;\">يرجى قراءة سياسة الخصوصية</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">تحفظ الحقوق</h3>\r\n"
						+ "<p style=\"text-align: right;\">نحن نحتفظ بالحق في طلب إزالة جميع الروابط أو أي رابط معين لموقعنا. أنت توافق على الفور إزالة جميع الروابط بموقعنا الإلكتروني عند الطلب. نحتفظ أيضا بالحق في طب هذه الشروط والأحكام وربط السياسة في أي وقت. من خلال ربطها باستمرار بموقعنا الإلكتروني، فإنك توافق على الالتزام بشروط وأحكام ربط هذه الشروط والأحكام هذه.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">إزالة الروابط من موقعنا</h3>\r\n"
						+ "<p style=\"text-align: right;\">إذا وجدت أي رابط على موقعنا وهو مسيء لأي سبب من الأسباب، فأنت حر في الاتصال وإبلاغنا بأي لحظة. سننظر في طلبات إزالة الروابط ولكننا لسنا ملزمين أو نحو ذلك أو للرد عليك مباشرة.</p>\r\n"
						+ "<p style=\"text-align: right;\">نحن لا نضمن أن المعلومات الموجودة على هذا الموقع صحيحة، ونحن لا نضمن اكتمالها أو دقتها؛ ولا نعدك بالتأكد من أن موقع الويب لا يزال متاحا أو يتم تحديث المواد الموجودة على الموقع حتى الآن.</p>\r\n"
						+ "\r\n"
						+ "<h3 style=\"text-align: right;\">تنصل</h3>\r\n"
						+ "<p style=\"text-align: right;\">إلى أقصى حد يسمح به القانون المعمول به، نستبعد جميع العروض والضمانات والشروط المتعلقة بموقعنا واستخدام هذا الموقع. لا شيء في هذا إخلاء المسؤولية:</p>\r\n"
						+ "<p style=\"text-align: right;\">حد أو استبعاد مسؤوليتنا أو مسؤوليتك عن الوفاة أو الإصابة الشخصية؛\r\n"
						+ "حد أو استبعاد مسؤوليتنا أو مسؤوليتك عن الاحتيال أو التحريف الاحتيالي؛\r\n"
						+ "الحد من أي من المطلوبات الخاصة بنا بأي طريقة غير مسموح بها بموجب القانون المعمول به؛ أو\r\n"
						+ "استبعاد أي من المطلوبات الخاصة بنا والتي قد لا يتم استبعادها بموجب القانون المعمول به.</p>\r\n"
						+ "<p style=\"text-align: right;\">القيود وحظر المسؤولية المحددة في هذا القسم وأماكن أخرى في هذا الإخلاء: (أ) تخضع للفقرة السابقة؛ (ب) يحكم جميع الالتزامات الناشئة بموجب إخلاء المسئولية، بما في ذلك الالتزامات الناشئة في العقد، في الضرر وانتهاك الواجب القانوني.</p>\r\n"
						+ "<p style=\"text-align: right;\">طالما أن الموقع الإلكتروني والمعلومات والخدمات على الموقع يتم توفيره مجانا، فلن نكون مسؤولين عن أي خسارة أو ضرر بأي طبيعة.</p>\r\n"
						+ "<p style=\"text-align: right;\"></p>";
				termsENG = "<h2><strong>Terms and Conditions</strong></h2>\r\n"
						+ "\r\n"
						+ "<p>Welcome to "+name+"!</p>\r\n"
						+ "\r\n"
						+ "<p>These terms and conditions outline the rules and regulations for the use of "+name+"s Website, located at "+url+".</p>\r\n"
						+ "\r\n"
						+ "<p>By accessing this website we assume you accept these terms and conditions. Do not continue to use "+name+" if you do not agree to take all of the terms and conditions stated on this page.</p>\r\n"
						+ "\r\n"
						+ "<p>The following terminology applies to these Terms and Conditions, Privacy Statement and Disclaimer Notice and all Agreements: \"Client\", \"You\" and \"Your\" refers to you, the person log on this website and compliant to the Company’s terms and conditions. \"The Company\", \"Ourselves\", \"We\", \"Our\" and \"Us\", refers to our Company. \"Party\", \"Parties\", or \"Us\", refers to both the Client and ourselves. All terms refer to the offer, acceptance and consideration of payment necessary to undertake the process of our assistance to the Client in the most appropriate manner for the express purpose of meeting the Client’s needs in respect of provision of the Company’s stated services, in accordance with and subject to, prevailing law of Netherlands. Any use of the above terminology or other words in the singular, plural, capitalization and/or he/she or they, are taken as interchangeable and therefore as referring to same.</p>\r\n"
						+ "\r\n"
						+ "<h3><strong>Cookies</strong></h3>\r\n"
						+ "\r\n"
						+ "<p>We employ the use of cookies. By accessing "+name+", you agreed to use cookies in agreement with the "+name+"'s Privacy Policy. </p>\r\n"
						+ "\r\n"
						+ "<p>Most interactive websites use cookies to let us retrieve the user’s details for each visit. Cookies are used by our website to enable the functionality of certain areas to make it easier for people visiting our website. Some of our affiliate/advertising partners may also use cookies.</p>\r\n"
						+ "\r\n"
						+ "<h3><strong>License</strong></h3>\r\n"
						+ "\r\n"
						+ "<p>Unless otherwise stated, "+name+" and/or its licensors own the intellectual property rights for all material on "+name+". All intellectual property rights are reserved. You may access this from "+name+" for your own personal use subjected to restrictions set in these terms and conditions.</p>\r\n"
						+ "\r\n"
						+ "<p>You must not:</p>\r\n"
						+ "<ul>\r\n"
						+ "    <li>Republish material from "+name+"</li>\r\n"
						+ "    <li>Sell, rent or sub-license material from "+name+"</li>\r\n"
						+ "    <li>Reproduce, duplicate or copy material from "+name+"</li>\r\n"
						+ "    <li>Redistribute content from "+name+"</li>\r\n"
						+ "</ul>\r\n"
						+ "\r\n"
						+ "<p>This Agreement shall begin on the date hereof. Our Terms and Conditions were created with the help of the <a href=\"https://www.privacypolicies.com/blog/sample-terms-conditions-template/\">Terms And Conditions Template</a>.</p>\r\n"
						+ "\r\n"
						+ "<p>Parts of this website offer an opportunity for users to post and exchange opinions and information in certain areas of the website. "+name+" does not filter, edit, publish or review Comments prior to their presence on the website. Comments do not reflect the views and opinions of "+name+",its agents and/or affiliates. Comments reflect the views and opinions of the person who post their views and opinions. To the extent permitted by applicable laws, "+name+" shall not be liable for the Comments or for any liability, damages or expenses caused and/or suffered as a result of any use of and/or posting of and/or appearance of the Comments on this website.</p>\r\n"
						+ "\r\n"
						+ "<p>"+name+" reserves the right to monitor all Comments and to remove any Comments which can be considered inappropriate, offensive or causes breach of these Terms and Conditions.</p>\r\n"
						+ "\r\n"
						+ "<p>You warrant and represent that:</p>\r\n"
						+ "\r\n"
						+ "<ul>\r\n"
						+ "    <li>You are entitled to post the Comments on our website and have all necessary licenses and consents to do so;</li>\r\n"
						+ "    <li>The Comments do not invade any intellectual property right, including without limitation copyright, patent or trademark of any third party;</li>\r\n"
						+ "    <li>The Comments do not contain any defamatory, libelous, offensive, indecent or otherwise unlawful material which is an invasion of privacy</li>\r\n"
						+ "    <li>The Comments will not be used to solicit or promote business or custom or present commercial activities or unlawful activity.</li>\r\n"
						+ "</ul>\r\n"
						+ "\r\n"
						+ "<p>You hereby grant "+name+" a non-exclusive license to use, reproduce, edit and authorize others to use, reproduce and edit any of your Comments in any and all forms, formats or media.</p>\r\n"
						+ "\r\n"
						+ "<h3><strong>Hyperlinking to our Content</strong></h3>\r\n"
						+ "\r\n"
						+ "<p>The following organizations may link to our Website without prior written approval:</p>\r\n"
						+ "\r\n"
						+ "<ul>\r\n"
						+ "    <li>Government agencies;</li>\r\n"
						+ "    <li>Search engines;</li>\r\n"
						+ "    <li>News organizations;</li>\r\n"
						+ "    <li>Online directory distributors may link to our Website in the same manner as they hyperlink to the Websites of other listed businesses; and</li>\r\n"
						+ "    <li>System wide Accredited Businesses except soliciting non-profit organizations, charity shopping malls, and charity fundraising groups which may not hyperlink to our Web site.</li>\r\n"
						+ "</ul>\r\n"
						+ "\r\n"
						+ "<p>These organizations may link to our home page, to publications or to other Website information so long as the link: (a) is not in any way deceptive; (b) does not falsely imply sponsorship, endorsement or approval of the linking party and its products and/or services; and (c) fits within the context of the linking party’s site.</p>\r\n"
						+ "\r\n"
						+ "<p>We may consider and approve other link requests from the following types of organizations:</p>\r\n"
						+ "\r\n"
						+ "<ul>\r\n"
						+ "    <li>commonly-known consumer and/or business information sources;</li>\r\n"
						+ "    <li>dot.com community sites;</li>\r\n"
						+ "    <li>associations or other groups representing charities;</li>\r\n"
						+ "    <li>online directory distributors;</li>\r\n"
						+ "    <li>internet portals;</li>\r\n"
						+ "    <li>accounting, law and consulting firms; and</li>\r\n"
						+ "    <li>educational institutions and trade associations.</li>\r\n"
						+ "</ul>\r\n"
						+ "\r\n"
						+ "<p>We will approve link requests from these organizations if we decide that: (a) the link would not make us look unfavorably to ourselves or to our accredited businesses; (b) the organization does not have any negative records with us; (c) the benefit to us from the visibility of the hyperlink compensates the absence of "+name+"; and (d) the link is in the context of general resource information.</p>\r\n"
						+ "\r\n"
						+ "<p>These organizations may link to our home page so long as the link: (a) is not in any way deceptive; (b) does not falsely imply sponsorship, endorsement or approval of the linking party and its products or services; and (c) fits within the context of the linking party’s site.</p>\r\n"
						+ "\r\n"
						+ "<p>If you are one of the organizations listed in paragraph 2 above and are interested in linking to our website, you must inform us by sending an e-mail to "+name+". Please include your name, your organization name, contact information as well as the URL of your site, a list of any URLs from which you intend to link to our Website, and a list of the URLs on our site to which you would like to link. Wait 2-3 weeks for a response.</p>\r\n"
						+ "\r\n"
						+ "<p>Approved organizations may hyperlink to our Website as follows:</p>\r\n"
						+ "\r\n"
						+ "<ul>\r\n"
						+ "    <li>By use of our corporate name; or</li>\r\n"
						+ "    <li>By use of the uniform resource locator being linked to; or</li>\r\n"
						+ "    <li>By use of any other description of our Website being linked to that makes sense within the context and format of content on the linking party’s site.</li>\r\n"
						+ "</ul>\r\n"
						+ "\r\n"
						+ "<p>No use of "+name+"'s logo or other artwork will be allowed for linking absent a trademark license agreement.</p>\r\n"
						+ "\r\n"
						+ "<h3><strong>iFrames</strong></h3>\r\n"
						+ "\r\n"
						+ "<p>Without prior approval and written permission, you may not create frames around our Webpages that alter in any way the visual presentation or appearance of our Website.</p>\r\n"
						+ "\r\n"
						+ "<h3><strong>Content Liability</strong></h3>\r\n"
						+ "\r\n"
						+ "<p>We shall not be hold responsible for any content that appears on your Website. You agree to protect and defend us against all claims that is rising on your Website. No link(s) should appear on any Website that may be interpreted as libelous, obscene or criminal, or which infringes, otherwise violates, or advocates the infringement or other violation of, any third party rights.</p>\r\n"
						+ "\r\n"
						+ "<h3><strong>Your Privacy</strong></h3>\r\n"
						+ "\r\n"
						+ "<p>Please read Privacy Policy</p>\r\n"
						+ "\r\n"
						+ "<h3><strong>Reservation of Rights</strong></h3>\r\n"
						+ "\r\n"
						+ "<p>We reserve the right to request that you remove all links or any particular link to our Website. You approve to immediately remove all links to our Website upon request. We also reserve the right to amen these terms and conditions and it’s linking policy at any time. By continuously linking to our Website, you agree to be bound to and follow these linking terms and conditions.</p>\r\n"
						+ "\r\n"
						+ "<h3><strong>Removal of links from our website</strong></h3>\r\n"
						+ "\r\n"
						+ "<p>If you find any link on our Website that is offensive for any reason, you are free to contact and inform us any moment. We will consider requests to remove links but we are not obligated to or so or to respond to you directly.</p>\r\n"
						+ "\r\n"
						+ "<p>We do not ensure that the information on this website is correct, we do not warrant its completeness or accuracy; nor do we promise to ensure that the website remains available or that the material on the website is kept up to date.</p>\r\n"
						+ "\r\n"
						+ "<h3><strong>Disclaimer</strong></h3>\r\n"
						+ "\r\n"
						+ "<p>To the maximum extent permitted by applicable law, we exclude all representations, warranties and conditions relating to our website and the use of this website. Nothing in this disclaimer will:</p>\r\n"
						+ "\r\n"
						+ "<ul>\r\n"
						+ "    <li>limit or exclude our or your liability for death or personal injury;</li>\r\n"
						+ "    <li>limit or exclude our or your liability for fraud or fraudulent misrepresentation;</li>\r\n"
						+ "    <li>limit any of our or your liabilities in any way that is not permitted under applicable law; or</li>\r\n"
						+ "    <li>exclude any of our or your liabilities that may not be excluded under applicable law.</li>\r\n"
						+ "</ul>\r\n"
						+ "\r\n"
						+ "<p>The limitations and prohibitions of liability set in this Section and elsewhere in this disclaimer: (a) are subject to the preceding paragraph; and (b) govern all liabilities arising under the disclaimer, including liabilities arising in contract, in tort and for breach of statutory duty.</p>\r\n"
						+ "\r\n"
						+ "<p>As long as the website and the information and services on the website are provided free of charge, we will not be liable for any loss or damage of any nature.</p>";
			
				if (rdbtnNewRadioButton.isSelected()) {terms=termsENG;
				termsn="Terms and conditions";}
				else if (rdbtnNewRadioButton_1.isSelected()) {terms=termsFR;
				termsn="Conditions générales";}
				else if( rdbtnNewRadioButton_2.isSelected()) {terms=termsESP;
				termsn="Términos y condiciones";}
				else if( rdbtnNewRadioButton_3.isSelected()) {terms=termsJP;}
				else if( rdbtnNewRadioButton_4.isSelected()) {terms=termsAR;}
				
			}
		});
		btnNewButton_1.setBounds(157, 316, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DMCA and About us");
		btnNewButton_2.addActionListener(new ActionListener() {
		
			private String url;
			private String name;
			private String email;
			private String DCMAENG;
			private String DCMAFR;
			private String DCMAESP;
			private String DMCAAR;
			
			private String AboutENG;
			private String AboutFR;
			private String AboutESP;
			private String AboutAR;
			private String AboutJP;
			private String dis;
			private String disESP;
			private String disfr;
			public String CCPA;
			private String CCPAFR;
			private String CCPAAR;
			private String CCPAESP;
			private String CPENG;
			private String CPFR;
			private String CPESP;
			
			public void actionPerformed(ActionEvent e) {
				
				email= textField_1.getText();
				name= textField.getText();
				url=textField_2.getText();
				DMCAAR="إذا أضفنا بعض المحتوى الخاص بك أو لمؤسستك عن طريق الخطأ ، فنحن نأسف لذلك. نعتذر عن ذلك ونؤكد لكم أن هذا لن يتكرر في المستقبل. إذا كنت المالك الشرعي للمحتوى المستخدم في موقعنا ، فالرجاء إرسال اسمك واسم المؤسسة وتفاصيل الاتصال وعنوان URL المخالف لحقوق الطبع والنشر وإثبات حقوق النشر (عنوان URL أو المستند القانوني) على "+url;
				CCPAAR="<!-- wp:heading {\"textAlign\":\"right\"} -->\r\n"
						+ "<h2 class=\"has-text-align-right\">إشعار الخصوصية للمقيمين في كاليفورنيا <!-- h2--></h2>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading {\"textAlign\":\"right\",\"level\":3} -->\r\n"
						+ "<h3 class=\"has-text-align-right\">تعريفات <!-- h3--></h3>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading {\"textAlign\":\"right\",\"level\":4} -->\r\n"
						+ "<h4 class=\"has-text-align-right\">موقع الويب <br>"+name+"</h4>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">المالك (أو نحن) <!-- h4--><br>يشير إلى الشخص (الأشخاص) الطبيعي أو الكيان القانوني الذي يوفر هذا الموقع للمستخدمين.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading {\"textAlign\":\"right\",\"level\":4} -->\r\n"
						+ "<h4 class=\"has-text-align-right\">المستخدم (أو أنت) <!-- h4--><br>يشير إلى أي شخص طبيعي أو كيان قانوني يستخدم هذا الموقع.</h4>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">يكمل إشعار الخصوصية هذا للمقيمين في كاليفورنيا المعلومات الواردة في سياسة الخصوصية الخاصة بالموقع وينطبق فقط على جميع الزوار والمستخدمين وغيرهم من المقيمين في ولاية كاليفورنيا. لقد اعتمدنا هذا الإشعار للامتثال لقانون خصوصية المستهلك في كاليفورنيا لعام 2018 (CCPA) وأي شروط محددة في CCPA لها نفس المعنى عند استخدامها في هذا الإشعار.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">المعلومات التي نجمعها <!-- h3--><br>يقوم موقع الويب بجمع المعلومات التي تحدد أو تتصل أو تصف أو تشير أو يمكن أن ترتبط ، أو يمكن ربطها بشكل معقول ، بشكل مباشر أو غير مباشر ، بمستهلك أو جهاز معين (\"المعلومات الشخصية\").</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>على وجه الخصوص ، قام موقع الويب بجمع الفئات التالية من المعلومات الشخصية من عملائه خلال الـ 12 شهرًا الماضية:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:table -->\r\n"
						+ "<figure class=\"wp-block-table\"><table><thead><tr><th>الفئة</th><th>أمثلة</th><th>المجمعة</th></tr></thead><tbody><tr><td>أ. المعرفات. <!-- td--></td><td>اسم حقيقي أو اسم مستعار أو عنوان بريدي أو معرف شخصي فريد أو معرف عبر الإنترنت أو عنوان بروتوكول الإنترنت أو عنوان البريد الإلكتروني أو اسم الحساب أو رقم الضمان الاجتماعي أو رقم رخصة القيادة أو رقم جواز السفر أو أي معرفات أخرى مشابهة. <!-- td--></td><td>نعم</td></tr><tr><td>ب. فئات المعلومات الشخصية المدرجة في قانون سجلات العملاء في كاليفورنيا (Cal. Civ. Code § 1798.80 (e)).</td><td>الاسم ، التوقيع ، رقم الضمان الاجتماعي ، الخصائص المادية أو الوصف ، العنوان ، رقم الهاتف ، رقم جواز السفر ، رخصة القيادة أو رقم بطاقة هوية الدولة ، رقم بوليصة التأمين ، التعليم ، التوظيف ، تاريخ التوظيف ، رقم الحساب المصرفي ، بطاقة الائتمان أو رقم بطاقة الخصم أو أي معلومات مالية أو معلومات طبية أو معلومات تأمين صحي أخرى. <!-- td--></td><td>نعم</td></tr><tr><td>ج. خصائص التصنيف المحمية بموجب قانون كاليفورنيا أو القانون الفيدرالي. <!-- td--></td><td>العمر (40 عامًا أو أكبر) ، العرق ، اللون ، النسب ، الأصل القومي ، الجنسية ، الدين أو العقيدة ، الحالة الاجتماعية ، الحالة الطبية ، الإعاقة الجسدية أو العقلية ، الجنس (بما في ذلك الجنس ، الهوية الجنسية ، التعبير الجنسي ، الحمل أو الولادة والحالات الطبية ذات الصلة) ، والتوجه الجنسي ، والحالة العسكرية أو العسكرية ، والمعلومات الجينية (بما في ذلك المعلومات الوراثية العائلية). <!-- td--></td><td>نعم</td></tr><tr><td>د. المعلومات التجارية. <!-- td--></td><td>سجلات الممتلكات الشخصية أو المنتجات أو الخدمات التي تم شراؤها أو الحصول عليها أو النظر فيها أو غيرها من سجلات أو اتجاهات الشراء أو الاستهلاك. <!-- td--></td><td>نعم</td></tr><tr><td>ه. المعلومات البيومترية. <!-- td--></td><td>الخصائص الجينية والفسيولوجية والسلوكية والبيولوجية أو أنماط النشاط المستخدمة لاستخراج نموذج أو معرف آخر أو معلومات تعريف ، مثل بصمات الأصابع وبصمات الوجوه وبصمات الصوت ومسح قزحية العين أو شبكية العين أو ضغط المفاتيح أو المشي أو الأنماط المادية الأخرى وبيانات النوم والصحة أو التمارين. <!-- td--></td><td>نعم</td></tr><tr><td>F. الإنترنت أو نشاط شبكة آخر مشابه. <!-- td--></td><td>سجل التصفح أو سجل البحث أو معلومات عن تفاعل المستهلك مع موقع ويب أو تطبيق أو إعلان. <!-- td--></td><td>نعم</td></tr><tr><td>ز. بيانات تحديد الموقع الجغرافي. <!-- td--></td><td>الموقع المادي أو الحركات. <!-- td--></td><td>نعم</td></tr><tr><td>ح. البيانات الحسية. <!-- td--></td><td>معلومات صوتية أو إلكترونية أو مرئية أو حرارية أو شمية أو مشابهة. <!-- td--></td><td>نعم</td></tr><tr><td>أنا. المعلومات المهنية أو المتعلقة بالعمل. <!-- td--></td><td>السجل الوظيفي الحالي أو السابق أو تقييمات الأداء. <!-- td--></td><td>نعم</td></tr><tr><td>ي. معلومات التعليم غير العامة (وفقًا لقانون الخصوصية والحقوق التعليمية للأسرة (20 U.S.C Section 1232g، 34 C.F.R. الجزء 99)).</td><td>سجلات التعليم المرتبطة مباشرة بالطالب الذي تحتفظ به مؤسسة تعليمية أو طرف يعمل نيابة عنها ، مثل الدرجات أو النصوص أو قوائم الفصل أو جداول الطلاب أو أكواد تعريف الطالب أو المعلومات المالية للطالب أو السجلات التأديبية للطالب. <!-- td --></td><td>نعم</td></tr><tr><td>ك. استنتاجات مستمدة من معلومات شخصية أخرى. <!-- td--></td><td>الملف الشخصي الذي يعكس تفضيلات الشخص وخصائصه واتجاهاته النفسية وميولته وسلوكه ومواقفه وذكائه وقدراته واستعداداته. <!-- td--></td><td>نعم</td></tr></tbody></table></figure>\r\n"
						+ "<!-- /wp:table -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>المعلومات الشخصية لا تشمل:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>المعلومات المتاحة للجمهور من السجلات الحكومية. <!-- li--></li><li>معلومات المستهلك مجهولة الهوية أو المجمعة. <!-- li--></li><li>المعلومات المستبعدة من نطاق CCPA ، مثل معلومات صحية أو طبية معينة وفئات أخرى من المعلومات المحمية بموجب قوانين مختلفة. <!-- li--></li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>نحصل على فئات المعلومات الشخصية المذكورة أعلاه من فئات المصادر التالية:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>منك مباشرةً. على سبيل المثال ، من النماذج التي تكملهاالإلكترونية أو المنتجات والخدمات التي تشتريها.</li><li>منك بشكل غير مباشر. على سبيل المثال ، من مراقبة أفعالك على موقعنا. <!-- li--></li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:heading {\"textAlign\":\"right\",\"level\":3} -->\r\n"
						+ "<h3 class=\"has-text-align-right\">استخدام المعلومات الشخصية <!-- h3--><br>يجوز لنا استخدام المعلومات الشخصية التي نجمعها أو الكشف عنها لواحد أو أكثر من الأغراض التجارية التالية:</h3>\r\n"
						+ "<!-- /wp:heading -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>لتلبية أو تلبية سبب تقديمك للمعلومات. على سبيل المثال ، إذا قمت بمشاركة اسمك ومعلومات الاتصال الخاصة بك لطلب عرض أسعار أو طرح سؤال حول خدماتنا ، فسنستخدم هذه المعلومات الشخصية للرد على استفسارك. إذا قدمت معلوماتك الشخصية لشراء منتج أو خدمة ، فسنستخدم هذه المعلومات لمعالجة مدفوعاتك وتسهيل التسليم. قد نقوم أيضًا بحفظ معلوماتك لتسهيل طلبات المنتجات الجديدة أو معالجة المرتجعات. </li><li>لمعالجة طلباتك ومشترياتك ومعاملاتك ومدفوعاتك ومنع الاحتيال المتعلق بالمعاملات. </li><li>لتزويدك بالدعم والرد على استفساراتك ، بما في ذلك التحقيق في مخاوفك ومعالجتها ومراقبة ردودنا وتحسينها. </li><li>للرد على طلبات تنفيذ القانون ووفقًا لما يقتضيه القانون المعمول به أو أمر محكمة أو اللوائح الحكومية. </li><li>كما هو موضح لك عند جمع معلوماتك الشخصية أو على النحو المنصوص عليه في قانون خصوصية المستهلك في كاليفورنيا. </li><li>لتقييم أو إجراء عملية اندماج أو تجريد أو إعادة هيكلة أو إعادة تنظيم أو حل أو غير ذلك من عمليات البيع أو النقل لبعض أو كل أصولنا أو أصول الشركات التابعة لنا والتي تكون فيها المعلومات الشخصية التي نحتفظ بها نحن أو الشركات التابعة لنا عن مستخدمي موقعنا من بين الأصول المنقولة.</li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">لن نجمع فئات إضافية من المعلومات الشخصية أو نستخدم المعلومات الشخصية التي نجمعها لأغراض مختلفة ماديًا أو غير ذات صلة أو غير متوافقة دون تقديم إشعار لك.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">مشاركة المعلومات الشخصية <!-- h3--><br>قد نكشف عن معلوماتك الشخصية لطرف ثالث لغرض تجاري. عندما نكشف عن معلومات شخصية لغرض تجاري ، فإننا ندخل عقدًا يصف الغرض ويطلب من المستلم الحفاظ على سرية المعلومات الشخصية وعدم استخدامها لأي غرض باستثناء تنفيذ العقد.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">نشارك معلوماتك الشخصية مع الفئات التالية من الأطراف الثالثة:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>مقدمو الخدمة. <!-- li--></li><li>مُجمِّعو البيانات. <!-- li--></li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">حقوقك وخياراتك <!-- h3--><br>يوفر قانون خصوصية المستهلك في كاليفورنيا (CCPA) للمستهلكين (المقيمين في كاليفورنيا) حقوقًا محددة فيما يتعلق بمعلوماتهم الشخصية. يصف هذا القسم حقوق CCPA الخاصة بك ويشرح كيفية ممارسة هذه الحقوق.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>الوصول إلى معلومات محددة وحقوق نقل البيانات <!-- h4--><br>لديك الحق في طلب الكشف عن معلومات معينة لك حول جمعنا لمعلوماتك الشخصية واستخدامها على مدار الاثني عشر شهرًا الماضية. بمجرد استلامنا لطلب المستهلك الذي يمكن التحقق منه وتأكيده (راجع ممارسة حقوق الوصول وإمكانية نقل البيانات والحذف) ، سنكشف لك ما يلي:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>فئات المعلومات الشخصية التي جمعناها عنك. <!-- li--></li><li>فئات مصادر المعلومات الشخصية التي جمعناها عنك. <!-- li--></li><li>نشاطنا التجاري أو غرضنا التجاري لجمع أو بيع تلك المعلومات الشخصية. <!-- li--></li><li>فئات الجهات الخارجية التي نشارك معها هذه المعلومات الشخصية. <!-- li--></li><li>الأجزاء المحددة من المعلومات الشخصية التي جمعناها عنك (تسمى أيضًا طلب نقل البيانات). <!-- li--></li><li>إذا بعنا أو كشفنا عن معلوماتك الشخصية لغرض تجاري ، فهناك قائمتان منفصلتان تكشفان:\r\n"
						+ "<ul>\r\n"
						+ "<li>المبيعات ، وتحديد فئات المعلومات الشخصية التي اشتراها كل فئة من فئات المستلمين ؛ و</li>\r\n"
						+ "<li>إفصاحات لغرض تجاري ، وتحديد فئات المعلومات الشخصية التي حصلت عليها كل فئة من المستلمين. <!-- li--></li>\r\n"
						+ "</ul>\r\n"
						+ "</li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>حقوق طلب الحذف <!-- h4--><br>يحق لك أن تطلب منا حذف أي من معلوماتك الشخصية التي جمعناها منك واحتفظنا بها ، مع مراعاة بعض الاستثناءات. بمجرد استلامنا لطلب المستهلك الذي يمكن التحقق منه وتأكيده (راجع ممارسة حقوق الوصول وإمكانية نقل البيانات والحذف) ، سنحذف (ونوجه مزودي الخدمة لدينا لحذف) معلوماتك الشخصية من سجلاتنا ، ما لم ينطبق استثناء.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph -->\r\n"
						+ "<p>قد نرفض طلب الحذف الخاص بك إذا كان الاحتفاظ بالمعلومات ضروريًا لنا أو لمزود (مزودي) الخدمة لدينا من أجل:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>أكمل المعاملة التي جمعنا من أجلها المعلومات الشخصية ، أو قدم سلعة أو خدمة طلبتها ، أو اتخذ الإجراءات المتوقعة بشكل معقول في سياق علاقتنا التجارية المستمرة معك ، أو نفذ عقدنا معك. <!-- li--></li><li>الكشف عن الحوادث الأمنية ، والحماية من الأنشطة الضارة أو الخادعة أو الاحتيالية أو غير القانونية ، أو مقاضاة المسؤولين عن مثل هذه الأنشطة. <!-- li--></li><li>تصحيح أخطاء المنتجات لتحديد وإصلاح الأخطاء التي تضعف الوظائف المقصودة الحالية. <!-- li--></li><li>الامتثال لقانون خصوصية الاتصالات الإلكترونية في كاليفورنيا (Cal. Penal Code § 1546 seq.).تمكين الاستخدامات الداخلية فقط التي تتوافق بشكل معقول مع توقعات المستهلك بناءً على علاقتك بنا. <!-- li--></li><li>الامتثال لالتزام قانوني. <!-- li--></li><li>استخدم استخدامات داخلية وقانونية أخرى لتلك المعلومات والتي تتوافق مع السياق الذي قدمتها فيه. <!-- li--></li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">ممارسة حقوق الوصول وإمكانية نقل البيانات والحذف <!-- h4--><br>لممارسة حقوق الوصول وإمكانية نقل البيانات والحذف الموضحة أعلاه ، يرجى إرسال طلب مستهلك يمكن التحقق منه إلينا إما عن طريق:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li><span style=\"background-color: var(--base-3); color: var(--contrast);\"> admin@mtilending.com</span> مراسلتنا عبر البريد الإلكتروني على</li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">يحق لك فقط ، أو لأي شخص مسجل لدى وزير خارجية ولاية كاليفورنيا تفوضه بالتصرف نيابة عنك ، تقديم طلب مستهلك يمكن التحقق منه يتعلق بمعلوماتك الشخصية. يمكنك أيضًا تقديم طلب مستهلك يمكن التحقق منه نيابة عن طفلك القاصر.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">لا يجوز لك سوى تقديم طلب مستهلك يمكن التحقق منه للوصول إلى البيانات أو نقلها مرتين خلال فترة 12 شهرًا. يجب أن يكون طلب المستهلك القابل للتحقق:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>قدم معلومات كافية تسمح لنا بالتحقق بشكل معقول من أنك الشخص الذي جمعنا معلومات شخصية أو ممثلًا مفوضًا عنه. <!-- li--></li><li>صِف طلبك بتفاصيل كافية تتيح لنا فهمه وتقييمه والرد عليه بشكل صحيح. <!-- li--></li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">لا يمكننا الرد على طلبك أو تزويدك بمعلومات شخصية إذا لم نتمكن من التحقق من هويتك أو سلطتك لتقديم الطلب وتأكيد المعلومات الشخصية المتعلقة بك.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">لا يتطلب تقديم طلب مستهلك يمكن التحقق منه إنشاء حساب معنا.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">سنستخدم فقط المعلومات الشخصية المقدمة في طلب مستهلك يمكن التحقق منه للتحقق من هوية مقدم الطلب أو تفويضه لتقديم الطلب.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">توقيت الاستجابة وتنسيقها <!-- h4--><br>نسعى جاهدين للرد على طلب المستهلك الذي يمكن التحقق منه في غضون خمسة وأربعين (45) يومًا من استلامه. إذا احتجنا إلى مزيد من الوقت ، فسنبلغك بالسبب وفترة التمديد كتابيًا.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">سنقوم بتسليم ردنا المكتوب بالبريد أو إلكترونيًا ، حسب اختيارك.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">أي إفصاحات نقدمها ستغطي فقط فترة الـ 12 شهرًا السابقة لاستلام طلب المستهلك الذي يمكن التحقق منه. سيوضح الرد الذي نقدمه أيضًا أسباب عدم تمكننا من الامتثال للطلب ، إن أمكن. بالنسبة لطلبات نقل البيانات ، سنختار تنسيقًا لتوفير معلوماتك الشخصية التي يمكن استخدامها بسهولة ويجب أن يسمح لك بنقل المعلومات من كيان إلى كيان آخر دون عوائق.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">نحن لا نفرض رسومًا لمعالجة أو الاستجابة لطلب المستهلك الذي يمكن التحقق منه ما لم يكن مفرطًا أو متكررًا أو لا أساس له من الصحة بشكل واضح. إذا قررنا أن الطلب يستدعي دفع رسوم ، فسنخبرك بسبب اتخاذنا هذا القرار ونزودك بتقدير التكلفة قبل إكمال طلبك.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">مبيعات المعلومات الشخصية <!-- h4--><br>لن نبيع معلوماتك الشخصية لأي طرف. إذا توقعنا في المستقبل بيع معلوماتك الشخصية إلى أي طرف ، فسنزودك بحقوق الانسحاب والاشتراك التي تتطلبها CCPA.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">عدم التمييز <!-- h3--><br>لن نميز ضدك لممارستك أيًا من حقوق قانون خصوصية المستهلك في كاليفورنيا (CCPA) الخاصة بك. ما لم يسمح قانون حماية خصوصية المستهلك في كاليفورنيا (CCPA) ، لن نقوم بما يلي:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>رفض السلع أو الخدمات. <!-- li--></li><li>تحصيل أسعار أو أسعار مختلفة للسلع أو الخدمات ، بما في ذلك من خلال منح الخصومات أو المزايا الأخرى أو فرض العقوبات. <!-- li--></li><li>تزويدك بمستوى أو جودة مختلفة للسلع أو الخدمات. <!-- li--></li><li>اقترح أنه قد تتلقى سعرًا أو سعرًا مختلفًا للسلع أو الخدمات أو مستوى أو جودة مختلفة للسلع أو الخدمات. <!-- li--></li></ul>\r\n"
						+ "<!-- /wp:list -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">حقوق الخصوصية الأخرى في كاليفورنيا <!-- h3--><br>يسمح قانون كاليفورنيا \"Shine the Light\" (قسم القانون المدني § 1798.83) لمستخدمي موقعنا الإلكتروني المقيمين في كاليفورنيا بطلب معلومات معينة بخصوص إفصاحنا عن المعلومات الشخصية لأطراف ثالثة لأغراض التسويق المباشر الخاصة بهم. لتقديم مثل هذا الطلب ، يرجى إرسال بريد إلكتروني إلى"+email+".</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">التغييرات في إشعار الخصوصية الخاص بنا <!-- h3--><br>نحتفظ بالحق في تعديل إشعار الخصوصية هذا وفقًا لتقديرنا وفي أي وقت. عندما نجري تغييرات على إشعار الخصوصية هذا ، سننشر الإشعار المحدث على موقعنا الإلكتروني ونحدّث تاريخ سريان الإشعار. استمرار استخدامك لموقعنا الإلكتروني بعد نشر التغييرات يشكل موافقتك على هذه التغييرات.</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:paragraph {\"align\":\"right\"} -->\r\n"
						+ "<p class=\"has-text-align-right\">معلومات الاتصال <!-- h3--><br>إذا كان لديك أي أسئلة أو تعليقات حول هذا الإشعار ، والطرق التي نجمع ونستخدم بها معلوماتك الموضحة أدناه وفي سياسة الخصوصية لدينا ، وخياراتك وحقوقك فيما يتعلق بهذا الاستخدام ، أو ترغب في ممارسة حقوقك بموجب قانون ولاية كاليفورنيا ، من فضلك لا تتردد في الاتصال بنا على:</p>\r\n"
						+ "<!-- /wp:paragraph -->\r\n"
						+ "\r\n"
						+ "<!-- wp:list -->\r\n"
						+ "<ul><li>الهاتف: </li><li>موقع الويب: "+url+"</li><li>البريد الإلكتروني: "+email+"</li></ul>\r\n"
						+ "<!-- /wp:list -->";
				CPESP="<h1> Política de cookies para "+name+" </h1>\r\n"
						+ "Esta es la política de cookies para "+name+", accesible desde "+url+"\r\n"
						+ "\r\n"
						+ "<strong> ¿Qué son las cookies <strong>\r\n"
						+ "\r\n"
						+ "Como es la práctica común con casi todos los sitios web profesionales, este sitio utiliza cookies, que son archivos pequeños que se descargan a su computadora, para mejorar su experiencia. Esta página describe qué información se reúnen, cómo lo usamos y por qué a veces necesitamos almacenar estas cookies. También compartiremos cómo puede evitar que estas cookies se almacenen, sin embargo, esto puede rebajarse o \"romper\" ciertos elementos de la funcionalidad de los sitios.\r\n"
						+ "\r\n"
						+ "<strong> cómo usamos las cookies <strong>\r\n"
						+ "\r\n"
						+ "Utilizamos cookies para una variedad de razones detalladas a continuación. Desafortunadamente, en la mayoría de los casos, no hay opciones estándar de la industria para deshabilitar las cookies sin deshabilitar completamente la funcionalidad y las características que agregan a este sitio. Se recomienda que se deje en todas las cookies si no está seguro de si los necesita o no en caso de que se utilicen para proporcionar un servicio que use.\r\n"
						+ "\r\n"
						+ "<strong> desactivando las cookies <strong>\r\n"
						+ "\r\n"
						+ "Puede evitar la configuración de las cookies ajustando la configuración en su navegador (consulte la Ayuda de su navegador para obtener esto). Tenga en cuenta que las cookies de incapacidad afectarán la funcionalidad de este y muchos otros sitios web que visita. La desactivación de las cookies generalmente resultará en incapacitar cierta funcionalidad y características de este sitio. Por lo tanto, se recomienda que no desactive las cookies. </a>.\r\n"
						+ "\r\n"
						+ "<strong> las cookies que establecemos <strong>\r\n"
						+ "<ul>\r\n"
						+ "  <li> Newsletters de correo electrónico cookies relacionadas\r\n"
						+ "\r\n"
						+ "Este sitio ofrece boletín informativo o servicios de suscripción de correo electrónico y cookies se pueden usar para recordar si ya está registrado y si desea mostrar ciertas notificaciones que pueden ser solo válidas para los usuarios suscritos / no suscritos.  </li>\r\n"
						+ "  <li> Las cookies de preferencias del sitio\r\n"
						+ "\r\n"
						+ "Para brindarle una gran experiencia en este sitio, proporcionamos la funcionalidad para establecer sus preferencias sobre cómo se ejecuta este sitio cuando lo usa. Para recordar sus preferencias, necesitamos establecer cookies para que esta información pueda llamarse cada vez que interactúe con una página se vea afectada por sus preferencias.  </li>\r\n"
						+ "</ul>\r\n"
						+ "<strong> cookies de terceros <strong>\r\n"
						+ "\r\n"
						+ "En algunos casos especiales también utilizamos cookies proporcionadas por terceros de confianza. La siguiente sección detalla qué cookies de terceros puede encontrar a través de este sitio.\r\n"
						+ "<ul>\r\n"
						+ "  <li> Este sitio utiliza Google Analytics, que es una de las Soluciones Analíticas más extendidas y confiables en la web para ayudarnos a comprender cómo utiliza el sitio y las formas en que podemos mejorar su experiencia. Estas cookies pueden rastrear las cosas, como el tiempo que gasta en el sitio y las páginas que visita para que podamos continuar produciendo contenido atractivo.\r\n"
						+ "\r\n"
						+ "Para obtener más información sobre las cookies de Google Analytics, consulte la página oficial de Google Analytics.  </li>\r\n"
						+ "  <li> De vez en cuando probamos nuevas características y realizamos cambios sutiles a la forma en que se entrega el sitio. Cuando todavía estamos probando nuevas funciones, se pueden usar estas cookies para asegurarse de que reciba una experiencia consistente mientras está en el sitio, mientras que garantiza que entendemos qué optimizaciones aprecian más a nuestros usuarios.  </li>\r\n"
						+ "  <li> El servicio de Google Adsense que usamos para servir la publicidad usa una cookie de DoubleClick para servir anuncios más relevantes en la web y limitar la cantidad de veces que se le muestra un anuncio dado.\r\n"
						+ "\r\n"
						+ "Para obtener más información sobre Google AdSense, consulte la Preguntas frecuentes sobre la privacidad oficial de Google AdSense.  </li>\r\n"
						+ "  <li> También utilizamos botones y / o complementos de redes sociales en este sitio que le permiten conectarse con su red social de varias maneras. Para que estos trabajen los siguientes sitios de redes sociales, incluyendo; {¡Listar las redes sociales cuyas funciones que ha integrado con su sitio?: 12}, establecerá cookies a través de nuestro sitio que se pueden usar para mejorar su perfil en su sitio o contribuir a los datos que tienen para varios propósitos descritos en su privacidad respectiva políticas.  </li>\r\n"
						+ "</ul>\r\n"
						+ "<strong> Más información <strong>\r\n"
						+ "\r\n"
						+ "Esperemos que haya aclarado las cosas para usted y como se mencionó anteriormente si hay algo que no está seguro de si necesita o no, generalmente es más seguro dejar las cookies habilitadas en caso de que interactúe con una de las características que usa en nuestro sitio.\r\n"
						+ "\r\n"
						+ "Para obtener más información general sobre cookies, lea <a href=\"https://www.generateprivacypolicy.com/#cookies\"> Artículo de \"cookies\" del generador de políticas de privacidad </a>.\r\n"
						+ "\r\n"
						+ "Sin embargo, si aún está buscando más información, puede comunicarse con nosotros a través de uno de nuestros métodos de contacto preferidos:\r\n"
						+ "<ul>\r\n"
						+ "  <li> visitando este enlace: "+url+"  </li>\r\n"
						+ "</ul>";
				CPFR="<h1> Politique de cookie pour "+name+" </h1>\r\n"
						+ "\r\n"
						+ "<p> Ceci est la politique de cookie pour "+name+", accessible depuis "+name+" </p>\r\n"
						+ "\r\n"
						+ "<p> <strong> Que sont les cookies </strong> </p>\r\n"
						+ "\r\n"
						+ "<p> Telle est la pratique courante avec presque tous les sites Web professionnels, ce site utilise des cookies, qui sont des fichiers minuscules téléchargés sur votre ordinateur, afin d'améliorer votre expérience. Cette page décrit quelles informations elles collaborent, comment nous l'utilisons et pourquoi nous avons parfois besoin de stocker ces cookies. Nous partagerons également comment vous pouvez empêcher ces cookies d'être stockés, cependant, cela pourrait rétrograder ou «casser» certains éléments de la fonctionnalité des sites. </p>\r\n"
						+ "\r\n"
						+ "<p> <strong> comment nous utilisons des cookies </strong> </p>\r\n"
						+ "\r\n"
						+ "<p> Nous utilisons des cookies pour une variété de raisons détaillées ci-dessous. Malheureusement, dans la plupart des cas, il n'y a pas d'options standard de l'industrie pour désactiver les cookies sans désactiver complètement la fonctionnalité et les fonctionnalités qu'ils ajoutent à ce site. Il est recommandé de laisser sur tous les cookies si vous ne savez pas si vous en avez besoin ou non au cas où ils seraient utilisés pour fournir un service que vous utilisez. </p>\r\n"
						+ "\r\n"
						+ "<p> <strong> Cookies invalidantes </strong> </p>\r\n"
						+ "\r\n"
						+ "<p> Vous pouvez empêcher le réglage des cookies en ajustant les paramètres de votre navigateur (voir Aide de votre navigateur pour comment faire cela). Sachez que la désactivation des cookies affectera la fonctionnalité de cette question et de nombreux autres sites Web que vous visitez. La désactivation des cookies entraînera généralement également une certaine désactivation de certaines fonctionnalités et fonctionnalités de ce site. Par conséquent, il est recommandé de ne pas désactiver les cookies. </p>\r\n"
						+ "<p> <strong> les cookies que nous avons définis </strong> </p>\r\n"
						+ "\r\n"
						+ "<ul>\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "<li>\r\n"
						+ "    <p> Bulletins de messagerie Cookies connexes </p>\r\n"
						+ "    <p> Ce site propose un bulletin d'information ou des services d'abonnement par courrier électronique et des cookies peuvent être utilisés pour vous rappeler que si vous êtes déjà enregistré et si vous souhaitez afficher certaines notifications qui ne pourraient être valables que pour les utilisateurs souscrits / désinscrits. </p>\r\n"
						+ "</li>\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "<li>\r\n"
						+ "    <p> Préférences de site Cookies </p>\r\n"
						+ "    <p> Afin de vous fournir une excellente expérience sur ce site, nous fournissons la fonctionnalité de définir vos préférences pour la manière dont ce site fonctionne lorsque vous l'utilisez. Afin de rappeler vos préférences, nous devons définir des cookies afin que ces informations puissent être appelées chaque fois que vous interagissez avec une page soit affectée par vos préférences. </p>\r\n"
						+ "</li>\r\n"
						+ "\r\n"
						+ "</ul>\r\n"
						+ "\r\n"
						+ "<p> <strong> cookies tiers </strong> </p>\r\n"
						+ "\r\n"
						+ "<p> Dans certains cas particuliers, nous utilisons également des cookies fournis par des tiers de confiance. La section suivante détaille les cookies tiers que vous pourriez rencontrer via ce site. </p>\r\n"
						+ "\r\n"
						+ "<ul>\r\n"
						+ "\r\n"
						+ "<li>\r\n"
						+ "    <p> Ce site utilise Google Analytics qui est l'une des solutions analytiques les plus répandues et de confiance sur le Web pour nous aider à comprendre comment vous utilisez le site et les moyens d'améliorer votre expérience. Ces cookies peuvent suivre des choses telles que la durée de votre dépense sur le site et les pages que vous visitez afin que nous puissions continuer à produire du contenu attrayant. </p>\r\n"
						+ "    <p> Pour plus d'informations sur Google Analytics Cookies, voir la page officielle Google Analytics. </p>\r\n"
						+ "</li>\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "<li>\r\n"
						+ "    <p> De temps en temps, nous testons de nouvelles fonctionnalités et nous apportons des modifications subtiles à la manière dont le site est livré. Lorsque nous testons toujours de nouvelles fonctionnalités, ces cookies peuvent être utilisés pour vous assurer de recevoir une expérience cohérente tandis que sur le site tout en garantissant que nous comprenons les optimisations nos utilisateurs apprécient le plus. </p>\r\n"
						+ "</li>\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "<li>\r\n"
						+ "    <p> Le service Google AdSense que nous utilisons pour desservir la publicité utilise un cookie de DoubleClick pour servir des annonces plus pertinentes sur le Web et limiter le nombre de fois qu'une annonce donnée vous est montrée. </p>\r\n"
						+ "    <p> Pour plus d'informations sur Google AdSense, voir la FAQ officiel de la confidentialité Google AdSense. </p>\r\n"
						+ "</li>\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "<li>\r\n"
						+ "    <p> Nous utilisons également des boutons et / ou des plugins de média sociaux sur ce site qui vous permettent de vous connecter avec votre réseau social de différentes manières. Pour que cela puisse travailler les sites de médias sociaux suivants, y compris; {Listez les réseaux sociaux dont vous avez intégré votre site ?: 12}, définira des cookies via notre site qui peut être utilisé pour améliorer votre profil sur leur site ou contribuer aux données qu'ils possèdent à diverses fins décrites dans leur vie privée respective. Politiques. </p>\r\n"
						+ "</li>\r\n"
						+ "\r\n"
						+ "</ul>\r\n"
						+ "\r\n"
						+ "<p> <strong> plus d'informations </strong> </p>\r\n"
						+ "\r\n"
						+ "<p> Espérons que cela a clarifié les choses pour vous et comme cela a été mentionné précédemment s'il y a quelque chose que vous n'êtes pas sûr de savoir si vous avez besoin ou non, il est généralement plus sûr de laisser des cookies activés au cas où il interagit avec l'une des fonctionnalités que vous utilisez sur notre site. </p>\r\n"
						+ "\r\n"
						+ "<p> Pour plus d'informations générales sur les cookies, veuillez lire <a href=\"https://www.generateprivacypolicy.com/#cookies\"> Article \"Cookies\" du générateur de politique de confidentialité </a>. </p>\r\n"
						+ "\r\n"
						+ "<p> Cependant, si vous cherchez toujours plus d'informations, vous pouvez nous contacter via l'une de nos méthodes de contact préférées: </p>\r\n"
						+ "\r\n"
						+ "<ul>\r\n"
						+ "\r\n"
						+ "<li> En visitant ce lien: "+url+" </li>\r\n"
						+ "</ul>";
				CPENG="<h1>Cookie Policy for "+name+"</h1>\r\n"
						+ "\r\n"
						+ "<p>This is the Cookie Policy for "+name+", accessible from "+url+"</p>\r\n"
						+ "\r\n"
						+ "<p><strong>What Are Cookies</strong></p>\r\n"
						+ "\r\n"
						+ "<p>As is common practice with almost all professional websites this site uses cookies, which are tiny files that are downloaded to your computer, to improve your experience. This page describes what information they gather, how we use it and why we sometimes need to store these cookies. We will also share how you can prevent these cookies from being stored however this may downgrade or 'break' certain elements of the sites functionality.</p>\r\n"
						+ "\r\n"
						+ "<p><strong>How We Use Cookies</strong></p>\r\n"
						+ "\r\n"
						+ "<p>We use cookies for a variety of reasons detailed below. Unfortunately in most cases there are no industry standard options for disabling cookies without completely disabling the functionality and features they add to this site. It is recommended that you leave on all cookies if you are not sure whether you need them or not in case they are used to provide a service that you use.</p>\r\n"
						+ "\r\n"
						+ "<p><strong>Disabling Cookies</strong></p>\r\n"
						+ "\r\n"
						+ "<p>You can prevent the setting of cookies by adjusting the settings on your browser (see your browser Help for how to do this). Be aware that disabling cookies will affect the functionality of this and many other websites that you visit. Disabling cookies will usually result in also disabling certain functionality and features of the this site. Therefore it is recommended that you do not disable cookies. This Cookies Policy was created with the help of the <a href=\"https://www.cookiepolicygenerator.com/cookie-policy-generator/\">Cookies Policy Generator from CookiePolicyGenerator.com</a>.</p>\r\n"
						+ "<p><strong>The Cookies We Set</strong></p>\r\n"
						+ "\r\n"
						+ "<ul>\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "<li>\r\n"
						+ "    <p>Email newsletters related cookies</p>\r\n"
						+ "    <p>This site offers newsletter or email subscription services and cookies may be used to remember if you are already registered and whether to show certain notifications which might only be valid to subscribed/unsubscribed users.</p>\r\n"
						+ "</li>\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "<li>\r\n"
						+ "    <p>Site preferences cookies</p>\r\n"
						+ "    <p>In order to provide you with a great experience on this site we provide the functionality to set your preferences for how this site runs when you use it. In order to remember your preferences we need to set cookies so that this information can be called whenever you interact with a page is affected by your preferences.</p>\r\n"
						+ "</li>\r\n"
						+ "\r\n"
						+ "</ul>\r\n"
						+ "\r\n"
						+ "<p><strong>Third Party Cookies</strong></p>\r\n"
						+ "\r\n"
						+ "<p>In some special cases we also use cookies provided by trusted third parties. The following section details which third party cookies you might encounter through this site.</p>\r\n"
						+ "\r\n"
						+ "<ul>\r\n"
						+ "\r\n"
						+ "<li>\r\n"
						+ "    <p>This site uses Google Analytics which is one of the most widespread and trusted analytics solution on the web for helping us to understand how you use the site and ways that we can improve your experience. These cookies may track things such as how long you spend on the site and the pages that you visit so we can continue to produce engaging content.</p>\r\n"
						+ "    <p>For more information on Google Analytics cookies, see the official Google Analytics page.</p>\r\n"
						+ "</li>\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "<li>\r\n"
						+ "    <p>From time to time we test new features and make subtle changes to the way that the site is delivered. When we are still testing new features these cookies may be used to ensure that you receive a consistent experience whilst on the site whilst ensuring we understand which optimisations our users appreciate the most.</p>\r\n"
						+ "</li>\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "<li>\r\n"
						+ "    <p>The Google AdSense service we use to serve advertising uses a DoubleClick cookie to serve more relevant ads across the web and limit the number of times that a given ad is shown to you.</p>\r\n"
						+ "    <p>For more information on Google AdSense see the official Google AdSense privacy FAQ.</p>\r\n"
						+ "</li>\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "<li>\r\n"
						+ "    <p>We also use social media buttons and/or plugins on this site that allow you to connect with your social network in various ways. For these to work the following social media sites including; {List the social networks whose features you have integrated with your site?:12}, will set cookies through our site which may be used to enhance your profile on their site or contribute to the data they hold for various purposes outlined in their respective privacy policies.</p>\r\n"
						+ "</li>\r\n"
						+ "\r\n"
						+ "</ul>\r\n"
						+ "\r\n"
						+ "<p><strong>More Information</strong></p>\r\n"
						+ "\r\n"
						+ "<p>Hopefully that has clarified things for you and as was previously mentioned if there is something that you aren't sure whether you need or not it's usually safer to leave cookies enabled in case it does interact with one of the features you use on our site.</p>\r\n"
						+ "\r\n"
						+ "<p>For more general information on cookies, please read <a href=\"https://www.generateprivacypolicy.com/#cookies\">\"Cookies\" article from the Privacy Policy Generator</a>.</p>\r\n"
						+ "\r\n"
						+ "<p>However if you are still looking for more information then you can contact us through one of our preferred contact methods:</p>\r\n"
						+ "\r\n"
						+ "<ul>\r\n"
						+ "\r\n"
						+ "<li>By visiting this link: "+url+"</li>\r\n"
						+ "</ul>\r\n"
						+ "";
				CCPA=""
						+ "<h2>Privacy Notice For California Residents</h2>\r\n"
						+ "<h3>Definitions</h3>\r\n"
						+ "<h4>Website</h4>\r\n"
						+ " "+name+" or https://"+url+"\r\n"
						+ "<h4>Owner (or We)</h4>\r\n"
						+ "Indicates the natural person(s) or legal entity that provides this Website to Users.\r\n"
						+ "<h4>User (or You)</h4>\r\n"
						+ "Indicates any natural person or legal entity using this Website.\r\n"
						+ "\r\n"
						+ "This Privacy Notice for California Residents supplements the information contained in the Website's Privacy Policy and applies solely to all visitors, users, and others who reside in the State of California. We adopted this notice to comply with the California Consumer Privacy Act of 2018 (CCPA) and any terms defined in the CCPA have the same meaning when used in this notice.\r\n"
						+ "<h3>Information We Collect</h3>\r\n"
						+ "The Website collects information that identifies, relates to, describes, references, is capable of being associated with, or could reasonably be linked, directly or indirectly, with a particular consumer or device (\"personal information\").\r\n"
						+ "\r\n"
						+ "In particular, Website has collected the following categories of personal information from its consumers within the last 12 months:\r\n"
						+ "<table>\r\n"
						+ "<thead>\r\n"
						+ "<tr>\r\n"
						+ "<th>Category</th>\r\n"
						+ "<th>Examples</th>\r\n"
						+ "<th>Collected</th>\r\n"
						+ "</tr>\r\n"
						+ "</thead>\r\n"
						+ "<tbody>\r\n"
						+ "<tr>\r\n"
						+ "<td>A. Identifiers.</td>\r\n"
						+ "<td>A real name, alias, postal address, unique personal identifier, online identifier, Internet Protocol address, email address, account name, Social Security number, driver's license number, passport number, or other similar identifiers.</td>\r\n"
						+ "<td>YES</td>\r\n"
						+ "</tr>\r\n"
						+ "<tr>\r\n"
						+ "<td>B. Personal information categories listed in the California Customer Records statute (Cal. Civ. Code § 1798.80(e)).</td>\r\n"
						+ "<td>A name, signature, Social Security number, physical characteristics or description, address, telephone number, passport number, driver's license or state identification card number, insurance policy number, education, employment, employment history, bank account number, credit card number, debit card number, or any other financial information, medical information, or health insurance information.</td>\r\n"
						+ "<td>YES</td>\r\n"
						+ "</tr>\r\n"
						+ "<tr>\r\n"
						+ "<td>C. Protected classification characteristics under California or federal law.</td>\r\n"
						+ "<td>Age (40 years or older), race, color, ancestry, national origin, citizenship, religion or creed, marital status, medical condition, physical or mental disability, sex (including gender, gender identity, gender expression, pregnancy or childbirth and related medical conditions), sexual orientation, veteran or military status, genetic information (including familial genetic information).</td>\r\n"
						+ "<td>YES</td>\r\n"
						+ "</tr>\r\n"
						+ "<tr>\r\n"
						+ "<td>D. Commercial information.</td>\r\n"
						+ "<td>Records of personal property, products or services purchased, obtained, or considered, or other purchasing or consuming histories or tendencies.</td>\r\n"
						+ "<td>YES</td>\r\n"
						+ "</tr>\r\n"
						+ "<tr>\r\n"
						+ "<td>E. Biometric information.</td>\r\n"
						+ "<td>Genetic, physiological, behavioral, and biological characteristics, or activity patterns used to extract a template or other identifier or identifying information, such as fingerprints, faceprints, and voiceprints, iris or retina scans, keystroke, gait, or other physical patterns, and sleep, health, or exercise data.</td>\r\n"
						+ "<td>YES</td>\r\n"
						+ "</tr>\r\n"
						+ "<tr>\r\n"
						+ "<td>F. Internet or other similar network activity.</td>\r\n"
						+ "<td>Browsing history, search history, information on a consumer's interaction with a Website, application, or advertisement.</td>\r\n"
						+ "<td>YES</td>\r\n"
						+ "</tr>\r\n"
						+ "<tr>\r\n"
						+ "<td>G. Geolocation data.</td>\r\n"
						+ "<td>Physical location or movements.</td>\r\n"
						+ "<td>YES</td>\r\n"
						+ "</tr>\r\n"
						+ "<tr>\r\n"
						+ "<td>H. Sensory data.</td>\r\n"
						+ "<td>Audio, electronic, visual, thermal, olfactory, or similar information.</td>\r\n"
						+ "<td>YES</td>\r\n"
						+ "</tr>\r\n"
						+ "<tr>\r\n"
						+ "<td>I. Professional or employment-related information.</td>\r\n"
						+ "<td>Current or past job history or performance evaluations.</td>\r\n"
						+ "<td>YES</td>\r\n"
						+ "</tr>\r\n"
						+ "<tr>\r\n"
						+ "<td>J. Non-public education information (per the Family Educational Rights and Privacy Act (20 U.S.C. Section 1232g, 34 C.F.R. Part 99)).</td>\r\n"
						+ "<td>Education records directly related to a student maintained by an educational institution or party acting on its behalf, such as grades, transcripts, class lists, student schedules, student identification codes, student financial information, or student disciplinary records.</td>\r\n"
						+ "<td>YES</td>\r\n"
						+ "</tr>\r\n"
						+ "<tr>\r\n"
						+ "<td>K. Inferences drawn from other personal information.</td>\r\n"
						+ "<td>Profile reflecting a person's preferences, characteristics, psychological trends, predispositions, behavior, attitudes, intelligence, abilities, and aptitudes.</td>\r\n"
						+ "<td>YES</td>\r\n"
						+ "</tr>\r\n"
						+ "</tbody>\r\n"
						+ "</table>\r\n"
						+ "Personal information does not include:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>Publicly available information from government records.</li>\r\n"
						+ " 	<li>Deidentified or aggregated consumer information.</li>\r\n"
						+ " 	<li>Information excluded from the CCPA's scope, like certain health or medical information and other categories of information protected by different laws.</li>\r\n"
						+ "</ul>\r\n"
						+ "We obtain the categories of personal information listed above from the following categories of sources:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>Directly from you. For example, from forms you complete or products and services you purchase.</li>\r\n"
						+ " 	<li>Indirectly from you. For example, from observing your actions on our Website.</li>\r\n"
						+ "</ul>\r\n"
						+ "<h3>Use of Personal Information</h3>\r\n"
						+ "We may use or disclose the personal information we collect for one or more of the following business purposes:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>To fulfill or meet the reason you provided the information. For example, if you share your name and contact information to request a price quote or ask a question about our services, we will use that personal information to respond to your inquiry. If you provide your personal information to purchase a product or service, we will use that information to process your payment and facilitate delivery. We may also save your information to facilitate new product orders or process returns.</li>\r\n"
						+ " 	<li>To process your requests, purchases, transactions, and payments and prevent transactional fraud.</li>\r\n"
						+ " 	<li>To provide you with support and to respond to your inquiries, including to investigate and address your concerns and monitor and improve our responses.</li>\r\n"
						+ " 	<li>To respond to law enforcement requests and as required by applicable law, court order, or governmental regulations.</li>\r\n"
						+ " 	<li>As described to you when collecting your personal information or as otherwise set forth in the CCPA.</li>\r\n"
						+ " 	<li>To evaluate or conduct a merger, divestiture, restructuring, reorganization, dissolution, or other sale or transfer of some or all of our or our affiliates' assets in which personal information held by us or our affiliates about our Website users is among the assets transferred.</li>\r\n"
						+ "</ul>\r\n"
						+ "We will not collect additional categories of personal information or use the personal information we collect for materially different, unrelated, or incompatible purposes without providing you notice.\r\n"
						+ "<h3>Sharing Personal Information</h3>\r\n"
						+ "We may disclose your personal information to a third party for a business purpose. When we disclose personal information for a business purpose, we enter a contract that describes the purpose and requires the recipient to both keep that personal information confidential and not use it for any purpose except performing the contract.\r\n"
						+ "\r\n"
						+ "We share your personal information with the following categories of third parties:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>Service providers.</li>\r\n"
						+ " 	<li>Data Aggregators.</li>\r\n"
						+ "</ul>\r\n"
						+ "<h3>Your Rights and Choices</h3>\r\n"
						+ "The CCPA provides consumers (California residents) with specific rights regarding their personal information. This section describes your CCPA rights and explains how to exercise those rights.\r\n"
						+ "<h4>Access to Specific Information and Data Portability Rights</h4>\r\n"
						+ "You have the right to request that we disclose certain information to you about our collection and use of your personal information over the past 12 months. Once we receive and confirm your verifiable consumer request (see Exercising Access, Data Portability, and Deletion Rights), we will disclose to you:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>The categories of personal information we've collected about you.</li>\r\n"
						+ " 	<li>The categories of sources for the personal information we've collected about you.</li>\r\n"
						+ " 	<li>Our business or commercial purpose for collecting or selling that personal information.</li>\r\n"
						+ " 	<li>The categories of third parties with whom we share that personal information.</li>\r\n"
						+ " 	<li>The specific pieces of personal information we’ve collected about you (also called a data portability request).</li>\r\n"
						+ " 	<li>If we sold or disclosed your personal information for a business purpose, two separate lists disclosing:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>sales, identifying the personal information categories that each category of recipient purchased; and</li>\r\n"
						+ " 	<li>disclosures for a business purpose, identifying the personal information categories that each category of recipient obtained.</li>\r\n"
						+ "</ul>\r\n"
						+ "</li>\r\n"
						+ "</ul>\r\n"
						+ "<h4>Deletion Request Rights</h4>\r\n"
						+ "You have the right to request that we delete any of your personal information that we collected from you and retained, subject to certain exceptions. Once we receive and confirm your verifiable consumer request (see Exercising Access, Data Portability, and Deletion Rights), we will delete (and direct our service providers to delete) your personal information from our records, unless an exception applies.\r\n"
						+ "\r\n"
						+ "We may deny your deletion request if retaining the information is necessary for us or our service provider(s) to:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>Complete the transaction for which we collected the personal information, provide a good or service that you requested, take actions reasonably anticipated within the context of our ongoing business relationship with you, or otherwise perform our contract with you.</li>\r\n"
						+ " 	<li>Detect security incidents, protect against malicious, deceptive, fraudulent, or illegal activity, or prosecute those responsible for such activities.</li>\r\n"
						+ " 	<li>Debug products to identify and repair errors that impair existing intended functionality.</li>\r\n"
						+ " 	<li>Comply with the California Electronic Communications Privacy Act (Cal. Penal Code § 1546 seq.). Enable solely internal uses that are reasonably aligned with consumer expectations based on your relationship with us.</li>\r\n"
						+ " 	<li>Comply with a legal obligation.</li>\r\n"
						+ " 	<li>Make other internal and lawful uses of that information that are compatible with the context in which you provided it.</li>\r\n"
						+ "</ul>\r\n"
						+ "<h4>Exercising Access, Data Portability, and Deletion Rights</h4>\r\n"
						+ "To exercise the access, data portability, and deletion rights described above, please submit a verifiable consumer request to us by either:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>Calling us at</li>\r\n"
						+ " 	<li>Emailing us at admin@"+url+"</li>\r\n"
						+ "</ul>\r\n"
						+ "Only you, or a person registered with the California Secretary of State that you authorize to act on your behalf, may make a verifiable consumer request related to your personal information. You may also make a verifiable consumer request on behalf of your minor child.\r\n"
						+ "\r\n"
						+ "You may only make a verifiable consumer request for access or data portability twice within a 12-month period. The verifiable consumer request must:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>Provide sufficient information that allows us to reasonably verify you are the person about whom we've collected personal information or an authorized representative.</li>\r\n"
						+ " 	<li>Describe your request with sufficient detail that allows us to properly understand, evaluate, and respond to it.</li>\r\n"
						+ "</ul>\r\n"
						+ "We cannot respond to your request or provide you with personal information if we cannot verify your identity or authority to make the request and confirm the personal information relates to you.\r\n"
						+ "\r\n"
						+ "Making a verifiable consumer request does not require you to create an account with us.\r\n"
						+ "\r\n"
						+ "We will only use personal information provided in a verifiable consumer request to verify the requestor's identity or authority to make the request.\r\n"
						+ "<h4>Response Timing and Format</h4>\r\n"
						+ "We endeavor to respond to a verifiable consumer request within forty-five (45) days of its receipt. If we require more time, we will inform you of the reason and extension period in writing.\r\n"
						+ "\r\n"
						+ "We will deliver our written response by mail or electronically, at your option.\r\n"
						+ "\r\n"
						+ "Any disclosures we provide will only cover the 12-month period preceding the verifiable consumer request's receipt. The response we provide will also explain the reasons we cannot comply with a request, if applicable. For data portability requests, we will select a format to provide your personal information that is readily useable and should allow you to transmit the information from one entity to another entity without hindrance.\r\n"
						+ "\r\n"
						+ "We do not charge a fee to process or respond to your verifiable consumer request unless it is excessive, repetitive, or manifestly unfounded. If we determine that the request warrants a fee, we will tell you why we made that decision and provide you with a cost estimate before completing your request.\r\n"
						+ "<h4>Personal Information Sales</h4>\r\n"
						+ "We will not sell your personal information to any party. If in the future, we anticipate selling your personal information to any party, we will provide you with the opt-out and opt-in rights required by the CCPA.\r\n"
						+ "<h3>Non-Discrimination</h3>\r\n"
						+ "We will not discriminate against you for exercising any of your CCPA rights. Unless permitted by the CCPA, we will not:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>Deny you goods or services.</li>\r\n"
						+ " 	<li>Charge you different prices or rates for goods or services, including through granting discounts or other benefits, or imposing penalties.</li>\r\n"
						+ " 	<li>Provide you a different level or quality of goods or services.</li>\r\n"
						+ " 	<li>Suggest that you may receive a different price or rate for goods or services or a different level or quality of goods or services.</li>\r\n"
						+ "</ul>\r\n"
						+ "<h3>Other California Privacy Rights</h3>\r\n"
						+ "California's \"Shine the Light\" law (Civil Code Section § 1798.83) permits users of our Website that are California residents to request certain information regarding our disclosure of personal information to third parties for their direct marketing purposes. To make such a request, please send an email to admin@"+name+".com.\r\n"
						+ "<h3>Changes to Our Privacy Notice</h3>\r\n"
						+ "We reserve the right to amend this privacy notice at our discretion and at any time. When we make changes to this privacy notice, we will post the updated notice on our Website and update the notice's effective date. Your continued use of our Website following the posting of changes constitutes your acceptance of such changes.\r\n"
						+ "<h3>Contact Information</h3>\r\n"
						+ "If you have any questions or comments about this notice, the ways in which we collect and use your information described below and in our Privacy Policy, your choices and rights regarding such use, or wish to exercise your rights under California law, please do not hesitate to contact us at:\r\n"
						+ "<ul>\r\n"
						+ " 	<li>Phone:</li>\r\n"
						+ " 	<li>Website: https://"+url+"</li>\r\n"
						+ " 	<li>Email: "+email+"</li>\r\n"
						+ "</ul>";
				DCMAESP="Si hemos agregado algún contenido que le pertenece a usted o a su organización por error, lamentamos eso. Pedimos disculpas por eso y le aseguramos que esto no se repetirá en el futuro. Si usted es el propietario legítimo del contenido utilizado en nuestro sitio web, envíenos un nombre a su nombre, nombre de la organización, detalles de contacto, derechos de autor infringiendo la URL y prueba de derechos de autor (URL o documento legal) en admin@"+url;
				DCMAFR="Si nous avons ajouté un contenu qui vous appartient ou votre organisation par erreur, nous sommes désolés pour cela. Nous nous excusons pour cela et nous vous assurer que cela ne sera pas répété à l'avenir. Si vous êtes le propriétaire légitime du contenu utilisé sur notre site Web,"
						+ " veuillez nous envoyer votre nom avec votre nom, votre nom d'organisation, vos coordonnées, URL de violation du droit d'auteur et une preuve de copyright (URL ou document légal) sur " + email;
				DCMAENG="If we Have added some content that belongs to you or your organization by mistake, We are sorry for that. We apologize for that and assure you that this won’t be repeated in future. If you are the rightful owner of the content used in our Website, "+
						 "please mail us with your Name, Organization Name, Contact Details, Copyright infringing URL and Copyright Proof (URL or Legal Document) at " + email ;
				
			AboutESP=name+" es una plataforma profesional de revistas en línea. Aquí le proporcionaremos solo contenido interesante, lo que le gustaría mucho. Estamos dedicados a brindarle lo mejor de la revista en línea. Estamos trabajando para convertir nuestra pasión por la revista en línea en un sitio web en línea en línea. Esperamos que disfrute de nuestra revista en línea tanto como disfrutemos ofreciéndoles a usted.\r\n"
					+ "\r\n"
					+ "Siguiendo publicando publicaciones más importantes en mi sitio web para todos ustedes. Por favor, dé su apoyo y amor.\r\n"
					+ "\r\n"
					+ "Gracias por visitar nuestro sitio.\r\n"
					+ "\r\n"
					+ "Que tenga un lindo día !";
			AboutFR=name + " est une plate-forme de magazine en ligne professionnelle. Ici, nous vous fournirons uniquement un contenu intéressant que vous aimerez beaucoup. Nous sommes dédiés à vous fournir le meilleur du magazine en ligne. Nous travaillons pour transformer notre passion pour le magazine en ligne dans un site Web en ligne en flèche. Nous espérons que vous apprécierez notre magazine en ligne autant que nous apprécions vous les offrir.\r\n"
					+ "\r\n"
					+ "Je vais continuer à poster des postes plus importants sur mon site Web pour vous tous. S'il vous plaît donner votre soutien et votre amour.\r\n"
					+ "\r\n"
					+ "Merci de visiter notre site\r\n"
					+ "\r\n"
					+ "Bonne journée !";
			AboutENG=name +" is a Professional online magazine Platform. Here we will provide you only interesting content, which you will like very much. We’re dedicated to providing you the best of online magazine. We’re working to turn our passion for online magazine into a booming online website. We hope you enjoy our online magazine as much as we enjoy offering them to you.\r\n"
					+ "\r\n"
					+ "I will keep posting more important posts on my Website for all of you. Please give your support and love.\r\n"
					+ "\r\n"
					+ "Thanks For Visiting Our Site\r\n"
					+ "\r\n"
					+ "Have a nice day !";
			disESP="<h1>Descargo de responsabilidad para "+name+" <!-- h1--></h1>\r\n"
					+ "Si necesita más información o tiene alguna pregunta sobre el descargo de responsabilidad de nuestro sitio, no dude en contactarnos por correo electrónico a admin@"+name+".com.\r\n"
					+ "<h2>Descargo de responsabilidad para "+name+"</h2>\r\n"
					+ "<!-- h2-->\r\n"
					+ "Toda la información en este sitio web - "+url+" - se publica de buena fe y solo para la información general. "+name+" no hace ninguna garantía sobre la integridad, la confiabilidad y la precisión de esta información. Cualquier acción que asuma la información que encuentre en este sitio web ("+name+"), es estrictamente bajo su propio riesgo. "+name+" no será responsable de ninguna pérdida y / o daños en relación con el uso de nuestro sitio web.\r\n"
					+ "\r\n"
					+ "Desde nuestro sitio web, puede visitar otros sitios web siguiendo hipervínculos a dichos sitios externos. Si bien nos esforzamos por proporcionar solo enlaces de calidad a sitios web útiles y éticos, no tenemos control sobre el contenido y la naturaleza de estos sitios. Estos enlaces a otros sitios web no implican una recomendación para todo el contenido que se encuentra en estos sitios. Los propietarios y el contenido del sitio pueden cambiar sin previo aviso y pueden ocurrir antes de que tengamos la oportunidad de eliminar un enlace que pueda haber ido \"malo\".\r\n"
					+ "\r\n"
					+ "Tenga en cuenta que cuando salga de nuestro sitio web, otros sitios pueden tener diferentes políticas de privacidad y términos que están más allá de nuestro control. Asegúrese de verificar las políticas de privacidad de estos sitios, así como sus \"Términos de servicio\" antes de participar en cualquier negocio o cargar cualquier información.\r\n"
					+ "\r\n"
					+ "Consentimiento <!-- h2-->\r\n"
					+ "Al utilizar nuestro sitio web, usted acepta nuestro descargo de responsabilidad y acepta sus términos.\r\n"
					+ "\r\n"
					+ "Actualización <!-- h2-->\r\n"
					+ "¿Debemos actualizar, enmendar o realizar algún cambio en este documento, esos cambios se publicarán de manera prominente aquí.";
			disfr="<h3>Avertissement</h3>\r\n"
					+ "<h4>\r\n"
					+ "Disclaimer pour "+name+"</h4>\r\n"
					+ "Si vous avez besoin de plus d'informations ou si vous avez des questions sur la responsabilité de notre site, n'hésitez pas à nous contacter par courrier électronique à admin@feeumi.com Notre département de non-responsabilité a été généré à l'aide du générateur de non-responsabilité.\r\n"
					+ "<h4>Clause de non-responsabilité pour "+name+"</h4>\r\n"
					+ "Toutes les informations sur ce site Web - "+url+" - est publiée de bonne foi et à des fins d'information générale uniquement. "+name+" ne fait aucune garantie sur l'exhaustivité, la fiabilité et la précision de ces informations. Toute action que vous prenez sur les informations que vous trouvez sur ce site Web ("+name+") est strictement à vos risques et périls. "+name+" ne sera pas responsable des pertes et / ou des dommages-intérêts liés à l'utilisation de notre site Web.\r\n"
					+ "\r\n"
					+ "Sur notre site Web, vous pouvez visiter d'autres sites Web en suivant des hyperliens sur de tels sites externes. Pendant que nous nous efforçons de fournir uniquement des liens qualité sur des sites Web utiles et éthiques, nous n'avons aucun contrôle sur le contenu et la nature de ces sites. Ces liens vers d'autres sites Web n'impliquent pas une recommandation pour tout le contenu trouvé sur ces sites. Les propriétaires de sites et le contenu peuvent changer sans préavis et peuvent avoir lieu avant de disposer de la possibilité de supprimer un lien qui a peut-être partie de «mauvais».\r\n"
					+ "\r\n"
					+ "Veuillez également conscience que lorsque vous quittez notre site Web, d'autres sites peuvent avoir des politiques et des termes de confidentialité différentes qui dépassent notre contrôle. Assurez-vous de vérifier les stratégies de confidentialité de ces sites ainsi que de leur \"Conditions d'utilisation\" avant de vous engager dans une entreprise ou de télécharger des informations.\r\n"
					+ "<h4>Consentement</h4>\r\n"
					+ "En utilisant notre site Web, vous consentiez par la présente à notre responsabilité de non-responsabilité et acceptez ses conditions.\r\n"
					+ "<h4>Mettre à jour</h4>\r\n"
					+ "Devrions-nous mettre à jour, modifier ou apporter des modifications à ce document, ces changements seront placés de manière évidente ici.";
			dis="<h1>Disclaimer for "+name+"</h1>\r\n"
					+ "\r\n"
					+ "<p>If you require any more information or have any questions about our site's disclaimer, please feel free to contact us by email at "+email+". Our Disclaimer was generated with the help of the <a href=\"https://www.termsfeed.com/disclaimer-generator/\">Disclaimer Generator</a>.</p>\r\n"
					+ "\r\n"
					+ "<h2>Disclaimers for "+name+"</h2>\r\n"
					+ "\r\n"
					+ "<p>All the information on this website - "+url+" - is published in good faith and for general information purpose only. "+name+" does not make any warranties about the completeness, reliability and accuracy of this information. Any action you take upon the information you find on this website ("+name+"), is strictly at your own risk. "+name+" will not be liable for any losses and/or damages in connection with the use of our website.</p>\r\n"
					+ "\r\n"
					+ "<p>From our website, you can visit other websites by following hyperlinks to such external sites. While we strive to provide only quality links to useful and ethical websites, we have no control over the content and nature of these sites. These links to other websites do not imply a recommendation for all the content found on these sites. Site owners and content may change without notice and may occur before we have the opportunity to remove a link which may have gone 'bad'.</p>\r\n"
					+ "\r\n"
					+ "<p>Please be also aware that when you leave our website, other sites may have different privacy policies and terms which are beyond our control. Please be sure to check the Privacy Policies of these sites as well as their \"Terms of Service\" before engaging in any business or uploading any information.</p>\r\n"
					+ "\r\n"
					+ "<h2>Consent</h2>\r\n"
					+ "\r\n"
					+ "<p>By using our website, you hereby consent to our disclaimer and agree to its terms.</p>\r\n"
					+ "\r\n"
					+ "<h2>Update</h2>\r\n"
					+ "\r\n"
					+ "<p>Should we update, amend or make any changes to this document, those changes will be prominently posted here.</p>";
			CCPAESP="<h2> Aviso de privacidad para los residentes de California </h2>\r\n"
					+ "<h3> Definiciones </h3>\r\n"
					+ "<h4> sitio web </h4>\r\n"
					+ name+" o https://"+url+"\r\n"
					+ "<h4> propietario (o nosotros) </h4>\r\n"
					+ "Indica la (s) persona (s) natural (s) natural (s) o la entidad legal que proporciona este sitio web a los usuarios.\r\n"
					+ "<h4> Usuario (o usted) </h4>\r\n"
					+ "Indica a cualquier persona física o entidad legal utilizando este sitio web.\r\n"
					+ "\r\n"
					+ "Este Aviso de privacidad para los residentes de California complementa la información contenida en la Política de privacidad del sitio web y se aplica únicamente a todos los visitantes, usuarios y otros que residen en el estado de California. Adoptamos este aviso para cumplir con la Ley de Privacidad del Consumidor de California de 2018 (CCPA) y cualquier Términos definidos en la CCPA tienen el mismo significado cuando se usa en este Aviso.\r\n"
					+ "<h3> Información Recopilamos </h3>\r\n"
					+ "El sitio web recopila información que identifica, se relaciona, se refiere, las referencias, es capaz de asociarse, o podría estar razonablemente vinculadas, directa o indirectamente, con un consumidor o dispositivo en particular (\"Información personal\").\r\n"
					+ "\r\n"
					+ "En particular, el sitio web ha recopilado las siguientes categorías de información personal de sus consumidores en los últimos 12 meses:\r\n"
					+ "<table>\r\n"
					+ "<thead>\r\n"
					+ "<tr>\r\n"
					+ "<th> categoría </th>\r\n"
					+ "<th> ejemplos </th>\r\n"
					+ "<th> recogido </th>\r\n"
					+ "</tr>\r\n"
					+ "</Thead>\r\n"
					+ "<tbody>\r\n"
					+ "<tr>\r\n"
					+ "<td> a. Identificadores. </td>\r\n"
					+ "<td> Un nombre real, alias, dirección postal, identificador personal único, identificador en línea, dirección de protocolo de Internet, dirección de correo electrónico, nombre de cuenta, número de seguro social, número de licencia de conducir, número de pasaporte u otros identificadores similares. </td>\r\n"
					+ "<td> sí </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> b. Información personal Categorías listadas en el Estatuto de los registros de los clientes de California (Cal. Civ. Código § 1798.80 (E). </td>\r\n"
					+ "<td> Un nombre, firma, número de seguro social, características físicas o descripción, dirección, número de teléfono, número de pasaporte, licencia de conducir o número de tarjeta de identificación de estado, número de póliza de seguro, educación, empleo, historia de empleo, número de cuenta bancaria, tarjeta de crédito Número, número de tarjeta de débito, o cualquier otra información financiera, información médica o información de seguro de salud. </td>\r\n"
					+ "<td> sí </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> c. Características de clasificación protegidas bajo la ley de California o Federal. </td>\r\n"
					+ "<td> edad (40 años o más), raza, color, ascendencia, origen nacional, ciudadanía, religión o credo, estado civil, condición médica, discapacidad física o mental, sexo (que incluye género, identidad de género, expresión de género, embarazo o Parto y afecciones médicas relacionadas), orientación sexual, veterano o estado militar, información genética (incluida la información genética familiar). </td>\r\n"
					+ "<td> sí </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> d. Información comercial. </td>\r\n"
					+ "<td> Registros de propiedad personal, productos o servicios adquiridos, obtenidos, o considerados u otros historiales o tendencias de compras o consumidores. </td>\r\n"
					+ "<td> sí </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> e. Información biométrica. </td>\r\n"
					+ "<td> características genéticas, fisiológicas, de comportamiento y biológicas, o patrones de actividad utilizados para extraer una plantilla u otro identificador o información de identificación, como las huellas dactilares, las huellas faciales y las expresiones de voz, las exploraciones de iris o la retina, la pulsación de teclas, la marcha u otros patrones físicos y sueño, salud o datos de ejercicio. </td>\r\n"
					+ "<td> sí </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> f. Internet u otra actividad de red similar. </td>\r\n"
					+ "<td> Historial de navegación, historial de búsqueda, información sobre la interacción de un consumidor con un sitio web, aplicación o publicidad. </td>\r\n"
					+ "<td> sí </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> g. Datos de geolocalización. </td>\r\n"
					+ "<td> Ubicación física o movimientos. </td>\r\n"
					+ "<td> sí </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> h. Datos sensoriales. </td>\r\n"
					+ "<td> Audio, información electrónica, visual, térmica, olfativa o similar. </td>\r\n"
					+ "<td> sí </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> i. Información profesional o relacionada con el empleo. </td>\r\n"
					+ "<td> Historial de trabajo actual o anterior o evaluaciones de rendimiento. </td>\r\n"
					+ "<td> sí </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> j. Información de educación no pública (según la Ley de Derechos Educativos y Privacidad de la Familia (20 U.SS.S.C. SECCIÓN 1232G, 34 C.F.R. PARTE 99)). </td>\r\n"
					+ "<td> registros de educación directamente relacionados con un estudiante mantenido por una institución educativa o parte que actúa en su nombre, como las calificaciones, las transcripciones, las listas de clases, los horarios de los estudiantes, los códigos de identificación de los estudiantes, la información financiera de los estudiantes o los registros disciplinarios de los estudiantes. </ td >\r\n"
					+ "<td> sí </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> k. Inferencias extraídas de otra información personal. </td>\r\n"
					+ "<td> Perfil que refleja las preferencias de una persona, las características, las tendencias psicológicas, las predisposiciones, el comportamiento, las actitudes, la inteligencia, las habilidades y las aptitudes. </td>\r\n"
					+ "<td> sí </td>\r\n"
					+ "</tr>\r\n"
					+ "</tbody>\r\n"
					+ "</table>"
					+ "La información personal no incluye:\r\n"
					+ "<ul>\r\n"
					+ " <li> información disponible públicamente de registros gubernamentales. </li>\r\n"
					+ " <li> Información de consumo prededificado o agregado. </li>\r\n"
					+ " <li> información excluida del alcance de la CCPA, como cierta salud o información médica y otras categorías de información protegidas por diferentes leyes. </li>\r\n"
					+ "</li>\r\n"
					+ "Obtenemos las categorías de información personal enumeradas anteriormente desde las siguientes categorías de fuentes:\r\n"
					+ "<ul>\r\n"
					+ " <li> directamente de usted. Por ejemplo, de los formularios que usted completa o productos y servicios que compra. </li>\r\n"
					+ " <li> indirectamente de usted. Por ejemplo, de observar sus acciones en nuestro sitio web. </li>\r\n"
					+ "</li>\r\n"
					+ "<h3> Uso de información personal </h3>\r\n"
					+ "Podemos usar o divulgar la información personal que recopilamos para uno o más de los siguientes fines comerciales:\r\n"
					+ "<ul>\r\n"
					+ " <li> para cumplir o cumplir con la razón por la que proporcionó la información. Por ejemplo, si comparte su nombre y la información de contacto para solicitar una cotización de precio o hacer una pregunta sobre nuestros servicios, usaremos esa información personal para responder a su consulta. Si proporciona su información personal para comprar un producto o servicio, usaremos esa información para procesar su pago y facilitar la entrega. También podemos guardar su información para facilitar los pedidos de nuevos productos o devoluciones de procesos. </li>\r\n"
					+ " <li> para procesar sus solicitudes, compras, transacciones y pagos y prevenir el fraude transaccional. </li>\r\n"
					+ " <LI> para brindarle apoyo y responder a sus consultas, incluso para investigar y abordar sus inquietudes y monitorear y mejorar nuestras respuestas. </li>\r\n"
					+ " <li> para responder a las solicitudes de cumplimiento de la ley y según lo exige la ley aplicable, la orden judicial o las regulaciones gubernamentales. </li>\r\n"
					+ " <li> como se describe al recopilar su información personal o, como se establece de otra manera en la CCPA. </li>\r\n"
					+ " <li> para evaluar o realizar una fusión, desinversión, reestructuración, reorganización, disolución u otra venta o transferencia de algunos o todos nuestros o nuestros activos de los afiliados en los que la información personal que realiza nosotros o nuestros afiliados sobre nuestros usuarios del sitio web se encuentran entre Los activos transferidos. </li>\r\n"
					+ "</li>\r\n"
					+ "No recopilaremos categorías adicionales de información personal o utilizaremos la información personal que recopilamos para fines materiales, no relacionados o incompatibles sin proporcionarle notificación.\r\n"
					+ "<h3> Compartir información personal </h3>\r\n"
					+ "Podemos divulgar su información personal a un tercero para un propósito comercial. Cuando revelamos información personal para un propósito comercial, ingresamos un contrato que describe el propósito y requiere que el destinatario mantenga la información personal confidencial y no la use para cualquier propósito, excepto en el futuro.\r\n"
					+ "\r\n"
					+ "Compartimos su información personal con las siguientes categorías de terceros:\r\n"
					+ "<ul>\r\n"
					+ " <li> proveedores de servicios. </li>\r\n"
					+ " <li> agregadores de datos. </li>\r\n"
					+ "</li>\r\n"
					+ "<h3> Sus derechos y opciones </h3>\r\n"
					+ "La CCPA proporciona a los consumidores (residentes de California) con derechos específicos con respecto a su información personal. Esta sección describe sus derechos de CCPA y explica cómo ejercer esos derechos.\r\n"
					+ "<h4> Acceso a información específica y derechos de portabilidad de datos </h4>\r\n"
					+ "Usted tiene el derecho de solicitar que le divulgamos cierta información sobre nuestra recopilación y uso de su información personal en los últimos 12 meses. Una vez que recibamos y confirmemos su solicitud de consumidor verificable (consulte Ejercicio de acceso, portabilidad de datos y derechos de eliminación), lo revelaremos:\r\n"
					+ "<ul>\r\n"
					+ " <li> Las categorías de información personal que hemos recopilado sobre usted. </li>\r\n"
					+ " <li> Las categorías de fuentes para la información personal que hemos recopilado sobre usted. </li>\r\n"
					+ " <li> Nuestro propósito comercial o comercial para recolectar o vender esa información personal. </li>\r\n"
					+ " <li> Las categorías de terceros con las que compartimos esa información personal. </li>\r\n"
					+ " <li> Las piezas específicas de información personal que hemos recopilado sobre usted (también llamado solicitud de portabilidad de datos). </li>\r\n"
					+ " <li> Si vendimos o revelamos su información personal para un propósito comercial, dos listas separadas que revelan:\r\n"
					+ "<ul>\r\n"
					+ " <li> ventas, identificando las categorías de información personal que compró cada categoría de destinatario; y </li>\r\n"
					+ " <li> divulgaciones para un propósito comercial, identificando las categorías de información personal que se obtuvo cada categoría de destinatario. </li>\r\n"
					+ "</li>\r\n"
					+ "</li>\r\n"
					+ "</li>\r\n"
					+ "<h4> Derechos de solicitud de eliminación </h4>\r\n"
					+ "Usted tiene el derecho de solicitar que eliminemos cualquiera de sus información personal que recopilamos de usted y retenidos, sujeto a ciertas excepciones. Una vez que recibamos y confirmemos su solicitud de consumidor verificable (consulte Ejercicio de acceso, portabilidad de datos y derechos de eliminación), eliminaremos (y dirigiremos a nuestros proveedores de servicios para eliminar) su información personal de nuestros registros, a menos que se aplique una excepción.\r\n"
					+ "\r\n"
					+ "Podemos negar su solicitud de eliminación si retenga la información es necesaria para nosotros o para nuestros proveedores de servicios:\r\n"
					+ "<ul>"
					+ "<li> Complete la transacción para la cual recopilamos la información personal, brinde un buen o servicio que solicitó, tome medidas razonablemente anticipadas en el contexto de nuestra relación comercial en curso, o de lo contrario realizar nuestro contrato con usted. </li>\r\n"
					+ " <li> detectar incidentes de seguridad, proteger contra la actividad maliciosa, engañosa, fraudulenta o ilegal, o procesar a los responsables de tales actividades. </li>\r\n"
					+ " <li> Productos de depuración para identificar y reparar errores que impiden la funcionalidad prevista existente. </li>\r\n"
					+ " <li> Cumplir con la Ley de Privacidad de Comunicaciones Electrónicas de California (CAL. Código Penal § 1546 SEC.). Habilitar únicamente usos internos que están razonablemente alineados con las expectativas de los consumidores en función de su relación con nosotros. </li>\r\n"
					+ " <li> Cumplir con una obligación legal. </li>\r\n"
					+ " <li> Haz que otros usos internos y legales de esa información son compatibles con el contexto en el que lo proporcionaste. </li>\r\n"
					+ "</ul>\r\n"
					+ "<H4> Ejercicio de acceso, portabilidad de datos y derechos de eliminación </h4>\r\n"
					+ "Para ejercer el acceso, la portabilidad de datos y los derechos de eliminación descritos anteriormente, envíe una solicitud de consumo verificable por cualquiera de nosotros:\r\n"
					+ "<ul>\r\n"
					+ " <li> nos llamando en </li>\r\n"
					+ " <li> enviándonos un correo electrónico a "+email+" </li>\r\n"
					+ "</ul>\r\n"
					+ "Solo usted, o una persona registrada con el Secretario de Estado de California que usted autoriza a actuar en su nombre, puede realizar una solicitud de consumidor verificable relacionada con su información personal. También puede realizar una solicitud de consumidor verificable en nombre de su hijo menor.\r\n"
					+ "\r\n"
					+ "Solo puede hacer una solicitud de consumidor verificable de acceso o portabilidad de datos dos veces dentro de un período de 12 meses. La solicitud de consumo verificable debe:\r\n"
					+ "<ul>\r\n"
					+ " <li> Proporcionar suficiente información que nos permita verificar razonablemente, usted es la persona sobre quienes recopilamos información personal o un representante autorizado. </li>\r\n"
					+ " <li> Describa su solicitud con detalles suficientes que nos permite comprender, evaluar y responder adecuadamente. </li>\r\n"
					+ "</ul>\r\n"
					+ "No podemos responder a su solicitud o proporcionarle información personal si no podemos verificar su identidad o autoridad para hacer la solicitud y confirmar que la información personal se relaciona con usted.\r\n"
					+ "\r\n"
					+ "Hacer una solicitud de consumo verificable no requiere que cree una cuenta con nosotros.\r\n"
					+ "\r\n"
					+ "Solo usaremos información personal proporcionada en una solicitud verificable del consumidor para verificar la identidad o autoridad del solicitante para hacer la solicitud.\r\n"
					+ "<H4> Tiempo de respuesta y formato </h4>\r\n"
					+ "Nos esforzamos por responder a una solicitud de consumidor verificable dentro de los cuarenta y cinco (45) días posteriores a su recepción. Si necesitamos más tiempo, le informaremos de la razón y el período de extensión por escrito.\r\n"
					+ "\r\n"
					+ "Entregaremos nuestra respuesta por escrito por correo o electrónicamente, a su opción.\r\n"
					+ "\r\n"
					+ "Cualquier divulgación que proporcionamos solo cubrirá el período de 12 meses que precede al recibo de solicitud de consumidor verificable. La respuesta que proporcionamos también explicará las razones por las que no podemos cumplir con una solicitud, si corresponde. Para solicitudes de portabilidad de datos, seleccionaremos un formato para proporcionar su información personal que sea fácilmente útil y debe permitirle transmitir la información de una entidad a otra entidad sin obstáculos.\r\n"
					+ "\r\n"
					+ "No cobramos una tarifa para procesar o responder a su solicitud de consumo verificable a menos que sea excesivo, repetitivo o manifiestamente infundado. Si determinamos que la solicitud le garantiza una tarifa, le diremos por qué tomamos esa decisión y le proporcionamos una estimación de costos antes de completar su solicitud.\r\n"
					+ "<H4> VENTA DE INFORMACIÓN PERSONAL </h4>\r\n"
					+ "No venderemos su información personal a ninguna parte. Si en el futuro, anticipamos que vendamos su información personal a cualquier parte, le proporcionaremos los derechos de exclusión y opciones de entrada requeridas por la CCPA.\r\n"
					+ "<h3> No discriminación </h3>\r\n"
					+ "No discriminaremos en su contra para ejercer ninguno de sus derechos de CCPA. A menos que la CCPA lo permita, no lo haremos:\r\n"
					+ "<ul>\r\n"
					+ " <li> negar sus bienes o servicios. </li>\r\n"
					+ " <li> le cobran diferentes precios o tasas de bienes o servicios, incluso a través de otorgar descuentos u otros beneficios, o imponer sanciones. </li>\r\n"
					+ " <li> le proporciona un nivel o calidad diferente de bienes o servicios. </li>\r\n"
					+ " <li> Sugerir que puede recibir un precio o tasa diferente para bienes o servicios o un nivel diferente o calidad de bienes o servicios. </li>\r\n"
					+ "</ul>\r\n"
					+ "<h3> Otros derechos de privacidad de California </h3>\r\n"
					+ "La ley \"Shine The Light\" de California (Sección de Código Civil § 1798.83) permite a los usuarios de nuestro sitio web que son residentes de California para solicitar cierta información sobre nuestra divulgación de información personal a terceros con fines de marketing directo. Para hacer tal solicitud, envíe un correo electrónico a "+email+".\r\n"
					+ "<h3> CAMBIOS A NUESTRO AVISO DE PRIVACIDAD </h3>\r\n"
					+ "Nos reservamos el derecho de modificar este aviso de privacidad a nuestra discreción y en cualquier momento. Cuando realicemos cambios en este Aviso de privacidad, publicaremos el Aviso actualizado en nuestro sitio web y actualizaremos la fecha de vigencia de la fecha de Aviso. Su uso continuado de nuestro sitio web después de la publicación de cambios constituye su aceptación de tales cambios."
					+ "<h3> Información de contacto </h3>\r\n"
					+ "Si tiene alguna pregunta o comentario sobre este aviso, las formas en que recopilamos y usamos su información que se describe a continuación y en nuestra Política de privacidad, sus opciones y derechos con respecto a dicho uso, o desean ejercer sus derechos en virtud de la ley de California, no lo haga Duida en contactarnos a:\r\n"
					+ ""
					+ "<ul>\r\n"
					+ " 	"
					+ " 	<li>Website: https://"+url+"</li>\r\n"
					+ " 	<li>Email: "+email+"</li>\r\n"
					+ "</ul>";
			CCPAFR="<!-- wp:heading {\"level\":3} -->\r\n"
					+ "<h3><strong>Avis de confidentialité pour les résidents de Californie</strong></h3>\r\n"
					+ "<!-- /wp:heading -->\r\n"
					+ "\r\n"
					+ "<!-- wp:heading {\"level\":4} -->\r\n"
					+ "<h4><strong><br /></strong>Définitions<br />Site Internet</h4>\r\n"
					+ "<!-- /wp:heading -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>"+name+" ou https://"+url+"</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p><strong>Propriétaire (ou nous)</strong></p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Indique la ou les personnes physiques ou une entité juridique qui fournit ce site Web aux utilisateurs.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p><strong>Utilisateur (ou vous)</strong></p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Indique toute personne physique ou une entité juridique utilisant ce site Web.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Cet avis de confidentialité des résidents de Californie complète les informations contenues dans la politique de confidentialité du site Web et s'applique uniquement à tous les visiteurs, utilisateurs et autres qui résident dans l'État de Californie. Nous avons adopté cet avis pour se conformer à la Loi sur la protection de la vie privée des consommateurs de Californie de 2018 (CCPA) et tous les termes définis dans la CCPA ont la même signification lorsqu'il est utilisé dans cet avis.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p><strong>Informations que nous collectons</strong></p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Le site Web collecte des informations identifiées, concerne, décrit, les références, est capable d'être associée à ou pourrait être raisonnablement liée, directement ou indirectement, avec un consommateur ou un dispositif particulier (\"Informations personnelles\").</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>En particulier, le site Web a collecté les catégories d'informations personnelles suivantes de ses consommateurs au cours des 12 derniers mois:</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+"<table>\r\n"
					+ "<thead>\r\n"
					+ "<tr>\r\n"
					+ "<th> catégorie </th>\r\n"
					+ "<th> Exemples </th>\r\n"
					+ "<th> collecté </th>\r\n"
					+ "</tr>\r\n"
					+ "</thead>\r\n"
					+ "<tbody>\r\n"
					+ "<tr>\r\n"
					+ "<td> a. Identificateurs. </td>\r\n"
					+ "<td> Un vrai nom, un alias, une adresse postale, un identifiant personnel unique, un identifiant en ligne, une adresse de protocole Internet, une adresse e-mail, un nom de compte, un numéro de sécurité sociale, un numéro de permis de conduire, un numéro de passeport ou d'autres identifiants similaires. </td>\r\n"
					+ "<td> oui </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> b. Catégories d'informations personnelles répertoriées dans le statut des enregistrements des clients de Californie (Cal. Civ. Code § 1798.80 (e)). </td>\r\n"
					+ "<td> Un nom, une signature, un numéro de sécurité sociale, des caractéristiques physiques ou une description, l'adresse, le numéro de téléphone, le numéro de passeport, le permis de conduire ou le numéro de carte d'identification de l'État, le numéro de police d'assurance, l'éducation, l'emploi, les antécédents d'emploi, le numéro de compte bancaire, la carte de crédit numéro, numéro de carte de débit ou toute autre information financière, informations médicales ou assurance maladie. </td>\r\n"
					+ "<td> oui </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> c. Caractéristiques de classification protégées en vertu de la Californie ou de la loi fédérale. </td>\r\n"
					+ "<td> Âge (40 ans ou plus), race, couleur, ascendance, origine nationale, citoyenneté, religion ou croyance, état mat l'accouchement et les conditions médicales connexes), l'orientation sexuelle, le statut de vétéran ou militaire, les informations génétiques (y compris les informations génétiques familiales). </td>\r\n"
					+ "<td> oui </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> d. Informations commerciales. </td>\r\n"
					+ "<td> Enregistrements de biens personnels, de produits ou de services achetés, obtenus ou envisagés, ou d'autres histoires ou tendances d'achat ou de consommation. </td>\r\n"
					+ "<td> oui </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> e. Informations biométriques. </td>\r\n"
					+ "<td> Caractéristiques génétiques, physiologiques, comportementales et biologiques, ou les modèles d'activité utilisés pour extraire un modèle ou un autre identifiant ou des informations d'identification, telles que les empreintes digitales, les faces de mise en couverture et les empreintes de voix, les scans de rétine, la frappe, la démarche ou d'autres modèles physiques et les données de sommeil, de santé ou d'exercice. </td>\r\n"
					+ "<td> oui </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> f. Internet ou autre activité de réseau similaire. </td>\r\n"
					+ "<td> Historique de navigation, historique de recherche, informations sur l'interaction d'un consommateur avec un site Web, une application ou une publicité. </td>\r\n"
					+ "<td> oui </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> g. Données de géolocalisation. </td>\r\n"
					+ "<td> Emplacement ou mouvements physiques. </td>\r\n"
					+ "<td> oui </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> H. Données sensorielles. </td>\r\n"
					+ "<td> Audio, électronique, visuel, thermique, olfactif ou similaire. </td>\r\n"
					+ "<td> oui </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> i. Informations professionnelles ou liées à l'emploi. </td>\r\n"
					+ "<td> Historique actuel ou passé ou évaluation des performances. </td>\r\n"
					+ "<td> oui </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> J. Informations sur l'éducation non publique (selon la Family Educational Rights and Privacy Act (20 U.S.C. Section 1232G, 34 C.F.R. Part 99)). </td>\r\n"
					+ "<td> Dossiers d'éducation directement liés à un étudiant entretenu par un établissement d'enseignement ou une partie agissant en son nom, tels que les notes, les transcriptions, les listes de classe, les horaires des étudiants, les codes d'identification des étudiants, l'information financière des étudiants ou les dossiers disciplinaires des étudiants. </ TD >\r\n"
					+ "<td> oui </td>\r\n"
					+ "</tr>\r\n"
					+ "<tr>\r\n"
					+ "<td> K. Inférences tirées d'autres informations personnelles. </td>\r\n"
					+ "<td> Profil reflétant les préférences, les caractéristiques, les tendances psychologiques, les prédispositions, les comportements, les attitudes, l'intelligence, les capacités et les aptitudes. </td>.\r\n"
					+ "<td> oui </td>\r\n"
					+ "</tr>\r\n"
					+ "</tbody>\r\n"
					+ "</table>"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Les informations personnelles n'incluent pas:</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Informations publiquement disponibles auprès des archives gouvernementales.<br />Informations de consommation désidentifiées ou agrégées.<br />Les informations exclues de la portée de la CCPA, comme certaines informations sur la santé ou les informations médicales et d'autres catégories d'informations protégées par différentes lois.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Nous obtenons les catégories d'informations personnelles énumérées ci-dessus dans les catégories suivantes de sources:</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Directement de votre part. Par exemple, des formulaires que vous achetez ou des produits et des services que vous achetez.<br />Indirectement de vous. Par exemple, d'observer vos actions sur notre site Web.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p><br /><strong>Utilisation d'informations personnelles</strong></p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Nous pouvons utiliser ou divulguer les informations personnelles que nous collectons pour un ou plusieurs des objectifs commerciaux suivants:</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Pour remplir ou rencontrer la raison pour laquelle vous avez fourni les informations. Par exemple, si vous partagez votre nom et vos coordonnées pour demander un devis de prix ou poser une question sur nos services, nous utiliserons ces informations personnelles pour répondre à votre demande. Si vous fournissez vos informations personnelles à l'achat d'un produit ou d'un service, nous utiliserons ces informations pour traiter votre paiement et faciliter la livraison. Nous pouvons également enregistrer vos informations pour faciliter les nouvelles commandes de produits ou les retours de processus.<br />Pour traiter vos demandes, vos achats, vos transactions et vos paiements et prévenir la fraude transactionnelle.<br />Pour vous fournir un soutien et répondre à vos demandes de renseignements, y compris pour enquêter et répondre à vos préoccupations et à surveiller et à améliorer nos réponses.<br />Répondre aux demandes de maintien de l'ordre et conformément à la législation applicable, ordonnance du tribunal ou réglementation gouvernementale.<br />Comme décrit à vous lors de la collecte de vos informations personnelles ou d'être configurées dans la CCPA.<br />Évaluer ou effectuer une fusion, une cession, une restructuration, une réorganisation, une dissolution ou une autre vente ou transfert de tout ou partie de nos actifs de nos affiliés dans lesquels des informations personnelles détenues par nous ou nos affiliés sur nos utilisateurs de notre site Web sont parmi les actifs transférés .</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Nous ne collecterons pas de catégories supplémentaires d'informations personnelles ni d'utiliser les informations personnelles que nous collectons pour des fins matériellement différentes, non liées ou incompatibles sans vous fournir un avis.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p><strong>Partage d'informations personnelles</strong></p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Nous pouvons divulguer vos informations personnelles à une tierce partie à des fins commerciales. Lorsque nous divulguons des informations personnelles à des fins commerciales, nous entrons dans un contrat qui décrit l'objectif et oblige le destinataire à garder ces informations personnelles confidentielles et ne l'utilisez pas à quelque fin que ce soit, à l'exception du contrat.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Nous partageons vos informations personnelles avec les catégories suivantes de tiers:</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Les fournisseurs de services.<br />Agrégateurs de données.<br />Vos droits et choix</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>La CCPA fournit aux consommateurs (résidents de la Californie) avec des droits spécifiques concernant leurs informations personnelles. Cette section décrit vos droits de la CCPA et explique comment exercer ces droits.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p><strong>Accès à des informations spécifiques sur les informations et les droits de portabilité des données</strong></p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Vous avez le droit de demander que nous vous divulguions certaines informations sur notre collecte et l'utilisation de vos informations personnelles au cours des 12 derniers mois. Une fois que nous recevons et confirmons votre demande de consommation vérifiable (voir l'exercice de l'accès, la portabilité des données et les droits de suppression), nous vous communiquerons:</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Les catégories d'informations personnelles que nous avons collectées à votre sujet.<br />Les catégories de sources pour les informations personnelles que nous avons collectées à votre sujet.<br />Notre bureau ou notre objectif commercial pour la collecte ou la vente d'informations personnelles.<br />Les catégories de tiers avec lesquelles nous partageons ces informations personnelles.<br />Les pièces spécifiques d'informations personnelles que nous avons collectées à votre sujet (également appelées demande de portabilité de données).<br />Si nous vendions ou divulguions vos informations personnelles à des fins commerciales, deux listes distinctes décrivant:<br />Ventes, identifiant les catégories d'informations personnelles que chaque catégorie de bénéficiaire achetée; et<br />Divulgations à des fins commerciales, identifiant les catégories d'informations personnelles que chaque catégorie de destinataire obtenue.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p><strong>Demande de demande de suppression</strong></p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Vous avez le droit de demander que nous supprimons l'une de vos informations personnelles que nous avons collectées chez vous et conservées, sous réserve de certaines exceptions. Une fois que nous recevons et confirmons votre demande de consommation vérifiable (voir l'exercice de l'accès, la portabilité des données et les droits de suppression), nous supprimerons (et dirigez-vous nos fournisseurs de services pour supprimer) vos informations personnelles de nos dossiers, à moins qu'une exception ne s'applique.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Nous pouvons refuser votre demande de suppression si le conservation des informations est nécessaire pour nous ou notre fournisseur de services à:</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Complétez la transaction pour laquelle nous avons collecté les informations personnelles, fournit un bon ou un service que vous avez demandé, prenez des mesures raisonnablement anticipées dans le contexte de nos relations commerciales en cours avec vous ou effectuez autrement notre contrat avec vous.<br />Détecter les incidents de sécurité, protéger contre des activités malveillantes, trompeuses, frauduleuses ou illégales, ou poursuivre les responsables de ces activités.<br />Produits de débogage Pour identifier et réparer les erreurs qui altérent la fonctionnalité souhaitée.<br />Se conformer à la Loi sur la protection des communications électroniques de la Californie (COP. Code pénal § 1546 SEQ.). Activez uniquement les utilisations internes relativement alignées sur les attentes des consommateurs en fonction de votre relation avec nous.<br />Se conformer à une obligation légale.<br />Faites d'autres utilisations internes et légales de ces informations compatibles avec le contexte dans lequel vous l'avez fourni.<br />Exercer l'accès, la portabilité des données et les droits de suppression des données</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Pour exercer l'accès, la portabilité des données et les droits de suppression décrits ci-dessus, veuillez nous envoyer une demande de consommation vérifiable à nous par rapport à:</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p><br />Nous envoyer un e-mail à "+email+"</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Seulement vous, ou une personne inscrite auprès du secrétaire d'État de Californie que vous autorisez à agir en votre nom, peut faire une demande de consommation vérifiable liée à vos informations personnelles. Vous pouvez également faire une demande de consommation vérifiable au nom de votre enfant mineur.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Vous ne pouvez faire qu'une demande de consommation vérifiable pour l'accès ou la portabilité des données deux fois dans une période de 12 mois. La demande de consommation vérifiable doit:</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Fournir des informations suffisantes qui nous permettent de vérifier raisonnablement que vous êtes la personne dont nous avons collecté des informations personnelles ou un représentant autorisé.<br />Décrivez votre demande avec suffisamment de détails qui nous permettent de bien comprendre, d'évaluer et de y répondre correctement.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Nous ne pouvons pas répondre à votre demande ni vous fournir des informations personnelles si nous ne pouvons pas vérifier votre identité ou votre autorité pour apporter la demande et confirmer que les informations personnelles vous concernent.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Faire une demande de consommation vérifiable ne nécessite pas de créer un compte avec nous.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Nous n'utiliserons que des informations personnelles fournies dans une demande de consommation vérifiable pour vérifier l'identité ou l'autorité du demandeur de faire la demande.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p><strong>Timing de réponse et format</strong></p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Nous nous efforçons de répondre à une demande de consommation vérifiable dans les quarante-cinq (45) jours suivant sa réception. Si nous avons besoin de plus de temps, nous vous informerons de la période de la raison et de la prolongation par écrit.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Nous livrerons notre réponse écrite par courrier ou par voie électronique, à votre option.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Toute information que nous fournissons ne couvrira que la période de 12 mois précédant la réception de la demande de consommation vérifiable. La réponse que nous fournissons vous expliquera également les raisons pour lesquelles nous ne pouvons pas respecter une demande, le cas échéant. Pour les demandes de portabilité des données, nous sélectionnerons un format pour fournir vos informations personnelles facilement utilisables et vous permettrons de transmettre les informations d'une entité à une autre entité sans entrave.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Nous ne facturons pas de frais pour traiter ou répondre à votre demande de consommation vérifiable à moins que cela ne soit excessif, répétitif ou manifestement non fondé. Si nous déterminons que la demande garantit des frais, nous vous dirons pourquoi nous avons pris cette décision et nous vous fournirons une estimation des coûts avant de terminer votre demande.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p><strong>Ventes d'informations personnelles</strong></p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Nous ne vendrons pas vos informations personnelles à une fête. Si, à l'avenir, nous prévoyons la vente de vos informations personnelles à une partie, nous vous fournirons les droits de désinscription et d'opt-in requis par la CCPA.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p><strong>Non-discrimination</strong></p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Nous ne ferons pas de discrimination contre vous pour avoir exercé les droits de votre CCPA. Sauf autorisation de la CCPA, nous ne le ferons pas:</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p><strong>Nier vos biens ou services.<br /></strong>Vous facturer des prix différents ou des tarifs pour des biens ou des services, y compris en accordant des rabais ou d'autres avantages, ou imposant des sanctions.<br />Vous fournir un niveau différent ou une qualité de biens ou de services.<br />Suggérez que vous pouvez recevoir un prix ou un tarif différent pour des biens ou des services ou un niveau différent ou une qualité de biens ou de services.<br />Autres droits de confidentialité de la Californie</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>La loi \"briller la lumière\" de Californie (section Code civil § 1798.83) permet aux utilisateurs de notre site Web qui sont des résidents de Californie à demander certaines informations concernant notre divulgation d'informations personnelles à des tiers à des fins de marketing direct. Pour faire une telle demande, veuillez envoyer un email à "+email+".</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p><strong>Changements à notre avis de confidentialité</strong></p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Nous nous réservons le droit de modifier cet avis de confidentialité à notre discrétion et à tout moment. Lorsque nous apportons des modifications à cet avis de confidentialité, nous publierons l'avis mis à jour sur notre site Web et mettrons à jour la date d'effet de la notification. Votre utilisation continue de notre site Web après l'affichage des modifications constitue votre acceptation de tels changements.</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p><strong>Coordonnées</strong></p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Si vous avez des questions ou des commentaires sur cet avis, la manière dont nous collectons et utilisez vos informations décrites ci-dessous et dans notre politique de confidentialité, vos choix et vos droits concernant cette utilisation, ou souhaitez exercer vos droits en vertu de la loi en Californie, veuillez ne pas faire hésiter à nous contacter à:</p>\r\n"
					+ "<!-- /wp:paragraph -->\r\n"
					+ "\r\n"
					+ "<!-- wp:paragraph -->\r\n"
					+ "<p>Site Web: https://"+url+"<br />Email: "+email+"</p>\r\n"
					+ "<!-- /wp:paragraph --></td>\r\n"
					+ "</tr>\r\n"
					+ "</thead>\r\n"
					+ "</table>";

			if (rdbtnNewRadioButton.isSelected()) {About=AboutENG;
			DCMA=DCMAENG;
			Aboutn="About us";
			DCMAn="DMCA";
			disc=dis;
			disn="Disclaimer";
			Cookie=CPENG;
			cookien="Cookie Policy";
			C=CCPA;
			}
			else if (rdbtnNewRadioButton_1.isSelected()) {About=AboutFR;
			DCMA=DCMAFR;
			Aboutn="A propos de nous";
			DCMAn="DMCA";
			disc=disfr;
			Cookie=CPFR;
			C=CCPAFR;
			disn="Avertissement";
			cookien="Politique de cookie";
			}
			else if( rdbtnNewRadioButton_2.isSelected()) {About=AboutESP;
			Aboutn="sobre nosotros";
			DCMA=DCMAESP;
			DCMAn="DMCA";
			disc=disESP;
			disn="Descargo de responsabilidad";
			C=CCPAESP;
			Cookie=CPESP;
			cookien="Política de cookies";
			
			disn="Descargo de responsabilidad";}
			else if( rdbtnNewRadioButton_3.isSelected()) {About=AboutJP;}
			else if( rdbtnNewRadioButton_4.isSelected()) {About=AboutAR;
			C=CCPAAR;
			Aboutn="نحن من";
			DCMA=DMCAAR;
			}
			
			}
			
			
			
			
		});
		btnNewButton_2.setBounds(276, 316, 148, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Publish");
		btnNewButton_3.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				String username;
				String password;
				
				Integer result1 = null;
				Integer result2 = null;
				Integer result3 = null;
				Integer result4 = null;
				Integer result5 = null;
				Integer result6 = null;
				Integer result7 = null;
					username=textField_3.getText();
					password=passwordField.getText();
					
						Wordpress wp = null;
						
						//"https://"+gurl+"//xmlrpc.php"
						try {
							wp = new Wordpress(username, password, "https://"+gurl+"/xmlrpc.php");

						} catch (MalformedURLException e1) {
							// TODO Auto-generated catch block
					
								// TODO Auto-generated catch block
								error err = new error(e1.toString());
								err.setVisible(true);
								frame.dispose();
							}
							

							
						
					
				

						try {
							Post CP=new Post();
					Post PP= new Post();
					
					Post TC=new Post();
					Post D=new Post();
					Post AB=new Post();
					Post Di=new Post();
					Post CC=new Post();
					
					
					PP.setPost_type("page");
					TC.setPost_type("page");
					D.setPost_type("page");
					AB.setPost_type("page");
					Di.setPost_type("page");
					CC.setPost_type("page");
					CP.setPost_type("page");
					
					PP.setPost_title(privacyn);
					PP.setPost_content(privacy);
					PP.setPost_status("publish");
					
					TC.setPost_title(termsn);
					TC.setPost_content(terms);
					TC.setPost_status("publish");
					
					CC.setPost_title("CCPA");
					CC.setPost_content(C);
					CC.setPost_status("publish");
					
					CP.setPost_title(cookien);
					CP.setPost_content(Cookie);
					CP.setPost_status("publish");
					
					D.setPost_title(DCMAn);
					D.setPost_content(DCMA);
					D.setPost_status("publish");
					
					AB.setPost_title(Aboutn);
					AB.setPost_content(About);
					AB.setPost_status("publish");

					
					Di.setPost_title(disn);
					Di.setPost_content(disc);
					Di.setPost_status("publish");
					
					

					
				
				
					if(pp) {
					result1 = wp.newPost(PP);}
					if(tc) {
					result2 = wp.newPost(TC);}
					if(cc) {
					result3 = wp.newPost(CC);}
					if(di) {
					result4 = wp.newPost(Di);}
					if(cp) {
					result5 = wp.newPost(CP);}
					if(dm) {
					result6 = wp.newPost(D);}
					if(ab) {
					result7 = wp.newPost(AB);}
					
						
					} catch (InsufficientRightsException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InvalidArgumentsException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ObjectNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (XmlRpcFault e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					
						
						

						
						
					} catch (XmlRpcException e1) {error err = new error(e1.toString());err.setVisible(true);
					frame.dispose();}
					String o="";
					o=o+("new Privacy Policy page id: " + result1+"\n");
					o=o+("new Terms and conditions page id: " + result2+"\n");
					o=o+("new CCPA page id: " + result3+"\n");
					o=o+("new Disclaimer page id: " + result4+"\n");
					o=o+("new Cookie Policy page id: " + result5+"\n");
					o=o+("new DMCA page id: " + result6+"\n");
					o=o+("new About us page id: " + result7+"\n");

					
					error err = new error(o);
					err.setVisible(true);
				
					frame.dispose();
			
			}
		});
		btnNewButton_3.setBounds(157, 270, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setBounds(246, 47, 156, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(244, 99, 158, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(246, 147, 156, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Site/Company name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(246, 19, 156, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(246, 74, 156, 23);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("URL");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(246, 123, 156, 23);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Language");
		lblNewLabel.setBounds(34, 47, 70, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setBounds(119, 212, 66, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(82, 239, 153, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setBounds(299, 225, 66, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(276, 281, 117, 20);
		frame.getContentPane().add(passwordField);
		
		 final JCheckBox CheckBoxPrivacy = new JCheckBox("Privacy");
		 CheckBoxPrivacy.addChangeListener(new ChangeListener() {
		 	public void stateChanged(ChangeEvent e) {
		 		if (CheckBoxPrivacy.isSelected()) {pp=true;}
		 		if (!CheckBoxPrivacy.isSelected()) {pp=false;}
		 	}
		 });
		
		CheckBoxPrivacy.setBounds(143, 19, 97, 23);
		frame.getContentPane().add(CheckBoxPrivacy);
		
		
		final JCheckBox chckbxTerms = new JCheckBox("Terms");
		chckbxTerms.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (chckbxTerms.isSelected()) {tc=true;}
		 		if (!chckbxTerms.isSelected()) {tc=false;}
			}
		});
		chckbxTerms.setBounds(143, 46, 97, 23);
		frame.getContentPane().add(chckbxTerms);
		
		final JCheckBox chckbxCcpa = new JCheckBox("CCPA");
		chckbxCcpa.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (chckbxCcpa.isSelected()) {cc=true;}
		 		if (!chckbxCcpa.isSelected()) {cc=false;}
			}
		});
		chckbxCcpa.setBounds(143, 74, 97, 23);
		frame.getContentPane().add(chckbxCcpa);
		
		final JCheckBox chckbxDisclaimer = new JCheckBox("Disclaimer");
		chckbxDisclaimer.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (!chckbxDisclaimer.isSelected()) {di=false;}
		 		if (chckbxDisclaimer.isSelected()) {di=true;}
			}
		});
		chckbxDisclaimer.setBounds(143, 98, 97, 23);
		frame.getContentPane().add(chckbxDisclaimer);
		
		final JCheckBox chckbxCookiePolicy = new JCheckBox("Cookie Policy");
		chckbxCookiePolicy.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
					if (!chckbxCookiePolicy.isSelected()) {cp=false;}
			 		if (chckbxCookiePolicy.isSelected()) {cp=true;}
				
			}
		});
		chckbxCookiePolicy.setBounds(143, 123, 97, 23);
		frame.getContentPane().add(chckbxCookiePolicy);
		
		final JCheckBox chckbxDmca = new JCheckBox("DMCA");
		chckbxDmca.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
					if (!chckbxDmca.isSelected()) {dm=false;}
			 		if (chckbxDmca.isSelected()) {dm=true;}
				
			}
		});
		chckbxDmca.setBounds(143, 146, 97, 23);
		frame.getContentPane().add(chckbxDmca);
		
		final JCheckBox chckbxAboutUs = new JCheckBox("About us");
		chckbxAboutUs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
					if (!chckbxAboutUs.isSelected()) {ab=false;}
			 		if (chckbxAboutUs.isSelected()) {ab=true;}
				
			}
		});
		chckbxAboutUs.setBounds(145, 172, 97, 23);
		frame.getContentPane().add(chckbxAboutUs);
		
		JLabel lblNewLabel_4 = new JLabel("akrame413@gmail.com");
		lblNewLabel_4.setBounds(10, 341, 148, 14);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
