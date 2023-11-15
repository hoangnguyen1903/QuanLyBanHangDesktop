/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus;

import Interface.DoiTra_Interface;
import dao.DoiTra_dao;
import entity.DoiTraEntity;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DoiTra_bus implements DoiTra_Interface{
    private DoiTra_dao dt_dao = new DoiTra_dao();
    
    @Override
    public boolean taoDoiTra(DoiTraEntity dt) {
        return dt_dao.taoDoiTra(dt);
    }

    @Override
    public ArrayList<DoiTraEntity> getAllDoiTra() {
        return dt_dao.getAllDoiTra();
    }
    
}
