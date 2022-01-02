package imt.nordeurope.j2ee.tp.Baey_Leclercq.tag;
import javax.servlet.jsp.tagext.TagSupport;

public class I18NWeather extends TagSupport {
    public String lang;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String key;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int doStartTag(){
        if(this.lang == null){
            this.setLang("en");
        }
        pageContext.getRequest().setAttribute("lang", this.getLang());
        return SKIP_BODY;
    }
}
