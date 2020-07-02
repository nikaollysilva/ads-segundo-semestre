package com.mycompany.teste.oshii;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;

/**
 *
 * @author Nikaolly
 */
public class TesteOshi {
    public static void main(String[] args) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardwareInfo = systemInfo.getHardware();
        CentralProcessor cpu = hardwareInfo.getProcessor();
        GlobalMemory glb = hardwareInfo.getMemory();
        
        System.out.println("Processador: " + cpu.getVendor());
        System.out.println("Logical Core's: " + cpu.getLogicalProcessorCount());
        System.out.println("Frequency (Hz): " + cpu.getVendorFreq());
        System.out.println("Nome: " + cpu.getName());
        System.out.println("Modelo: " + cpu.getModel());
        System.out.println(String.format("Memória Total: %.2f", Double.valueOf(glb.getTotal())));
        System.out.println("Memória Disponível: " + Double.valueOf(glb.getAvailable()));
    }
}
