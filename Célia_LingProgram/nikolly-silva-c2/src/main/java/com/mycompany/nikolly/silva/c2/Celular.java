package com.mycompany.nikolly.silva.c2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nikaolly
 */
public class Celular {
//    ATRIBUTOS

    private String modelo;
    private Double espacoArmazenamento;
    private List<App> listaDeApps;

//    CONSTRUTOR
    public Celular(String modelo, Double espacoArmazenamento) {
        this.modelo = modelo;
        this.espacoArmazenamento = espacoArmazenamento;
        listaDeApps = new ArrayList<App>();
    }

//METODOS
    public void instalarApp(App app) {
        System.out.println("Instalando aplicativo...");
        if ((getEspacoArmazenamento() - app.getTamanho_GB()) >= 0) {
            listaDeApps.add(app);
            setEspacoArmazenamento(getEspacoArmazenamento() - app.getTamanho_GB());
        } else {
            System.out.println("-----------------------------------------------------------------------------------\n"
                    +"ERROR: \n"
                    + "O dispositivo não possuí espaço de armazenamento suficiente.");
        }
    }

    public void exibeAppsInstalados() {
        if (!listaDeApps.isEmpty()) {
            
            System.out.println(String.format(
                    "---------------------------------Seus Aplicativos----------------------------------\n"
                  + "   %s\n"
                  + "  Total de aplicativos: %d\n"
                  + "-----------------------------------------------------------------------------------",
                    getListaDeApps(), getListaDeApps().size()));
        }else{
            System.out.println("Esse dispositivo não possuí apps instalados.");
        }

    }

    public void exibeArmazenamentoDisponivel() {
        System.out.println(String.format("O dispositivo possuí %.2f de espaço de armazenamento disponível",
                getEspacoArmazenamento()));
    }

//    TO_STRING
    @Override
    public String toString() {
        return "Celular{" + "modelo=" + modelo + ", espacoArmazenamento=" + espacoArmazenamento + ", listaDeApps=" + listaDeApps + '}';
    }

//    GET E SET
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getEspacoArmazenamento() {
        return espacoArmazenamento;
    }

    public void setEspacoArmazenamento(Double espacoArmazenamento) {
        this.espacoArmazenamento = espacoArmazenamento;
    }

    public List<App> getListaDeApps() {
        return listaDeApps;
    }

    public void setListaDeApps(List<App> listaDeApps) {
        this.listaDeApps = listaDeApps;
    }

}
