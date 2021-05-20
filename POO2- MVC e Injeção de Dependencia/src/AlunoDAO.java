import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO implements IAlunoPersistDAO{
	
	final String NOMEDATABELA = "aluno";
	
    public boolean inserir(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (matricula) VALUES (?), (cpf) VALUES (?), (dataNascimento) VALUES (?), (email) VALUES (?) , (nome) VALUES (?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getMatricula());
            ps.setString(2, aluno.getCpf());
            ps.setString(3, aluno.getDataNascimento());
            ps.setString(4, aluno.getEmail());
            ps.setString(5, aluno.getNome());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET cpf = ?, SET getDataNascimento = ?, SET email = ?, SET nome = ? WHERE matricula = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getCpf());
            ps.setString(2, aluno.getDataNascimento());
            ps.setString(3, aluno.getEmail());
            ps.setString(4, aluno.getNome());
            ps.setString(5, aluno.getMatricula());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
    }
    public boolean excluir(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE matricula = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getMatricula());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
    }
    public Aluno procurarPorCPF(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cpf = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getCpf());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Aluno obj = new Aluno();
                obj.setCpf(rs.getString(1));
                obj.setDataNascimento(rs.getString(2));
                obj.setEmail(rs.getString(3));
                obj.setMatricula(rs.getString(4));
                obj.setNome(rs.getString(5));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    public Aluno procurarPorMatricula(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE matricula = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getMatricula());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Aluno obj = new Aluno();
                obj.setCpf(rs.getString(1));
                obj.setDataNascimento(rs.getString(2));
                obj.setEmail(rs.getString(3));
                obj.setMatricula(rs.getString(4));
                obj.setNome(rs.getString(5));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    public Aluno procurarPorDataNascimento(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE dataNascimento = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getDataNascimento());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Aluno obj = new Aluno();
                obj.setCpf(rs.getString(1));
                obj.setDataNascimento(rs.getString(2));
                obj.setEmail(rs.getString(3));
                obj.setMatricula(rs.getString(4));
                obj.setNome(rs.getString(5));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    public Aluno procurarPorEmail(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE email = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getEmail());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Aluno obj = new Aluno();
                obj.setCpf(rs.getString(1));
                obj.setDataNascimento(rs.getString(2));
                obj.setEmail(rs.getString(3));
                obj.setMatricula(rs.getString(4));
                obj.setNome(rs.getString(5));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    public Aluno procurarPorNome(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Aluno obj = new Aluno();
                obj.setCpf(rs.getString(1));
                obj.setDataNascimento(rs.getString(2));
                obj.setEmail(rs.getString(3));
                obj.setMatricula(rs.getString(4));
                obj.setNome(rs.getString(5));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    public boolean existe(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE matricula = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getMatricula());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ps.close();
                rs.close();
                conn.close();
                return true;
            }
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
        return false;
    }
    public List<Aluno> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Aluno> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    public List<Aluno> montarLista(ResultSet rs) {
        List<Aluno> listObj = new ArrayList<Aluno>();
        try {
            while (rs.next()) {
            	Aluno obj = new Aluno();
                obj.setCpf(rs.getString(1));
                obj.setDataNascimento(rs.getString(2));
                obj.setEmail(rs.getString(3));
                obj.setMatricula(rs.getString(4));
                obj.setNome(rs.getString(5));
                
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
}
