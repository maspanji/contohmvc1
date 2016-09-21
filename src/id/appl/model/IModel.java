/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.appl.model;

import id.appl.view.IControllerView;

/**
 *
 * @author panji
 */
public interface IModel {
    public void sendNotification();
    public void attach(IControllerView cv);
}
