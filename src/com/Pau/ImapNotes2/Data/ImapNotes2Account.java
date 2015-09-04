package com.Pau.ImapNotes2.Data;

public class ImapNotes2Account {

    private String accountname = "";
    private String username = "";
    private String password = "";
    private String server = "";
    private String portnum = "";
    private String security = "";
    private String usesticky = "";
    private Boolean accountHasChanged = false;
    
    
    public ImapNotes2Account() {
    }
    
    public String toString() {
        return this.accountname + ":" + this.username + ":" + this.password + ":"
	    + this.server + ":" + this.portnum + ":" + this.security + ":"
            + this.usesticky + ":" + this.accountHasChanged.toString();
        }

    public String GetAccountname() {
        return this.accountname;
    }
 
    public void SetAccountname(String Accountname) {
        if (this.accountname.equals(Accountname)) this.accountHasChanged = true;
        this.accountname = Accountname;
    }
 
    public String GetUsername() {
        return this.username;
    }
 
    public void SetUsername(String Username) {
        this.username = Username;
    }
 
    public String GetPassword() {
        return this.password;
    }
 
    public void SetPassword(String Password) {
        this.password = Password;
    }
    
    public String GetServer() {
        return this.server;
    }
 
    public void SetServer(String Server) {
        this.server = Server;
    }
    
    public String GetPortnum() {
        return this.portnum;
    }
 
    public void SetPortnum(String Portnum) {
        this.portnum = Portnum;
    }
    
    public String GetSecurity() {
        return this.security;
    }
 
    public void SetSecurity(String Security) {
        this.security = Security;
    }
    
    public String GetUsesticky() {
        return this.usesticky;
    }
 
    public void SetUsesticky(String Usesticky) {
        this.usesticky = Usesticky;
    }
    
    public void SetaccountHasChanged() {
        this.accountHasChanged = true;
    }
    
    public void SetaccountHasNotChanged() {
        this.accountHasChanged = false;
    }
    
    public Boolean GetaccountHasChanged() {
        return this.accountHasChanged;
    }
    
    public void Clear() {
        this.username=null;
        this.password=null;
        this.server=null;
        this.portnum=null;
        this.security=null;
        this.usesticky=null;
        this.accountHasChanged=false;
    }
}
