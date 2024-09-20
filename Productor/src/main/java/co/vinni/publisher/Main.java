package co.vinni.publisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

import static co.vinni.Producer.emitLog;


public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        log.info("Initiated Producer");
        Scanner sc = new Scanner(System.in);
        String msg = "";
        while(msg.isEmpty()) {
            log.info("Enter the message to be sent : ");
            msg = sc.nextLine();
            if (msg.isEmpty()) {
                log.error(" The message is empty");
            } else {
                try {
                    emitLog(msg);
                } catch (IOException | TimeoutException e) {
                    log.error(" Error {0}" , e);
                }
            }
        }
    }
}
