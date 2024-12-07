package cucumber.codigopostal;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class CodigoPostalAPI {
    private static String UBICACION_POR_CODIGO_POSTAL_Y_PAIS = "https://api.zippopotam.us/{pais}/{codigopostal}";

    //Nos va a traer la ubicacion por codigo postal
    @Step("Obtener ubicacion por codigo postal {0} en país {1}")
    public void buscarUbicacionPorCodigoPostalYPais(String codigopostal, String pais){
        SerenityRest.given()
                .pathParam("codigopostal", codigopostal)
                .pathParam("pais", pais)
                .get(UBICACION_POR_CODIGO_POSTAL_Y_PAIS);
    }
}
