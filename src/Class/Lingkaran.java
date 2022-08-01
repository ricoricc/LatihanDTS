package Class;

import java.util.Scanner;

public class Lingkaran {
    int _xPos, _yPos;
    double _r;
    String _color;

    void moveHorizontal(int n){
        if((_xPos+=n) > 80)
        _xPos += n;
    }
    void moveVertical(int _yPos){
        this._yPos += _yPos;
    }
    void moveDiagonal(){}
    void resize(){}
    void getLuas(){}
    void getDiameter(){}
    double getKeliling(){
      return 2*Math.PI*_r;
    }
    void display(){
        System.out.println("Jari-jari: "+_r);
        System.out.println("Titik tengah: "+ _xPos +", "+ _yPos);
        System.out.println("Warna: "+_color);
        System.out.println("Keliling: " + getKeliling());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lingkaran l1 = new Lingkaran();
        Lingkaran l2 = new Lingkaran();
        
        l1._r = 10;
        l1._xPos = 5;
        l1._yPos = 7;
        l1._color = "merah";

        l2._r = 3;
        l2._xPos = 40;
        l2._yPos = 20;
        l2._color = "kuning";

        System.out.println("L1 Berpindah ke kanan?");
        int geser = sc.nextInt();
        l1._xPos += geser;
        l1.display();

//        System.out.println("L1 Berpindah ke kanan?");
//        geser = sc.nextInt();
//        l2._xPos += geser;
    }

}

