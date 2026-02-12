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
Salvar as credencias do PAT em cache facilitam pois evita a necessidade de ficar inserindo toda vez que quiser realizar um comando pull ou push. Segue abaixo o comando para salvar por 1h.
```bash
git config --global credential.helper 'cache --timeout=3600'
```
## Qual a diferença entre git merge e git rebase?
Ambos comandos servem para mesclar alterações de uma branch em outra, mas a principal diferença deles é que o merge pega os commits de uma branch e junta com os commmits de outra, gerando um novo commit e preservando as historias e suas ramificações, é ideal para trabalhos em conjunto, pois evita o conflito. ja o rebase aplica os commits da branch atual em cima da branch desejada, deixando o historico linear, só é recomendado para projetos de apenas um desenvolvedor, pois pode acabar causando conflitos e ficando dificil de distinguir quando cada coisa aconteceu.
