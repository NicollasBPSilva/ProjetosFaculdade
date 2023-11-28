package ControleEstoque;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;

public class MenuAutoPecas {

    private static ArrayList<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("");
            System.out.println("--- Sistema de Auto Peças ---");
            System.out.println("");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Consultar produto");
            System.out.println("3 - Vender produto");
            System.out.println("4 - Relatório de estoque");
            System.out.println("5 - Sair");
            opcao = scanner.nextInt();
            System.out.println("");

            switch (opcao) {
                case 1:
                    System.out.println("Digite o código do produto:");
                    String codigo = scanner.next();
                    System.out.println("");
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.next();
                    System.out.println("");
                    System.out.println("Digite a categoria do produto:");
                    String categoria = scanner.next();
                    System.out.println("");
                    System.out.println("Digite o preço do produto:");
                    double preco = scanner.nextDouble();
                    System.out.println("");
                    System.out.println("Digite a quantidade do produto:");
                    int quantidade = scanner.nextInt();
                    System.out.println("");
                    Produto novoProduto = new Produto(codigo, nome, categoria, preco, quantidade);
                    produtos.add(novoProduto);
                    break;
                case 2:
                    System.out.println("Digite o nome do produto:");
                    nome = scanner.next();
                    System.out.println("");
                    Produto produto = consultarProduto(nome);
                    if (produto != null) {
                        System.out.println("Código: " + produto.getCodigo());
                        System.out.println("Nome: " + produto.getNome());
                        System.out.println("Categoria: " + produto.getCategoria());
                        System.out.println("Preço: " + produto.getPreco());
                        System.out.println("Quantidade em estoque: " + produto.getQuantidade());
                    } else {
                        System.out.println("Produto não encontrado.");
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do produto:");
                    nome = scanner.next();
                    System.out.println("");
                    System.out.println("Digite a quantidade vendida:");
                    quantidade = scanner.nextInt();
                    System.out.println("");
                    boolean vendaRealizada = realizarVenda(nome, quantidade);
                    if (vendaRealizada) {
                        System.out.println("Venda realizada com sucesso!");
                        System.out.println("");
                        produtos.remove(vendaRealizada);
                    } else {
                        System.out.println("Não foi possível realizar a venda. Verifique se há estoque suficiente.");
                        System.out.println("");
                    }
                    break;
                case 4:
                    gerarRelatorio();
                    System.out.println("Relatório gerado com sucesso!");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Encerrando o sistema...");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println("");
                    break;
            }
        } while (opcao != 5);
        scanner.close();
    }

    public static Produto consultarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public static boolean realizarVenda(String nome, int quantidade) {
        Produto produto = consultarProduto(nome);
        if (produto != null && produto.getQuantidade() >= quantidade) {
            produto.removerProduto(quantidade);
            return true;
        }
        return false;
    }

    public static void gerarRelatorio() {
        try {
            FileWriter fileWriter = new FileWriter("relatorio.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Relatório de estoque\n");
            bufferedWriter.write("Data: " + new Date() + "\n");
            bufferedWriter.write("produtos em estoque:\n");
            for (Produto produto : produtos) {
                bufferedWriter.write(produto.getNome() + ": " + produto.getQuantidade() + " unidades\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {

        }

    }
}
