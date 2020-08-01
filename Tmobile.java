package com.MultiCarrier;

public class Tmobile implements Services{
    UnlimitedCalls uc;
    UnlimitedTexts ut;
    VolumeData vd;
    UnlimitedData ud;

    public void setUc(UnlimitedCalls uc) {
        this.uc = uc;
    }

    public void setUt(UnlimitedTexts ut) {
        this.ut = ut;
    }

    public void setVd(VolumeData vd) {
        this.vd = vd;
    }

    public void setUd(UnlimitedData ud) {
        this.ud = ud;
    }

    @Override
    public void serviceProvider() {
        System.out.println("Your service provider is T-mobile");
    }

    @Override
    public void unlimitedCalls() {
        uc.unlimitedCalls();
    }

    @Override
    public void unlimitedTexts() {
        ut.unlimitedTexts();
    }

    @Override
    public void volumeData() {
        vd.volumeData();
    }

    @Override
    public void unlimitedData() {
        ud.unlimitedData();
    }
}
