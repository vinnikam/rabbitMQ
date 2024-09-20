package co.vinni.subscriptor;

import co.vinni.Receiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        log.info("Subscriptor ");
        try {
            Receiver.receivedLog();
        } catch (IOException | TimeoutException e) {
            log.error("Error to receive message {0}",e);
        }
    }
}
