/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

import javax.swing.SwingUtilities;

public class Hotel {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            login loginFrame = new login();   
            loginFrame.setLocationRelativeTo(null);
            loginFrame.setVisible(true);
        });
    }
}

