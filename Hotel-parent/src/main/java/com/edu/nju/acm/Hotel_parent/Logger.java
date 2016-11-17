package com.edu.nju.acm.Hotel_parent;
import java.io.PrintWriter;

/**
 * 在程序开发中，我们常常需要输出程序运行中的一些数据来帮助我们判断程序的运行状态或者诊断问题。
 * 在实际的应用中，并不会使用System.out.println这样的方式输出，而是使用Logger来记录程序日志。
 * 其好处在于，可以设定记录日志的级别来筛选输出的内容，还可以指定将内容输出到标准输出流还是输出到文件。
 * 
 * 比如，在默认情况下：
 * logger.info("Reading file..."); // 输出[INFO]Reading file...到标准输出流
 * 
 * 请完成以下功能：
 * 1. 日志的输出级别设定
 * 在程序的开发过程中，我们往往在程序中有些地方输出的是调试信息，有些地方输出的是错误信息。
 * 而在实际运行中我们更多地会去关注错误输出信息，而希望忽略那些调试信息。
 * 这时就需要设定日志输出级别的功能来对输出日志进行过滤。
 * 
 * 日志级别从低到高分别是 DEBUG, INFO, WARNING, ERROR, FATAL
 * 当Logger的级别设置得较高时，较低级别的日志将不会被输出。
 * 比如当级别设定为ERROR时：
 * Logger logger = new Logger();
 * logger.error("Empty file!"); // 输出[ERROR]Empty file!
 * logger.info("Reading file..."); // INFO级别比ERROR低，因此不输出
 * logger.debug("Reading file..."); // 同样不输出
 * 
 * 2. 输出目标设定
 * Logger应当可以允许用户选择讲输出通过标准输出流输出还是通过文件输出。
 * Logger默认将日志输出到标准输出流。
 * Logger提供setOutput(PrintWriter writer)方法
 * 当用户将PrintWriter对象传入后，logger将使用该对象输出内容，不再输出到标准输出流中。
 * 
 * 3. 输出格式设定
 * 输出的日志可以使用占位符指定格式，默认格式为[%s]%m
 * 其中%s表示大写的LOG级别(severity)，%m表示日志信息(message)
 * 比如：
 * Logger logger = new Logger();
 * logger.info("Reading file..."); // 默认输出[INFO]Reading file...
 * logger.setFormat("*%m* - %s"); // 变更格式
 * logger.info("Reading file..."); // 输出*Reading file...* - INFO
 * 
 * 请尝试实现该Logger。
 * 
 * 请注意：
 * 1. Logger默认级别是INFO,
 * 2. 所有输出结尾要求有换行符，可直接用System.out或者PrintWriter的println方法
 * 3. 枚举类型的ordinal()方法可以将枚举转化为int
 */
public class Logger {
	public void debug(String msg) {
		
	}

	public void info(String msg) {
		
	}
	
	public void warning(String msg) {
		
	}
	
	public void fatal(String msg) {
		
	}
	
	public void error(String msg) {
		
	}
	
	public void setLevel(LogLevel level) {

	}

	public void setOutput(PrintWriter writer) {

	}

	public void setFormat(String format) {

	}
}
