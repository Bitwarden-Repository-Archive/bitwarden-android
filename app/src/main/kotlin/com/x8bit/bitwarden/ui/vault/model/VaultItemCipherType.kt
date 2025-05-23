package com.x8bit.bitwarden.ui.vault.model

import kotlinx.serialization.Serializable

/**
 * Represents different types of ciphers that can be added/viewed.
 */
@Serializable
enum class VaultItemCipherType {

    /**
     * A login cipher.
     */
    LOGIN,

    /**
     * A card cipher.
     */
    CARD,

    /**
     * A identity cipher.
     */
    IDENTITY,

    /**
     * A secure note cipher.
     */
    SECURE_NOTE,

    /**
     * A SSH key cipher.
     */
    SSH_KEY,
}
