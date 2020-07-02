/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.oshi;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;

/**
 *
 * @author Nikaolly
 */
public class TesteOshi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardwareInfo = systemInfo.getHardware();
        CentralProcessor cpu = hardwareInfo.getProcessor();
        GlobalMemory glb = hardwareInfo.getMemory();
        
        System.out.println("Vendor: " + cpu.getVendor());
        System.out.println("Logical Cores: " + cpu.getLogicalProcessorCount());
        System.out.println("Frequency (Hz): " + cpu.getVendorFreq());
        System.out.println("Nome: " + cpu.getName());
        System.out.println("Modelo: " + cpu.getModel());
        System.out.println(String.format("Memória Total: %.2f", Double.valueOf(glb.getTotal())));
        System.out.println("Memória Disponível: " + Double.valueOf(glb.getAvailable()));
    }
    
}
