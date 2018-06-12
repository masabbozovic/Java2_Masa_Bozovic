
package computer;


public class Computer {
    private double processTact;
    private double memory;
    private int hardDrive;
   
    public Computer() {
        
    }

    public Computer(double processTact, double memory, int hardDrive) {
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public Computer(int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getProcessTact() {
        return processTact;
    }

    public void setProcessTact(double processTact) {
        this.processTact = processTact;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
    
    public void info() {
        System.out.println("Process Tact: " + getProcessTact());
        System.out.println("Memory: " + getMemory());
        System.out.println("Hard Drive: " + getHardDrive());
        System.out.println("");
    }
    
    
}
