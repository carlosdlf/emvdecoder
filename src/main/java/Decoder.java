import io.github.binaryfoo.DecodedData;
import io.github.binaryfoo.RootDecoder;

import java.util.List;

public class Decoder {


    /*querida cachetitos tienes que usar otra ide. eclipse es una mierd@
    * evoluciona, no tengas los mismos "gustos" XDDD
    * */

    public static void main(String[] args) {
        RootDecoder rootDecoder = new RootDecoder();
        List<DecodedData> zxc = rootDecoder
                .decode("5F34010182023C009F100706010A03A0B0009F26082F1D19F97D74AF009F360203975F2A020604950580800400009A031708019C01309F02060000000000009F03060000000000009F1A0206049F33036040209F3704BA6FF67F", "EMV", "constructed");

        for (DecodedData decodedData : zxc) {
            System.out.println("tag ->"+decodedData.component1() + " desc ->" + decodedData.component2() + " valor -> " + decodedData.component3());
        }
    }

}
