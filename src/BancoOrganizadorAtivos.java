import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList < String > ativos = new ArrayList< >();

            int quantidadeAtivos = scanner.nextInt();

            // Entrada dos códigos dos ativos
            for (int i = 0; i < quantidadeAtivos; i++) { // Use "<" em vez de "<=" aqui
                String codigoAtivo = scanner.next();
                ativos.add(codigoAtivo);
            }

            // Ordenar os ativos em ordem alfabética.
            Collections.sort(ativos);

            // Imprimir a lista de ativos ordenada.
            for (String ativo : ativos) {
                System.out.println(ativo);
            }


            //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
        }
    }


