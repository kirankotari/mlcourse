//package net_test;
//import java.io.File;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class FileWalker {
//
//    public void walk( String path ) {
//
//        File root = new File( path );
//        File[] list = root.listFiles();
//
//        if (list == null) return;
//
//        for ( File f : list ) {
//            if ( f.isDirectory() ) {
//                walk( f.getAbsolutePath() );
//                System.out.println( "Dir:" + f.getAbsoluteFile() );
//            }
//            else {
//                System.out.println( "File:" + f.getAbsoluteFile() );
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        String put;
//        FileWalker fw = new FileWalker();
//        fw.walk("C:/" );
//        try {
//                    String selectTableSql = "SELECT * from subcatalog";
//                    String query = " insert into subcatalog (folder)" + "values(?)";
//                    Statement statement = null;
//                    Connection cn = ConnectorDB.getConnection();
//                    PreparedStatement pr = cn.prepareStatement(query);
//                    pr.setString(1,fw);
//                    pr.execute();
//                    cn.close();
//                } catch(SQLException e) {
//                    e.printStackTrace();
//                }
//    }
//
//}