 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnum = new Random();
        System.out.println("defina el largo del arreglo: ");
        int a = in.nextInt();
        int[] arreglo = new int[a];
        int numpar = 0;
        int numinpar = 0;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnum.nextInt(100);
            //contar numeros pares
            System.err.println(arreglo[i]);
            if (arreglo[i] % 2 == 0) {
                numpar++;
            } else {
                numinpar++;
            }

        }
        System.out.println("numeros pares " + numpar);
        System.out.println("numeros impares " + numinpar);
    }

}
