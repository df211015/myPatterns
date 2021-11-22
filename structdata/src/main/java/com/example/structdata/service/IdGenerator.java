package com.example.structdata.service;

/**
 *
 */
public interface IdGenerator {
    String generate() throws IdGenerationFailureException;
}
