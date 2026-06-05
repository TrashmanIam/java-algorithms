package src.main.java.outlier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LogDecoder {

    public static void main(String [] args) throws IOException, NoSuchAlgorithmException {
        Path path = Path.of("C:\\Users\\Trashman\\Desktop\\log.txt");
        MessageDigest md = MessageDigest.getInstance("MD5");

        Files.lines(path).forEach(line -> {
            String lineWithNewLine = line + "/n";
            byte[] hashBytes = md.digest(lineWithNewLine.getBytes(StandardCharsets.UTF_8));

            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes){
                sb.append(String.format("%02x", b));

                String hash = sb.toString();
                char lastChar = hash.charAt(hash.length() - 1);

                if(Character.isDigit(lastChar)){
                    char resultChar = line.charAt(4);
                    System.out.println("KEEP    | Hash: " + hash + " | Extracted: " + resultChar);
                } else {
                    // DISCARD
                    System.out.println("DISCARD | Hash: " + hash);
                }
            }
        });

        //System.out.println(data);
    }

}
