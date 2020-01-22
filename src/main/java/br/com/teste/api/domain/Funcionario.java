package br.com.teste.api.domain;

import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * A Funcionario.
 */
@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "nome_completo")
    private String nomeCompleto;

    @Column(name = "estado_civil")
    private String estadoCivil;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "aniversario")
    private Instant aniversario;

    @Column(name = "salario")
    private Long salario;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public Funcionario nomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
        return this;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public Funcionario estadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
        return this;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public Funcionario email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Funcionario phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Instant getAniversario() {
        return aniversario;
    }

    public Funcionario aniversario(Instant aniversario) {
        this.aniversario = aniversario;
        return this;
    }

    public void setAniversario(Instant aniversario) {
        this.aniversario = aniversario;
    }

    public Long getSalario() {
        return salario;
    }

    public Funcionario salario(Long salario) {
        this.salario = salario;
        return this;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Funcionario)) {
            return false;
        }
        return id != null && id.equals(((Funcionario) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
            "id=" + getId() +
            ", nomeCompleto='" + getNomeCompleto() + "'" +
            ", estadoCivil='" + getEstadoCivil() + "'" +
            ", email='" + getEmail() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", aniversario='" + getAniversario() + "'" +
            ", salario=" + getSalario() +
            "}";
    }
}
