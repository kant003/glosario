public static void main(String[] args) throws InterruptedException {
	        // Contar del 1 al 10
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Repeticiones => " + i);
	            Thread.sleep(500); // Pausa de medio segundo
	        }

	        // Cuenta descendente desde 100 hasta 0
	        for (int j = 100; j >= 0; j--) {
	            System.out.println("Descendiendo hacia ZERO => " + j);
	        }
	    }
	}