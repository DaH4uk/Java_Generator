package sample;

import org.w3c.dom.Document;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by DaH4uk on 01.11.2015.
 */
public class VersionChecker extends Thread {


    @Override
    public void run() {
        String file = new String(System.getProperty("user.dir").replace('\\', '/') + "/" + "version.xml");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
        }

        Double currentVersion = parseXml(inputStream);
        System.out.println("Current version: " + currentVersion);


        String https_url = "https://raw.githubusercontent.com/DaH4uk/Java_Generator/master/src/Java_Generator_jar/version.xml";
        URL url;

        Double remoteVersion = null;
        try {

            url = new URL(https_url);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            System.out.println("Connected");

            InputStream in = con.getInputStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader inb = new BufferedReader(new InputStreamReader(in));

            String inputLine;

            while ((inputLine = inb.readLine()) != null) {
                System.out.println(inputLine);
            }


            remoteVersion = parseXml(in);


            System.out.println(remoteVersion);
            in.close();
            isr.close();
            inb.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Double parseXml(InputStream fXml) {
        Double version = null;

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(fXml);
            doc.getDocumentElement().normalize();

            version = Double.parseDouble(doc.getDocumentElement().getAttribute("JGenerator"));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return version;
    }
//    private void print_https_cert(HttpsURLConnection con){
//
//        if(con!=null){
//
//            try {
//
//                System.out.println("Response Code : " + con.getResponseCode());
//                System.out.println("Cipher Suite : " + con.getCipherSuite());
//                System.out.println("\n");
//
//                Certificate[] certs = con.getServerCertificates();
//                for(Certificate cert : certs){
//                    System.out.println("Cert Type : " + cert.getType());
//                    System.out.println("Cert Hash Code : " + cert.hashCode());
//                    System.out.println("Cert Public Key Algorithm : "
//                            + cert.getPublicKey().getAlgorithm());
//                    System.out.println("Cert Public Key Format : "
//                            + cert.getPublicKey().getFormat());
//                    System.out.println("\n");
//                }
//
//            } catch (SSLPeerUnverifiedException e) {
//                e.printStackTrace();
//            } catch (IOException e){
//                e.printStackTrace();
//            }
//
//        }
//
//    }
//
//    private void print_content(HttpsURLConnection con){
//        if(con!=null){
//
//            try {
//
//                System.out.println("****** Content of the URL ********");
//                BufferedReader br =
//                        new BufferedReader(
//                                new InputStreamReader(con.getInputStream()));
//
//                String input;
//
//                while ((input = br.readLine()) != null){
//                    System.out.println(input);
//                }
//                br.close();
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//    }
}
