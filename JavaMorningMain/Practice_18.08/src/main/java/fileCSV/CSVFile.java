package fileCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class CSVFile {
//    private static String csvFile = "file.csv";
//
//    public static Integer findRowIndex(String fieldName, String value) throws IOException {
//        try (BufferedReader reader = new BufferedReader(
//                new InputStreamReader(
//                        new FileInputStream(csvFile)))) {
//
//            String header = reader.readLine();
//
//            List<String[]> dataRows = new ArrayList<>();
//
//            while (reader.ready()) {
//                String dataLine = reader.readLine();
//                if (dataLine.isEmpty()) {
//                    break;
//                }
//                String[] dataParts = dataLine.split(",");
//
//                dataRows.add(dataParts);
//            }
//
////            System.out.println("Header = " + header);
////            for (String[] dataRow : dataRows) {
////                System.out.println("Data row = " + Arrays.toString(dataRow));
////            }
//        }
//    }
//}
