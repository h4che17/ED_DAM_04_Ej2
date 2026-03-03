public class CostePersonal {

    private static final int VALOR_HORA_EXTRA = 20;

    static float costeDelPersonal(Trabajador[] trabajadores) {
        float costeFinal = 0;

        for (Trabajador trabajador : trabajadores) {

            int tipo = trabajador.getTipoTrabajador();
            float nomina = trabajador.getNomina();

            if (tipo == Trabajador.DIRECTOR || tipo == Trabajador.SUBDIRECTOR) {
                costeFinal += nomina;
            } else {
                costeFinal += nomina + (trabajador.getHorasExtras() * VALOR_HORA_EXTRA);
            }
        }

        return costeFinal;
    }
}
