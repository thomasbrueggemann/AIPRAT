package tests;

import static com.google.common.truth.Truth.assertThat;

import java.util.LinkedList;

import analysis.App;

public class AppTest {

	public AppTest() {
		App app = new App("data/com.goodrx");
		LinkedList<String> files = app.getAllSourceFiles();

		assertThat(files).isNotEmpty();
	}
}
