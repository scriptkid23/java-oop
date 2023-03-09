package DesignPattern.AdapterPattern;

// 
class DanChoi{
    void uong_ruou(){
        System.out.println("Toi dang uong ruou");
    }
    void biet_nhay(){
        System.out.println("Toi dang nhay");
    }
}

class DanNghiemTuc {
    void uong_nuoc(){
        System.out.println("Toi dang uong nuoc loc");
    }
    void di_bo(){
        System.out.println("Toi biet di bo");
    }
}

interface nguoi{
    void uong();
    void hanh_dong();
}
class Adapter extends DanChoi {
    private DanNghiemTuc danNghiemTuc;

    Adapter(DanNghiemTuc danNghiemTuc){
        this.danNghiemTuc = danNghiemTuc;
    }

    @Override
    void uong_ruou() {
        // TODO Auto-generated method stub
        this.danNghiemTuc.uong_nuoc();
    }
    @Override
    void biet_nhay() {
        this.danNghiemTuc.di_bo();
    }
}


public class AdapterPatternExample {

    public void quan_bar(DanChoi danchoi){
            danchoi.biet_nhay();
            danchoi.uong_ruou();
    }        
    public static void main(String[] args) {
        AdapterPatternExample adapterPatternExample = new AdapterPatternExample();
        DanChoi danchoixom = new DanChoi();
        DanNghiemTuc danNghiemTuc = new DanNghiemTuc();
        DanChoi danNghiemtuc_vao_bar = new Adapter(danNghiemTuc);
        adapterPatternExample.quan_bar(danNghiemtuc_vao_bar);
    }
}
