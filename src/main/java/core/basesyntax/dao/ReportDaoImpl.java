package core.basesyntax.dao;

import core.basesyntax.db.Storage;
import core.basesyntax.model.Product;
import java.util.Map;

public class ReportDaoImpl implements ReportDao {
    private Storage storage = new Storage();

    @Override
    public Map<String, Integer> get() {
        return storage.getReportData();
    }

    @Override
    public void update(Product product) {
        storage.addToReportData(product);
    }

    @Override
    public int getBalanceForProduct(Product product) {
        return get().get(product.getProductName());
    }
}
