public class Transport implements MainTransport {

    public void CreateTransport(String type){
         
        Camion C;
        Bateau B;

        if (type=="camion") {

            C= new Camion() ;
            C.TransportTerrestre();
        }

        else if (type=="Bateau") {

            B= new Bateau() ;
            B.TransportMaritime();
        }

    }
    
}