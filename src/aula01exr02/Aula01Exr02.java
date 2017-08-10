package aula01exr02;

import javax.swing.JOptionPane;

public class Aula01Exr02 {
    
    public static Double calculaDistancia(Ponto p1, Ponto p2){
        Double dist = Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)+Math.pow(p2.getY()-p1.getY(),2));
        return dist;
    }

    public static void main(String[] args) {
        try{
            Ponto p1 = new Ponto();
            Ponto p2 = new Ponto();
            String num; 
            num = JOptionPane.showInputDialog(null, "Digite um valor para a coordenada X do primeiro ponto: ", "Ponto", JOptionPane.PLAIN_MESSAGE);
            p1.setX(Double.parseDouble(num));
            num = JOptionPane.showInputDialog(null, "Digite um valor para a coordenada Y do primeiro ponto: ", "Ponto", JOptionPane.PLAIN_MESSAGE);
            p1.setY(Double.parseDouble(num));
            num = JOptionPane.showInputDialog(null, "Digite um valor para a coordenada X do segundo ponto: ", "Ponto", JOptionPane.PLAIN_MESSAGE);
            p2.setX(Double.parseDouble(num));
            num = JOptionPane.showInputDialog(null, "Digite um valor para a coordenada Y do segundo ponto: ", "Ponto", JOptionPane.PLAIN_MESSAGE);
            p2.setY(Double.parseDouble(num));
            JOptionPane.showMessageDialog(null, "Resultado final:\nPonto P1 = ("+p1.getX()+", "+p1.getY()+")\nPonto P2 = ("+p2.getX()+", "+p2.getY()+ ")\nDistancia entre P1 e P2: "+ calculaDistancia(p1, p2), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Número digitado é incorreto!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

}
