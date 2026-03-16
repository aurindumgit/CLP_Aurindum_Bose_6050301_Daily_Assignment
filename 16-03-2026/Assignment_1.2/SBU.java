package springAssignment2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sbu")
public class SBU {

    private String sbuId;
    private String sbuName;
    private String sbuHead;

    public SBU() {
//        System.out.println("SBU default constructor called");
    }

    public String getSbuId() { return sbuId; }
    public String getSbuName() { return sbuName; }
    public String getSbuHead() { return sbuHead; }

    @Value("PES-BU")
    public void setSbuId(String sbuId) {
        this.sbuId = sbuId;
    }

    @Value("Product Engineering Services")
    public void setSbuName(String sbuName) {
        this.sbuName = sbuName;
    }

    @Value("Kiran Rao")
    public void setSbuHead(String sbuHead) {
        this.sbuHead = sbuHead;
    }

    @Override
    public String toString() {
        return "SBU [sbuCode=" + sbuId + ", sbuHead=" + sbuHead + ", sbuName=" + sbuName + "]";
    }
}