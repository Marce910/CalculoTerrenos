import javax.swing.JOptionPane;

public class Notas
{
    public static void main(String [] args)
    {
        String nombre;
        double nota1;
        double nota2;
        double nota3;
        
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su nota 1"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su nota 2"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su nota 3"));
        
        double prom = (nota1 + nota2 + nota3) / 3;
        
        JOptionPane.showMessageDialog(null, "El promedio es: "+prom);
    }
    
}
