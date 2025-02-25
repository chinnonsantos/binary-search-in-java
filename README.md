<p align="center">
    <a href="https://docs.oracle.com/en/java/" target="_blank">
        <img src="docs/imgs/java-21.jpg" width="600" alt="Java Logo">
    </a>
</p>

# Binary Search in Java (JVM) - Console Application

> "A **pesquisa** ou **busca binária** (em inglês binary search algorithm ou binary chop) é um algoritmo de busca em 
> vetores que segue o paradigma de **divisão e conquista**. Ela parte do pressuposto de que o vetor está ordenado e 
> realiza sucessivas divisões do espaço de busca comparando o elemento buscado (chave) com o elemento no meio do vetor. 
> Se o elemento do meio do vetor for a chave, a busca termina com sucesso. Caso contrário, se o elemento do meio vier 
> antes do elemento buscado, então a busca continua na metade posterior do vetor. E finalmente, se o elemento do meio 
> vier depois da chave, a busca continua na metade anterior do vetor.
>
> -- [Pesquisa Binária - Wikipedia](https://pt.wikipedia.org/wiki/Pesquisa_bin%C3%A1ria)

![binary-x-linear-search](docs/imgs/binary-x-linear-search.gif)
![binary-search-tree](docs/imgs/binary-search-tree.gif)

## Dependencies

- [Java `21.0.5-amzn`](https://sdkman.io/jdks/#amzn)
- [Maven `3.9.9`](https://sdkman.io/sdks#maven)

## Complexity Analysis

A complexidade do algoritmo de **Busca binária** é da ordem de **`O(log n)`**, em que **`n`** é o tamanho do 
vetor de busca. Apresenta-se mais eficiente que a **Busca linear** cuja ordem é **`O(n)`**.

## Procedure

Dado uma lista **&Alpha;** de **`n`** elementos com os valores **&Alpha;<sub>0</sub>, &Alpha;<sub>1</sub>, 
&Alpha;<sub>2</sub>, ..., &Alpha;<sub>n-1</sub>** ordenada de tal modo que **&Alpha;<sub>0</sub> &le; 
&Alpha;<sub>1</sub> &le; &Alpha;<sub>2</sub>  &le; ... &le; &Alpha;<sub>n-1</sub>**, e um valor para pesquisa 
**`T`**, a seguinte rotina usa pesquisa binária para achar o índice de **`T`** em **&Alpha;**.

1. Defina **`L`** para `0` e **`R`** para `n - 1`.
2. Se **L &gt; R** a pesquisa termina sem sucesso.
3. Defina **`m`**(o índice do meio da lista) para **`(L + R) / 2`** arredondado.
4. Se **&Alpha;<sub>m</sub> &lt; T**, defina **`L`** para **`m + 1`** e volte ao segundo passo.
5. Se **&Alpha;<sub>m</sub> &gt; T**, defina **`R`** para **`m - 1`** e volte ao segundo passo.
6. Se **&Alpha;<sub>m</sub> = T**, a pesquisa está feita, o índice de **`T`** é **`m`**.

> Para o algoritmo computacional ser mais eficiente, foi implementado uma validação de **Lista vazia**, evitando-se a 
> execução de procedimentos desnecessários! 

## How to run?

```bash
mvn clean install
# ...
# [INFO] ------------------------------------------------------------------------
# [INFO] BUILD SUCCESS
# [INFO] ------------------------------------------------------------------------
# [INFO] Total time:  1.717 s
# [INFO] Finished at: 2025-02-25T20:20:48-03:00
# [INFO] ------------------------------------------------------------------------

java -jar target/binary-search-in-java-1.0.0.jar 10
# SUCCESSFUL - value 10 found in index 10 with 11 interactions!
# Linear search of 10 from array size 1,000,000 took 21,770,539 nano

java -jar target/binary-search-in-java-1.0.0.jar   
# SUCCESSFUL - value 303,873 found in index 303,873 with 303,874 interactions!
# Linear search of 303,873 from array size 1,000,000 took 22,309,957 nano
```
