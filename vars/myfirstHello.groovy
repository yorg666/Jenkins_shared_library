#!/usr/bin/env groovy

def call(String name = 'warlock') {
  echo "Hello, ${name}."
}

def info(message) {
  echo "INFO: ${message}"
}

def warning(message) {
  echo "WARNING: ${message}"
}
