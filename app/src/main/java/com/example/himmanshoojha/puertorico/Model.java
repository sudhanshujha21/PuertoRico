package com.example.himmanshoojha.puertorico;

/**
 * Created by Himmanshoo Jha on 11/04/2017.
 */

public class Model {

    public int image_id;

    public String txt;

    public Model(int image_id,String txt){

        this.image_id =image_id;

        this.txt = txt;
    }

    public int getImage_id()
    {
        return image_id;
    }

    public void setImage_id(int image_id) {

        this.image_id = image_id;
    }

    public String getTxt()
    {
        return txt;
    }

    public void setTxt(String txt) {


        this.txt = txt;
    }
}
