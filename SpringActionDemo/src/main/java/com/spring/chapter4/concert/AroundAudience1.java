package com.spring.chapter4.concert;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAudience1 {
	public void watchPerformance(ProceedingJoinPoint joinpoint) {
		try {
			// 表演之前
			System.out.println("Audience is taking seats.");
			System.out.println("Audience is turning off cellphones.");
			long start = System.currentTimeMillis();

			// 执行被通知的方法
			joinpoint.proceed();

			// 表演之后
			long end = System.currentTimeMillis();
			System.out.println("CLAP CLAP CLAP !!!");
			System.out.println("The performance took " + (end - start)
					+ " milliseconds.");
		} catch (Throwable t) {
			// 表演失败之后
			System.out.println("Demanding a refund!!");
		}
	}
}
