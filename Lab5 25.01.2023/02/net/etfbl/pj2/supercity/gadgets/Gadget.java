package net.etfbl.pj2.supercity.gadgets;

public class Gadget{   

    private String gadgetDescription;

    public Gadget(){
        super();
        System.out.println("Y'u had just called an empty Constructor and created an useless object..object without any describes.. \n");
    }

    public Gadget(String gadgetDescription){
        this.gadgetDescription = new String(gadgetDescription);
    }

    public void setGadgetDescritption(String gadgetDescription){
        this.gadgetDescription = gadgetDescription;
    }

    public String getGadgetDescription(){
        return this.gadgetDescription;
    }

    @Override
    public String toString(){
        return new String("Gadget[ " + gadgetDescription + "]");
    }
}