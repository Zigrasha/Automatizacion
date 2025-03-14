package utilitario;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipUtil {

    // Método para descomprimir un archivo zip
    public static void unzip(String zipFilePath, String destDirectory) throws IOException {
        File destDir = new File(destDirectory);
        if (!destDir.exists()) {
            destDir.mkdir();
        }

        ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFilePath));
        ZipEntry entry = zipIn.getNextEntry();

        while (entry != null) {
            String filePath = destDirectory + File.separator + entry.getName();
            if (!entry.isDirectory()) {
                extractFile(zipIn, filePath);
            } else {
                File dir = new File(filePath);
                dir.mkdir();
            }
            zipIn.closeEntry();
            entry = zipIn.getNextEntry();
        }
        zipIn.close();

        // No eliminar el archivo zip después de descomprimirlo
    }

    private static void extractFile(ZipInputStream zipIn, String destinationDir) throws IOException {
        // Crear el directorio necesario para la entrada
        File file = new File(destinationDir);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))) {
            byte[] bytesIn = new byte[4096];
            int read;
            while ((read = zipIn.read(bytesIn)) != -1) {
                bos.write(bytesIn, 0, read);
            }
        }
    }

    public static String getChromedriverPath(String extractedDir) {
        File dir = new File(extractedDir);
        File[] files = dir.listFiles();

        if (files != null) {
            // Busca el archivo chromedriver.exe en el directorio descomprimido
            for (File file : files) {
                if (file.isFile() && file.getName().equals("chromedriver.exe")) {
                    return file.getAbsolutePath();
                }
                // Busca en subdirectorios
                if (file.isDirectory()) {
                    String driverPath = getChromedriverPath(file.getAbsolutePath());
                    if (driverPath != null) {
                        return driverPath; // Retorna el path encontrado
                    }
                }
            }
        }
        throw new IllegalStateException("El archivo chromedriver.exe no se encontró en la ruta especificada.");
    }
}
