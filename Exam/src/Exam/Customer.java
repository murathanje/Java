package Exam;


public class Customer {
    
    int hesapNumarasi;
    String musteriAdi;
    float paraMiktari;
    public int getHesapNumarasi() {
        return hesapNumarasi;
    }


    public void setHesapNumarasi(int hesapNumarasi) {
        this.hesapNumarasi = hesapNumarasi;
    }


    public String getMusteriAdi() {
        return musteriAdi;
    }


    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }


    public float getParaMiktari() {
        return paraMiktari;
    }


    public void setParaMiktari(float paraMiktari) {
        this.paraMiktari = paraMiktari;
    }




    void musteriEkle(int _hesapNumarasi, String _musteriAdi, float _paraMiktari){

       this.hesapNumarasi =  _hesapNumarasi;
       this.musteriAdi = _musteriAdi;
       this.paraMiktari = _paraMiktari;
    }


    void paraYatir(float _tutar){
        this.paraMiktari += _tutar;
    }

    void paraCek(float _tutar) throws Exception{
        if(_tutar > paraMiktari){
            throw new Exception("Hesabinizda yeterli miktarda para yok.");
        }else{
            paraMiktari -= _tutar;
            System.out.println("Hesabinizdan belirttiğiniz miktarda para çekilmiştir");
        }
    }


    void kontrol(){
        System.out.println("Hesabinizdaki bakiyeniz: " + paraMiktari);
    }

    void goster(){
        System.out.println(hesapNumarasi + ": " + musteriAdi + " " + paraMiktari );
    }

}
