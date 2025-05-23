# 🥟 MaquinaDeCoxinhas

Este projeto implementa uma classe **MaquinaDeCoxinhas** em Java que simula uma máquina que armazena e vende coxinhas.  
Ele permite abastecer a máquina, vender coxinhas (individualmente ou em lote) e zerar o estoque.

---

## ✨ Funcionalidades

* **Abastecimento** → Adiciona coxinhas à máquina.
* **Venda Unitária** → Vende uma coxinha por vez.
* **Venda em Lote** → Vende uma quantidade específica de coxinhas, se houver estoque suficiente.
* **Zerar Estoque** → Reseta o número de coxinhas para zero.
* **Exibição de Estado** → Mostra no console o estado atual da máquina após cada operação.

---

## 📦 Sobre o Projeto

O código contém duas classes principais:

* **MaquinaDeCoxinhas** → Contém os métodos para gerenciar o estoque.
* **MaquinaDeCoxinhasTeste** → Classe de teste que demonstra como usar os métodos da máquina.

---

## 💻 Exemplo de Uso

```java
public class MaquinaDeCoxinhasTeste {
    public static void main(String[] args) {
        MaquinaDeCoxinhas coxinha = new MaquinaDeCoxinhas();

        coxinha.abastecer(10);           // Abastece com 10 coxinhas
        coxinha.venderCoxinhas();        // Vende 1 coxinha
        coxinha.venderCoxinhas(2);       // Vende 2 coxinhas
        coxinha.zerarMaquina();          // Zera o estoque
    }
}
````
## ⚙️ Estrutura das Operações

### 1️⃣ Abastecimento

* **Método**: `abastecer(int quantidadeAbastecer)`  
Acrescenta a quantidade passada ao estoque total.

---

### 2️⃣ Venda Unitária

* **Método**: `venderCoxinhas()`  
Subtrai uma unidade do estoque, se disponível.

---

### 3️⃣ Venda em Lote

* **Método**: `venderCoxinhas(int quantidadeCompra)`  
Verifica se há estoque suficiente antes de subtrair a quantidade desejada.

---

### 4️⃣ Zerar Estoque

* **Método**: `zerarMaquina()`  
Define o estoque para zero.
