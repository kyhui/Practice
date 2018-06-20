package test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;

public class SetupEnvironment {
	File file;
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	static InputStream stdin = System.in;
	static PrintStream stdout = System.out;
	private static int result;

	public SetupEnvironment(String name) throws IOException {
		this.file = new File("/Users/kyhui/Documents/Coding/Self Improvement/HackerEarth/testfiles/" + name + ".txt");
		System.setIn(new ByteArrayInputStream(Files.readAllBytes(file.toPath())));
		System.setOut(new PrintStream(out));

	}

	public ByteArrayOutputStream getOutput() {
		return out;
	}

	public static void setAnswer(int result) {
		SetupEnvironment.result = result;
	}

	public int getAnswer() {
		return result;
	}

	public static void cleanUp() {
		System.setIn(stdin);
		System.setOut(stdout);
	}
}
