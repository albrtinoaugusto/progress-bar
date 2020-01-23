
package Application;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Albertino Augusto */

public class StartGUI extends javax.swing.JFrame 
{
    
    public StartGUI()
    {
        initComponents();
    }
    
    public class Progress implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
           int n = progressBar.getValue();
           
           if(n<100)
           {
               n ++;
               progressBar.setValue(n);
           }
           else
           {
               timer.stop();
               System.out.println("Thread terminated"); 
           }
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressBar = new javax.swing.JSlider();
        button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Progress Bar Test");
        setMaximumSize(new java.awt.Dimension(400, 160));
        setMinimumSize(new java.awt.Dimension(400, 160));
        setPreferredSize(new java.awt.Dimension(400, 160));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progressBar.setBackground(new java.awt.Color(102, 102, 102));
        progressBar.setForeground(new java.awt.Color(0, 204, 204));
        progressBar.setValue(0);
        getContentPane().add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 312, -1));

        button.setText("Click Here");
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonMouseReleased(evt);
            }
        });
        getContentPane().add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 140, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseReleased
        timer.start();
    }//GEN-LAST:event_buttonMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timer= new Timer(50, new Progress());
    }//GEN-LAST:event_formWindowOpened


    public static void main(String args[])
    {


        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new StartGUI().setVisible(true);
            }
        });
    }
    
    
    private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JSlider progressBar;
    // End of variables declaration//GEN-END:variables
}
