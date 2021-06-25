package z2;

public class LogEntry {
	String time;
	String level;
	String thread;
	String text;
	public String getTime() {
		return time;
	}
	public String getLevel() {
		return level;
	}
	public String getThread() {
		return thread;
	}
	public String getText() {
		return text;
	}
	public LogEntry(String time, String level, String thread, String text) {
		super();
		this.time = time;
		this.level = level;
		this.thread = thread;
		this.text = text;
	}
	

}
