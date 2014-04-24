/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.cofares;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pfares
 */
@XmlRootElement
public class X {
    private int px;
    private int py;

    /**
     * @return the px
     */
    public int getPx() {
        return px;
    }

    /**
     * @param px the px to set
     */
    public void setPx(int px) {
        this.px = px;
    }

    /**
     * @return the py
     */
    public int getPy() {
        return py;
    }

    /**
     * @param py the py to set
     */
    public void setPy(int py) {
        this.py = py;
    }
}
