package leet;

public class SolutionValidateIPAddress {
    public String validIPAddress(String queryIP) {
        if (queryIP.matches("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$")) {
            return "IPv4";
        } else if (queryIP.matches("^(([0-9a-fA-F]{1,4}):){7}([0-9a-fA-F]{1,4})$")) {
            return "IPv6";
        } else {
            return "Neither";
        }
    }
}

