package z2;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class LogProcessor {
	private Path file;
	private List<LogEntry> log;

	/**
	 * Creates object and set file.
	 * 
	 * @param file file name
	 */
	public LogProcessor(Path file) {
		this.file = file;
		log = new LinkedList<>();

	}

	/**
	 * Load file and populate list of loaded objects (LogEntry).
	 * 
	 * @throws IOException if can not load file
	 */
	public void load() throws IOException {
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNext()) {
				String line = sc.nextLine();
				log.add(parseLog(line));
			}
		}
	}

	/**
	 * Returns list of log entries.
	 * 
	 * @return list of log entries
	 */
	public List<LogEntry> getLogs() {
		return log;
	}

	/**
	 * Extracts elements of line and creates LogEntry.
	 * 
	 * @param line one line og log file
	 * @return created log entry object
	 */
	public static LogEntry parseLog(String line) {
		String time=line.substring(0,23);
		line=line.substring(23);
		
		//String level=line.substring(0,line.indexOf('[')).trim();
		String level =line.substring(0,7).trim();

		//line=line.substring(line.indexOf('['));
		line=line.substring(6);
		String thread=line.substring(48,63).trim();
		line=line.substring(63);
		
		//String text=line.substring(line.lastIndexOf(':')+1).trim();
		String text=line.substring(44).trim();
		LogEntry entry = new LogEntry(time,level,thread,text);
		
		return entry;
		
	}
	public static void main(String[] args) {
		LogEntry le = parseLog("2020-05-12 05:43:10.370  INFO [AuthenticationAuthorizationManager,,,] 1 --- [           main] s.c.a.AnnotationConfigApplicationContext : Some text ...");
		System.out.println(le.getTime());
		System.out.println(le.getLevel());
		System.out.println(le.getThread());
		System.out.println(le.getText());
	}
}
