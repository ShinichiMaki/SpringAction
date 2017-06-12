package com.spring.chapter1.knight;

public class BraveKnight implements Knight {

	private Quest quest;

//	private Minstrel minstrel;

	/**
	 * 构造函数
	 * 
	 * @param quest
	 */
	public BraveKnight(Quest quest) {
		// TODO Auto-generated constructor stub
		this.quest = quest;
	}

//	/**
//	 * 构造函数
//	 * 
//	 * @param quest
//	 * @param minstrel
//	 */
//	public BraveKnight(Quest quest, Minstrel minstrel) {
//		// TODO Auto-generated constructor stub
//		this.quest = quest;
//		this.minstrel = minstrel;
//	}

	public void embarkOnQuest() {
		// TODO Auto-generated method stub
		// this.minstrel.singBeforeQuest();
		this.quest.embark();
		// this.minstrel.singAfterQuest();
	}
}
