package com.example.service.customize;

public abstract class AbsMediator {
    public ColleagueOfLandlady getLandlady() {
        return landlady;
    }

    public void setLandlady(ColleagueOfLandlady landlady) {
        this.landlady = landlady;
    }

    public ColleagueOfTenant getTenant() {
        return tenant;
    }

    public void setTenant(ColleagueOfTenant tenant) {
        this.tenant = tenant;
    }

    private ColleagueOfLandlady landlady = null;
    private ColleagueOfTenant tenant = null;

    public abstract void interruptLandlady();
}
