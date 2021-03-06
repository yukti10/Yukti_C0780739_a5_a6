package Yukti_C0780739_a5_a6;

import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class main {

    static boolean Login() {
        int count = 0;
        Boolean flag = false;
        while (count < 3) {
            JFrame f = new JFrame();
            String username = JOptionPane.showInputDialog(f, "Enter UserName:");
            String password = JOptionPane.showInputDialog(f, "Enter Password:");
            if (username.equals("Yukti") && password.equals("Password")) {
                JOptionPane.showMessageDialog(f, "User logged in successfully.");
                flag = true;
                break;
            } else {
                JOptionPane.showMessageDialog(f, "Incorrect credentials.");
                if (count == 2) {
                    JOptionPane.showMessageDialog(f, "You have exceeded the number of attempts");
                }

            }
            count++;
        }
        return flag;
    }

    static void options() {
        if (Login()) {
            JPanel jp = new JPanel();
            JTextField fName = new JTextField(5);
            JTextField lName = new JTextField(5);
            JCheckBox servicesPackageA = new JCheckBox("Package A - $100/hr");
            servicesPackageA.setBounds(100, 100, 50, 50);
            JCheckBox servicesPackageB = new JCheckBox("Package B – $150/hr");
            servicesPackageB.setBounds(100, 100, 50, 50);
            JCheckBox optionsStorageSmall = new JCheckBox("Storage Small – $8/day");
            optionsStorageSmall.setBounds(100, 100, 50, 50);
            JCheckBox optionsStorageLarge = new JCheckBox("Storage Large – $20.11/day");
            optionsStorageLarge.setBounds(100, 100, 50, 50);
            JCheckBox itemsBoxesSmall = new JCheckBox("Boxes small - $2.50/per box");
            itemsBoxesSmall.setBounds(100, 100, 50, 50);
            JCheckBox itemsBoxesLarge = new JCheckBox("Boxes large - $4.50/ per box");
            itemsBoxesLarge.setBounds(100, 100, 50, 50);
            jp.add(new JLabel("First Name:"));
            jp.add(fName);
            jp.add(Box.createHorizontalStrut(15));
            jp.add(new JLabel("Last Name:"));
            jp.add(lName);
            JOptionPane.showConfirmDialog(null, jp,
                    "Please Enter below details", JOptionPane.OK_CANCEL_OPTION);
            JPanel jp1 = new JPanel();
            jp1.add(new JLabel("Services"));
            jp1.add(servicesPackageA);
            jp1.add(servicesPackageB);
            jp1.add(new JLabel("Options\n"));
            jp1.add(optionsStorageSmall);
            jp1.add(optionsStorageLarge);
            jp1.add(new JLabel("Items\n"));
            jp1.add(itemsBoxesSmall);
            jp1.add(itemsBoxesLarge);
            JOptionPane.showConfirmDialog(null, jp1,
                    "Please Enter below details", JOptionPane.OK_CANCEL_OPTION);
            Program p1 = new Program();
            p1.setPackageAService(100.0);
            p1.setPackageBService(150.0);
            p1.setStorageSmall(8.0);
            p1.setStorageLarge(20.11);
            p1.setBoxesSmall(2.5);
            p1.setBoxesLarge(4.5);
            double total =0;
            double serviceCost=0;
            double itemCost=0;
            double optionsCost =0;
            if (servicesPackageA.isSelected()){
                total += p1.getPackageAService();
                serviceCost+=p1.getPackageAService();
            }
            if (servicesPackageB.isSelected()){
                total += p1.getPackageBService();
                serviceCost+=p1.getPackageBService();
            }
            if (optionsStorageSmall.isSelected()){
                total += p1.getStorageSmall();
                optionsCost+=p1.getStorageSmall();

            }
            if (optionsStorageLarge.isSelected()){
                total += p1.getStorageLarge();
                optionsCost+=p1.getStorageLarge();
            }
            if (itemsBoxesSmall.isSelected()){
                total += p1.getBoxesSmall();
                itemCost+=p1.getBoxesSmall();
            }
            if (itemsBoxesLarge.isSelected()){
                total += p1.getBoxesLarge();
                itemCost+=p1.getBoxesLarge();
            }

            JFrame jf = new JFrame();
            JOptionPane.showMessageDialog(jf,"Your total amount is:"+total);
            //ASSIGNMENT 6
            JFrame jf1 = new JFrame();
            JOptionPane.showMessageDialog(jf1,"Your Service cost is $"+serviceCost +"\n Your Options cost is $"+optionsCost
            +"\n Your item cost is $"+itemCost+"Your total cost including everything is $"+total);

        }

    }

    public static void main(String[] args) {
            options();

    }
}

