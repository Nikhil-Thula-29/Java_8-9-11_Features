package com.nt.java9changes;

import java.io.IOException;
import java.util.Optional;

public class ProcessAPIChanges {
	
	public static void main(String[] args) throws IOException {
		ProcessHandle ph=ProcessHandle.current(); //Give me the currently running Java process
		System.out.println(ph.pid());
		
		Optional<ProcessHandle> pr=ProcessHandle.of(24364);
		if(pr.isPresent()) {
			ProcessHandle pr1=pr.get();
			System.out.println(pr1.pid());
			ProcessHandle.Info pinfo=pr1.info();
			System.out.println(pinfo.user().get());
			System.out.println(pinfo.command().get());
			System.out.println(pinfo.startInstant().get());
			System.out.println(pinfo.totalCpuDuration().get());
			System.out.println(pr);
			pr1.destroy();
		}
		
		
		ProcessHandle.allProcesses().forEach((x)->System.out.println(x.info()));
		
		new ProcessBuilder("notepad.exe").start();
		//new ProcessBuilder("C:\\Users\\nikhi\\Downloads\\eclipse-jee-2026-03-R-win32-x86_64\\eclipse\\eclipse.exe").start();
	}

}
