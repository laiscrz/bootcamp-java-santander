package gerenciamentousuarios;
// package main.java.gerenciamentousuarios;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

import main.java.gerenciamentousuarios.exceptions.UsuarioNaoEncontradoException;
import main.java.gerenciamentousuarios.model.Usuario;

public class Main {

    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) throws UsuarioNaoEncontradoException {
        inicializarUsuarios();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSistema de Gerenciamento de Usuários");
            System.out.println("1. Buscar Usuário");
            System.out.println("2. Adicionar Usuário");
            System.out.println("3. Mostrar Todos os Usuários");
            System.out.println("4. Deletar Usuário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do usuário: ");
                    int idBuscar = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    Optional<Usuario> usuarioEncontrado = buscarUsuarioPorId(idBuscar);
                    usuarioEncontrado.ifPresentOrElse(
                            u -> System.out.println("Usuário encontrado: " + u.getNome()),
                            () -> System.out.println("Usuário não encontrado."));
                    break;
                case 2:
                    System.out.print("Digite o ID do novo usuário: ");
                    int idAdicionar = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    // Verifica se o ID já está em uso
                    if (buscarUsuarioPorId(idAdicionar).isPresent()) {
                        System.out.println("ID já está em uso. Não foi possível adicionar o usuário.");
                    } else {
                        System.out.print("Digite o nome do novo usuário: ");
                        String nomeAdicionar = scanner.nextLine();
                        System.out.print("Digite o e-mail do novo usuário: ");
                        String emailAdicionar = scanner.nextLine();

                        adicionarUsuario(idAdicionar, nomeAdicionar, emailAdicionar);
                        System.out.println("Usuário adicionado com sucesso.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de Usuários:");
                    mostrarTodosUsuarios();
                    break;
                case 4:
                    System.out.print("Digite o ID do usuário a ser deletado: ");
                    int idDeletar = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    boolean removido = deletarUsuario(idDeletar);
                    if (removido) {
                        System.out.println("Usuário removido com sucesso.");
                    } else {
                        System.out.println("Usuário não encontrado para remoção.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void inicializarUsuarios() {
        usuarios.add(new Usuario(1, "João", "joao@example.com"));
        usuarios.add(new Usuario(2, "Maria", "maria@example.com"));
        usuarios.add(new Usuario(3, "Pedro", "pedro@example.com"));
    }

    // Busca um usuário pelo ID na lista de usuários
    private static Optional<Usuario> buscarUsuarioPorId(int id) throws UsuarioNaoEncontradoException {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return Optional.of(usuario); // Retorna o usuário encapsulado em Optional se encontrado
            }
        }
        return Optional.empty(); // Retorna Optional vazio se usuário não encontrado
    }

    // Adiciona um novo usuário à lista de usuários
    private static void adicionarUsuario(int id, String nome, String email) {
        Usuario novoUsuario = new Usuario(id, nome, email);
        usuarios.add(novoUsuario);
    }

    // Deleta um usuário da lista de usuários pelo ID
    private static boolean deletarUsuario(int id) throws UsuarioNaoEncontradoException {
        // Busca o usuário na lista pelo ID usando Optional
        Optional<Usuario> usuarioParaRemover = buscarUsuarioPorId(id);

        // Verifica se o usuário foi encontrado
        if (usuarioParaRemover.isPresent()) {
            // Remove o usuário da lista usando get() para acessar o objeto Usuario dentro
            // do Optional
            usuarios.remove(usuarioParaRemover.get());
            // Retorna true para indicar que o usuário foi removido com sucesso
            return true;
        }

        // Retorna false se o usuário não foi encontrado na lista
        return false;
    }

    // Mostra todos os usuários cadastrados
    private static void mostrarTodosUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}