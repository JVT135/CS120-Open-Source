

import java.io.*;

public class even_odd_site {
    public static void main(String[] args) throws IOException {
        
        // Create a BufferedWriter Object
        BufferedWriter file = new BufferedWriter(new FileWriter("numbers.html"));
        
        // Write to a HTML file
        file.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n");
        file.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n");
        
        // Even-Odd calc and output to HTML
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                file.write("<tr><td>" + i + "</td><td></td></tr>\n");
            }
            else {
                file.write("<tr><td></td><td>" + i + "</td></tr>\n");
            }
        }
        file.write("</table>\n</body>\n</html>");
        file.close();
        
        // New Buffered Reader Object
        BufferedReader reader = new BufferedReader(new FileReader("numbers.html"));
        
        // Print HTML file to console
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
