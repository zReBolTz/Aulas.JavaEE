package br.com.senai.WillianFerreira.application.config;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;
//Essa é a configuração para forçar o eclipse a entender que estaremos usando JSF em toda a aplicação
@FacesConfig(version = Version.JSF_2_3) 

//Com o ApplicationScoped, podemos definir o tempo de vida dele
//Temos três tipos para definir esta vida: RequestScoped, ApplicationScoped e o SessionScoped
//RequestScoped= Terá seu funcionamento apenas quando for pedida um requisição
//ApplicationScoped= Estará em uso em toda aplicação, ou seja, em todo momento
//SessionScoped= Estará em uso quando a sessão estiver ativa, ou seja, enquanto a página estiver aberta.

@ApplicationScoped
public class Config {
}
