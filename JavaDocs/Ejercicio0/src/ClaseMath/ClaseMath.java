package ClaseMath;

public class ClaseMath {

	public static void main(String[] args) {
		   // 1. Math.sqrt(x) — Raíz cuadrada
        double resultado1 = Math.sqrt(25);
        System.out.println(resultado1);

        // 2. Math.pow(x, y) — Potencia
        double resultado2 = Math.pow(2, 3);
        System.out.println(resultado2);

        // 3. Math.abs(x) — Valor absoluto
        int resultado3 = Math.abs(-18);
        System.out.println(resultado3);

        // 4. Math.max(x, y) — Máximo
        int mayor = Math.max(8, 12);
        System.out.println(mayor);

        // 5. Math.min(x, y) — Mínimo
        int menor = Math.min(8, 12);
        System.out.println(menor);

        // 6. Math.round(x) — Redondeo al entero más cercano
        long redondeado = Math.round(4.6);
        System.out.println(redondeado);

        // 7. Math.ceil(x) — Redondeo hacia arriba
        double arriba = Math.ceil(4.3);
        System.out.println(arriba);

        // 8. Math.floor(x) — Redondeo hacia abajo
        double abajo = Math.floor(4.8);
        System.out.println(abajo);

        // 9. Math.random() — Número aleatorio entre 0 y 1
        double aleatorio = Math.random();
        System.out.println(aleatorio);

	}

}
