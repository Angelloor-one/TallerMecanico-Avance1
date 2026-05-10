package com.alp.taller.model;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int idCliente;

    public Vehiculo() {}

    public Vehiculo(String placa, String marca, String modelo, int idCliente) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.idCliente = idCliente;
    }

    // --- GETTERS Y SETTERS ---

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}