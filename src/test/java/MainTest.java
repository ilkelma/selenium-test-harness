package net.kcina.test;

import org.junit.Test;

import org.fluentlenium.adapter.FluentTest;

import static org.fest.assertions.Assertions.assertThat;
import static org.fest.assertions.fluentlenium.FluentLeniumAssertions.assertThat;
import static org.fluentlenium.core.Fluent.*;

public class MainTest extends FluentTest {

	@Test 
	public void bing_title_should_contain_query() {
		goTo("http://www.bing.com/");
		fill("#sb_form_q").with("test");
		submit("#sb_form_q");
		assertThat(title()).contains("test");
	}

}