
package com.cokelek.bean;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;


@ManagedBean
@RequestScoped
public class Klarnet {
    
    
    private String plan1;
    private int plan2;
    private String plan3;
    private String plan4 = "<h:selectOneMenu><f:selectItem itemLabel='seran' itemValue='sercan' /></h:selectOneMenu>";
    private String adim;
    private String plan5;
    
    private Map<String,String> azizveysel =null;
    private String azizveysel_tek="";
    private List<String> veriler = null;
    
    private List<Gladyator> ask = null;
    
    @PostConstruct
    public void init(){
        
      veriler =  new LinkedList<String>();
        
         this.azizveysel = new LinkedHashMap<String,String>();
         
        this.azizveysel.put("nevide", "nevide");
        this.azizveysel.put("gozluk", "gozluk");
        this.azizveysel.put("ask", "ask");
        this.azizveysel.put("orospi", "orospi");
        this.azizveysel.put("okuz", "okuz");
        
        ask = new LinkedList<Gladyator>();
        this.ask.add(new Gladyator("nevide", "nevideOZEL"));
        this.ask.add(new Gladyator("gozluk", "gozlukOZEL"));
        this.ask.add(new Gladyator("ask", "askOZEL"));
        this.ask.add(new Gladyator("orospi", "orospiOZEL"));
        this.ask.add(new Gladyator("okuz", "okuzOZEL"));
        
    }

    public List<Gladyator> getAsk() {
        return ask;
    }

    public void setAsk(List<Gladyator> ask) {
        this.ask = ask;
    }
    
    public String dans(){
        String al = "";
        
        for(String k : this.veriler){
            al += "-"+k;
        }
        return al;
    }

    public String getPlan5() {
        return plan5;
    }

    public void setPlan5(String plan5) {
        this.plan5 = plan5;
    }

    
    public String getAdim() {
        return adim;
    }

    public void setAdim(String adim) {
        this.adim = adim;
    }

    public String getPlan1() {
        return plan1;
    }

    public void setPlan1(String plan1) {
        this.plan1 = plan1;
    }

    public int getPlan2() {
        return plan2;
    }

    public void setPlan2(int plan2) {
        this.plan2 = plan2;
    }

    public String getPlan3() {
        return plan3;
    }

    public void setPlan3(String plan3) {
        this.plan3 = plan3;
    }

    public String getPlan4() {
        return plan4;
    }

    public void setPlan4(String plan4) {
        this.plan4 = plan4;
    }

    public Map<String, String> getAzizveysel() {
        return azizveysel;
    }

    public void setAzizveysel(Map<String, String> azizveysel) {
        this.azizveysel = azizveysel;
    }

    public String getAzizveysel_tek() {
        return azizveysel_tek;
    }

    public void setAzizveysel_tek(String azizveysel_tek) {
        this.azizveysel_tek = azizveysel_tek;
    }

    public List<String> getVeriler() {
        return veriler;
    }

    public void setVeriler(List<String> veriler) {
        this.veriler = veriler;
    }

  
    
}
