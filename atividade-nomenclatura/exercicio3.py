def converter_celsius_para_fahrenheit(celsius):
    fahrenheit = (celsius * 9/5) + 32
    return fahrenheit

temperatura_celsius = 25
temperatura_fahrenheit = converter_celsius_para_fahrenheit(temperatura_celsius)

print("Temperatura em Fahrenheit:", temperatura_fahrenheit)