package org.cryptomator.cryptolib.sgx;

final class Constants {
    static final int SGX_ADD_BYTES = 560;
    static final int SGX_PAYLOAD_SIZE = 1024 * 32;
    static final int SGX_CHUNK_SIZE = SGX_PAYLOAD_SIZE + SGX_ADD_BYTES;
}
