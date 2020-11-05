
/**
 * Write a description of class l here.
 * 
 * @author Juan Felipe Ortiz / Tomas Duque Giraldo
 * @version 01
 */
public class leercsv
{
import codecs
#esta clase es una prueba para leer archivos csv y almacenarlos en diferentes listas
# de python

list1 = []

with codecs.open('0_test_balanced_5000.csv',
                 encoding = 'utf-8-sig') as file:

    for row in file:
        list1.append(row)

list2 = []

for row in list1:
    row1 = row.strip()
    list2.append(row1.split(";"))

print(list2[0])
#utilice el print(list2[0]) para probar el lector de archivos
}