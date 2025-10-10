package PiedraPapelTijeras;


public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Usuario u1=new Usuario();
        Bot b1=new Bot();

        //presentacion
        u1.pedirNombre();
        b1.presentacionBot();

        //Juego
        //1(piedra) 2(papel) 3(tijeras)
        do{
            u1.pedirEleccion();
            b1.eleccionBot();
            if(u1.getEleccion()==1 && b1.getEleccionB()==3 || u1.getEleccion()==2 && b1.getEleccionB()==1 || u1.getEleccion()==3 && b1.getEleccionB()==2){
                u1.sumaPuntosU();
                System.out.println("Enhorabunea "+u1.getNombre()+" has ganado esta ronda");
                System.out.println("Llevas "+u1.getContadorU()+" puntos");
            }else if(u1.getEleccion()==b1.getEleccionB()) {
                System.out.println("Empate continuemos no pienso perder");
            }else{
                b1.sumaPuntosB();
                System.out.println("He ganado esta jeje llevo: "+b1.getContadorB()+" puntos");
            }

        }while(u1.getContadorU()!=3 && b1.getContadorB()!=3);

        if(u1.getContadorU()==3){
            System.out.println("Maldicion me has ganado no puede ser exijo la revancha "+u1.getNombre());
        }else if(b1.getContadorB()==3){
            System.out.println("He ganado soy el mejor, sigue iontentandolo "+u1.getNombre());
        }
    }
}



