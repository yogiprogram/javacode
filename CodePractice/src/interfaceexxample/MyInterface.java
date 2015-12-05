package interfaceexxample;

import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public interface MyInterface {
	String getName() throws IOException , SQLException;
}

interface MyInterface2 {
	String getName() throws IOException, SQLException;
}
