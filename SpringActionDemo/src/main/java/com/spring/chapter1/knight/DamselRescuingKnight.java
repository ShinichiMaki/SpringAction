package com.spring.chapter1.knight;

public class DamselRescuingKnight implements Knight {
	private RescueDamselQuest quest;

	/**
	 * 构造函数
	 */
	public DamselRescuingKnight() {
		// TODO Auto-generated constructor stub
		this.quest = new RescueDamselQuest();
	}

	// 探索的行为
	public void embarkOnQuest() {
		// TODO Auto-generated method stub
		quest.embark();
	}
}
