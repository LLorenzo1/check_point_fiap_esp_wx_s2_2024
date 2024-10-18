# Primeira etapa: escopo

## Implementação Relatório: Compressão de Dados Genéticos com Run-Length Encoding (RLE)

### Iniciar

O relatório visa informar sobre o desenvolvimento de um software que possa ser capaz de desencadear a compressão de dados genéticos usando Run-Length Encoding. Foi um projeto para a disciplina de engenharia de software, exigindo ao grupo da turma desenvolver um programa que possa ser capaz de comprimir uma sequência de nucleotídeos de A, C, T e G. Isso contribuiu significativamente para a redução com satisfação de tamanho. O grupo tinha como objetivo principal implementar sem perda o sistema de compressão de uma maneira simples e eficiente.

## Fotografia do projeto:

* O projeto foi desenvolvido em Java. Depois disso, foi modulado de interesse.

* Organização dos códigos-fonte. Visava dividir o sistema em várias classes, garantindo a implementação da tarefa será de forma ideal e responsável.

### Apresentação de classes principais:

1. CompressorRLE.java

A classe possui um algoritmo RLE, que implementa o método para compressão. Com base em uma sequência de letras, o método em dois realiza uma varredura e a geração de um texto da entrada comprimida por número de ocorrências de letras. Por exemplo: entrado para o método é _AAAACCCCTTTTGGGG_, e o resultado do método de sáida será idêntico a _A4C4T4G4_;

2. App.java

É o sistema foi executado. Tem vários sub-métodos e responsabilidades para que: é receber a entrada-saída, criar uma aplicação para compressão e exibir um relatório de devolução de tamanho de escrita, taxa de compressão e frequência de letras do texto, através de ler um arquivo de comutação e saída.

### 5. InterfaceTextual.java

A classe InterfaceTextual é responsável por exibir no terminal as mensagens de um relatório contendo informações detalhadas sobre o próprio arquivo de entrada, o arquivo comprimido criado, as frequências dos 4 nucleotídeos, o percentual de compressão e uma mensagem final de sucesso. Método utilizado: A metodologia selected foi o processo iterativo. Etapas: *Análise e Planejamento: para entender os requisitos e planejar a implementação das funcionalidades. *Implementação: as classes principais foram criadas focando na modularização e responsabilidade única de cada classe para não ferir criticamente o princípio do encapsulamento segundo o paradigma de POO. *Testes: todos os testes foram realizados manualmente com o objetivo de verificar se o algoritmo realmente conseguia comprimir e descomprimir respectivamente. *Ajustes Finais: após a implementação da interface e puxando as informações do arquivo, severos ajustes de padronização e execução foram feitos.### Algoritmo de Compressão (RLE)

Foi selecionado o algoritmo RLE pois é simples e eficiente em dados que possuem muitas repetições como mostrado em sequências genéticas. O algoritmo RLE percorre a sequência de nucleotídeos, contabiliza as frequências de nucleotídeos consecutivas e escreve a sequência comprimida. A abordam é forte pois economiza muito espaço, especialmente se tratando de dados tão redundante.## Resultados

### Análise dos Resultados

A implementação atingiu o objetivo proposto de diminuir o tamanho da sequência de nucleotídeos exibida sem grandes perdas. Foi atingida uma taxa de compressão de próximamente 50% dos dados gerando o arquivo.comp para os casos apresentados, o que aponta a boa eficiência no caso do RLE.### Desempenho

O desempenho foi adequado para Biotico/Genômica. O tempo de execução foi satisfatório em arquivos de até 1MB e a compressão foi eficiente diminuindo drasticamente os dados iniciais. O código foi desenvolvido para ser escalável e facilmente mantido.

 -----------------------------------------------------------
|           LIB UNCLE PRESSER - GRUPO LORENZO               |
|-----------------------------------------------------------|
| ARQUIVO DE ENTRADA: inputs/input1.txt                     |
| ARQUIVO DE SAÍDA: outputs/output1.txt                     |
 -----------------------------------------------------------
| TAMANHO DO ARQUIVO DE ENTRADA: 16                         |
| TAMANHO DO ARQUIVO DE SAÍDA: 8                            |
 -----------------------------------------------------------
| FREQUÊNCIAS:                                              |
| A: 25.00%  C: 25.00%  T: 25.00%  G: 25.00%                |
 -----------------------------------------------------------
| TAXA DE COMPRESSÃO: =~ 50.00%                             |
 -----------------------------------------------------------
| SCORE: WELL-DONE                                          |
 -----------------------------------------------------------

### Análise dos Resultados

A implementação atingiu o objetivo principal de reduzir o tamanho da sequência de nucleotídeos sem perda de dados. A taxa de compressão no exemplo acima foi de aproximadamente 50%, o que demonstra a eficiência do algoritmo RLE para sequências com repetições significativas.

### Desempenho

O desempenho do algoritmo foi considerado adequado para o escopo do projeto. O tempo de execução em arquivos de até 1MB foi satisfatório e a compressão resultou em reduções significativas no tamanho dos dados. O código foi estruturado para ser escalável e de fácil manutenção.

## Conclusão

O projeto de compressão de dados genéticos usando Run-Length Encoding foi totalmente finalizado com sucesso. Todas as funcionalidades solicitadas foram implementadas com sucesso, e o software forneceu os resultados esperados, atendendo aos requisitos de compressão e relatórios. O código está bem configurado de uma maneira modular e clara, o que permite a fácil modificação e uso d sensata abordagem de engenharia futura. O algoritmo do Run Length Encoding é uma forma inovadora e eficiente para compactação de dados com alta redundância, tal como seqüências de nucleotídeos. Além disso, o software farejador poderia ser estendido para abordar outros tipos de compressão para cenários com restrições de tempo e intenso volume de dados.
