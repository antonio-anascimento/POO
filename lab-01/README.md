# Sistema de Controle de versão

## Configuração inicial para o uso do Git
É nescessário a configuração do nome e e-mail para poder realizar commits pois os commits precisam ser rastreáveis
### Configuração de nome de usuário e e-mail no Git
```bash
git config --global user.name "Seu Nome"
git config --global user.email "seuemail@exemplo.com"
```

### Criando Personal Access Token (PAT) no GitHub
O PAT funciona como uma senha temporaria, é geralmente usada por quem acessa o git via terminal, caso você tenha a autenticação de dois fatores ativada, sua senha comum não funcionaria no terminal.

#### Gerando o PAT
1. Clique no Seu usuario no github.
2. Clique em Settings.
3. Clique em Developer Settings.
4. Clique em Personal access tokens.
5. Clique em Tokens(classic).
6. Clique em Generate new token.
7. Escolha o nome do token, prazo e suas permissões.
8. Clique em Generate token.

### Salvar em cache as credenciais do PAT
## Qual a diferença entre git merge e git rebase?
