package clayfinTrainee;

import java.io.IOException;

public class MemorySize {
//	public static void main(String[] args) {
//		
//		double size_bytes=99621514731588D;
//		String cnt_size = null;
//		
//		double size_kb = size_bytes /1024;
//		double size_mb = size_kb / 1024;
//		double size_gb = size_mb / 1024 ;
//		
//		
//		 
//	    System.out.println(cnt_size = size_gb + " GB");
//	        
//		 
//	    System.out.println(cnt_size = size_mb + " MB");
//	    
//	    System.out.println(cnt_size = size_kb + " KB");
//	             
//				
//	}
	
	public static void main(String[] args) throws IOException {
		/*
		 * public static final java.io.InputStream in; public static final
		 * java.io.PrintStream out; public static final java.io.PrintStream err;
		 */
		//System.exit(-1); //nonzero ->abnormal termination
		System.out.println(System.in);
		//System.out.println(System.in.read());
		System.out.println(System.currentTimeMillis());
		System.out.println(System.lineSeparator());//On UNIX systems, it returns "\n"; on MicrosoftWindows systems it returns "\r\n".
		Runtime r=null;//new Runtime();
		r=Runtime.getRuntime();
		System.out.println(r);
		System.out.println(r.availableProcessors());
		System.out.println(r.totalMemory());//in bytes (long)
		
		
		//convert to kb, mb,gb
		System.out.println(Thread.currentThread().getName());
		//gc - heap memory
		
		
	}
}
