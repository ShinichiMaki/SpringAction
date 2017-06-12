package com.spring.chapter1.knight;

import static org.mockito.Mockito.*;

import org.junit.Test;

import com.spring.chapter1.knight.BraveKnight;
import com.spring.chapter1.knight.Quest;

public class BraveKnightTest {

	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);

		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}

}
