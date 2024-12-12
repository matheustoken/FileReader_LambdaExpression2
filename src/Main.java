import entities.Sale;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo CSV: ");
        String path = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Sale> list=new ArrayList<>();

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                list.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2], Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
                line = br.readLine();
            }

            Map<String, Double> sales = list.stream()
                    .collect(Collectors.groupingBy(
                            x -> x.getSeller(),
                            Collectors.summingDouble(x -> x.getTotal())
                    ));
            System.out.println("Total de vendas por vendedor:");
            sales.forEach((seller, total) ->
                    System.out.println(  seller +  " - " + "R$"+ total)
            );


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}