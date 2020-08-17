import csv
with open('0_test_balanced_5000.csv') as file:
    reader = csv.reader(file)

    for roe in reader:
        print('prueba', {0})