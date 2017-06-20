package com.spring.chapter4.concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 
 * @author liguangyao
 *
 */
// @Aspect
public class Audience1 {

	/**
	 * 测试方案一
	 */
	// 表演之前
	public void takeSeats() {
		System.out.println("Audience is taking their seats.");
	}

	// 表演之前
	public void turnOffCellPhones() {
		System.out.println("Audience is turning off cellphones");
	}

	// 表演之后
	public void applaud() {
		System.out.println("CLAP CLAP CLAP !!!");
	}

	// 表演失败之后
	public void demandRefund() {
		System.out.println("Demanding a refund!");
	}

	// /**
	// * 测试方案二
	// */
	// // 表演之前
	// @Before("execution(** com.spring.chapter4.concert.Performance.perform(..))")
	// public void takeSeats2() {
	// System.out.println("Audience is taking their seats.");
	// }
	//
	// // 表演之前
	// @Before("execution(** com.spring.chapter4.concert.Performance.perform(..))")
	// public void turnOffCellPhones2() {
	// System.out.println("Audience is turning off cellphones");
	// }
	//
	// // 表演之后
	// @AfterReturning("execution(** com.spring.chapter4.concert.Performance.perform(..))")
	// public void applaud2() {
	// System.out.println("CLAP CLAP CLAP !!!");
	// }
	//
	// // 表演失败之后
	// @AfterThrowing("execution(** com.spring.chapter4.concert.Performance.perform(..))")
	// public void demandRefund2() {
	// System.out.println("Demanding a refund!");
	// }

	// /**
	// * 测试方案三
	// */
	// // 定义切点
	// @Pointcut("execution(** com.spring.chapter4.concert.Performance.perform(..))")
	// public void performance() {
	// };
	//
	// // 表演之前
	// @Before("performance()")
	// public void takeSeats3() {
	// System.out.println("Audience is taking their seats.");
	// }
	//
	// // 表演之前
	// @Before("performance()")
	// public void turnOffCellPhones3() {
	// System.out.println("Audience is turning off cellphones.");
	// }
	//
	// // 表演之后
	// @AfterReturning("performance()")
	// public void applaud3() {
	// System.out.println("CLAP CLAP CLAP !!!");
	// }
	//
	// // 表演失败之后
	// @AfterThrowing("performance()")
	// public void demandRefund3() {
	// System.out.println("Demanding a refund!");
	// }
}
