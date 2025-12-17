package org.example.kkrproject.service;

import com.fazecast.jSerialComm.SerialPort;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
@RequiredArgsConstructor
public class SerialScanService {

    private final VoorraadService voorraadService;

    @PostConstruct
    public void startListening() {

        new Thread(() -> {

            SerialPort comPort = SerialPort.getCommPort("COM9");
            comPort.setBaudRate(115200);
            comPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_BLOCKING, 0, 0);

            if (!comPort.openPort()) {
                System.out.println("❌ COM-poort niet geopend");
                return;
            }

            System.out.println("✅ Luistert naar micro:bit via USB (" + comPort.getSystemPortName() + ")");

            try {
                InputStream in = comPort.getInputStream();
                StringBuilder sb = new StringBuilder();

                int b;
                while ((b = in.read()) != -1) {
                    char c = (char) b;
                    System.out.print(c); // direct loggen wat binnenkomt
                    if (c == '\n') {     // einde van een regel
                        String line = sb.toString().trim();
                        sb.setLength(0); // buffer reset
                        System.out.println("📥 Ontvangen: " + line);

                        try {
                            Integer productcode = Integer.parseInt(line);
                            voorraadService.verlaagVoorraadMetEen(productcode);
                            System.out.println("📦 Voorraad verlaagd voor product " + productcode);
                        } catch (NumberFormatException e) {
                            System.out.println("⚠️ Ongeldige input: " + line);
                        }
                    } else {
                        sb.append(c);
                    }
                }

            } catch (Exception e) {
                System.out.println("❌ Serial leesfout: " + e.getMessage());
            }

        }).start();
    }
}
