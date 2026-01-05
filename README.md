# Desafio POO - Bootcamp DIO

Desafio de Programação Orientada a Objetos do Bootcamp CI&T - Backend com Java & AWS da [Digital Innovation One](https://www.dio.me/).

## Sobre

Projeto Java que modela o domínio de um Bootcamp, aplicando os 4 pilares da POO: **Abstração**, **Encapsulamento**, **Herança** e **Polimorfismo**.

O sistema permite:
- Criar cursos e mentorias
- Inscrever desenvolvedores em bootcamps
- Acompanhar progresso dos devs
- Calcular XP adquirido

## Estrutura

```
src/
└── br/com/dio/desafio/
    ├── Main.java
    └── dominio/
        ├── Bootcamp.java
        ├── Conteudo.java (abstrata)
        ├── Curso.java
        ├── Mentoria.java
        └── Dev.java
```

## Pilares da POO

- **Abstração**: Classe `Conteudo` define estrutura base para cursos e mentorias
- **Encapsulamento**: Atributos privados com getters/setters
- **Herança**: `Curso` e `Mentoria` herdam de `Conteudo`
- **Polimorfismo**: Cada tipo de conteúdo calcula XP de forma diferente

## Tecnologias

- Java 11+
- Collections (Set, LinkedHashSet)
- Stream API
- Optional

## Como Executar

```bash
cd src
javac br/com/dio/desafio/Main.java br/com/dio/desafio/dominio/*.java
java br.com.dio.desafio.Main
```

## Exemplo de Uso

```java
// Criar curso e mentoria
Curso curso = new Curso();
curso.setTitulo("Java Básico");
curso.setCargaHoraria(8);

Mentoria mentoria = new Mentoria();
mentoria.setTitulo("Mentoria Java");
mentoria.setData(LocalDate.now());

// Criar bootcamp
Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Bootcamp Java Developer");
bootcamp.getConteudos().add(curso);
bootcamp.getConteudos().add(mentoria);

// Inscrever dev e progredir
Dev dev = new Dev();
dev.setNome("João");
dev.inscreverBootcamp(bootcamp);
dev.progredir();
System.out.println("XP: " + dev.calcularTotalXp());
```

## Créditos

Desafio criado por [Camila Cavalcante](https://github.com/cami-la) para o Bootcamp CI&T da [Digital Innovation One](https://www.dio.me/).

