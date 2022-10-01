import Manager.KrediUI;
import Manager.OgretmenKrediManager;
import Manager.TarimKrediManager;

public class App {
    public static void main(String[] args) throws Exception {
        
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        TarimKrediManager tarimKrediManager = new TarimKrediManager();
        
        KrediUI krediUI = new KrediUI();
        
        krediUI.KrediHesapla(ogretmenKrediManager);
        krediUI.KrediHesapla(tarimKrediManager);
    }
}
