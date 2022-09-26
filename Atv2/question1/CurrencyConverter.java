package question1;
import java.io.*;
import java.net.*; 

public class CurrencyConverter {
    private double price;
    private double amount;
    private double converter;

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getAmount() {
        return this.amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getConverter(){
        return this.converter;
    }
    public void setConverter(double converter) {
        this.converter = converter;
    }

    public double dollarToReal(double amount, double price) {
        this.setPrice(price);
        this.setAmount(amount);
        this.setConverter((this.getPrice() * this.amount) * 0.06 + (this.getPrice() * this.getAmount()));
        return converter;
    }

    public double RequestDollar() throws Exception {
        
        String urlToRead = "https://www3.bcb.gov.br/bc_moeda/rest/converter/1/1/220/790/2022-09-23";
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
            for (String line; (line = reader.readLine()) != null; ) {
                result.append(line);
            }
        }

        String  xml = result.toString();

        int begin = xml.lastIndexOf("<valor-convertido>") + "<valor-convertido>".length(); 
        int end = xml.lastIndexOf("</valor-convertido>");
        
        String dollars = xml.substring(begin, end);

        double dollar = Double.parseDouble(dollars);
        return dollar;

     }

  
  
}