
package actividad2;

class Persona {
 private String name;
 private String email;
 
 public Persona (String name, String email){
     this.name = name;
     this.email = email;
     
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "nombre: "+name +", email: "+email;
    }
 
    
}
