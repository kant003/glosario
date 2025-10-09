numero = 3

match numero:
    case 1: 
        print("Es uno")
    case 2:
        print("Es dos")
    case 3:
        print("Es tres")
    case _:
        print("Numero no reconocido")

#-----------------------------------------------------------

num1 = int(input("Dime un numero: "))

match num1:
    case 0:
        print("el numero es un cero")
    case num1 if num1 % 2 == 0:
        print("el numero es par")
    case num1 if num1 % 2 != 0:
        print("el numero es impar")
    case _:
        print("numero no reconocido") 

#-----------------------------------------------------------

num2 = int(input("Dime un numero entero: "))

match num2:
    case num2 if num2 < 0:
        print("el numero es negativo")
    case num2 if num2 > 0 and num2 < 10:
        print("numero entre 0 y 9")
    case num2 if num2 >= 10:
        print("numeros mayores o iguales a 10")
    case _:
        print("numero no reconocido")