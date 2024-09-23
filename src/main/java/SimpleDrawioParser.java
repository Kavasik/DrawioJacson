

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.util.List;
import java.util.Map;

                         public class SimpleDrawioParser {
                             public static void main(String[] args) {
                                 try {
                                     XmlMapper xmlMapper = new XmlMapper();
                                     Map<String, Object> drawioData = xmlMapper.readValue(new File("C:\\Users\\ABarkhatov\\Downloads\\documents-components.drawio"), Map.class);

                                     // Выводим полное содержимое для диагностики
                                     System.out.println(drawioData);

                                     // Пример анализа, если структура отличается
                                     analyzeData(drawioData);
                                 } catch (Exception e) {
                                     e.printStackTrace();
                                 }
                             }

                             private static void analyzeData(Map<String, Object> data) {
                                 // Эти функции зависят от вашей фактической структуры.
                                 // Например:
                                 if (data.containsKey("diagram")) {
                                     List<Map<String, Object>> diagrams = (List<Map<String, Object>>) data.get("diagram");
                                     for (Map<String, Object> diagram : diagrams) {
                                         // Дополнительная обработка
                                     }
                                 } else {
                                     System.out.println("No 'diagram' key found.");
                                 }
                             }
                         }