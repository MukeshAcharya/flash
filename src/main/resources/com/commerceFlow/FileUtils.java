package commerceFlow;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.hylamobile.tests.TestContext;

public class FileUtils {

	private static final Logger logger = Logger.getLogger(FileUtils.class);

	public static List<File> getFiles(File dir) {

		List<File> propertyFiles = new ArrayList<File>();
		File[] fileList = dir.listFiles();
		for (File file : fileList) {
			if (!file.isDirectory())
				propertyFiles.add(file);
			else
				logger.warn(String.format(
						"found directory [%s] inside properties of properties directory.\nif desirable, implement new method to load recursively",
						file.getName()));
		}
		return propertyFiles;
	}

	public static String getFileContent(InputStream inputStream) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			return sb.toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static String getFileContent(String fileName) {

		ClassLoader classLoader = FileUtils.class.getClassLoader();
		File file = new File(
				classLoader.getResource(TestContext.getTestEnvironment() + "/testdata/" + fileName).getFile());
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			return getFileContent(inputStream);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (Exception ex) {

			}

		}
	}

}
