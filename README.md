# Programa de Imposto de Renda em Java

# Descrição:

Este programa em Java implementa um sistema de cálculo de imposto de renda, utilizando polimorfismo e uma classe abstrata para calcular os impostos de diferentes tipos de contribuintes, como pessoas físicas e jurídicas.

# Ferramentas Utilizadas:

Java

Eclipse IDE

# Funcionamento:

O programa utiliza a classe Scanner para obter informações do usuário e as classes Pessoa, PessoaFisica e PessoaJuridica para armazenar informações sobre cada contribuinte.

O polimorfismo é utilizado através do método imposto() implementado nas classes PessoaFisica e PessoaJuridica, permitindo o cálculo do imposto de cada tipo de contribuinte de forma diferente.

A classe abstrata Pessoa contém os atributos comuns a todas as subclasses e o método abstrato imposto(), que é implementado nas subclasses.

# Como utilizar:

Para utilizar o programa, siga os seguintes passos:

Clone o repositório do programa em sua máquina.

Abra o projeto em sua IDE Java (como o Eclipse).

Execute o arquivo Program.java.

Insira o número de contribuintes a serem cadastrados.

Para cada contribuinte, informe se é pessoa física (i) ou jurídica (c), além de seu nome e renda anual.

Se for uma pessoa física, informe os gastos com saúde.

Se for uma pessoa jurídica, informe o número de funcionários.

Após inserir todas as informações, o programa imprimirá uma lista com as informações de cada contribuinte cadastrado e o valor total de impostos a serem pagos.


# Observações:

O programa utiliza o decorador @Override para indicar que o método imposto() está sendo sobrescrito nas subclasses. A classe Pessoa é abstrata e não pode ser instanciada diretamente.

--------------------------

# Tax Payers Program with Polymorphism in Java

# Description:

This Java program implements a tax payer management system using polymorphism, allowing the creation of two different types of tax payers: individual and company.

# Tools Used:

Java

Eclipse IDE

# Functioning:

The program uses the Scanner class to obtain user information and the abstract class Pessoa and its subclasses PessoaFisica and PessoaJuridica to store information about each tax payer.

Polymorphism is used through the method imposto() implemented in the three classes of tax payers, allowing the calculation of taxes for each type of tax payer.

# How to Use:

To use the program, follow these steps:

Clone the program repository on your machine.

Open the project in your Java IDE (such as Eclipse).

Execute the Program.java file.

Enter the number of tax payers to be registered.

For each tax payer, inform whether they are an individual (i) or a company (c), as well as their name and annual income.

If it is an individual tax payer, inform their health expenditures.

If it is a company tax payer, inform the number of employees.

After entering all the information, the program will print a list of taxes paid for each registered tax payer.

The program will also print the total taxes paid.

# Observations:

The program uses the decorator @Override to indicate that the imposto() method is being overridden in the subclasses. It also uses an abstract class Pessoa to avoid code repetition.
