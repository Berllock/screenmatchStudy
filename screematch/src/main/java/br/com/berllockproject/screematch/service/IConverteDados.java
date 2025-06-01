package br.com.berllockproject.screematch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
