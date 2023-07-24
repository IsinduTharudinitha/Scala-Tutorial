
object CaesarCipher {

  def caesarEncrypt(plainText: String, shift: Int): String = {
    plainText.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  def caesarDecrypt(encryptedText: String, shift: Int): String = {
    encryptedText.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base - shift + 26) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  def cipher(process: (String, Int) => String, text: String, key: Int): String = {
    process(text, key)
  }

  def main(args: Array[String]): Unit = {
    val shift = 3
    val text = "Hello, World!"

                                                                               // Encryption
    val encryptedtext = cipher(caesarEncrypt, text, shift)
    println("Encrypted: " + encryptedtext)

                                                                                    // Decryption
    val decryptedtext = cipher(caesarDecrypt, encryptedtext, shift)
    println("Decrypted: " + decryptedtext)
  }
}
