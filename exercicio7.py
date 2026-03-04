def converter_celsius_para_fahrenheit(graus_celsius):
    return (graus_celsius * 9/5) + 32

def converter_fahrenheit_para_celsius(graus_fahrenheit):
    return (graus_fahrenheit - 32) * 5/9

temperatura_celsius = 25
temperatura_fahrenheit = 77

print(converter_celsius_para_fahrenheit(temperatura_celsius))
print(converter_fahrenheit_para_celsius(temperatura_fahrenheit))