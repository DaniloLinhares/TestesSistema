#language: pt
  @cadusuario
  Funcionalidade: Validações do cadastro de usuário

    @nomeobrigatorio
    Cenario: Validar campo nome obrigatorio
      Dado que estou na pagina de login
      E não preencho o campo nome
      Quando preencho E-mail com "test@gmail.com"
      E preencho senha com "12345"
      E preencho idade com "28"
      E pressiono Cadastrar
      Então irá exibir uma mensagem informando "Campos obrigatórios"

    @emailobrigatorio
    Cenario: Validar campo e-mail
      Dado que estou na pagina de login
      E não preencho o campo E-mail
      Quando preencho Nome com "Joaoooo"
      E preencho senha com "12345"
      E preencho idade com "28"
      E pressiono Cadastrar
      Então irá exibir uma mensagem informando "Campos obrigatórios"

    @senhaforte
    Esquema do Cenario: Validar senha forte
       Dado que estou na pagina de login
       E preencho Nome com "Joaoooo"
       E preencho idade com "28"
       E preencho E-mail com "test@gmail.com"
       Quando preencho senha com "<senha>"
       E pressiono Cadastrar
       Então será exibido a mensagem informando "<resultado>"

       Exemplos:
       |senha  |resultado                                                                   |
       |11111  |Preenher ao menos uma letra maiuscula, numero e caractere. Ex.: Aaa222$$   |
       |12abx  |Preenher ao menos uma letra maiuscula, numero e caractere. Ex.: Aaa222$$  |
       |AB12$# |Cadastrado com sucesso!                                                   |
