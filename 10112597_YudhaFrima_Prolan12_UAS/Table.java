/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

/**
 *
 * @author Iscariot
 */
abstract class Table {

	int rate;
	boolean wifi;
	boolean status;
    
    abstract public void statuschange();
}
