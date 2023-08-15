/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro.model.util;

/**
 *
 * @author Windows 10
 */

import java.sql.ResultSet;
import java.sql.SQLException;
public class SequenceManager {
    private static final String sqln = "SELECT NEXT VALUE FOR sequencia";

    public static int getValue() throws SQLException {

        ResultSet resultSet = ConectorBD.getSelect(sqln);
        
        int nextValue = 0;
        if (resultSet.next()) {
            nextValue = resultSet.getInt(1);
        }
        ConectorBD.closeResultset(resultSet);
  
        return nextValue;
    }
 
}
