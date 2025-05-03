[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/zaY_p4dR)

# Questão 1:

### OÉ boa prática usar getters e setters porque eles permitem controlar o acesso aos atributos de uma classe. Quando os atributos são públicos, qualquer parte do código pode modificá-los livremente, o que pode causar erros ou dados inválidos. Com setters, podemos aplicar regras antes de alterar um valor, garantindo que os dados do objeto fiquem sempre corretos.

# Questão 2:

### a) Quais informações são relevantes para representar um livro?
##### Título, autor, ISBN, editora, ano de publicação, número de páginas, categoria (gênero), e se ele está disponível para empréstimo.

### b) Por que a classe Livro é uma abstração?
##### Porque ela representa um modelo genérico de um livro no sistema. A classe não é um livro real, mas sim uma forma de organizar e agrupar as informações e comportamentos que todo livro deve ter dentro do programa.

### c) Três métodos que fariam sentido nessa classe:
- emprestarLivro() – para marcar o livro como emprestado.
- devolverLivro() – para marcar o livro como disponível novamente.
- exibirInformacoes() – para mostrar os dados do livro formatados.
